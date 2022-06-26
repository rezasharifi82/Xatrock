
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
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class HomePageController implements Initializable {

    Stage stage ;
    Scene scene;
    @FXML
    private Label nameLabel;
    @FXML
    private MenuBar menuBar;
    @FXML
    private Button messengertButton;
    @FXML
    private ImageView logoutLabel;
    @FXML
    private Button mathematicButton;
    @FXML
    private Button physicButton;
    @FXML
    private Button logicalCircuitButton;
    @FXML
    private Button programmingButton;
    @FXML
    private ImageView clock;
    @FXML
    private MenuItem editeProfileMenue;
    @FXML
    private MenuItem logoutMenue;
    @FXML
    private MenuItem physicMenue;
    @FXML
    private MenuItem mathematicMenue;
    @FXML
    private MenuItem programmingMenue;
    @FXML
    private MenuItem logicalcircuitMenue;
    @FXML
    private Menu examMenue;
    @FXML
    private MenuItem physicExamMenue;
    @FXML
    private MenuItem logicalcircuitExamMenue;
    @FXML
    private MenuItem mathematicExamMenue;
    @FXML
    private MenuItem programmingExamMenue;
    @FXML
    private MenuItem aboutMenue;
    @FXML
    private AnchorPane pane;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    @FXML
    private void logoutMenueHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    @FXML
    private void editeprofileMenueHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    @FXML
    private void mathematicMenueHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    @FXML
    private void physicMenueHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    @FXML
    private void programmingMenueHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    @FXML
    private void logicalCircuitMenueHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    @FXML
    private void mathematicExamMenueHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    @FXML
    private void physicExamMenueHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    @FXML
    private void programmingExamMenueHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    @FXML
    private void logicalCircuitExamMenueHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    }
    
    
    
}
