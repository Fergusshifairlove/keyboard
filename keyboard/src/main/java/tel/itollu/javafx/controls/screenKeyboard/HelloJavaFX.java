package tel.itollu.javafx.controls.screenKeyboard;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

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

    /**
     * Implementation of <code>start</code> method to run JavaFX application
     * @param primaryStage
     * @throws Exception 
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Моя экранная клавиатура");
        Keyboard myKeyboard = new Keyboard();

        StackPane root = new StackPane();
        root.getChildren().add(myKeyboard);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    
}
