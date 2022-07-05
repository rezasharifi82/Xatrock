
package xatrock;

import java.awt.Font;
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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class ForgetPasswordPageController implements Initializable {
    private Scene scene ;
    private Stage stage ;
    private Parent parent ;
    @FXML
    Label emailNotify ;
    @FXML 
    TextField emailTextField;
    @FXML
    Button passwordResetButton;
    @FXML
    Hyperlink backToSigninButton;
    String inputEmail ;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    } 
     public void switchToLoginPage(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
     //TODO boolean search_in_db(inputEmail){
     // if(inputEmail is exist in db return true ; 
     // else return false ; 
     boolean result1 = false /*TODO result 1 == search_in_db(inputEmail)*/ ;
     
     @FXML
    private void  passwordResetButtonHandler(ActionEvent e){
         if(result1==false){
              UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 22));
            JOptionPane.showMessageDialog(null , "Your entered email is not correct");
            
         }
         else if(result1){
             //TODO 
             // 1 _ creat an object from email class ; 
             // 2 _ call the constructor of email class to send a new password for inputEmail ;
             // 3 _ save the new send password in db ;
         
         }
     }
    @FXML 
    private void emailTextFieldHandler(ActionEvent e){
        inputEmail = emailTextField.getText();
    }
    
    
}
