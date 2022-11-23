import javax.swing.*;
import java.awt.*;


// 400x400 window with a simple ControllableSquareSprite that can be moved by the user via arrow keys
public class RobotSimulation extends JFrame{

    private static final int DELAY = 40;
    private ControllableRobot playerSprite;

    public RobotSimulation() {
        setSize(new Dimension(800, 800));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Robot Simulation");
        setVisible(true);

        // init ControllableSquareSprite at (175, 175) with width 100 and color Cyan. Set screen bounds to 800px * 800px
        playerSprite = new ControllableRobot(175, 175, 100, Color.RED, 800, 800);

    }
    public ControllableRobot getRobot(){
        return playerSprite;
    }

    public void repaintAndUpdate() {
        playerSprite.update();  
        repaint();
    }
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 800);
        Graphics2D g2d = (Graphics2D) g;
        playerSprite.draw(g2d);
    }

}