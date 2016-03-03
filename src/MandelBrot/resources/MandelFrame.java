package MandelBrot.resources;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Danman on 02-Mar-16.
 */
public class MandelFrame extends JFrame{

    public MandelFrame () {
        setTitle("Mandelbrot");
        setSize(400, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton drawMandelbrot = new JButton("Draw Mandelbrot picture!");
        JPanel draw = new JPanel();
        draw.setOpaque(true);
        draw.setBackground(Color.lightGray);

        setLayout(new BorderLayout());

        Container c = getContentPane();
        c.add(drawMandelbrot, BorderLayout.NORTH);
        c.add(draw, BorderLayout.CENTER);

        drawMandelbrot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                draw.add(new MBImage(), "center");
            }
        });
    }

}
