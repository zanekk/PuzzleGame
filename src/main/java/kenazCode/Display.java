package kenazCode;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Display {
    JFrame frame ;
    //JButton[][] buttons = new JButton[3][3];

    //private final List<JButton> buttons = new ArrayList<JButton>();

    JButton B1,B2,B3,B4,B5,B6,B7,B8;
    int rows , col;
    JPanel panel =new JPanel();

    public Display(int width,int height){
        frame = new JFrame("PuzzleGame");
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(3,3);
        frame.setLocationRelativeTo(null);

        frame.setLayout(grid);

        B1 = new JButton();
        B2 = new JButton();
        B3 = new JButton();
        B4 = new JButton();
        B5 = new JButton();
        B6 = new JButton();
        B7 = new JButton();
        B8 = new JButton();


        B1.setIcon(new ImageIcon("/home/zanek/Pulpit/IT/JAVA/JAVAzadania/PuzzleGame/src/main/java/kenazCode/1.jpg"));
        B2.setIcon(new ImageIcon("/home/zanek/Pulpit/IT/JAVA/JAVAzadania/PuzzleGame/src/main/java/kenazCode/2.jpg"));
        B3.setIcon(new ImageIcon("/home/zanek/Pulpit/IT/JAVA/JAVAzadania/PuzzleGame/src/main/java/kenazCode/3.jpg"));
        B4.setIcon(new ImageIcon("/home/zanek/Pulpit/IT/JAVA/JAVAzadania/PuzzleGame/src/main/java/kenazCode/4.jpg"));
        B5.setIcon(new ImageIcon("/home/zanek/Pulpit/IT/JAVA/JAVAzadania/PuzzleGame/src/main/java/kenazCode/5.jpg"));
        B6.setIcon(new ImageIcon("/home/zanek/Pulpit/IT/JAVA/JAVAzadania/PuzzleGame/src/main/java/kenazCode/6.jpg"));
        B7.setIcon(new ImageIcon("/home/zanek/Pulpit/IT/JAVA/JAVAzadania/PuzzleGame/src/main/java/kenazCode/7.jpg"));
        B8.setIcon(new ImageIcon("/home/zanek/Pulpit/IT/JAVA/JAVAzadania/PuzzleGame/src/main/java/kenazCode/8.jpg"));


        frame.add(B1);
        frame.add(B2);
        frame.add(B3);
        frame.add(B4);
        frame.add(B5);
        frame.add(B6);
        frame.add(B7);
        frame.add(B8);

        frame.setVisible(true);
        getButton(B1);
    }


    public int get(JButton button){

        int ex = button.getLocationOnScreen().x;
        System.out.print(ex);
        return ex;
    }


    public void setCol(){


    }

    public void setRows(){


    }
    public int getRows(JButton button){

        return  rows;
    }
    public int getCol(){

        return col;
    }
}
