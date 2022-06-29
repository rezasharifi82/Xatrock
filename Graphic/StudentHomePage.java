
package xatrock;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class StudentHomePage implements Initializable {
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
    private Menu examMenue;
    private AnchorPane pane;
    @FXML
    private MenuItem editeProfileMenu;
    @FXML
    private MenuItem logoutMenu;
    @FXML
    private MenuItem physicMenu;
    @FXML
    private MenuItem mathematicMenu;
    @FXML
    private MenuItem programmingMenu;
    @FXML
    private MenuItem logicalcircuitMenu;
    @FXML
    private MenuItem physicExamMenu;
    @FXML
    private MenuItem logicalcircuitExamMenu;
    @FXML
    private MenuItem mathematicExamMenu;
    @FXML
    private MenuItem programmingExamMenu;
    @FXML
    private MenuItem aboutMenu;
    @FXML
    private Menu themMenu;
    @FXML
    private AnchorPane homePane;
    @FXML
    private CheckMenuItem darkThemeCheckMenu;
    @FXML
    private Label timeLabel;
    @FXML
    private Label dateLabel;
    @FXML
    private Label lessonSeparator;
    @FXML
    private Label title;
    @FXML
    private Label eventSeparator;
    @FXML
    private Label calenderSeparetor;
    @FXML
    private Label dateSeparator;
    @FXML
    private Button logoutButton;
    @FXML
    private Label idLabel;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    AnimationTimer timer = new AnimationTimer() {
    @Override
    public void handle(long now) {
    timeLabel.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    dateLabel.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

      }
    };
      timer.start();
      nameLabel.setText(/*TODO select name from db and set here*/"");
      idLabel.setText(/*TODO select id from db and set here*/"");
      //you can find the id ,with emailAddress static value that i define in login page controller ;
      
      
    }    

    @FXML 
    private void messengerButtonHandler(ActionEvent e) throws IOException{
        //TODO setthe ,essenger file name in the below String that i set the messengerPage;
       Parent root = FXMLLoader.load(getClass().getResource("MessengerPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
     
    @FXML
    private void logoutMenuHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)homePane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    private void editeprofileMenuHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    private void mathematicMenuHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    private void physicMenuHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    private void programmingMenuHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    private void logicalCircuitMenuHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    private void mathematicExamMenuHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    private void physicExamMenuHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    private void programmingExamMenuHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    
    }
    private void logicalCircuitExamMenuHandler(ActionEvent e) throws IOException{
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("LoginPage.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)pane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();
    }
    @FXML
    private void logoutButtonHandler (ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        scene = new Scene(root);
        scene = logoutButton.getScene();
        root.translateYProperty().set(scene.getHeight());
        homePane.getChildren().add(root);
        Timeline timeLine = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(),0,Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(1) , kv);
        timeLine.getKeyFrames().add(kf);
        timeLine.play();
        
        

    }

    
    @FXML
    private void themeManager(ActionEvent e){
        if(darkThemeCheckMenu.isSelected()){
     homePane.setStyle("-fx-background-image:url('/xatrock/backgroundDark.png');");
     timeLabel.setStyle("-fx-text-fill:white;");
     dateSeparator.setStyle("-fx-text-fill:white;");
     eventSeparator.setStyle("-fx-text-fill:white;");
     dateLabel.setStyle("-fx-text-fill:white;");
     calenderSeparetor.setStyle("-fx-text-fill:white;");
     lessonSeparator.setStyle("-fx-text-fill:white;");
     title.setStyle("-fx-text-fill:white;");
     nameLabel.setStyle("-fx-text-fill:white;");
     clock.setImage(new Image("/xatrock/lightClock.png"));
     logoutLabel.setImage(new Image("/xatrock/lightLogout.png"));
     
        }
      else if(darkThemeCheckMenu.isSelected() == false){
          homePane.setStyle("-fx-background-image:url('/xatrock/background.png');");
     
              timeLabel.setStyle("-fx-text-fill:black;");
     dateSeparator.setStyle("-fx-text-fill:black;");
     eventSeparator.setStyle("-fx-text-fill:black;");
     dateLabel.setStyle("-fx-text-fill:black;");
     calenderSeparetor.setStyle("-fx-text-fill:black;");
     lessonSeparator.setStyle("-fx-text-fill:black;");
     title.setStyle("-fx-text-fill:black;");
     nameLabel.setStyle("-fx-text-fill:black;");
     clock.setImage(new Image("/xatrock/clock.png"));
     logoutLabel.setImage(new Image("/xatrock/logout.png"));
     
      }
        
      
    }
      @FXML
       private void aboutXatrockHandler(ActionEvent e) throws IOException{
        FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("AboutXatrockPage1.fxml"));
       Parent ReportManager = loader.load();
       Scene ReportManagerScene = new Scene(ReportManager);
       Stage window = (Stage)homePane.getScene().getWindow();
       window.setScene(ReportManagerScene); 
       window.show();

        
    }
    
    
    
}
