import java.awt.*;

//code for the Powerdot Class
/**
 *@author Kevin Henderson
 * @version 1.0
 * @since 2023-23-01
 */

public class PowerDot implements Drawable{
    private int PositionX;
    private int PositionY;

    public PowerDot(int x, int y){
        PositionX = x;
        PositionY = y;
    }

    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(PositionX,PositionY,20,20);
    }

}
