import processing.core.PApplet;



public static final int WIDTH = 640;
public static final int HEIGHT = 480;
public static final int DIAMETER = 20;

        int width1 = 0;
        int width2 = 0;
        int width3 = 0;
        int width4 = 0;

public static void main(String[] args) {
        PApplet.main("tp", args);
        }

@Override
public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        }

@Override
public void draw() {
        drawCircle(width1+=1,HEIGHT/5, DIAMETER, DIAMETER);
        drawCircle(width2+=2,HEIGHT/5 * 2, DIAMETER, DIAMETER);
        drawCircle(width3+=3,HEIGHT/5 * 3, DIAMETER, DIAMETER);
        drawCircle(width4+=4,HEIGHT/5 * 4, DIAMETER, DIAMETER);

        }

private void drawCircle(int width, int height, int diameter1, int diameter2) {
        ellipse(width, height, diameter1, diameter2);
        }
