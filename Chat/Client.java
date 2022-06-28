import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

// A client sends messages to the server, the server spawns a thread to communicate with the client.
// Each communication with a client is added to an array list so any message sent gets sent to every other client
// by looping through it.

public class Client extends JFrame implements ActionListener {

    // A client has a socket to connect to the server and a reader and writer to receive and send messages respectively.
    private Socket socket;
    InputStream fromServerStream;
    OutputStream toServerStream;
    DataInputStream reader;
    PrintWriter writer;
    private String username;
    //public ClientGraphic here;
    JButton send;
    Boolean ifyes=true;
    JTextField textField1;
    JScrollPane myscroll;
    JPanel mainpanel;
    JLabel lesson_name;
    JPanel chatpanel;
    public static int cons=200;
    private JLabel new_message;

    public Client(Socket socket, String username,String lesson ) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            this.socket = socket;
            this.username = username;
            toServerStream=socket.getOutputStream();
            fromServerStream=socket.getInputStream();
            reader= new DataInputStream(fromServerStream);
            writer=new PrintWriter(toServerStream,true);


            chatpanel=new JPanel();
            lesson_name=new JLabel(lesson);
            send=new JButton("Send");
            textField1=new JTextField();
        } catch (IOException e) {
            // Gracefully close everything.
           // closeEverything(socket, bufferedReader, bufferedWriter);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        init();
        this.setTitle(lesson+" "+username);
        //this.pack();
    }

    // Sending a message isn't blocking and can be done without spawning a thread, unlike waiting for a message.
    public void sendMessage() {
        try {
            // Initially send the username of the client.
            if(ifyes) {
                writer.println(username);
                ifyes=false;

            }
            // Create a scanner for user input.
            // While there is still a connection with the server, continue to scan the terminal and then send the message.
            if (socket.isConnected()) {
                String messageToSend = textField1.getText();
               // String messageToSend=scanner.nextLine();TODO check this
                if(messageToSend!=null && !messageToSend.isEmpty())
                    writer.println(username + ": " + messageToSend);

            }
        } catch (Exception e) {
            // Gracefully close everything.
           // closeEverything(socket, bufferedReader, bufferedWriter);
            System.out.println("#7485126");
        }
    }

    // Listening for a message is blocking so need a separate thread for that.
    public void listenForMessage() {
        new Thread(() -> {
            String msgFromGroupChat;
            // While there is still a connection with the server, continue to listen for messages on a separate thread.
            while (socket.isConnected()) {
                try {
                    // Get the messages sent from other users and print it to the console.
                    validator();
                    msgFromGroupChat = reader.readLine();
                    System.out.println(msgFromGroupChat);
                    get_other_message(msgFromGroupChat);
                    //this.revalidate();
                } catch (IOException e) {
                    // Close everything gracefully.
                    //closeEverything(socket, bufferedReader, bufferedWriter);
                }
            }
        }).start();
    }


    public void get_other_message(String full){

        new Thread(() -> {
            if(!full.isEmpty()) {
                //full = User + " : " + full;
                JLabel newm = new JLabel(full);
                newm.setForeground(new Color(18, 6, 155));
                newm.setFont(new Font("MV Boli", Font.PLAIN, 20));
                newm.setBounds(150, 250, 1000, 20);
                newm.setPreferredSize(new Dimension(1000, 20));
                cons += 25;
                //System.out.println(445464564);
                chatpanel.setPreferredSize(new Dimension(10, cons));
                chatpanel.add(newm);
                textField1.setText("");
                //this.notifyAll();
                //me.revalidate();
                validator();

            }

        }).start();

        this.revalidate();

    }

    public void validator(){
        this.revalidate();

    }



    public void send_new_message(){
        String full=textField1.getText();
        // myclient.set_user_message(full);
        // myclient.sendMessage();

        if(!full.isEmpty()) {
            full =  "You : " + full;
            JLabel newm = new JLabel(full);
            newm.setForeground(new Color(218, 5, 32));
            newm.setFont(new Font("MV Boli", Font.BOLD, 20));
            newm.setBounds(150, 250, 1000, 100);
            newm.setPreferredSize(new Dimension(1000, 20));
            cons += 25;
            //System.out.println(445464564);
            chatpanel.setPreferredSize(new Dimension(10, cons));
            chatpanel.add(newm);
            textField1.setText("");
        }


    }

    // Run the program.
    public static void main(String[] args) throws IOException {

        // Get a username for the user and a socket connection.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username for the group chat: ");
        String username = scanner.nextLine();
        // Create a socket to connect to the server.
        Socket socket = new Socket("localhost", 9090);

        // Pass the socket and give the client a username.
        Client client = new Client(socket, username,"Ap");
        // Infinite loop to read and send messages.
        client.listenForMessage();
        client.sendMessage();
    }


    public void init(){
        {
            mainpanel=new JPanel();
            //this.setContentPane(panel1);
            this.setTitle("Chat");
            this.setSize(new Dimension(400,600));
            send.setBounds(320,510,70,50);
            textField1.setBounds(20,510,290,50);
            chatpanel.setBackground(new Color(223, 224, 112));
            mainpanel.setBackground(new Color(7, 7, 74));
            //mainpanel.setSize(new Dimension(50,100));
            // mainpanel.setText("sadasdd");
            chatpanel.setBounds(30,30,400,400);
            mainpanel.setBounds(0   ,0,410,610);
            mainpanel.add(send);
           new_message=new JLabel("Welcome!");
            new_message.setForeground(Color.BLACK);
           new_message.setFont(new Font("MV Boli",Font.BOLD,30));
           new_message.setBounds(150,250,1000,100);
           new_message.setPreferredSize(new Dimension(1000,50));
           // this.send_new_message("sdasdasdasdewrw");
            cons+=25;
            chatpanel.setPreferredSize(new Dimension(10,cons));
            chatpanel.add(new_message);

            //chatpanel.setLayout(new GridLayout(5,1,5,5));
            chatpanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));



            myscroll=new JScrollPane(chatpanel);
            myscroll.setAutoscrolls(true);
            // chatpanel.setLayout(new GridLayout(10,1));
            chatpanel.setAutoscrolls(true);
            myscroll.setPreferredSize(new Dimension(200,440));
            //myscroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            //myscroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            myscroll.setBounds(30, 30, 350, 450);





            //mainpanel.add(chatpanel);
            mainpanel.add(myscroll);
            mainpanel.add(textField1);
            send.addActionListener(this);
            mainpanel.setLayout(null);
            this.setResizable(false);
            this.setVisible(true);
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.add(mainpanel);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==send){
            //myclient.sendnow=true;
            // this.sendMessage();
            //myclient.sendMessage();
            this.sendMessage();
            this.send_new_message();
            //System.out.println("sadasd");
            this.revalidate();
            //this.listenForMessage();
        }
    }


}