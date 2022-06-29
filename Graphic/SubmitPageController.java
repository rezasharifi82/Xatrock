
package xatrock;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class SubmitPageController implements Initializable {

    Stage stage ;
    Scene scene;
    String input_verify_code;
    @FXML
    private Label notifyLabel;
    @FXML
    private TextField verifyCodeTextField;
    @FXML
    private Button verifyButton;
    @FXML
    private Hyperlink sendCodeAgainHyperLink;
    @FXML
    private Button backToSignupPageButton;
    @FXML
    private AnchorPane submitPane;
    @FXML
    private Label controller;
    SignupPageController obj_from_signupPage = new SignupPageController();
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    } 
    private void  verifyCodeTextFieldHandler(ActionEvent e) throws IOException{
        if(verifyCodeTextField.getText().length()!=6){
            controller.setVisible(true);
            controller.setText(" enter correct value ");
          verifyCodeTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width:3px;"
                + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");         
     verifyButton.setDisable(true);
        }
        else{
                    controller.setText("");
             verifyCodeTextField.setStyle("-fx-border-color: black ;"
                     + "-fx-border-width: 1px;"
                     + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,1 );");
             input_verify_code =verifyCodeTextField.getText();
              verifyButton.setDisable(false);
        }
            
    }
    @FXML
    private void sendCodeAgian(ActionEvent e){
        // TODO int creat_6digit_random_number(){
       // return 6 digit number ;}
       // int *result1 = creat_6digit_random_number();
       // TODO creat an object from email class ;
       // TODO call the constructor of email class (email , "verify code" , result1);
       
    }
    
    @FXML
    private void verifyButtonHandler(ActionEvent e) throws IOException{
        
        //TODO boolean compare_input_code(input_verify_code , obj_from_signupPage.result1){
        // if(input_verify_code == obj_from_signupPage.result1) return true ;
        // else return false ;}

        boolean result1 = false ;//compare_input_code(input_verify_code , obj_from_signupPage.result1);
        if(result1==false){
                controller.setVisible(true);
            controller.setText(" enter correct value ");
          verifyCodeTextField.setStyle("-fx-border-color: red ;"
                  + "-fx-border-width:3px;"
                + " -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) ,20,0,0,1 );");         
          verifyCodeTextField.setText("");
        }
        else if(result1==true){
        Parent root = FXMLLoader.load(getClass().getResource("SuccessfullySignupPage.fxml"));
        scene = new Scene(root);
        scene = verifyButton.getScene();
        root.translateYProperty().set(scene.getHeight());
        submitPane.getChildren().add(root);
        Timeline timeLine = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(),0,Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1) , kv);
        timeLine.getKeyFrames().add(kf);
        timeLine.play();
        
        }
        
    }
     @FXML
    private void backToSignupPageButtonHandler(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SignupPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        
    }
    
    
}
