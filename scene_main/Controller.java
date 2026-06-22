package scene_main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

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
       var stage = (Stage) Label_data.getScene().getWindow(); 

       var view_output = getClass().getResource("/scene_output/scene_output.fxml");
       var controller_output = new scene_output.Controller();

       var loader = new FXMLLoader();
       loader.setLocation(view_output);
       loader.setController(controller_output);

        // 
        var scence = new Scene(loader.load());
        //
        stage.setScene(scence); 
        stage.show();

    }

}
