/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xatrock;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class SubmitPageController implements Initializable {

    @FXML
    private Label notifyLabel;
    @FXML
    private TextField verifyCodeTextField;
    @FXML
    private Button verifyButton;
    @FXML
    private Hyperlink sendCodeAgainHyperLink;
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
