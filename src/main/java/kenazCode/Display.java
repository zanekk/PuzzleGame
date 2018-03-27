package kenazCode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Display {
    JFrame frame ;
    int rows , col;
    GridBagConstraints gbc = new GridBagConstraints();
    JButton[][] allButtons = new JButton[3][3];
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


        frame = new JFrame("PuzzleGame");
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
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
             }        checkingQueue();

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

                 }        checkingQueue();

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

             }        checkingQueue();

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

             }        checkingQueue();

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

             }        checkingQueue();

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

             }        checkingQueue();

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

             }        checkingQueue();

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

             }        checkingQueue();

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
             checkingQueue();

         }
        checkingQueue();
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
        int counter = 0;
        JLabel gratulations = new JLabel();
        JFrame secFrame;
        //i=row j=column

        gratulations.setText("         Congratulations !!!");

        for(int j = 0; j < 3; j++){
        for(int i = 0; i < 3; i++) {
            if ((Integer)allButtons[i][j].getClientProperty("row") == (i+1) && (Integer)allButtons[i][j].getClientProperty("column") == (j+1) ) {
                counter++;
                System.out.print(counter);
            }else if((Integer)allButtons[i][j].getClientProperty("row") == 3 && (Integer)allButtons[i][j].getClientProperty("column") == 3 ){
               counter--;
               System.out.print("-");
            }
        }}

                if(counter == 9){

                secFrame = new JFrame("Congratulation");
                secFrame.add(gratulations);
                secFrame.setSize(200,100);
                secFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                secFrame.setLocationRelativeTo(null);
                secFrame.setResizable(false);
                secFrame.setVisible(true);

            }

        }





}



