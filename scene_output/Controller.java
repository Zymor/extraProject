package scene_output;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class Controller {

    @FXML
    private Label label_output;

    @FXML
    void on_close(ActionEvent event) throws Exception {
        var stage = (Stage) label_output.getScene().getWindow();
        var view_output = getClass().getResource("../scene_main/View.fxml");
        var controller_output = new scene_main.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_output);
        loader.setController(controller_output);

        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }
}