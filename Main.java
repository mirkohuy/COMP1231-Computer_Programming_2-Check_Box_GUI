/**
 * T00705586 Mirko July 2022
 * Main calls CheckboxClass
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage stage)
    {
        // create check box system
        Scene myScene = new Scene(new CheckBoxClass(), 300, 200);

        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(300, 300);
        pane.setVgap(10);
        pane.setHgap(10);
        
        // Scene (window content) inside a Stage (window)
        stage.setTitle("Pizza Cost");
        stage.setScene(myScene);

        // Show the Stage (window)
        stage.show();
    }
}
