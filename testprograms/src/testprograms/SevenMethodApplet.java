package testprograms;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SevenMethodApplet extends Applet {

    private int startX, startY, endX, endY;
    private boolean drawing;

    // Initialization method
    public void init() {
        // Initialization code goes here
        System.out.println("Initializing the applet...");

        // Set the background color
        setBackground(Color.WHITE);

        // Add mouse listener for drawing
        MyMouseListener listener = new MyMouseListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
    }

    // Start method
    public void start() {
        // Code that needs to run when the applet starts goes here
        System.out.println("Starting the applet...");
    }

    // Stop method
    public void stop() {
        // Code that needs to run when the applet stops goes here
        System.out.println("Stopping the applet...");
    }

    // Cleanup method
    public void destroy() {
        // Cleanup code goes here
        System.out.println("Destroying the applet...");
    }

    // Paint method for drawing graphics
    public void paint(Graphics g) {
        // Drawing code goes here
        g.setColor(Color.BLACK);
        g.drawLine(startX, startY, endX, endY);
    }

    // Update method
    public void update(Graphics g) {
        // Update code goes here
        paint(g);
    }

    // Set background color method
    public void setBackground(Color c) {
        // Set background color code goes here
        super.setBackground(c);
    }

    // Set foreground color method
    public void setForeground(Color c) {
        // Set foreground color code goes here
        super.setForeground(c);
    }

    // Inner class for mouse events
    class MyMouseListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            startX = e.getX();
            startY = e.getY();
            drawing = true;
        }

        public void mouseDragged(MouseEvent e) {
            if (drawing) {
                endX = e.getX();
                endY = e.getY();
                repaint(); // Repaint to update the drawing
                startX = endX;
                startY = endY;
            }
        }

        public void mouseReleased(MouseEvent e) {
            drawing = false;
        }
    }
}
