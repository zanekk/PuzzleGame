package kenazCode;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class Display {
    JFrame frame ;
    JButton B1;
    JPanel panel =new JPanel();

    public Display(int width,int height){
        frame = new JFrame("PuzzleGame");
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        B1 = new JButton();
        //B1.setIcon(new ImageIcon("/home/zanek/Pulpit/IT/JAVA/JAVAzadania/PuzzleGame/src/main/java/kenazCode/1.jpg"));
        B1.setSize(100,100);

        panel.add(B1);
        frame.add(panel);



        frame.setVisible(true);


    }
}
