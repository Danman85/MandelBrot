package MandelBrot.resources;

import java.awt.*;

/**
 * Created by Danman on 03-Mar-16.
 */
public class MBPixel {

    private double y;
    private double x;
    private Color color;
    public final int MAX_ITERATION = 200;

    public MBPixel(int x, int y){
        this.y = (y - 100) / 50;
        this.x = (x - 100) / 50;
        this.color = determineColor(y, x);
    }

    private Color determineColor (double y, double x) {
        double c = Math.sqrt((y * y) + (x * x));
        double z = 0;
        boolean infinite = false;
        for (int n = 0; n < MAX_ITERATION; n++) {
            double zNew = (z * z) + c;
            if (zNew >= 2) {
                infinite = false;
            } else {
                infinite = true;
            }
        }
        if (infinite){
            return new Color(0, 0, 0);
        } else {
            return new Color(153, 221, 255);
        }
    }
}
