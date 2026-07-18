import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class CALCULATOR implements ActionListener {
    JFrame jf;
    boolean isOperatorClicked=false;
    String whichOperatorClicked;
    String OldValue, Value;
    JLabel DisplayLabel;
    JButton zeroButton, oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton;
    JButton dotButton, equalButton, diviButton, multiButton, subButton, addButton, clearButton, squareButton, cubeButton, modulasButton;
   
    public CALCULATOR() {
        jf=new JFrame("Azaf`s Calculator");
        jf.setLayout(null);
        jf.setLocation(200, 100);
        jf.getContentPane().setBackground(new Color(24, 24, 24));
        jf.getContentPane().setPreferredSize(new Dimension(510, 595));
        DisplayLabel=new JLabel();
        DisplayLabel.setBounds(30, 30, 450, 75);
        DisplayLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        DisplayLabel.setBackground(new Color(243, 156, 44));
        DisplayLabel.setOpaque(true);
        DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayLabel.setForeground(Color.black);
        DisplayLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        jf.add(DisplayLabel);
       
        sevenButton=new JButton("7");
        sevenButton.setBounds(30,220,100,75);
        sevenButton.setBackground(new Color(78, 47, 33));
        sevenButton.setForeground(Color.white);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
        sevenButton.setBorder(BorderFactory.createEmptyBorder());
        sevenButton.addActionListener(this);
        jf.add(sevenButton);
       
        eightButton=new JButton("8");
        eightButton.setBounds(145,220,100,75);
        eightButton.setBackground(new Color(78, 47, 33));
        eightButton.setForeground(Color.white);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
        eightButton.setBorder(BorderFactory.createEmptyBorder());
        eightButton.addActionListener(this);
        jf.add(eightButton);
       
        nineButton=new JButton("9");
        nineButton.setBounds(260,220,100,75);
        nineButton.setBackground(new Color(78, 47, 33));
        nineButton.setForeground(Color.white);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
        nineButton.setBorder(BorderFactory.createEmptyBorder());
        nineButton.addActionListener(this);
        jf.add(nineButton);
       
        fourButton=new JButton("4");
        fourButton.setBounds(30,310,100,75);
        fourButton.setBackground(new Color(78, 47, 33));
        fourButton.setForeground(Color.white);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
        fourButton.setBorder(BorderFactory.createEmptyBorder());
        fourButton.addActionListener(this);
        jf.add(fourButton);
       
        fiveButton=new JButton("5");
        fiveButton.setBounds(145,310,100,75);
        fiveButton.setBackground(new Color(78, 47, 33));
        fiveButton.setForeground(Color.white);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
        fiveButton.setBorder(BorderFactory.createEmptyBorder());
        fiveButton.addActionListener(this);
        jf.add(fiveButton);
       
        sixButton=new JButton("6");
        sixButton.setBounds(260,310,100,75);
        sixButton.setBackground(new Color(78, 47, 33));
        sixButton.setForeground(Color.white);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
        sixButton.setBorder(BorderFactory.createEmptyBorder());
        sixButton.addActionListener(this);
        jf.add(sixButton);
       
        oneButton=new JButton("1");
        oneButton.setBounds(30,400,100,75);
        oneButton.setBackground(new Color(78, 47, 33));
        oneButton.setForeground(Color.white);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
        oneButton.setBorder(BorderFactory.createEmptyBorder());
        oneButton.addActionListener(this);
        jf.add(oneButton);
       
        twoButton=new JButton("2");
        twoButton.setBounds(145,400,100,75);
        twoButton.setBackground(new Color(78, 47, 33));
        twoButton.setForeground(Color.white);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
        twoButton.setBorder(BorderFactory.createEmptyBorder());
        twoButton.addActionListener(this);
        jf.add(twoButton);
       
        threeButton=new JButton("3");
        threeButton.setBounds(260,400,100,75);
        threeButton.setBackground(new Color(78, 47, 33));
        threeButton.setForeground(Color.white);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
        threeButton.setBorder(BorderFactory.createEmptyBorder());
        threeButton.addActionListener(this);
        jf.add(threeButton);
       
        dotButton=new JButton(".");
        dotButton.setBounds(30,490,100,75);
        dotButton.setBackground(new Color(78, 47, 33));
        dotButton.setForeground(Color.white);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
        dotButton.setBorder(BorderFactory.createEmptyBorder());
        dotButton.addActionListener(this);
        jf.add(dotButton);
       
        zeroButton=new JButton("0");
        zeroButton.setBounds(145,490,100,75);
        zeroButton.setBackground(new Color(78, 47, 33));
        zeroButton.setForeground(Color.white);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
        zeroButton.setBorder(BorderFactory.createEmptyBorder());
        zeroButton.addActionListener(this);
        jf.add(zeroButton);
       
        equalButton=new JButton("=");
        equalButton.setBounds(260,490,100,75);
        equalButton.setBackground(new Color(254, 193, 7));
        equalButton.setForeground(Color.white);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
        equalButton.setBorder(BorderFactory.createEmptyBorder());
        equalButton.addActionListener(this);
        jf.add(equalButton);
       
        diviButton=new JButton("/");
        diviButton.setBounds(375,130,105,75);
        diviButton.setBackground(new Color(254, 160, 89));
        diviButton.setForeground(Color.white);
        diviButton.setFont(new Font("Arial", Font.PLAIN, 30));
        diviButton.setBorder(BorderFactory.createEmptyBorder());
        diviButton.addActionListener(this);
        jf.add(diviButton);
       
        multiButton=new JButton("x");
        multiButton.setBounds(375,220,105,75);
        multiButton.setBackground(new Color(254, 160, 89));
        multiButton.setForeground(Color.white);
        multiButton.setFont(new Font("Arial", Font.PLAIN, 30));
        multiButton.setBorder(BorderFactory.createEmptyBorder());
        multiButton.addActionListener(this);
        jf.add(multiButton);
       
        subButton=new JButton("-");
        subButton.setBounds(375,310,105,75);
        subButton.setBackground(new Color(254, 160, 89));
        subButton.setForeground(Color.white);
        subButton.setFont(new Font("Arial", Font.PLAIN, 30));
        subButton.setBorder(BorderFactory.createEmptyBorder());
        subButton.addActionListener(this);
        jf.add(subButton);
       
        addButton=new JButton("+");
        addButton.setBounds(375,400,105,75);
        addButton.setBackground(new Color(254, 160, 89));
        addButton.setForeground(Color.white);
        addButton.setFont(new Font("Arial", Font.PLAIN, 30));
        addButton.setBorder(BorderFactory.createEmptyBorder());
        addButton.addActionListener(this);
        jf.add(addButton);
       
        clearButton=new JButton("Clear");
        clearButton.setBounds(375,490,105,75);
        clearButton.setBackground(new Color(24, 24, 24));
        clearButton.setForeground(Color.white);
        clearButton.setFont(new Font("Arial", Font.BOLD, 20));
        clearButton.setBorder(BorderFactory.createEmptyBorder());
        clearButton.addActionListener(this);
        jf.add(clearButton);
       
        squareButton=new JButton("x²");
        squareButton.setBounds(30,130,100,75);
        squareButton.setBackground(new Color(90, 85, 76));
        squareButton.setForeground(Color.white);
        squareButton.setFont(new Font("Arial", Font.PLAIN, 30));
        squareButton.setBorder(BorderFactory.createEmptyBorder());
        squareButton.addActionListener(this);
        jf.add(squareButton);
       
        cubeButton=new JButton("x³");
        cubeButton.setBounds(145,130,100,75);
        cubeButton.setBackground(new Color(90, 85, 76));
        cubeButton.setForeground(Color.white);
        cubeButton.setFont(new Font("Arial", Font.PLAIN, 30));
        cubeButton.setBorder(BorderFactory.createEmptyBorder());
        cubeButton.addActionListener(this);
        jf.add(cubeButton);
       
        modulasButton=new JButton("%");
        modulasButton.setBounds(260,130,100,75);
        modulasButton.setBackground(new Color(90, 85, 76));
        modulasButton.setForeground(Color.white);
        modulasButton.setFont(new Font("Arial", Font.PLAIN, 30));
        modulasButton.setBorder(BorderFactory.createEmptyBorder());
        modulasButton.addActionListener(this);
        jf.add(modulasButton);
       
       
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new CALCULATOR();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==oneButton) {
            if(isOperatorClicked) {
                DisplayLabel.setText("1");
                isOperatorClicked=false;
            }else {
                DisplayLabel.setText(DisplayLabel.getText()+"1");
            }
           
        }else if(e.getSource()==twoButton) {
            if(isOperatorClicked) {
                DisplayLabel.setText("2");
                isOperatorClicked=false;
            }else {
                DisplayLabel.setText(DisplayLabel.getText()+"2");
            }
           
        }else if(e.getSource()==threeButton) {
            if(isOperatorClicked) {
                DisplayLabel.setText("3");
                isOperatorClicked=false;
            }else {
                DisplayLabel.setText(DisplayLabel.getText()+"3");
            }
           
        }else if(e.getSource()==fourButton) {
            if(isOperatorClicked) {
                DisplayLabel.setText("4");
                isOperatorClicked=false;
            }else {
                DisplayLabel.setText(DisplayLabel.getText()+"4");
            }
           
        }else if(e.getSource()==fiveButton) {
            if(isOperatorClicked) {
                DisplayLabel.setText("5");
                isOperatorClicked=false;
            }else {
                DisplayLabel.setText(DisplayLabel.getText()+"5");
            }
           
        }else if(e.getSource()==sixButton) {
            if(isOperatorClicked) {
                DisplayLabel.setText("6");
                isOperatorClicked=false;
            }else {
                DisplayLabel.setText(DisplayLabel.getText()+"6");
            }
           
        }else if(e.getSource()==sevenButton) {
            if(isOperatorClicked) {
                DisplayLabel.setText("7");
                isOperatorClicked=false;
            }else {
                DisplayLabel.setText(DisplayLabel.getText()+"7");
            }
           
        }else if(e.getSource()==eightButton) {
            if(isOperatorClicked) {
                DisplayLabel.setText("8");
                isOperatorClicked=false;
            }else {
                DisplayLabel.setText(DisplayLabel.getText()+"8");
            }
           
        }else if(e.getSource()==nineButton) {
            if(isOperatorClicked) {
                DisplayLabel.setText("9");
                isOperatorClicked=false;
            }else {
                DisplayLabel.setText(DisplayLabel.getText()+"9");
            }
           
        }else if(e.getSource()==zeroButton) {
            if(isOperatorClicked) {
                DisplayLabel.setText("0");
                isOperatorClicked=false;
            }else {
                DisplayLabel.setText(DisplayLabel.getText()+"0");
            }
           
        }else if(e.getSource()==dotButton) {
            DisplayLabel.setText(DisplayLabel.getText()+".");
           
        }else if(e.getSource()==equalButton) {
            String newValue=DisplayLabel.getText();
            float oldValueF=Float.parseFloat(OldValue);
            float newvalueF=Float.parseFloat(newValue);
            if (whichOperatorClicked=="add") {
                float result=oldValueF+newvalueF;
                DisplayLabel.setText(result+"");
               
            }else if(whichOperatorClicked=="sub") {
                float result=oldValueF-newvalueF;
                DisplayLabel.setText(result+"");
               
            }else if(whichOperatorClicked=="divi") {
                float result=oldValueF/newvalueF;
                DisplayLabel.setText(result+"");
               
            }else if(whichOperatorClicked=="multi") {
                float result=oldValueF*newvalueF;
                DisplayLabel.setText(result+"");
               
            }else if(whichOperatorClicked=="modulas") {
                float result=oldValueF%newvalueF;
                DisplayLabel.setText(result+"");
               
            }
           
       
        }else if(e.getSource()==addButton) {
            whichOperatorClicked="add";
            isOperatorClicked=true;
            OldValue=DisplayLabel.getText();
           
        }else if(e.getSource()==subButton) {
            whichOperatorClicked="sub";
            isOperatorClicked=true;
            OldValue=DisplayLabel.getText();
           
        }else if(e.getSource()==diviButton) {
            whichOperatorClicked="divi";
            isOperatorClicked=true;
            OldValue=DisplayLabel.getText();
           
        }else if(e.getSource()==multiButton) {
            whichOperatorClicked="multi";
            isOperatorClicked=true;
            OldValue=DisplayLabel.getText();
           
        }else if(e.getSource()==clearButton) {
            DisplayLabel.setText("");
           
        }else if(e.getSource()==squareButton) {
            Value=DisplayLabel.getText();
            float ValueF=Float.parseFloat(Value);
            float result=ValueF*ValueF;
            DisplayLabel.setText(result+"");
            isOperatorClicked=true;
           
        }else if(e.getSource()==cubeButton) {
            Value=DisplayLabel.getText();
            float ValueF=Float.parseFloat(Value);
            float result=ValueF*ValueF*ValueF;
            DisplayLabel.setText(result+"");
            isOperatorClicked=true;
           
        }else if(e.getSource()==modulasButton) {
            whichOperatorClicked="modulas";
            isOperatorClicked=true;
            OldValue=DisplayLabel.getText();
        }
       
    }

}