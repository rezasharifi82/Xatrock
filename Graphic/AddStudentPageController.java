
package xatrock;

import java.awt.Font;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class AddStudentPageController implements Initializable {

    Stage stage  ;
    Scene scene;
    @FXML
    private ComboBox<String> chooseStudentComboBox;
    @FXML
    private ComboBox<String> chooseLessonComboBox;
    @FXML
    private Button saveButton;
    @FXML
    private Button backToHomePageButton;
    @FXML
    private AnchorPane pane;
    String comboValue1;
    String comboValue2 ;
   
    //TODO ArrayList list_of_members(comboValue1){
    //if(comboValue.equals("1"){
    // return the programming lesson members ;}
    // else if(comboValue.equals("2")){
    // return the physic lesson members by array list format ;}
    // else if(comboValue.equals("3")){
    // return the mathematic lesson members by array list format;}
    // else if(comboValue.equals("4")){
    // return the logical circuit lesson members by array list format ;
    // hint : comboValue1.equals("1") : the programming item selected ; 
    // hint : comboValue1.equals("2") : the physic item selected ;
    // hint : comboValue1.equals("3") : the mathematic item selected ;
    // hint : comboValue1.equals("4") : the logical circuit item selected ;}
    
    //TODO  ArrayList<String> list = list_of_members();
    
           
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
        chooseLessonComboBox.getItems().add("Programming");
        chooseLessonComboBox.getItems().add("Physic");
        chooseLessonComboBox.getItems().add("Mathematic");    
        chooseLessonComboBox.getItems().add("Logical circuit");

       chooseStudentComboBox.getItems().addAll("" /*TODO list*/);
      
        
        
    }    
    @FXML 
    private void chooseLessonComboBoxHandler(ActionEvent e){
      comboValue1 = chooseLessonComboBox.getValue();
       if(comboValue1.equals("Programming")){
           comboValue1 = "1";
       }
       else if(comboValue1.equals("Physic")){
           comboValue1 = "2";
       }
       else if(comboValue1.equals("Mathematic")){
           comboValue1 = "3";
       }
       else if(comboValue1.equals("Logical circuit")){
           comboValue1 = "4";
       }
     
    }
    @FXML
    private void chooseStudentComboBoxHandler(ActionEvent e){
        
        comboValue2 = chooseStudentComboBox.getValue();
    }

     @FXML
    private void saveButtonHandler(ActionEvent e){
           //TODO void add_student_in_lesson(cpmboValue2){
            // convert 0 to 1 in lesson comboValue1 for member comboValue2 ;}
            
              UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 22));
             JOptionPane.showMessageDialog(null , " Student added in lesson ");
            chooseStudentComboBox.getItems().remove(comboValue2);
    
    }
    @FXML
    private void backToHomePageButtonHandler(ActionEvent e) throws IOException{
         FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("TeacherHomePage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    }
}
