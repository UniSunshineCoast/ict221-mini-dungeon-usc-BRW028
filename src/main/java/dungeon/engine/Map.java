package dungeon.engine;

import java.util.Arrays;

public class Map {
    private int width;
    private int height;
    private char[][] grid;
    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new char[width][height];
        generateMap();
    }
    private void generateMap() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                grid[x][y] = (x == 0 || x == width - 1 || y == 0 || y == height - 1) ? '#' : ' ';
            }
        }
    }
        public void printMap() {
            for (char[] row : grid) {
                for (char cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
        }
    }

