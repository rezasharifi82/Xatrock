
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class StudentHomeWorkPageController implements Initializable {

    Stage stage ;
    Scene scene ;
    
    String homeWorkName;
    String filePath;
    @FXML
    private TextField homeWorkNameTextField;
    @FXML
    private Button homeWorkUploadButton;
    @FXML
    private Label fileNameLabel;
    @FXML
    private Button sendButton;
    @FXML
    private Hyperlink hyper1;
    @FXML
    private Hyperlink hyper2;
    @FXML
    private Hyperlink hyper3;
    @FXML
    private Hyperlink hyper4;
    @FXML
    private Hyperlink hyper15;
    @FXML
    private ComboBox<String> lessonComboBox;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         lessonComboBox.getItems().addAll("Programming" , "Physic" , "Mathematic" , "Logical circuit");

    }    

    @FXML
    private void homeWorkNameTextFieldHandler(ActionEvent event) {
        homeWorkName = homeWorkNameTextField.getText();
    }

    @FXML
    private void uploadButtonHandler(ActionEvent event) {
          FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Files" , "*.pdf" , "*jpg" , "*png" , "word"));
        List <File> f = fc.showOpenMultipleDialog(null);
        for(File file :f){
        fileNameLabel.setText(file.getAbsolutePath());
        
       }
        filePath = fileNameLabel.getText();
    }

    @FXML
    private void backToHomePageButtonHandler(ActionEvent e) throws IOException {
             Parent root = FXMLLoader.load(getClass().getResource("StudentHomePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void sendButtonHandler(ActionEvent event) throws IOException {
        // TODO void insert_into_db(homeWorkName ,filePath ){
     // insert the parameters into the student home work table;}
        
         Parent root = FXMLLoader.load(getClass().getResource("SuccessfullySendHomeWorkPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }@FXML
    private void hyper1Handler(ActionEvent event) {
          Runtime rt = Runtime.getRuntime();
          String url = "file:///D:/Learn/Logic%20circuit/pracices/1/FUM-Logic-Design-00-02-HW%231.pdf";
          try {
	  rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
         } catch (IOException ioException) {
	ioException.printStackTrace();
       }
    }
    @FXML
    private void hyper2Handler(ActionEvent event) {
        Runtime rt = Runtime.getRuntime();
          String url = "file:///D:/Learn/Logic%20circuit/pracices/2/FUM-Logic-Design-00-02-HW%232.pdf";
          try {
	  rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
         } catch (IOException ioException) {
	ioException.printStackTrace();
       }
    }
    @FXML
    private void hyper3Handler(ActionEvent event) {
        Runtime rt = Runtime.getRuntime();
          String url = "file:///D:/Learn/Logic%20circuit/pracices/3/FUM-Logic-Design-00-02-HW%233.pdf";
          try {
	  rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
         } catch (IOException ioException) {
	ioException.printStackTrace();
       }
    }
    @FXML
    private void hyper4Handler(ActionEvent event) {
        Runtime rt = Runtime.getRuntime();
          String url = "file:///C:/Users/HUAWEI/Desktop/Xatrock/Xatrock/general%20calculus%202.pdf";
          try {
	  rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
         } catch (IOException ioException) {
	ioException.printStackTrace();
       }
    }
    @FXML
    private void hyper5Handler(ActionEvent event) {
        Runtime rt = Runtime.getRuntime();
          String url = "file:///D:/Learn/programming/loc/phase2/fhase2.pdf";
          try {
	  rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
         } catch (IOException ioException) {
	ioException.printStackTrace();
       }
    }
   
    }
    
    

