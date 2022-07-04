
package xatrock;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class TeacherHomeWorkPageController implements Initializable {
    Stage stage;
    Scene scene ;
    String homeWorkName ;
    String filePath;
    @FXML
    private TextField homeWorkNameTextField;
    @FXML
    private Button homeWorkUploadButton;  
    
    @FXML
    private Label fileNameLabel;
    @FXML
    private AnchorPane bu;
    @FXML
    private Button sendButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }  
    @FXML
    private void homeWorkNameTextFieldHandler(ActionEvent e){
        
        homeWorkName = homeWorkNameTextField.getText();
        
        
    }
    @FXML
    private void uploadButtonHandler(ActionEvent e){
        
         FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Files" , "*.pdf" , "*jpg" , "*png" , "word"));
        List <File> f = fc.showOpenMultipleDialog(null);
        for(File file :f){
        fileNameLabel.setText(file.getAbsolutePath());
        
       }
        filePath = fileNameLabel.getText();
        
        
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
    private void sendButtonHandler(ActionEvent e) throws IOException{
     // TODO void insert_into_db(homeWorkName ,filePath ){
     // insert the parameters into the teacher home work table;}
        
         Parent root = FXMLLoader.load(getClass().getResource("SuccessfullySendHomeWorkPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    
}
