import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


public class Calculator implements ActionListener {
boolean operaterClicked=false;
char operaters;
String oldValue;
JLabel label;
JButton sevenButton;
JButton eightButton;
JButton nineButton;
JButton fourButton;
JButton fiveButton;
JButton sixButton;
JButton oneButton;
JButton twoButton;
JButton threeButton;
JButton dotButton;
JButton zeroButton;
JButton equalButton;
JButton divisionButton;
JButton multiplicationButton;
JButton addButton;
JButton substractButton;
JButton clearButton;


  public Calculator(){
    
  JFrame frame=new JFrame("My Calculator");
  frame.setLayout(null);
  frame.setSize(600, 500);

 
  label=new JLabel(null, null, 0);
  label.setBounds(10, 10, 560, 70);
  label.setBackground(Color.BLACK);
  label.setForeground(Color.WHITE);
  label.setOpaque(true);
  label.setHorizontalAlignment(SwingConstants.RIGHT);
  frame.add(label);

  frame.setLocation(300, 100);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);



  sevenButton=new JButton("7");
  sevenButton.setBounds(10, 100, 60, 60);
  frame.add(sevenButton);
  sevenButton.addActionListener(this);
  
  eightButton=new JButton("8");
  eightButton.setBounds(80, 100, 60, 60);
  frame.add(eightButton);
  eightButton.addActionListener(this);

  nineButton=new JButton("9");
  nineButton.setBounds(150, 100, 60, 60);
  frame.add(nineButton);
  nineButton.addActionListener(this);

  clearButton=new JButton("C");
  clearButton.setBounds(300, 100, 60, 60);
  frame.add(clearButton);
  clearButton.addActionListener(this);

  fourButton=new JButton("4");
  fourButton.setBounds(10, 180, 60, 60);
  frame.add(fourButton);
  fourButton.addActionListener(this);

  fiveButton=new JButton("5");
  fiveButton.setBounds(80, 180, 60, 60);
  frame.add(fiveButton);
  fiveButton.addActionListener(this);

  sixButton=new JButton("6");
  sixButton.setBounds(150, 180, 60, 60);
  frame.add(sixButton);
  sixButton.addActionListener(this);

  oneButton=new JButton("1");
  oneButton.setBounds(10, 260, 60, 60);
  frame.add(oneButton);
  oneButton.addActionListener(this);

  twoButton=new JButton("2");
  twoButton.setBounds(80, 260, 60, 60);
  frame.add(twoButton);
  twoButton.addActionListener(this);

  threeButton=new JButton("3");
  threeButton.setBounds(150, 260, 60, 60);
  frame.add(threeButton);
  threeButton.addActionListener(this);

  dotButton=new JButton(".");
  dotButton.setBounds(10, 340, 60, 60);
  frame.add(dotButton);
  dotButton.addActionListener(this);

  zeroButton=new JButton("0");
  zeroButton.setBounds(80, 340, 60, 60);
  frame.add(zeroButton);
  zeroButton.addActionListener(this);

  equalButton=new JButton("=");
  equalButton.setBounds(150, 340, 60, 60);
  frame.add(equalButton);
  equalButton.addActionListener(this);

  divisionButton=new JButton("/");
  divisionButton.setBounds(220, 100, 60, 60);
  frame.add(divisionButton);
  divisionButton.addActionListener(this);

  multiplicationButton=new JButton("*");
  multiplicationButton.setBounds(220, 180, 60, 60);
  frame.add(multiplicationButton);
  multiplicationButton.addActionListener(this);

  addButton=new JButton("+");
  addButton.setBounds(220, 260, 60, 60);
  frame.add(addButton);
  addButton.addActionListener(this);

  substractButton=new JButton("-");
  substractButton.setBounds(220, 340, 60, 60);
  frame.add(substractButton);
  substractButton.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
   if (e.getSource()==sevenButton) {
    if (operaterClicked) {
       label.setText("7");
       operaterClicked=false;
    }else{
      label.setText(label.getText()+"7");
    }
    
   }else if (e.getSource()==eightButton) {
     if (operaterClicked) {
       label.setText("8");
       operaterClicked=false;
    }else{
      label.setText(label.getText()+"8");
    }
   }else if (e.getSource()==nineButton) {
    if (operaterClicked) {
       label.setText("9");
       operaterClicked=false;
    }else{
      label.setText(label.getText()+"9");
    }
   }else if (e.getSource()==fourButton) {
    if (operaterClicked) {
       label.setText("4");
       operaterClicked=false;
    }else{
      label.setText(label.getText()+"4");
    }
   }else if (e.getSource()==fiveButton) {
     if (operaterClicked) {
       label.setText("5");
       operaterClicked=false;
    }else{
      label.setText(label.getText()+"5");
    }
   }else if (e.getSource()==sixButton) {
     if (operaterClicked) {
       label.setText("6");
       operaterClicked=false;
    }else{
      label.setText(label.getText()+"6");
    }
   }else if (e.getSource()==fourButton) {
    if (operaterClicked) {
       label.setText("4");
       operaterClicked=false;
    }else{
      label.setText(label.getText()+"4");
    }
   }else if (e.getSource()==oneButton) {
     if (operaterClicked) {
       label.setText("1");
       operaterClicked=false;
    }else{
      label.setText(label.getText()+"1");
    }
   }else if (e.getSource()==twoButton) {
   if (operaterClicked) {
       label.setText("2");
       operaterClicked=false;
    }else{
      label.setText(label.getText()+"2");
    }
   }else if (e.getSource()==threeButton) {
    if (operaterClicked) {
       label.setText("3");
       operaterClicked=false;
    }else{
      label.setText(label.getText()+"3");
    }
   }
   
   else if (e.getSource()==divisionButton) {
    operaterClicked=true;
    operaters='/';
    oldValue=label.getText();
    label.setText("/");

   }else if (e.getSource()==multiplicationButton) {
    operaterClicked=true;
    operaters='*';
    oldValue=label.getText();
    label.setText("*");

   }else if (e.getSource()==substractButton) {
   operaterClicked=true;
   operaters='-';
   oldValue=label.getText();
   label.setText("-");
    
   }else if (e.getSource()==addButton) {
    operaterClicked=true;
    operaters='+';
    oldValue=label.getText();
    label.setText("+");

   }else if (e.getSource()==zeroButton) {
   if (operaterClicked) {
       label.setText("0");
       operaterClicked=false;
    }else{
      label.setText(label.getText()+"0");}

   }else if (e.getSource()==equalButton) {
    String newValue=label.getText();
    float oldValueF=Float.parseFloat(oldValue);
    float newValueF=Float.parseFloat(newValue);
    
    if (operaters=='+') {
      float result=oldValueF+newValueF;
       label.setText(result+"");
    } else if (operaters=='-') {
      float result=oldValueF-newValueF;
       label.setText(result+"");
    } else if (operaters=='*') {
      float result=oldValueF*newValueF;
       label.setText(result+"");
    }else if (operaters=='/') {
      float result=oldValueF/newValueF;
       label.setText(result+"");
    }
   

   }else if (e.getSource()==clearButton) {
    label.setText(""); 
   }  

  }


}
