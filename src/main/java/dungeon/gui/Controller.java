package dungeon.gui;

import dungeon.engine.Cell;
import dungeon.engine.GameEngine;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class Controller {
    @FXML
    private GridPane gridPane;

    GameEngine engine;

    @FXML
    public void initialize() {
        engine = new GameEngine(10,10);

        updateGui();
    }

    private void updateGui() {
        //Clear old GUI grid pane
        gridPane.getChildren().clear();

        //Loop through map board and add each cell into grid pane
        int mapSize = engine.getSize(10); // Remove unnecessary argument

        for (int x = 0; x < mapSize; x++) {
            for (int y = 0; y < mapSize; y++) {
                Node cell = engine.getMap()[x][y]; // Ensure Cell is a JavaFX Node
                gridPane.add(cell, y, x); // Verify (column, row) order

            }
        }
        gridPane.setGridLinesVisible(true);
    }

}
