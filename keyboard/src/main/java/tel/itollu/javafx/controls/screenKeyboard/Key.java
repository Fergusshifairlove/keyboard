package tel.itollu.javafx.controls.screenKeyboard;

import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;


public class Key extends Button {
    private final String keyFxmlFile = "/fxml/Key.fxml";

    private String label;
    private int scanCode;

    public Key() {
        super();
    }

    public Key(String label, int scanCode) {
        super();
        this.label = label;
        this.scanCode = scanCode;
    }

    private void loadFxmlMarkup() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(this.keyFxmlFile));
    }

}
