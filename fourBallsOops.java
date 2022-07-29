import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;


    public static final int DIAMETER = 10;
    private final List<Circle> circles = new ArrayList<>();


    public static void main(String[] args) {
        PApplet.main("FourBallsOops", args);
    }

    @Override
    public void settings() {
        super.settings();

        Window window = new Window(640, 480);
        size(window.getWidth(), window.getHeight());

        for (int i = 0; i < 4; i++) {
            createCircleAndAddToList(window.getHeight()/5 * (i+1), i+1);
        }
    }

    @Override
    public void draw() {
        for (Circle circle : circles) {
            drawCircle(circle);
        }
    }

    public void drawCircle(Circle circle) {
        ellipse(circle.getWidth(), circle.getHeight(), circle.getDiameter(), circle.getDiameter());
        circle.incrementWidth();
    }

    public void createCircleAndAddToList(int height, int incrementValue) {
        Circle circle = new Circle(0, height, DIAMETER, incrementValue);
        circles.add(circle);
    }







public class Circle extends PApplet {
    private int width;
    private final int height;
    private final int diameter;
    private final int incrementValue;

    public Circle(int width, int height, int diameter, int incrementValue) {
        this.width = width;
        this.height = height;
        this.diameter = diameter;
        this.incrementValue = incrementValue;
    }

    public void incrementWidth() {
        this.width += this.incrementValue;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDiameter() {
        return diameter;
    }

}










public class Window extends PApplet {
    private final int height;
    private final int width;

    public Window(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
