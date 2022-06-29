package xatrock;

import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class SignupPageController implements Initializable {
 
    Pattern pattern;
    Matcher matcher;
    Stage stage ;
    Scene scene;
     String primaryId;
     String fullName ;
     int verifyCode ;
     String firstName ;
     String lastName ;
     long phoneNumber ;
     int status ;
     String userName ;
     int password ;
     String email ;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private DatePicker birthDateDatePicker;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private PasswordField confirmPasswordTextField;
    @FXML
    private TextField emailAddressTextFiled;
    @FXML
    private Button signupButton;
    @FXML
    private ProgressBar passwordLevelProgressBar;
    @FXML
    private TextField phonNumberTextField;
    @FXML
    private RadioButton studentRadioButton;
    @FXML
    private RadioButton teacherRadioButton;
    @FXML
    private Label lastNameNotifyLabel;
    @FXML
    private Label firstNameNotifyLabel;
    @FXML
    private Label phonNumberNotifyLabel;
    @FXML
    private Label usernameNotifyLabel;
    @FXML
    private Label passwordNotifyLabel;
    @FXML
    private Label confirmPasswordNotifyLabel;
    @FXML
    private Label emailAddressNotifyLabel;
    @FXML
    private Label PaswordLevelNotify;
    @FXML
    private AnchorPane signupPage;
   
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        passwordLevelProgressBar.setStyle("-fx-accent: green;");
      
        
        
    }    

    @FXML
    private void hadle(InputMethodEvent event) {
        
    }

    @FXML
    private void hadle(MouseEvent event) {
    }

    @FXML
    private void firstNameHandler(ActionEvent event) {
   
          if(firstNameTextField.getText().length()>15){
            firstNameNotifyLabel.setVisible(true);
            firstNameNotifyLabel.setText("The size of your name must less than 15 characters ");
          firstNameTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width: 3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");
       
          }
          else if(firstNameTextField.getText().isEmpty()){
          firstNameNotifyLabel.setVisible(true);
          firstNameNotifyLabel.setText("Please enter your name");
          firstNameTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width: 3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
          }
          else{
              firstNameNotifyLabel.setText("");
             firstNameTextField.setStyle("-fx-border-color: black ;"
                     + "-fx-border-width: 1px;"
                     + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");
              lastNameTextField.requestFocus();
              firstName = firstNameTextField.getText();
                 if(firstNameNotifyLabel.getText().equals("")&&
                         lastNameNotifyLabel.getText().equals("")&&
                         phonNumberNotifyLabel.getText().equals("")&&
                         usernameNotifyLabel.getText().equals("")&&
                         passwordNotifyLabel.getText().equals("")&&
                         confirmPasswordNotifyLabel.getText().equals("")&&
                         emailAddressNotifyLabel.getText().equals("")){
           signupButton.setDisable(false);
           
       }
                 else signupButton.setDisable(true);
          }
    }
    @FXML
    private void lastNameHandler(ActionEvent e){
         if(lastNameTextField.getText().length()>15){
            lastNameNotifyLabel.setVisible(true);
            lastNameNotifyLabel.setText("The size of your name must less than 15 characters ");
          lastNameTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width: 3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");
       
          }
          else if(lastNameTextField.getText().isEmpty()){
          lastNameNotifyLabel.setVisible(true);
          lastNameNotifyLabel.setText("Please enter your name");
          lastNameTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width: 3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
          }
          else{
              lastNameNotifyLabel.setText("");
             lastNameTextField.setStyle("-fx-border-color: black ;"
                     + "-fx-border-width: 1px;"
                     + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");
              birthDateDatePicker.requestFocus();
             lastName = lastNameTextField.getText();
              if(firstNameNotifyLabel.getText().equals("")&&
                         lastNameNotifyLabel.getText().equals("")&&
                         phonNumberNotifyLabel.getText().equals("")&&
                         usernameNotifyLabel.getText().equals("")&&
                         passwordNotifyLabel.getText().equals("")&&
                         confirmPasswordNotifyLabel.getText().equals("")&&
                         emailAddressNotifyLabel.getText().equals("")){
           signupButton.setDisable(false);
       }
          }
         
         
    }
    @FXML
     private void birthDateHandler(ActionEvent e){
                    phonNumberTextField.requestFocus();
                    if(firstNameNotifyLabel.getText().equals("")&&
                         lastNameNotifyLabel.getText().equals("")&&
                         phonNumberNotifyLabel.getText().equals("")&&
                         usernameNotifyLabel.getText().equals("")&&
                         passwordNotifyLabel.getText().equals("")&&
                         confirmPasswordNotifyLabel.getText().equals("")&&
                         emailAddressNotifyLabel.getText().equals("")){
           signupButton.setDisable(false);
       }
          }
         
    @FXML
    private void phonNumberHandler(ActionEvent e){
             if(phonNumberTextField.getText().isEmpty()){
          phonNumberNotifyLabel.setVisible(true);
          phonNumberNotifyLabel.setText("Please enter your phone number");
          phonNumberTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width:3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
          }
                else if(phonNumberTextField.getText().length()!=11){
          phonNumberNotifyLabel.setVisible(true);
          phonNumberNotifyLabel.setText("Please enter correct phone number");
          phonNumberTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width: 3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
          }
                    else if((phonNumberTextField.getText().charAt(0)!='0'&&
                phonNumberTextField.getText().charAt(1)!='9')){
               phonNumberNotifyLabel.setVisible(true);
          phonNumberNotifyLabel.setText("Please enter correct phon number");
          phonNumberTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width: 3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
          }
       
        
        
            else{
              phonNumberNotifyLabel.setText("");
             phonNumberTextField.setStyle("-fx-border-color: black ;"
                     + "-fx-border-width: 1px;"
                     + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");

             usernameTextField.requestFocus();
             phoneNumber = Long.parseLong(phonNumberTextField.getText());
             if(firstNameNotifyLabel.getText().equals("")&&
                         lastNameNotifyLabel.getText().equals("")&&
                         phonNumberNotifyLabel.getText().equals("")&&
                         usernameNotifyLabel.getText().equals("")&&
                         passwordNotifyLabel.getText().equals("")&&
                         confirmPasswordNotifyLabel.getText().equals("")&&
                         emailAddressNotifyLabel.getText().equals("")){
           signupButton.setDisable(false);
       }
          }
        }
  
        @FXML
        private void studentRadioButton(ActionEvent e ){
            if(studentRadioButton.isSelected()){
                teacherRadioButton.setSelected(false);
                status = 0;
            }
             if(teacherRadioButton.isSelected()){
                studentRadioButton.setSelected(false);
                status = 1;
            }
             if(firstNameNotifyLabel.getText().equals("")&&
                         lastNameNotifyLabel.getText().equals("")&&
                         phonNumberNotifyLabel.getText().equals("")&&
                         usernameNotifyLabel.getText().equals("")&&
                         passwordNotifyLabel.getText().equals("")&&
                         confirmPasswordNotifyLabel.getText().equals("")&&
                         emailAddressNotifyLabel.getText().equals("")){
           signupButton.setDisable(false);
       }
      
    }
        @FXML
        private void teacherRadioButton(ActionEvent e ){
              if(teacherRadioButton.isSelected()){
                studentRadioButton.setSelected(false);
                status = 1 ;
            }
            if(studentRadioButton.isSelected()){
                teacherRadioButton.setSelected(false);
                status = 0 ;
                
            }  
            if(firstNameNotifyLabel.getText().equals("")&&
                         lastNameNotifyLabel.getText().equals("")&&
                         phonNumberNotifyLabel.getText().equals("")&&
                         usernameNotifyLabel.getText().equals("")&&
                         passwordNotifyLabel.getText().equals("")&&
                         confirmPasswordNotifyLabel.getText().equals("")&&
                         emailAddressNotifyLabel.getText().equals("")){
           signupButton.setDisable(false);
       }
        }
        
          @FXML
    private void usernameHandler(ActionEvent e){
             if(usernameTextField.getText().isEmpty()){
          usernameNotifyLabel.setVisible(true);
          usernameNotifyLabel.setText(" enter a username ");
          usernameTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width:3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
          }
                else if(usernameTextField.getText().length()<5||
                        usernameTextField.getText().length()>12){
          usernameNotifyLabel.setVisible(true);
          usernameNotifyLabel.setText("( enter 5 - 12 charachters )");
          usernameTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width: 3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
          }
              
            else{
              usernameNotifyLabel.setText("");
             usernameTextField.setStyle("-fx-border-color: black ;"
                     + "-fx-border-width: 1px;"
                     + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");
         passwordTextField.requestFocus();
         userName = usernameTextField.getText();
         if(firstNameNotifyLabel.getText().equals("")&&
                         lastNameNotifyLabel.getText().equals("")&&
                         phonNumberNotifyLabel.getText().equals("")&&
                         usernameNotifyLabel.getText().equals("")&&
                         passwordNotifyLabel.getText().equals("")&&
                         confirmPasswordNotifyLabel.getText().equals("")&&
                         emailAddressNotifyLabel.getText().equals("")){
           signupButton.setDisable(false);
       }
                }
        }
           @FXML
    private void passwordHandler(ActionEvent e){
             if(passwordTextField.getText().isEmpty()){
          passwordNotifyLabel.setVisible(true);
          passwordNotifyLabel.setText(" enter a password ");
          passwordTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width:3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
          }
                else if(passwordTextField.getText().length()<8||
                        passwordTextField.getText().length()>12){
          passwordNotifyLabel.setVisible(true);
          passwordNotifyLabel.setText("( enter 8 - 12 charachters )");
          passwordTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width: 3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
          }
              
            else{
              passwordNotifyLabel.setText("");
             passwordTextField.setStyle("-fx-border-color: black ;"
                     + "-fx-border-width: 1px;"
                     + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");           
           confirmPasswordTextField.requestFocus();
          password = Integer.parseInt(passwordTextField.getText());
           if(firstNameNotifyLabel.getText().equals("")&&
                         lastNameNotifyLabel.getText().equals("")&&
                         phonNumberNotifyLabel.getText().equals("")&&
                         usernameNotifyLabel.getText().equals("")&&
                         passwordNotifyLabel.getText().equals("")&&
                         confirmPasswordNotifyLabel.getText().equals("")&&
                         emailAddressNotifyLabel.getText().equals("")){
           signupButton.setDisable(false);
       }
                }
        }
           @FXML
    private void confirmPasswordHandler(ActionEvent e){
             if(confirmPasswordTextField.getText().isEmpty()){
          confirmPasswordNotifyLabel.setVisible(true);
          confirmPasswordNotifyLabel.setText(" enter password ");
          confirmPasswordTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width:3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
          }
             
             else if(!(confirmPasswordTextField.getText().equals(passwordTextField.getText()))){
                  confirmPasswordNotifyLabel.setVisible(true);
          confirmPasswordNotifyLabel.setText(" enter correct ");
          confirmPasswordTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width:3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
          
             }
       
              
             else {
              confirmPasswordNotifyLabel.setText("");
             confirmPasswordTextField.setStyle("-fx-border-color: black ;"
                     + "-fx-border-width: 1px;"
                     + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");
             emailAddressTextFiled.requestFocus();
             if(firstNameNotifyLabel.getText().equals("")&&
                         lastNameNotifyLabel.getText().equals("")&&
                         phonNumberNotifyLabel.getText().equals("")&&
                         usernameNotifyLabel.getText().equals("")&&
                         passwordNotifyLabel.getText().equals("")&&
                         confirmPasswordNotifyLabel.getText().equals("")&&
                         emailAddressNotifyLabel.getText().equals("")){
           signupButton.setDisable(false);
       }
             }
        }
    @FXML
    private void emailHandler(ActionEvent e){
         // regrex for validation a email format ;
           pattern = pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+"
                   + "@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
          matcher = pattern.matcher(emailAddressTextFiled.getText());
           if(emailAddressTextFiled.getText().isEmpty()){
          emailAddressNotifyLabel.setVisible(true);
          emailAddressNotifyLabel.setText(" enter your email ");
          emailAddressTextFiled.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width:3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
          }
          
           else if(!(matcher.find())){
              emailAddressNotifyLabel.setText(" enter a correct email ");
          emailAddressTextFiled.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width:3px;"
                  + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");      
         
          }
               else {
              emailAddressNotifyLabel.setText("");
             emailAddressTextFiled.setStyle("-fx-border-color: black ;"
                     + "-fx-border-width: 1px;"
                     + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");
        email = emailAddressTextFiled.getText();
             if(firstNameNotifyLabel.getText().equals("")&&
                         lastNameNotifyLabel.getText().equals("")&&
                         phonNumberNotifyLabel.getText().equals("")&&
                         usernameNotifyLabel.getText().equals("")&&
                         passwordNotifyLabel.getText().equals("")&&
                         confirmPasswordNotifyLabel.getText().equals("")&&
                         emailAddressNotifyLabel.getText().equals("")){
           signupButton.setDisable(false);
       }
           }
        
    }
    @FXML
   private void signUpButtonHandler(ActionEvent e) throws IOException{
       // TODO void save_in_db (firstName , lastName , phoneNumber , status , userName , password , email ){
       // save the parameters in the database ;}
       // TODO int creat_6digit_random_number(){
       // return 6 digit number ;}
       // int *result1 = creat_6digit_random_number();
       // TODO creat an object from email class ;
       // TODO call the constructor of email class (email , "verify code" , result1);
       
       
        Parent root = FXMLLoader.load(getClass().getResource("SubmitPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
   
        
 
        
       

//        try {
//            
//          Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//          java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xatrock" , "root" , "");
//       PreparedStatement insert = con.prepareStatement("INSERT INTO member VALUES(?,?,?,?,?,?,?,?,?,?)");
//       Random rand = new Random();
//       Integer member_id = rand.nextInt(999999);
//       
//       String memberId = member_id.toString();
//       primaryId = memberId ;
//       fullName = firstNameTextField.getText()+" "+lastNameTextField.getText();
//       insert.setString(1, memberId);
//       insert.setString(2, firstNameTextField.getText());
//       insert.setString(3, lastNameTextField.getText());
//       String position= "0";
//       if(studentRadioButton.isSelected()){
//           position = "0" ;
//           
//       }
//       else if(teacherRadioButton.isSelected()){
//           position = "1";
//       }
//       insert.setString(5, position);
//       insert.setString(4, phonNumberTextField.getText());
//       insert.setString(6, emailAddressTextFiled.getText());
//       insert.setString(7, usernameTextField.getText());
//       insert.setString(8, passwordTextField.getText());
//       insert.setString(9, null);
//       insert.setString(10, "12");
//       insert.execute();
            
//       
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(SignupPageController.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            Logger.getLogger(SignupPageController.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(SignupPageController.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(SignupPageController.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(SignupPageController.class.getName()).log(Level.SEVERE, null, ex);
//        }
       
     
}
   @FXML
   private void backToLoginPageHandler(ActionEvent e) throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
   }
  
 }


    

