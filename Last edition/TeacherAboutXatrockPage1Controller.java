
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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class TeacherAboutXatrockPage1Controller implements Initializable {

    Stage stage ;
    Scene scene ;
    @FXML
    private Button nextButton;
    @FXML
    private Button backButton;
    @FXML
    private AnchorPane aboutXatrockPane1;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    

    @FXML
    private void switcToAboutXatrockPage2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TeacherAboutXatrockPage2.fxml"));
        scene = new Scene(root);
        scene = nextButton.getScene();
        root.translateYProperty().set(scene.getHeight());
        aboutXatrockPane1.getChildren().add(root);
        Timeline timeLine = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(),0,Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1) , kv);
        timeLine.getKeyFrames().add(kf);
        timeLine.play();
    }

    @FXML
    private void switchToHomePage(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("TeacherHomePage.fxml"));
        scene = new Scene(root);
        scene = backButton.getScene();
        root.translateYProperty().set(scene.getHeight());
        aboutXatrockPane1.getChildren().add(root);
        Timeline timeLine = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(),0,Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1) , kv);
        timeLine.getKeyFrames().add(kf);
        timeLine.play();
    }
    
}
