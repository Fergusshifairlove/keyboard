package tel.itollu.javafx.controls.screenKeyboard;

import javafx.scene.control.Button;


public class Key extends Button {

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

}
