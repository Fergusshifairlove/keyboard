package tel.itollu.javafx.controls.screenKeyboard;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

/**
 * Main JavaFx class
 *
 */
public class HelloJavaFX extends Application
{
    public static void main( String[] args )
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Моя новая кнопка");
        Button myShinyNewButton = new Button();
        myShinyNewButton.setText("Нажми меня!");
        myShinyNewButton.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event) {
                System.out.println("Hello JavaFX!");
            }            
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(myShinyNewButton);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    
}
