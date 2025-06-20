package dungeon.gui;

import dungeon.engine.GameEngine;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Objects;

/**
 * GUI for the Maze Runner Game.
 *
 * NOTE: Do NOT run this class directly in IntelliJ - run 'RunGame' instead.
 */
public class GameGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("game_gui.fxml")));
        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.setTitle("MiniDungeon Game");
        primaryStage.show();
    }


    public class MovementApp extends Application {
        private int x = 0, y = 0;

        @Override
        public void start(Stage primaryStage) {
            Button upButton = new Button("Up");
            Button downButton = new Button("Down");
            Button leftButton = new Button("Left");
            Button rightButton = new Button("Right");

            upButton.setOnAction(e -> move("Up"));
            downButton.setOnAction(e -> move("Down"));
            leftButton.setOnAction(e -> move("Left"));
            rightButton.setOnAction(e -> move("Right"));

            VBox layout = new VBox(10, upButton, downButton, leftButton, rightButton);
            Scene scene = new Scene(layout, 200, 200);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Movement Controls");
            primaryStage.show();
        }

        private void move(String direction) {
            switch (direction) {
                case "Up" -> y--;
                case "Down" -> y++;
                case "Left" -> x--;
                case "Right" -> x++;
            }
            System.out.println("Position: (" + x + ", " + y + ")");
        }

        public static void main(String[] args) {
            launch(args);
        }
    }

    /** In IntelliJ, do NOT run this method.  Run 'RunGame.main()' instead. */
    public static void main(String[] args) {
        launch(args);
    }
}
