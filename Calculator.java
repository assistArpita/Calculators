
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

  double num1 = 0, num2 = 0, result = 0;
  int calculator;

  JFrame frame = new JFrame("Calculater");
  JLabel label = new JLabel();
  JTextField textfield = new JTextField();

  JButton buttonZero = new JButton("0");
  JButton buttonOne = new JButton("1");
  JButton buttonTwo = new JButton("2");
  JButton buttonThree = new JButton("3");
  JButton buttonFour = new JButton("4");
  JButton buttonFive = new JButton("5");
  JButton buttonSix = new JButton("6");
  JButton buttonSeven = new JButton("7");
  JButton buttonEight = new JButton("8");
  JButton buttonNine = new JButton("9");
  JButton buttonDot = new JButton(".");
  JButton buttonAdd = new JButton("+");
  JButton buttonSub = new JButton("-");
  JButton buttonMul = new JButton("*");
  JButton buttonDiv = new JButton("/");
  JButton buttonClear = new JButton("C");
  JButton buttonDelete = new JButton("Del");
  JButton buttonEqu = new JButton("=");

  Calculator() {
    prepareGui();
    addComponents();
    addActionEvent();

  }

  public void prepareGui() {
    frame.setSize(305, 510);
    frame.getContentPane().setLayout(null);
    frame.getContentPane().setBackground(Color.black);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void addComponents() {
    label.setBounds(250, 0, 50, 50);
    label.setForeground(Color.white);
    frame.add(label);

    textfield.setBounds(10, 40, 270, 40);
    textfield.setFont(new Font("Arial", Font.BOLD, 20));
    textfield.setEditable(false);
    textfield.setHorizontalAlignment(SwingConstants.RIGHT);
    frame.add(textfield);

    buttonSeven.setBounds(10, 230, 60, 40);
    buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonSeven);

    buttonEight.setBounds(80, 230, 60, 40);
    buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonEight);

    buttonNine.setBounds(150, 230, 60, 40);
    buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonNine);

    buttonFour.setBounds(10, 290, 60, 40);
    buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonFour);

    buttonFive.setBounds(80, 290, 60, 40);
    buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonFive);

    buttonSix.setBounds(150, 290, 60, 40);
    buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonSix);

    buttonOne.setBounds(10, 350, 60, 40);
    buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonOne);

    buttonTwo.setBounds(80, 350, 60, 40);
    buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonTwo);

    buttonThree.setBounds(150, 350, 60, 40);
    buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonThree);

    buttonDot.setBounds(150, 410, 60, 40);
    buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonDot);

    buttonZero.setBounds(10, 410, 60, 40);
    buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonZero);

    buttonEqu.setBounds(80, 410, 60, 40);
    buttonEqu.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonEqu);

    buttonDiv.setBounds(220, 410, 60, 40);
    buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
    buttonDiv.setBackground(Color.GRAY);
    frame.add(buttonDiv);

    buttonDelete.setBounds(150, 170, 130, 40);
    buttonDelete.setFont(new Font("Arial", Font.BOLD, 20));
    buttonDelete.setBackground(Color.RED);
    frame.add(buttonDelete);

    buttonClear.setBounds(10, 170, 130, 40);
    buttonClear.setFont(new Font("Arial", Font.BOLD, 20));
    buttonClear.setBackground(Color.RED);
    frame.add(buttonClear);

    buttonAdd.setBounds(220, 230, 60, 40);
    buttonAdd.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonAdd);

    buttonSub.setBounds(220, 290, 60, 40);
    buttonSub.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonSub);

    buttonMul.setBounds(220, 350, 60, 40);
    buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
    frame.add(buttonMul);

  }

  public void addActionEvent() {

    buttonAdd.addActionListener(this);
    buttonSub.addActionListener(this);
    buttonMul.addActionListener(this);
    buttonDiv.addActionListener(this);
    buttonClear.addActionListener(this);
    buttonEqu.addActionListener(this);
    buttonDot.addActionListener(this);
    buttonDelete.addActionListener(this);
    buttonOne.addActionListener(this);
    buttonTwo.addActionListener(this);
    buttonThree.addActionListener(this);
    buttonFour.addActionListener(this);
    buttonFive.addActionListener(this);
    buttonSix.addActionListener(this);
    buttonSeven.addActionListener(this);
    buttonEight.addActionListener(this);
    buttonNine.addActionListener(this);
    buttonZero.addActionListener(this);

  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == buttonClear) {
      label.setText("");
      textfield.setText("");
    } else if (e.getSource() == buttonDelete) {
      String s = textfield.getText();
      textfield.setText("");
      for (int i = 0; i < s.length() - 1; i++)
        textfield.setText(textfield.getText() + s.charAt(i));
    } else if (e.getSource() == buttonZero) {
      if (textfield.getText().equals("0")) {
        return;
      } else {
        textfield.setText(textfield.getText() + "0");
      }
    } else if (e.getSource() == buttonOne) {
      label.setText("1");
      textfield.setText(textfield.getText() + "1");

    } else if (e.getSource() == buttonTwo) {
      textfield.setText(textfield.getText() + "2");
    } else if (e.getSource() == buttonThree) {
      textfield.setText(textfield.getText() + "3");
    } else if (e.getSource() == buttonFour) {
      textfield.setText(textfield.getText() + "4");
    } else if (e.getSource() == buttonFive) {
      textfield.setText(textfield.getText() + "5");
    } else if (e.getSource() == buttonSix) {
      textfield.setText(textfield.getText() + "6");
    } else if (e.getSource() == buttonSeven) {
      textfield.setText(textfield.getText() + "7");
    } else if (e.getSource() == buttonEight) {
      textfield.setText(textfield.getText() + "8");
    } else if (e.getSource() == buttonNine) {
      textfield.setText(textfield.getText() + "9");
    } else if (e.getSource() == buttonDot) {
      if (textfield.getText().contains(".")) {
        return;
      } else {
        textfield.setText(textfield.getText() + ".");
      }
    } else if (e.getSource() == buttonAdd) {
      String str = textfield.getText();
      num1 = Double.parseDouble(textfield.getText());
      calculator = 1;
      textfield.setText("");
      label.setText(str + "+");
    } else if (e.getSource() == buttonSub) {
      String str = textfield.getText();
      num1 = Double.parseDouble(textfield.getText());
      calculator = 2;
      textfield.setText("");
      label.setText(str + "-");
    } else if (e.getSource() == buttonMul) {
      String str = textfield.getText();
      num1 = Double.parseDouble(textfield.getText());
      calculator = 3;

      textfield.setText("");
      label.setText(str + "*");
    } else if (e.getSource() == buttonDiv) {
      String str = textfield.getText();
      num1 = Double.parseDouble(textfield.getText());
      calculator = 4;
      textfield.setText("");
      label.setText(str + "/");
    } else if (e.getSource() == buttonEqu) {
      num2 = Double.parseDouble(textfield.getText());
      switch (calculator) {
        case 1:
          result = num1 + num2;
          break;
        case 2:
          result = num1 - num2;

          break;
        case 3:
          result = num1 * num2;
          break;
        case 4:
          result = num1 / num2;
        default:
          break;
      }
      if (Double.toString(result).endsWith(".0")) {
        textfield.setText(Double.toString(result).replace(".0", ""));
      } else {
        textfield.setText(Double.toString(result));
      }
      label.setText("");
      num1 = result;
    }
  }
}
