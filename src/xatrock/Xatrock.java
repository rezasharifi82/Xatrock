
package xatrock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Xatrock extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        
        Scene scene = new Scene(root);
        String cssBg = this.getClass().getResource("background.css").toExternalForm();
        scene.getStylesheets().add(cssBg);
        stage.setScene(scene);
       
        
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
