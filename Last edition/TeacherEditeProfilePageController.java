
package xatrock;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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
import javafx.stage.Stage;


public class TeacherEditeProfilePageController implements Initializable {

    
    Scene scene ;
    Stage stage ;
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
    private Button finishButton;
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
    private Button backToHomePageButton;

    TeacherHomePageController th = new TeacherHomePageController();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void hadle(InputMethodEvent event) {
    }

    @FXML
    private void hadle(MouseEvent event) {
    }

    @FXML
    private void firstNameHandler(ActionEvent event) {
        
        firstNameTextField.setText(""/*TODO th.set_information().getFirstName()*/);
        lastNameTextField.requestFocus();
    }

    @FXML
    private void lastNameHandler(ActionEvent event) {
          lastNameTextField.setText(""/*TODO th.set_information().getLastName()*/);
           phonNumberTextField.requestFocus();
    }

   

    @FXML
    private void usernameHandler(ActionEvent event) {
          usernameTextField.setText(""/*TODO th.set_information().getusername()*/);
          passwordTextField.requestFocus();
    }

    @FXML
    private void passwordHandler(ActionEvent event) {
         
          confirmPasswordTextField.requestFocus();
    }

    @FXML
    private void confirmPasswordHandler(ActionEvent event) {
        confirmPasswordTextField.setText("");
         emailAddressTextFiled.requestFocus();
    }

    @FXML
    private void emailHandler(ActionEvent event) {
          emailAddressTextFiled.setText(""/*TODO th.set_information().getEmail()*/);
            
    }

    @FXML
    private void finishButtonHandler(ActionEvent e) throws IOException {
        //TODO update the information in db .
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
    }

    @FXML
    private void phonNumberHandler(ActionEvent event) {
     phonNumberTextField.setText(""/*TODO th.set_information().getPhoneNumber()*/);

     usernameTextField.requestFocus();
    }


    @FXML
    private void backToHomePageHandler(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TeacherHomePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void birthDateHandler(ActionEvent event) {
    }

    @FXML
    private void studentRadioButton(ActionEvent event) {
    }

    @FXML
    private void teacherRadioButton(ActionEvent event) {
    }
    
}
