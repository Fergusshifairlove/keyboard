package tel.itollu.javafx.controls.screenKeyboard;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

import java.io.IOException;


public class Key extends Button {
    private final String keyFxmlFile = "/fxml/Key.fxml";

    public Key() throws IOException {
        super();
        loadFxmlMarkup();
        this.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Key pressed!");
            }
        });
    }

    private void loadFxmlMarkup() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(this.keyFxmlFile));
        loader.setRoot(this);
        loader.setController(this);
        loader.load();
    }
}
