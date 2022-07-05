
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class CreateLssonPageController implements Initializable {

    Scene scene ;
    Stage stage ;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField numberTextField;
    @FXML
    private Button createButton;
    @FXML
    private Button backToHomePageButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }  
@FXML
    private void switchToHomePagePage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TeacherHomePage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
}
