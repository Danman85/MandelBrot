package MandelBrot;

import MandelBrot.resources.MandelFrame;

import javax.swing.*;

/**
 * Created by Danman on 02-Mar-16.
 */
public class MBApp {


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {

                JFrame mandel = new MandelFrame();

            }
        });
    }
}
