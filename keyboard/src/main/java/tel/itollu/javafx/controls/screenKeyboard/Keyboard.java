package tel.itollu.javafx.controls.screenKeyboard;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class Keyboard extends VBox {
    private String keyboardFxmlFile = "/fxml/Keyboard.fxml";

    public Keyboard() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(this.keyboardFxmlFile));
    }

    private void loadFxmlMarkup() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(this.keyboardFxmlFile));
    }

}
