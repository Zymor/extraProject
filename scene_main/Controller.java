package scene_main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label Label_data;

    @FXML
    private TextField TEXTFIELD_DATA;

    @FXML
    void GO_TO_INPUT_BUTTON(ActionEvent event) {

    }

    @FXML
    void GO_TO_OUPUT_BUTTON(ActionEvent event) {
        Stage = Label_data.getScene().getWindow();

    }

}
