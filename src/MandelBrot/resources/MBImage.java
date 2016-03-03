package MandelBrot.resources;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;

/**
 * Created by Danman on 03-Mar-16.
 */
public class MBImage extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        BufferedImage picture = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        generate(picture);
        g.drawImage(picture, 0, 0, null);
    }

    private void generate (BufferedImage image){
        int height = getHeight();
        int width = getWidth();
        MBPixel[] mb = new MBPixel[height * width];

        for (int y = 0; y < height; y++){
            for (int x = 0; x <width; x++){
                mb[x + (y * width)] = new MBPixel(x, y);
            }
        }
        Raster raster = image.getRaster();
        raster.getDataElements(0, 0, 200, 200, mb);
    }
}
