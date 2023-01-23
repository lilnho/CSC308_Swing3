import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * The game class that creates and runs the version 1 of the pacman game.
 *
 * @author      Matthew Wingerden
 * @version     1.0
 * @since       1/23/2023
 */
public class Game extends JFrame implements ActionListener, KeyListener {
    private Maze maze;
    private Pacman pacman;
    private Ghost ghost;

    public Game() {
        pacman = new Pacman();
        ghost = new Ghost();
        maze = new Maze(pacman, ghost);
        this.getContentPane().add(maze);
        this.addKeyListener(this);
    }

    public void startTimer() {
        Timer timer = new Timer(100, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        maze.repaint();
    }

    public static void main(String [] args) {
        Game win = new Game();
        win.setSize(500, 500);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.startTimer();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP -> pacman.up();
            case KeyEvent.VK_DOWN -> pacman.down();
            case KeyEvent.VK_LEFT -> pacman.left();
            case KeyEvent.VK_RIGHT -> pacman.right();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

}