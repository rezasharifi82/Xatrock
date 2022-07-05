
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

public class StudentAboutXatrockPage1Controller implements Initializable {

    Scene scene;
    Parent parent;
    @FXML
    private Button nextButton;
    private Button beforeButton;
    @FXML
    private AnchorPane aboutXatrockPane1;
    @FXML
    private Button backButton;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
       @FXML
        private void switcToAboutXatrockPage2(ActionEvent e) throws IOException{
            Parent root = FXMLLoader.load(getClass().getResource("StudentAboutXatrockPage2.fxml"));
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
    private void switchToHomePage(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("StudentHomePage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)aboutXatrockPane1.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    }
    
    
}
