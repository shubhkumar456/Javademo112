import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Rectangle {
    public static void main(String[] args) {
//
//        int width =10;
//        int height=5;
//
//        for (int i=0; i<height; i++){
//            for (int j=0; j<width; j++){
//                if (i==0 || i==height-1 || j==0 || j==width-1){
//                    System.out.println("#");
//                } else if (i==j || i==height-j-1) {
//                    System.out.print("\\");
//                }
//
//
//
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        Image img = new BufferedImage(300,200, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = (Graphics2D) img.getGraphics();
        g2d.setColor(Color.BLACK);
        g2d.drawRect(50,50,200,100);
        g2d.drawLine(50,50,250,150);
        g2d.drawLine(50,150,250,50);

        JFrame frame = new JFrame();
        frame.getContentPane().add(new JLabel(new ImageIcon(img)));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
