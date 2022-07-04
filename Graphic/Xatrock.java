
package xatrock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Xatrock extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        
        Scene scene = new Scene(root);
        String cssBg = this.getClass().getResource("background.css").toExternalForm();
        scene.getStylesheets().add(cssBg);
        stage.setScene(scene);
        stage.getIcons().add(new Image("/xatrock/logo.png"));
        stage.setTitle("Xatrock");
       
        
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
        
//        Email.send("salehmhosseini2002@gmail.com" , "test" , "hi");
    
    }
    
}
