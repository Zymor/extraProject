package scene_output;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label_output_data;

    @FXML
    void on_close(ActionEvent event) {
        var stage = (javafx.stage.Stage) label_output_data.getScene().getWindow();

        var view_output = getClass().getResource("../scene_main/View.fxml");
        var controller_output = new scene_main.Controller();
    }

    @FXML
    void initialize() {
        

    }

}
