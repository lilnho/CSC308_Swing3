import javax.swing.*;
import java.awt.*;

/**
 * Maze class sets up the maze for the game.
 *
 * @author Juan Custodio
 * @version 1.0
 * @since 1/23/2023
 */
public class Maze extends JPanel
{

    private Drawable[] items = new Drawable[3];

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(0,0,500,500);
        for(int i = 0; i < 500; i = i +10)
        {
            g.drawLine(i, 0, i, 500);
        }
        for(int i = 0; i < 500; i = i + 10)
        {
            g.drawLine(0, i, 500, i);
        }
        for(int i = 0; i < items.length; i++)
        {
            items[i].draw(g);
        }
    }

    public Maze(Pacman pacman, Ghost ghost)
    {
        items[0] = pacman;
        items[1] = ghost;
        items[2] = new PowerDot(300, 30);
    }
}
