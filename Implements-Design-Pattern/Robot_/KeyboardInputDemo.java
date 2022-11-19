import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// 400x400 window with a simple ControllableSquareSprite that can be moved by the user via arrow keys
public class KeyboardInputDemo extends JFrame implements KeyListener {

    private static final int DELAY = 33;        // number of ms delay between frames
    private ControllableSquareSprite playerSprite;  // sprite controlled by the player/user. Receives key input

    public KeyboardInputDemo() {
        // window set-up
        setSize(new Dimension(400, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Keyboard Input Demo");
        setVisible(true);

        // IMPORTANT!! register a listener to this JFrame window
        addKeyListener(this);

        // init ControllableSquareSprite at (175, 175) with width 50 and color Cyan. Set screen bounds to 400px * 400px
        playerSprite = new ControllableSquareSprite(175, 175, 50, Color.CYAN, 400, 400);

        // set up an ActionListener to invalidate the window every DELAY milliseconds
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                playerSprite.update();  // have player-controlled sprite update itself
                repaint();  // repaint the screen
            }
        };

        // start the timer
        new Timer(DELAY, taskPerformer).start();
    }

    // refreshes the screen by painting over it, then draws the playerSprite
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 400, 400);
        Graphics2D g2d = (Graphics2D) g;
        // have the playerSprite draw itself to the window
        playerSprite.draw(g2d);
    }

    @Override  // handle keyTyped action: we can ignore it, but still need it for the interface
    public void keyTyped(KeyEvent e) {

    }

    @Override  // handle keyPressed action: send to playerSprite
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed");
        playerSprite.handleKeyPressed(e);
    }

    @Override  // handle keyReleased action: send to playerSprite
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
        playerSprite.handleKeyReleased(e);
    }
}