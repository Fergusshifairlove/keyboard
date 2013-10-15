package tel.itollu.javafx.controls.screenKeyboard;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class Keyboard extends VBox {
    private String keyboardFxmlFile = "/fxml/Keyboard.fxml";

    public Keyboard() throws IOException {
        loadFxmlMarkup();
    }

    private void loadFxmlMarkup() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(this.keyboardFxmlFile));
        loader.setRoot(this);
        loader.setController(this);
        loader.load();
    }

}
