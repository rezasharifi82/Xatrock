
package xatrock;

import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class LoginPageController implements Initializable {

    private Stage stage ;
    private Scene scene ;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private Button loginButtton;
    @FXML
    private Hyperlink signupHyperLink;
    @FXML
    private CheckBox robotCheckBox;
    @FXML
    private Label notifyLabel;
    @FXML
    private Hyperlink forgotpasswordHyperLink;
    @FXML
    private AnchorPane pane;
    @FXML
    private Button tempButton;
    @FXML
    private PasswordField passwordTextField;
    private Label passwordNotifyLabel;
    private Label usernameNotifyLabel;
    @FXML
    private TextField emailTextField;
  
    static String emailAddress ;
    @FXML
    private Label controllerLabel;
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    

    public void  valueHandle(ActionEvent e){
        
    }

    @FXML
    private void switchToSignupPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SignupPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void switchToForgetPasswordPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ForgetPasswordPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void temp (ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        scene = new Scene(root);
        scene = tempButton.getScene();
        root.translateYProperty().set(scene.getHeight());
        pane.getChildren().add(root);
        Timeline timeLine = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(),0,Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1) , kv);
        timeLine.getKeyFrames().add(kf);
        timeLine.play();
        
    }
    @FXML
    private void LoginButtonHandler(ActionEvent e) throws IOException{
        
        //TODO check_in_db int(email , password)
        //return id ;
        // retrun -1 means email!=password 
        // if TODO == -1 {
        // execute first below if statement 
    //    };
    
    // TODO check_in_db boolean (email , password) (make a if statement in body of below else if);
    //  TODO == false means that input email is for a student ;
    //  TODO == true means that input email is for a teacher ;
     if(false){
           controllerLabel.setDisable(false);
           loginButtton.setDisable(true);
       }
     
      else if(true && robotCheckBox.isSelected()){ 
          if(false){
           controllerLabel.setDisable(true);
           loginButtton.setDisable(false);
         emailAddress = emailTextField.getText() ;
       Parent root = FXMLLoader.load(getClass().getResource("StudentHomePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
          }
          else if(true){
           controllerLabel.setDisable(true);
           loginButtton.setDisable(false);
         emailAddress = emailTextField.getText() ;
       Parent root = FXMLLoader.load(getClass().getResource("TeacherHomePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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
      
                }
        }
    
}
