/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xatrock;

import java.net.URL;
import java.util.ResourceBundle;
 import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
/**
 * FXML Controller class
 *
 * @author HUAWEI
 */
public class HomePageController implements Initializable {


    @FXML
    private AnchorPane homePane;
    @FXML
    private Label nameLabel;
    @FXML
    private MenuBar menuBar;
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
    private Menu examMenue;
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
    private CheckMenuItem darkThemeCheckMenu;
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
    private Label lessonSeparator;
    @FXML
    private Label title;
    @FXML
    private Label eventSeparator;
    @FXML
    private Label calenderSeparetor;
    @FXML
    private ImageView clock;
    @FXML
    private Label timeLabel;
    @FXML
    private Label dateLabel;
    @FXML
    private Label dateSeparator;
    @FXML
    private Button logoutButton;
    @FXML
    private Label idLabel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void logoutMenuHandler(ActionEvent event) {
    }

    @FXML
    private void aboutXatrockHandler(ActionEvent event) {
    }

    @FXML
    private void themeManager(ActionEvent event) {
    }

    @FXML
    private void logoutButtonHandler(ActionEvent event) {
    }

}
