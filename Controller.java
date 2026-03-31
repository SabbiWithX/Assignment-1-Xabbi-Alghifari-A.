import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label melabel;

    @FXML
    void Click(ActionEvent event) {

        melabel.setText("you clicked the button!");
        System.out.println("The button were clicked");
    }
}
