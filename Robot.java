
/**
 * Classe Robot ayant une position en 2 dimensions.
 *
 * @author CharlieLamatte && PaulLevelu
 * @version 1.0
 */
public class Robot {
    private int x;
    private int y;
    private String robotName;

    // Constructeur
    public Robot(int x, int y, String robotName) {
        this.x = x;
        this.y = y;
        this.robotName = robotName;
    }

    // Getter pour l'attribut x
    public int getX() {
        return x;
    }

    // Setter pour l'attribut x
    public void setX(int x) {
        this.x = x;
    }

    // Getter pour l'attribut y
    public int getY() {
        return y;
    }

    // Setter pour l'attribut y
    public void setY(int y) {
        this.y = y;
    }

    // Getter pour l'attribut robotName
    public String getRobotName() {
        return robotName;
    }

    // Setter pour l'attribut robotName
    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }
}
