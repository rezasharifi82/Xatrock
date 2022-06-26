package xatrock;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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


public class SignupPageController implements Initializable {
 
    Pattern pattern;
    Matcher matcher;
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
            }
             if(teacherRadioButton.isSelected()){
                studentRadioButton.setSelected(false);
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
            }
            if(studentRadioButton.isSelected()){
                teacherRadioButton.setSelected(false);
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
   private void signUpButtonHandler(ActionEvent e){

     
}     
}


    

