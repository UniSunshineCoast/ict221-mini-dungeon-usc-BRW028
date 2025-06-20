package dungeon.engine;

import javafx.scene.text.Text;

import java.util.Scanner;


public class GameEngine {

    /**
     * The size of the current game.
     *
     * @return this is both the width and the height.
     */
    public String getMap() {
        Map.printMap();
    }

    private int x, y;

    public GameEngine(int startX, int startY) {
        this.x = startX;
        this.y = startY;}
        public int getSize(int size){
            return 10;
    }

    public static void main (String[] args) {
        GameEngine engine = new GameEngine(9, 9);
        //Cell[][] map1 = map.printMap();
        int command; //w = up; s = down; a = left; d = right
// Set player name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String playerName = scanner.nextLine();
        Player player1 = new Player(playerName, 0, 10, 100);
        player1.displayPlayerInfo();


        while (player1.getHealth() < 0 && player1.getStamina() > 1)
        {
            System.out.print("Command 1: Up 2: Down 3: Left 4: Right ");
            command = scanner.nextInt();
            switch (command) {
                case 1 -> engine.move("Up");
                case 2 -> engine.move("Down");
                case 3 -> engine.move("Left");
                case 4 -> engine.move("Right");
            }
            player1.reduceStamina(1);
        }
    }

    public void move(String direction) {
        int playerX = this.x;
        int playerY = this.y;
        switch (direction.toLowerCase()) {
            case "left" -> {
                if (playerX > 0) playerX -= 1;
            }
            case "right" -> {
                if (playerX < 9) playerX += 1;
            }
            case "up" -> {
                if (playerY > 0) playerY -= 1;
            }
            case "down" -> {
                if (playerY < 9 ) playerY += 1;
            }
            default -> {
                String s = "Invalid Input";
            }
        }
        this.x = playerX;
        this.y = playerY;

    }
}
