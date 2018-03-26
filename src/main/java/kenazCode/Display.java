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
    boolean stat1, stat2, stat3, stat4, stat5, stat6, stat7, stat8;
    boolean stat9 = false;


    public Display(int width,int height){
        stat1 =true;
        stat2 =true;
        stat3 =true;
        stat4 =true;
        stat5 =true;
        stat6 =true;
        stat7 =true;
        stat8 =true;

        id1 = 1;
        id2 = 2;
        id3 = 3;
        id4 = 4;
        id5 = 5;
        id6 = 6;
        id7 = 7;
        id8 = 8;

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
                allButtons[i][j].setBorder(null);
                allButtons[i][j].putClientProperty("column", j+1);
                allButtons[i][j].putClientProperty("row", i+1);
            }}

        settingFirstQueue();

        allButtons[0][0].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\1.jpg"));
        allButtons[0][1].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\2.jpg"));
        allButtons[0][2].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\3.jpg"));
        allButtons[1][0].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\4.jpg"));
        allButtons[1][1].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\5.jpg"));
        allButtons[1][2].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\6.jpg"));
        allButtons[2][0].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\7.jpg"));
        allButtons[2][1].setIcon(new ImageIcon("E:\\IT\\JAVA\\PuzzleGame\\src\\main\\java\\kenazCode\\8.jpg"));

        frame.setVisible(true);


        allButtons[0][0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                selectionButtonPressed(allButtons[0][0]);
            }
        });

        allButtons[0][1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                selectionButtonPressed(allButtons[0][1]);
            }
        });
        allButtons[0][2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                selectionButtonPressed(allButtons[0][2]);
            }
        });
        allButtons[1][0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                selectionButtonPressed(allButtons[1][0]);
            }
        });
        allButtons[1][1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                selectionButtonPressed(allButtons[1][1]);
            }
        });
        allButtons[1][2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                selectionButtonPressed(allButtons[1][2]);
            }
        });
        allButtons[2][0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                selectionButtonPressed(allButtons[2][0]);
            }
        });
        allButtons[2][1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                selectionButtonPressed(allButtons[2][1]);
            }
        });



    }


    public void selectionButtonPressed(JButton buton){

        int row = (Integer) buton.getClientProperty("row");
        int col = (Integer) buton.getClientProperty("column");

         if((row == 2) && (col == 3)){

             if(stat9 == false){


                 gbc.gridy = 3;
                 gbc.gridx = 3;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 3);
                 buton.putClientProperty("row", 3);

                 stat9 = true;

                 frame.remove(buton);
                 frame.add(buton,gbc);
                 frame.setVisible(true);


             }else if(stat5 == false){


                 gbc.gridy = 2;
                 gbc.gridx = 2;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 2);
                 buton.putClientProperty("row", 2);

                 stat5 = true;

                 frame.remove(buton);
                 frame.add(buton,gbc);
                 frame.setVisible(true);

             }else if(stat3 == false) {


                 gbc.gridy = 1;
                 gbc.gridx = 3;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 3);
                 buton.putClientProperty("row", 1);

                 stat3 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);
             }
             }else if((row == 3) && (col == 3)) {

                 if (stat6 == false) {

                     gbc.gridy = 2;
                     gbc.gridx = 3;

                     setbooleanOfButtons(buton, false);

                     buton.putClientProperty("column", 3);
                     buton.putClientProperty("row", 2);

                     stat6 = true;


                     frame.remove(buton);
                     frame.add(buton, gbc);
                     frame.setVisible(true);

                 } else if (stat8 == false) {


                     gbc.gridy = 3;
                     gbc.gridx = 2;

                     setbooleanOfButtons(buton, false);

                     buton.putClientProperty("column", 2);
                     buton.putClientProperty("row", 3);

                     stat8 = true;

                     frame.remove(buton);
                     frame.add(buton, gbc);
                     frame.setVisible(true);

                 }
             }else if((row == 2) && (col == 2)) {

             if (stat6 == false) {

                 gbc.gridy = 2;
                 gbc.gridx = 3;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 3);
                 buton.putClientProperty("row", 2);

                 stat6 = true;


                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             } else if (stat2 == false) {


                 gbc.gridy = 1;
                 gbc.gridx = 2;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 2);
                 buton.putClientProperty("row", 1);

                 stat2 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             }else if (stat4 == false) {


                 gbc.gridy = 2;
                 gbc.gridx = 1;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 1);
                 buton.putClientProperty("row", 2);

                 stat4 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             }else if (stat8 == false) {


                 gbc.gridy = 3;
                 gbc.gridx = 2;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 2);
                 buton.putClientProperty("row", 3);

                 stat8 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             }
         }else if((row == 1) && (col == 3)) {

             if (stat6 == false) {

                 gbc.gridy = 2;
                 gbc.gridx = 3;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 3);
                 buton.putClientProperty("row", 2);

                 stat6 = true;


                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             } else if (stat2 == false) {


                 gbc.gridy = 1;
                 gbc.gridx = 2;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 2);
                 buton.putClientProperty("row", 1);

                 stat2 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             }
         }else if((row == 1) && (col == 2)) {

             if (stat3 == false) {

                 gbc.gridy = 1;
                 gbc.gridx = 3;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 3);
                 buton.putClientProperty("row", 1);

                 stat3 = true;


                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             } else if (stat1 == false) {


                 gbc.gridy = 1;
                 gbc.gridx = 1;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 1);
                 buton.putClientProperty("row", 1);

                 stat1 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             } else if (stat5 == false) {


                 gbc.gridy = 2;
                 gbc.gridx = 2;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 2);
                 buton.putClientProperty("row", 2);

                 stat5 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             }
         }else if((row == 1) && (col == 1)) {

             if (stat2 == false) {

                 gbc.gridy = 1;
                 gbc.gridx = 2;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 2);
                 buton.putClientProperty("row", 1);

                 stat2 = true;


                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             } else if (stat4 == false) {


                 gbc.gridy = 2;
                 gbc.gridx = 1;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 1);
                 buton.putClientProperty("row", 2);

                 stat4 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             }
         }else if((row == 2) && (col == 1)) {

             if (stat1 == false) {

                 gbc.gridy = 1;
                 gbc.gridx = 1;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 1);
                 buton.putClientProperty("row", 1);

                 stat1 = true;


                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             } else if (stat5 == false) {


                 gbc.gridy = 2;
                 gbc.gridx = 2;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 2);
                 buton.putClientProperty("row", 2);

                 stat5 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             } else if (stat7 == false) {


                 gbc.gridy = 3;
                 gbc.gridx = 1;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 1);
                 buton.putClientProperty("row", 3);

                 stat7 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             }
         }else if((row == 3) && (col == 2)) {

             if (stat7 == false) {

                 gbc.gridy = 3;
                 gbc.gridx = 1;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 1);
                 buton.putClientProperty("row", 3);

                 stat7 = true;


                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             } else if (stat5 == false) {


                 gbc.gridy = 2;
                 gbc.gridx = 2;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 2);
                 buton.putClientProperty("row", 2);

                 stat5 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             } else if (stat9 == false) {


                 gbc.gridy = 3;
                 gbc.gridx = 3;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 3);
                 buton.putClientProperty("row", 3);

                 stat9 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             }
         }else if((row == 3) && (col == 1)) {

             if (stat4 == false) {

                 gbc.gridy = 2;
                 gbc.gridx = 1;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 1);
                 buton.putClientProperty("row", 2);

                 stat4 = true;


                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             } else if (stat8 == false) {


                 gbc.gridy = 3;
                 gbc.gridx = 2;

                 setbooleanOfButtons(buton, false);

                 buton.putClientProperty("column", 2);
                 buton.putClientProperty("row", 3);

                 stat8 = true;

                 frame.remove(buton);
                 frame.add(buton, gbc);
                 frame.setVisible(true);

             }
         }

         }



    public boolean booleanOfButtons(JButton buton){
        if((Integer)buton.getClientProperty("row") == 1 && (Integer)buton.getClientProperty("column") == 1    ){
            return stat1;
        }else if((Integer)buton.getClientProperty("row") == 1 && (Integer)buton.getClientProperty("column") == 2  ){
            return stat2;
        }else if((Integer)buton.getClientProperty("row") == 1 && (Integer)buton.getClientProperty("column") == 3  ){
            return stat3;
        }else if((Integer)buton.getClientProperty("row") == 2 && (Integer)buton.getClientProperty("column") == 1  ){
            return stat4;
        }else if((Integer)buton.getClientProperty("row") == 2 && (Integer)buton.getClientProperty("column") == 2  ){
            return stat5;
        }else if((Integer)buton.getClientProperty("row") == 2 && (Integer)buton.getClientProperty("column") == 3  ){
            return stat6;
        }else if((Integer)buton.getClientProperty("row") == 3 && (Integer)buton.getClientProperty("column") == 1  ){
            return stat7;
        }else if((Integer)buton.getClientProperty("row") == 3 && (Integer)buton.getClientProperty("column") == 2  ){
            return stat8;
        }else if((Integer)buton.getClientProperty("row") == 3 && (Integer)buton.getClientProperty("column") == 3  ){
            return stat9;
        }
        return false;
    }

    public boolean setbooleanOfButtons(JButton buton, boolean trueFalse){
        if((Integer)buton.getClientProperty("row") == 1 && (Integer)buton.getClientProperty("column") == 1    ){
            stat1 = trueFalse;
        }else if((Integer)buton.getClientProperty("row") == 1 && (Integer)buton.getClientProperty("column") == 2  ){
            stat2 = trueFalse;
        }else if((Integer)buton.getClientProperty("row") == 1 && (Integer)buton.getClientProperty("column") == 3  ){
            stat3 = trueFalse;
        }else if((Integer)buton.getClientProperty("row") == 2 && (Integer)buton.getClientProperty("column") == 1  ){
            stat4 = trueFalse;
        }else if((Integer)buton.getClientProperty("row") == 2 && (Integer)buton.getClientProperty("column") == 2  ){
            stat5 = trueFalse;
        }else if((Integer)buton.getClientProperty("row") == 2 && (Integer)buton.getClientProperty("column") == 3  ){
            stat6 = trueFalse;
        }else if((Integer)buton.getClientProperty("row") == 3 && (Integer)buton.getClientProperty("column") == 1  ){
            stat7 = trueFalse;
        }else if((Integer)buton.getClientProperty("row") == 3 && (Integer)buton.getClientProperty("column") == 2  ){
            stat8 = trueFalse;
        }else if((Integer)buton.getClientProperty("row") == 3 && (Integer)buton.getClientProperty("column") == 3  ){
            stat9 = trueFalse;
        }
        return false;
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


    public void settingFirstQueue(){



        gbc.gridy = 1;
        gbc.gridx = 1;
        allButtons[0][1].putClientProperty("column", 1);
        allButtons[0][1].putClientProperty("row", 1);
        frame.add(allButtons[0][1],gbc);


        gbc.gridy = 1;
        gbc.gridx = 2;
        allButtons[1][2].putClientProperty("column", 2);
        allButtons[1][2].putClientProperty("row", 1);
        frame.add(allButtons[1][2],gbc);


        gbc.gridy = 1;
        gbc.gridx = 3;
        allButtons[1][0].putClientProperty("column", 3);
        allButtons[1][0].putClientProperty("row", 1);
        frame.add(allButtons[1][0],gbc);


        gbc.gridy = 2;
        gbc.gridx = 1;
        allButtons[2][0].putClientProperty("column", 1);
        allButtons[2][0].putClientProperty("row", 2);
        frame.add(allButtons[2][0],gbc);


        gbc.gridy = 2;
        gbc.gridx = 2;
        allButtons[2][1].putClientProperty("column", 2);
        allButtons[2][1].putClientProperty("row", 2);
        frame.add(allButtons[2][1],gbc);


        gbc.gridy = 2;
        gbc.gridx = 3;
        allButtons[0][0].putClientProperty("column", 3);
        allButtons[0][0].putClientProperty("row", 2);
        frame.add(allButtons[0][0],gbc);

        gbc.gridy = 3;
        gbc.gridx = 1;
        allButtons[1][1].putClientProperty("column", 1);
        allButtons[1][1].putClientProperty("row", 3);
        frame.add(allButtons[1][1],gbc);

        gbc.gridy = 3;
        gbc.gridx = 2;
        allButtons[0][2].putClientProperty("column", 2);
        allButtons[0][2].putClientProperty("row", 3);
        frame.add(allButtons[0][2],gbc);


        frame.setVisible(true);


    }

        public void checkingQueue (){







        }





}



