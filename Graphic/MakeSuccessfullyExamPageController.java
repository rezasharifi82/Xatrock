
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


public class MakeSuccessfullyExamPageController implements Initializable {

    Scene scene ;
    Stage stage ;
    @FXML
    private Button backToHomePageButton;
    @FXML
    private Button backToMakeExamPage;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    @FXML
    private void backToHomePageButtonHandler(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("TeacherHomePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    @FXML
    private void backToMakeExamPageButtonHandler(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("MakeExamPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    
}
