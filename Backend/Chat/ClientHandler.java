package xat.Chat;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;



public class ClientHandler implements Runnable {

    public static ArrayList<ClientHandler> clientHandlers = new ArrayList<>();

    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientUsername;

    public ClientHandler(Socket socket , int Ck) {
        try {
            this.socket = socket;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.clientUsername = bufferedReader.readLine();
            clientHandlers.add(this);
        } catch (IOException e) {
        }
    }
    @Override
    public void run() {
        String messageFromClient;
        while (socket.isConnected()) {
            try {
                messageFromClient = bufferedReader.readLine();
                broadcastMessage(messageFromClient);
            } catch (IOException e) {
                System.out.println("#7832764");
                break;
            }
            catch (NullPointerException f){
                boolean i=clientHandlers.remove(this);

                if(i==true)
                    Server.getInstance().writemsg(this.clientUsername+" left!");
            }
        }
    }


    public void broadcastMessage(String messageToSend) {
        for (ClientHandler clientHandler : clientHandlers) {
            try {
                if (!clientHandler.clientUsername.equals(clientUsername) && !messageToSend.isBlank() && !messageToSend.isEmpty()) {
                    clientHandler.bufferedWriter.write(messageToSend);
                    clientHandler.bufferedWriter.newLine();
                    clientHandler.bufferedWriter.flush();
                }
            } catch (IOException e) {
                System.out.println("#7845219");
            }
        }
        if(messageToSend!=null && messageToSend!="\n") {
            //System.out.println("State 5");

            Server.getInstance().writemsg(messageToSend.substring(0, messageToSend.length() - 1));
        }
    }

}