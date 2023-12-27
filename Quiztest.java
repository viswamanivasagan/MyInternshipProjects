package com.mycompany.quiztest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Quiztest extends JFrame implements ActionListener{

    private static void QuizTest(String simple_Quiz_App) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    JLabel label;    
    JRadioButton radioButtons[]=new JRadioButton[5];
    JButton btnNext,btnResult;
    ButtonGroup bg;
    int count= 0,current = 0,x = 1,y = 1,now = 0;
    int m[]=new int[10];
            
    Quiztest(String s){
        super(s);
        label = new JLabel();
        add(label);
        bg=new ButtonGroup();
        for(int i=0;i<5;i++){
            radioButtons[i]= new JRadioButton();
            add(radioButtons[i]);
            bg.add(radioButtons[i]);
        }
        btnNext=new JButton("Next");
        btnResult=new JButton("Result");
        btnResult.setVisible(false);
        btnResult.addActionListener(this);
        btnNext.addActionListener(this);
        add(btnNext);
        add(btnResult);
        setData();
        label.setBounds(30,40,450,20);
        radioButtons[0].setBounds(50, 80, 450, 20);
        radioButtons[1].setBounds(50, 110, 200, 20);
        radioButtons[2].setBounds(50, 140, 200, 20);
        radioButtons[3].setBounds(50, 170, 200, 20);
        btnNext.setBounds(100, 240, 100, 30); 
        btnResult.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);
    }        
    void setData(){
        radioButtons[4].setSelected(true);
        if(current==0){
            label.setText("Q1:Grand Central Terminal, Park Avenue, New York is the world's");
            radioButtons[0].setText("largest railway station");
            radioButtons[1].setText("highest railway station");
            radioButtons[2].setText("longest railway station");
            radioButtons[3].setText("None of the above");
            
        }
         if(current==1){
            label.setText("Q2:First human heart transplant operation conducted by Dr. Christiaan Barnard on Louis Washkansky, was conducted in");
            radioButtons[0].setText("1967");
            radioButtons[1].setText("1968");
            radioButtons[2].setText("1958");
            radioButtons[3].setText("1922");
            
        }
        if(current==2){
            label.setText("Q3:Entomology is the science that studies");
            radioButtons[0].setText("Behavior of human beings");
            radioButtons[1].setText("Insects");
            radioButtons[2].setText("The origin and history of technical and scientific terms");
            radioButtons[3].setText("The formation of rocks");
            
        }
        if(current==3){
            label.setText("Q4:Eritrea, which became the 182nd member of the UN in 1993, is in the continent of");
            radioButtons[0].setText("Asia");
            radioButtons[1].setText("Africa");
            radioButtons[2].setText("Europe");
            radioButtons[3].setText("Australia");
            
        }
        if(current==4){
            label.setText("Q5:Garampani sanctuary is located a");
            radioButtons[0].setText("Junagarh, Gujarat");
            radioButtons[1].setText("Diphu, Assam");
            radioButtons[2].setText("Kohima, Nagaland");
            radioButtons[3].setText("Gangtok, Sikkim");
            
        }
        if(current==5){
            label.setText("Q6:For which of the following disciplines is Nobel Prize awarded?");
            radioButtons[0].setText("Physics and Chemistry");
            radioButtons[1].setText("Physiology or Medicine");
            radioButtons[2].setText("Literature, Peace and Economics");
            radioButtons[3].setText("All of the above");
            
        }
        if(current==6){
            label.setText("Q7:Hitler party which came into power in 1933 is known as");
            radioButtons[0].setText("Labour Party");
            radioButtons[1].setText("Nazi Party");
            radioButtons[2].setText("Ku-Klux-Klan");
            radioButtons[3].setText("Democratic Party");
            
        }
        if(current==7){
            label.setText("Q8:Fastest shorthand writer was");
            radioButtons[0].setText("Dr. G. D. Bist");
            radioButtons[1].setText("J.R.D. Tata");
            radioButtons[2].setText("J.M. Tagore");
            radioButtons[3].setText("Khudada Khan");
            
        }
        if(current==8){
            label.setText("Q9:FFC stands for");
            radioButtons[0].setText("Foreign Finance Corporation");
            radioButtons[1].setText("Film Finance Corporation");
            radioButtons[2].setText("Federation of Football Council");
            radioButtons[3].setText("None of the above");
            
        }
        if(current==9){
            label.setText("Q10:Epsom (England) is the place associated with");
            radioButtons[0].setText("racing");
            radioButtons[1].setText("polo");
            radioButtons[2].setText("shooting");
            radioButtons[3].setText("snooker");
            
        }
        label.setBounds(30, 40, 450, 20);
        for(int i=0,j=0;i<=90;i+=30,j++){
            radioButtons[j].setBounds(50, 80+i, 200, 20);
        }
    }
    boolean checkAns(){
        if(current==0){
            return (radioButtons[0].isSelected());
        }
        if(current==1){
            return (radioButtons[0].isSelected());
        }
        if(current==2){
            return (radioButtons[1].isSelected());
        }
        if(current==3){
            return (radioButtons[1].isSelected());
        }
        if(current==4){
            return (radioButtons[1].isSelected());
        }
        if(current==5){
            return (radioButtons[3].isSelected());
        }
        if(current==6){
            return (radioButtons[1].isSelected());
        }
        if(current==7){
            return (radioButtons[0].isSelected());
        }
        if(current==8){
            return (radioButtons[1].isSelected());
        }
        if(current==9){
            return (radioButtons[0].isSelected());
        }
        return false;
    }
        
        
    
    public static void main(String[] args) {
        new Quiztest("Simple Quiz App");
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnNext){
            if(checkAns())
                count=count+1;
            current++;
            setData();
            if(current==1){
                btnNext.setEnabled(false);
                btnResult.setVisible(true); 
                btnResult.setText("Result");
                                    
            }
        }
        if(e.getActionCommand().equals("Result")){
            if(checkAns())
                count = count+1;
            current++;
            JOptionPane.showMessageDialog(this,"Correct Answers are"+count);
            System.exit(0);
        }
       
    }
}
