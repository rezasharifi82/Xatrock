
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudentPhysicExamPageController implements Initializable {

    Stage stage;
    
    Scene scene ;
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
    private RadioButton option1RadioButton;
    @FXML
    private RadioButton option2RadioButton;
    @FXML
    private RadioButton option3RadioButton;
    @FXML
    private RadioButton option4RadioButton;
    @FXML
    private Label questionLabel;
    @FXML
    private Button backToHomePageButton;
    @FXML
    private Button nextButton;
    @FXML
    private Button finishButton;

     @Override
    public void initialize(URL url, ResourceBundle rb) {
    //TODO String pull_default_question_from_db(){
        // return the text of question of 1 in physic lesson ;
        //TODO String pull_default_option1_from_db(){
        // return the text of option1 of 1 in physic lesson ;
        //TODO String pull_default_option2_from_db(){
        // return the text of option2 of 1 in physic lesson ;
        //TODO String pull_default_option3_from_db(){
        // return the text of option3 of 1 in physic lesson ;
        //TODO String pull_default_option4_from_db(){
        // return the text of option4  of 1 in physic lesson ;
        
        
   questionTextFiled.setText(""/*TODO pull_default_question_from_db()*/);
   option1TextField.setText(""/*TODO pull_default_option1_from_db()*/);
   option2TextField.setText(""/*TODO pull_default_option12_from_db()*/);
   option3TextField.setText(""/*TODO pull_default_option3_from_db()*/);
   option4TextField.setText(""/*TODO pull_default_option4_from_db()*/);
   
    }    

    @FXML
    private void option1RadioButtonHandler(ActionEvent e) {
              if (option1RadioButton.isSelected()){
            option2RadioButton.setSelected(false);
            option3RadioButton.setSelected(false);
            option4RadioButton.setSelected(false);
            //save_answer_in_db("1");
        }
    }

    @FXML
    private void option2RadioButtonHandler(ActionEvent e) {
               if (option2RadioButton.isSelected()){
            option1RadioButton.setSelected(false);
            option3RadioButton.setSelected(false);
            option4RadioButton.setSelected(false);
            //save_answer_in_db("2");
        }
    }

    @FXML
    private void option3RadioButtonHandler(ActionEvent e) {
                   if (option3RadioButton.isSelected()){
            option2RadioButton.setSelected(false);
            option1RadioButton.setSelected(false);
            option4RadioButton.setSelected(false);
            //save_answer_in_db("3");
        }
    }

    @FXML
    private void option4RadioButtonHandler(ActionEvent e) {
               if (option4RadioButton.isSelected()){
            option2RadioButton.setSelected(false);
            option3RadioButton.setSelected(false);
            option1RadioButton.setSelected(false);
            //save_answer_in_db("4");
        }
    }
//TODO void save_answer_in_db(String s){
   // save the btn  answer in db;} 
    @FXML
    private void backToHomePageButtonHandler(ActionEvent e) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("StudentHomePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
    }

    @FXML
    private void nextButtonHandler(ActionEvent e) throws IOException {
          //TODO String pull_question_count_question_from_db(){
        // return the text of question of question_count in physic lesson ;
        //TODO String pull_question_count_option1_from_db(){
        // return the text of option1 of question_count in physic lesson ;
        //TODO String pull_question_count_option2_from_db(){
        // return the text of option2 of question_count in physic lesson ;
        //TODO String pull_question_count_option3_from_db(){
        // return the text of option3 of question_count in physic lesson ;
        //TODO String pull_question_count_option4_from_db(){
        // return the text of option4  of question_count in physic lesson ;
        //TODO void is_question_in_db_exist(question_count){
        // if the question of number question_count is exist {
        //question_count++ ; 
        // questionTextFiled.setText(pull_question_count_question_from_db());
        //option1TextField.setText( pull_question_count_option1_from_db());
        // option2TextField.setText( pull_question_count_option12_from_db());
        // option3TextField.setText( pull_question_count_option3_from_db());
        //option4TextField.setText( pull_question_count_option4_from_db());}
        // else{
       finishButton.setDisable(false);
        //}
        
        Parent root = FXMLLoader.load(getClass().getResource("StudentMathematicExamPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void finishButtonHandler(ActionEvent e) throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("StudenHomePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
    }
    
}
