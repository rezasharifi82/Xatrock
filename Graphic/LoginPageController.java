
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
  
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    

    @FXML
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
    
}
