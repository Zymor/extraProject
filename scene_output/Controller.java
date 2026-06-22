package scene_output;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class Controller {

    @FXML
    private Label label_output;

    @FXML
    void on_close(ActionEvent event) throws Exception {
        var stage = (Stage) label_output.getScene().getWindow();
        var view_main = getClass().getResource("scene_main/View.fxml");
        var controller_main = new scene_main.Controller();        
        var loader = new FXMLLoader();
        loader.setLocation(view_main);
        loader.setController(controller_main);
        
        var scene = new Scene(loader.load());
        
        stage.setScene(scene);
        stage.show(); 
    }
}