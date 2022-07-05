
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
import javafx.stage.Stage;


public class StudentMathematicPageController implements Initializable {
Stage stage ;
Scene scene;
    @FXML
    private Button gradeButton;
    @FXML
    private Button homeWorkButton;
    @FXML
    private Button examButton;
    @FXML
    private Button backToHomePageButton;
    @FXML
    private Button messengertButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    } 
    @FXML
        private void messengerButtonHandler(ActionEvent e) throws IOException{
        //TODO set the ,messenger file name in the below String that i set the messengerPage;
       Parent root = FXMLLoader.load(getClass().getResource("MessengerPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
         @FXML
        private void backToHomePageHandler(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("StudentHomePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
        @FXML
        private void switchToExamPage(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("StudentMathematicExamPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
            
        }
         @FXML
        private void swithToHomeWorkPage(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("StudentHomeWorkPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
            
        }
        @FXML
        private void switchToGradePage(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("StudentGradePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
    
}
