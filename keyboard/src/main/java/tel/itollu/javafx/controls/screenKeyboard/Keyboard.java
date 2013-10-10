/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tel.itollu.javafx.controls.screenKeyboard;

import java.io.IOException;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author elias
 */
public class Keyboard extends VBox{
    public Keyboard(){
        String keyboardFxmlFile = "/fxml/keyboard.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(keyboardFxmlFile));
        
        
        
    }
    
}
