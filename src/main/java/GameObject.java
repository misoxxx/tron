import java.awt.*;
import java.util.ArrayList;

public abstract class GameObject {
    protected Coordinates location;
    protected Color color;

    public GameObject(Coordinates location, Color color) {
        this.location = location;
        this.color = color;
    }

    public Coordinates getLocation() {
        return location;
    }

    public void setLocation(Coordinates location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public abstract void move();

    public abstract boolean checkCollision(GameObject other);

    public abstract void update();
}
