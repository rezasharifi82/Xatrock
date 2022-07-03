
package xatrock;

import java.awt.Font;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class MakeExamPageController implements Initializable {

    Scene scene ;
    Stage stage ;
    String question ;
    String option1;
    String option2;
    String option3;
    String option4;
    String correctAnswer ;
    String lessonComboValue ;
    String examNumberComboValue ;
    @FXML
    private RadioButton option1RadioButton;
    @FXML
    private RadioButton option2RadioButton;
    @FXML
    private RadioButton option3RadioButton;
    @FXML
    private RadioButton option4RadioButton;
    @FXML
    private Button fixButton;
    @FXML
    private Button nextButton;
    @FXML
    private Button finishButton;
    @FXML
    private Button backToLessonPageButton;
    @FXML
    private Button backToHomePageButton;
    @FXML
    private Label questionLabel;
    @FXML
    private TextField questionTextFiled;
    @FXML
    private TextField option4TextField;
    @FXML
    private TextField option3TextField;
    @FXML
    private TextField option2TextField;
    @FXML
    private TextField option1TextField;
    @FXML
    private ComboBox<String> lessonComboBox;
    @FXML
    private ComboBox<String> examNumberComboBox;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  questionTextFiled.setVisible(true);
  option1TextField.setVisible(true);
  option2TextField.setVisible(true);
  option3TextField.setVisible(true);
  option4TextField.setVisible(true);
  option1RadioButton.setText("");
  option2RadioButton.setText("");
  option3RadioButton.setText("");
  option4RadioButton.setText("");
  questionLabel.setText("");
  lessonComboBox.getItems().addAll("Programming" , "Physic" , "Mathematic" , "Logical circuit");
  examNumberComboBox.getItems().addAll("1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10");
        
    } 
    @FXML
    private void finishButtonHandler(ActionEvent e) throws IOException{
          Parent root = FXMLLoader.load(getClass().getResource("MakeSuccessfullyExamPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
     }
    @FXML
    private void nextButtonHandler(ActionEvent e) throws IOException{
          Parent root = FXMLLoader.load(getClass().getResource("MakeExamPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        
        
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
    private void backToLessonPageButtonHandler(ActionEvent e) throws IOException{
          Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    @FXML
    private void fixButtonHandler(ActionEvent e){
        
     
       if(option1RadioButton.isSelected()==false&&
               option2RadioButton.isSelected()==false&&
               option3RadioButton.isSelected()==false&&
               option4RadioButton.isSelected()==false ){
             UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 22));
             JOptionPane.showMessageDialog(null , "Please enter the correct option");
       }
       else if(option1.equals("")){
                 UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 22));
             JOptionPane.showMessageDialog(null , "Please fill the option1");
     
       }
        else if(option2.equals("")){
                 UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 22));
             JOptionPane.showMessageDialog(null , "Please fill the option2");
     
       }
         else if(option3.equals("")){
                 UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 22));
             JOptionPane.showMessageDialog(null , "Please fill the option3");
     
       }
          else if(option4.equals("")){
                 UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 22));
             JOptionPane.showMessageDialog(null , "Please fill the option4");
     
       }
            else if(question.equals("")){
                 UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 22));
             JOptionPane.showMessageDialog(null , "Please fill the question");
     
       }
       else{
       // TODO void save_in_db(question , option1RadioButton,option2RadioButton , option3RadioButton , option4RadioButton  option1 , option2 , option3 , option4 , lessonComboValue , examNumberComboValue){
       //if(lessonComboValue.equals("1"){
       // that means the exam is for programming lesson . 
       //so , save exam in programming lesson table in exam cloumn .}
        //else if(lessonComboValue.equals("2"){
       // that means the exam is for physic lesson . 
       //so , save exam in physic lesson table in exam cloumn .}
       //else if(lessonComboValue.equals("3"){
       // that means the exam is for mathematic lesson . 
       //so , save exam in mathematic lesson table in exam cloumn .}
       //else if(lessonComboValue.equals("4"){
       // that means the exam is for logical circuit lesson . 
       //so , save exam in logical circuit lesson table in exam cloumn .}
       // we have to have a table for exams ;
       //  } 
       // if(examNumberComboValue.equals("1"){
       // thath means the number of exam is 1 , so save this exam in exam 1 ;}
       //if(option1RadioButton) // that means the option 1 is correct answer ;
       //else if(option2RadioButton) // that means the option 2 is correct answer ;
       //else if(option3RadioButton) // that means the option 3 is correct answer ;
       //else if(option4RadioButton) // that means the option 4 is correct answer ;}}
       
      nextButton.setDisable(false);
      finishButton.setDisable(false);
      fixButton.setDisable(true);
        
      questionTextFiled.setEditable(false);
      
      
      option1TextField.setEditable(false);
      
      
      option2TextField.setEditable(false);
     
      
      option3TextField.setEditable(false); 
      
      
      option4TextField.setEditable(false);
    
       }
    }
     @FXML 
    private void questionTextFieldHandler(ActionEvent e){
        option1TextField.requestFocus();
        question=option1TextField.getText();
    }
     @FXML 
    private void option1TextFieldHandler(ActionEvent e){
        
        option2TextField.requestFocus();
        option1 = option1TextField.getText();
    }
     @FXML 
    private void option2TextFieldHandler(ActionEvent e){
        option3TextField.requestFocus();
        option2 = option2TextField.getText();
    }
     @FXML 
    private void option3TextFieldHandler(ActionEvent e){
        option4TextField.requestFocus();
        option3 = option3TextField.getText();
    }
     @FXML 
    private void option4TextFieldHandler(ActionEvent e){
        fixButton.requestFocus();
        option4 = option4TextField.getText();
    }
     @FXML 
    private void option1RadioButtonHandler(ActionEvent e){
        if (option1RadioButton.isSelected()){
            option2RadioButton.setSelected(false);
            option3RadioButton.setSelected(false);
            option4RadioButton.setSelected(false);
            
        }
        
    }
     @FXML 
    private void option2RadioButtonHandler(ActionEvent e){
         if (option2RadioButton.isSelected()){
            option1RadioButton.setSelected(false);
            option3RadioButton.setSelected(false);
            option4RadioButton.setSelected(false);
            
        }
    }
     @FXML 
    private void option3RadioButtonHandler(ActionEvent e){
         if (option3RadioButton.isSelected()){
            option2RadioButton.setSelected(false);
            option4RadioButton.setSelected(false);
            option1RadioButton.setSelected(false);
            
        }
    }
     @FXML 
    private void option4RadioButtonHandler(ActionEvent e){
         if (option4RadioButton.isSelected()){
            option2RadioButton.setSelected(false);
            option3RadioButton.setSelected(false);
            option1RadioButton.setSelected(false);
           
        }
    }
    @FXML 
    private void lessonComboBoxHandler(ActionEvent e){
        lessonComboValue=lessonComboBox.getValue();
       
       if(lessonComboValue.equals("Programming")){
           lessonComboValue = "1";
       }
       else if(lessonComboValue.equals("Physic")){
           lessonComboValue = "2";
       }
       else if(lessonComboValue.equals("Mathematic")){
           lessonComboValue = "3";
       }
       else if(lessonComboValue.equals("Logical circuit")){
           lessonComboValue = "4";
       }
        
    }
    @FXML
    private void examNumberComboBoxHandler(ActionEvent e){
        examNumberComboValue = examNumberComboBox.getValue();
        
    }
    
    
    
}
