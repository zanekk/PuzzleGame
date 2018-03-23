package kenazCode;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Display {
    JFrame frame ;
    int rows , col;
    GridBagConstraints gbc = new GridBagConstraints();
    JButton[][] allButtons = new JButton[3][3];
    final int id1, id2, id3, id4, id5, id6, id7, id8;
    int p1,p2,p3,p4,p5,p6,p7,p8;

    public Display(int width,int height){
        frame = new JFrame("PuzzleGame");
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setResizable(false);
        GridBagLayout grid = new GridBagLayout();

        frame.setLayout(grid);


        //j = cols i = rows
        for(int j = 0; j < 3;j++){
            for(int i = 0; i < 3; i++ ) {
                allButtons[i][j] = new JButton();
                gbc.gridx = j+1;
                gbc.gridy = i+1;
                frame.add(allButtons[i][j], gbc);
                allButtons[i][j].setBorder(null);
                allButtons[i][j].putClientProperty("column", j+1);
                allButtons[i][j].putClientProperty("row", i+1);
            }}
        frame.remove(allButtons[2][2]);

        id1 = 1;
        id2 = 2;
        id3 = 3;
        id4 = 4;
        id5 = 5;
        id6 = 6;
        id7 = 7;
        id8 = 8;

        p1 = 1;
        p2 = 2;
        p3 = 3;
        p4 = 4;
        p5 = 5;
        p6 = 6;
        p7 = 7;
        p8 = 8;


        allButtons[0][0].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\1.jpg"));
        allButtons[0][1].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\2.jpg"));
        allButtons[0][2].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\3.jpg"));
        allButtons[1][0].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\4.jpg"));
        allButtons[1][1].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\5.jpg"));
        allButtons[1][2].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\6.jpg"));
        allButtons[2][0].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\7.jpg"));
        allButtons[2][1].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\8.jpg"));

        frame.setVisible(true);

        actionForThemAll(allButtons[0][0]);
        actionForThemAll(allButtons[0][1]);
        actionForThemAll(allButtons[0][2]);
        actionForThemAll(allButtons[1][0]);
        actionForThemAll(allButtons[1][1]);
        actionForThemAll(allButtons[1][2]);
        actionForThemAll(allButtons[2][0]);
        actionForThemAll(allButtons[2][1]);


    }
    public void actionForThemAll(JButton buton){
        final JButton fButton = buton;
        buton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                selectionButtonPressed(fButton);
            }
        });

    }

    public void selectionButtonPressed(JButton buton){

        int row = (Integer) buton.getClientProperty("row");
        int col = (Integer) buton.getClientProperty("column");
        int emptyI , emptyJ ;
         if((Integer)buton.getClientProperty("row")==2 && (Integer)buton.getClientProperty("column") == 3){
             for(int j = 0; j<8; j++){
             for(int i = 0 ; i<8; i++) {
             if((Integer)allButtons[i][j].getClientProperty("row") == 2  && (Integer) allButtons[i][j].getClientProperty("column") == 2){

             }else if((Integer)allButtons[i][j].getClientProperty("row") == 1 && (Integer)allButtons[i][j].getClientProperty("column") == 3){

                 }else if((Integer)allButtons[i][j].getClientProperty("row") == 3 && (Integer)allButtons[i][j].getClientProperty("column") == 3){

                 }else


             }
             }
         }/*else if((Integer)buton.getClientProperty("row")==3 && (Integer)buton.getClientProperty("column") == 3){
            for(int j = 0; j<8; j++){
                for(int i = 0 ; i < 8 ; i++) {
                    if((Integer)allButtons[i][j].getClientProperty("row") != 2 && (Integer)allButtons[i][j].getClientProperty("column") != 3){
                        gbc.gridy = 2;
                        gbc.gridx = 3;

                        buton.putClientProperty("column", 3);
                        buton.putClientProperty("row", 2);

                        frame.remove(buton);
                        frame.add(buton,gbc);
                        frame.setVisible(true);
                    }


                }
            }
        }else if((Integer)buton.getClientProperty("row")==3 && (Integer)buton.getClientProperty("column") == 3){
             for(int j = 0; j<8; j++){
                 for(int i = 0 ; i < 8 ; i++) {
                     if((Integer)allButtons[i][j].getClientProperty("row") != 2 && (Integer)allButtons[i][j].getClientProperty("column") != 3){
                         gbc.gridy = 2;
                         gbc.gridx = 3;

                         buton.putClientProperty("column", 3);
                         buton.putClientProperty("row", 2);

                         frame.remove(buton);
                         frame.add(buton,gbc);
                         frame.setVisible(true);
                     }


                 }
             }
         }else if((Integer)buton.getClientProperty("row")==3 && (Integer)buton.getClientProperty("column") == 3){
             for(int j = 0; j<8; j++){
                 for(int i = 0 ; i < 8 ; i++) {
                     if((Integer)allButtons[i][j].getClientProperty("row") != 2 && (Integer)allButtons[i][j].getClientProperty("column") != 3){
                         gbc.gridy = 2;
                         gbc.gridx = 3;

                         buton.putClientProperty("column", 3);
                         buton.putClientProperty("row", 2);

                         frame.remove(buton);
                         frame.add(buton,gbc);
                         frame.setVisible(true);
                     }


                 }
             }
         }else if((Integer)buton.getClientProperty("row")==3 && (Integer)buton.getClientProperty("column") == 3){
             for(int j = 0; j<8; j++){
                 for(int i = 0 ; i < 8 ; i++) {
                     if((Integer)allButtons[i][j].getClientProperty("row") != 2 && (Integer)allButtons[i][j].getClientProperty("column") != 3){
                         gbc.gridy = 2;
                         gbc.gridx = 3;

                         buton.putClientProperty("column", 3);
                         buton.putClientProperty("row", 2);

                         frame.remove(buton);
                         frame.add(buton,gbc);
                         frame.setVisible(true);
                     }


                 }
             }
         }else if((Integer)buton.getClientProperty("row")==3 && (Integer)buton.getClientProperty("column") == 3){
             for(int j = 0; j<8; j++){
                 for(int i = 0 ; i < 8 ; i++) {
                     if((Integer)allButtons[i][j].getClientProperty("row") != 2 && (Integer)allButtons[i][j].getClientProperty("column") != 3){
                         gbc.gridy = 2;
                         gbc.gridx = 3;

                         buton.putClientProperty("column", 3);
                         buton.putClientProperty("row", 2);

                         frame.remove(buton);
                         frame.add(buton,gbc);
                         frame.setVisible(true);
                     }


                 }
             }
         }else if((Integer)buton.getClientProperty("row")==3 && (Integer)buton.getClientProperty("column") == 3){
             for(int j = 0; j<8; j++){
                 for(int i = 0 ; i < 8 ; i++) {
                     if((Integer)allButtons[i][j].getClientProperty("row") != 2 && (Integer)allButtons[i][j].getClientProperty("column") != 3){
                         gbc.gridy = 2;
                         gbc.gridx = 3;

                         buton.putClientProperty("column", 3);
                         buton.putClientProperty("row", 2);

                         frame.remove(buton);
                         frame.add(buton,gbc);
                         frame.setVisible(true);
                     }


                 }
             }
         }else if((Integer)buton.getClientProperty("row")==3 && (Integer)buton.getClientProperty("column") == 3){
             for(int j = 0; j<8; j++){
                 for(int i = 0 ; i < 8 ; i++) {
                     if((Integer)allButtons[i][j].getClientProperty("row") != 2 && (Integer)allButtons[i][j].getClientProperty("column") != 3){
                         gbc.gridy = 2;
                         gbc.gridx = 3;

                         buton.putClientProperty("column", 3);
                         buton.putClientProperty("row", 2);

                         frame.remove(buton);
                         frame.add(buton,gbc);
                         frame.setVisible(true);
                     }


                 }
             }
         }*/
      //  gbc.gridx = 3;
      //  gbc.gridy = 3;




    }

    public int definitionOfButtons(JButton buton){
        if(buton == allButtons[0][0]){
            return id1;
        }else if(buton == allButtons[0][1]){
            return id2;
        }else if(buton == allButtons[0][2]){
            return id3;
        }else if(buton == allButtons[1][0]){
            return id4;
        }else if(buton == allButtons[1][1]){
            return id5;
        }else if(buton == allButtons[1][2]){
            return id6;
        }else if(buton == allButtons[2][0]){
            return id7;
        }else if(buton == allButtons[2][1]){
            return id8;
        }
    return 0;
    }

    public void something(){



    }







}



