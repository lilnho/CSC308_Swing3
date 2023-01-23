import java.awt.*;
/*
Code for the Ghost class.
 */

/**
*@author Pablo Nguyen
 * @version 1.0
 * @since 2023-22-01
 */
public class Ghost implements Drawable{
    private int xPosition = 400;
    private int yPosition = 400;

    public void draw(Graphics g){
        g.setColor(Color.RED);
        if (Math.random() >.5)
            if (Math.random() >.5)
                xPosition += 20;
            else
                xPosition -= 20;
        else
        if (Math.random() >.5)
            yPosition += 20;
        else
            yPosition -= 20;

        if (xPosition > 400) xPosition = 400;
        if (yPosition > 400) yPosition = 400;
        if (xPosition < 0) xPosition = 0;
        if (xPosition < 0) yPosition = 0;

        g.fillRect(xPosition,yPosition, 20, 20);
    }


}
