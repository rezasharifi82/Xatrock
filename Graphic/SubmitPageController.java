/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    } 
    @FXML
    private void verifyButtonHandler(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
     @FXML
    private void backToSignupPageButtonHandler(ActionEvent e) throws IOException{
//        Parent root = FXMLLoader.load(getClass().getResource("SignupPage.fxml"));
//        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
  Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
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
