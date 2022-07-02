package xatrock;

import java.awt.Font;
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
import javax.swing.JOptionPane;
import javax.swing.UIManager;


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
    String input_email = null ;
    String input_password = null ;
    
  
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
        Parent root = FXMLLoader.load(getClass().getResource("SubmitPage.fxml"));
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
       /* TODO  int search_email_in_db(input_email){
         if(input_email is not found ) return -1 ;
         else if (email is found) return password of this email ;} 
        
        TODO boolean check_in_db (input_password) {
         if (search_email_in_db (input_email ) == input_passwoerd return true ;
         elase return false ;}
        
        TODO int check_status_by_db(input_email){
         if(status of input_email in db = 0 )return 0;
        else return 1 ;
        status 0 is define for student and status 1 is define for teacher in signup page ;
      */
     
      int result1=0 ; // == search_email_in_db ;
      boolean result2 = false; // == check_in_db ;
      int result3 = 0 ; // check_status_by_db ;
     if(result1== -1){
           
             UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 22));
            JOptionPane.showMessageDialog(null , " your entered email is not found! ");
       }
     else{
         if(result2==false){
              
             UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 22));
            JOptionPane.showMessageDialog(null , " your entered password is not correct! ");
    
         }
         else{
             if(result3==0 ){
                 if(robotCheckBox.isSelected()==false){
                     
             UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 22));
             JOptionPane.showMessageDialog(null , " you are robot!!");
    
                     
                 }
                 else if(robotCheckBox.isSelected()){
        Parent root = FXMLLoader.load(getClass().getResource("StudentHomePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
                 }
                 
             }
             else if(result3==1){
                 if(robotCheckBox.isSelected()==false){
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 22));
            JOptionPane.showMessageDialog(null , " you are robot!!");
                 }
                 else if(robotCheckBox.isSelected()){
                  
        Parent root = FXMLLoader.load(getClass().getResource("TeacherHomePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
                     
                 }
             }
         }
         
     }

           
    }  
    @FXML
    private void emailHandler(ActionEvent e){
         input_email = emailTextField.getText();
       passwordTextField.requestFocus();
       
        }
    
    
    @FXML
    private void passwordHandler(ActionEvent e){
         input_password = passwordTextField.getText();
    }
      
 
    
}