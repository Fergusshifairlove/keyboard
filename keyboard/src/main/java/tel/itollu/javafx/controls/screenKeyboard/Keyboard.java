package tel.itollu.javafx.controls.screenKeyboard;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class Keyboard extends VBox {


    public Keyboard() {
        String keyboardFxmlFile = "/fxml/keyboard.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(keyboardFxmlFile));

    }

}
