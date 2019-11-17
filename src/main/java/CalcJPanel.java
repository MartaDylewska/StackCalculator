

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CalcJPanel extends JPanel {

    private JTextArea screen;
    private JButton but0, but1, but2, but3, but4, but5, but6, but7, but8, but9;
    private JButton butDot, butAdd, butSubtr, butMult, butDiv, butEquals;
    private JButton butLeftBracket, butRightBracket, butBack, butReset;
    private String calcSign;

    private int buttonSize = 80;


    public Dimension getPreferredSize() {
        return new Dimension(420, 440);
    }

    public CalcJPanel() {
        setLayout(null);
        createScreen();
        add(screen);
        createBut7();
        add(but7);
        createBut8();
        add(but8);
        createBut9();
        add(but9);
        createButAdd();
        add(butAdd);
        createButLeftBracket();
        add(butLeftBracket);
        createBut4();
        add(but4);
        createBut5();
        add(but5);
        createBut6();
        add(but6);
        createButSubtr();
        add(butSubtr);
        createButRightBrackett();
        add(butRightBracket);
        createBut1();
        add(but1);
        createBut2();
        add(but2);
        createBut3();
        add(but3);
        createButMult();
        add(butMult);
        createBut0();
        createButReset();
        add(butReset);
        add(but0);
        createButDot();
        add(butDot);
        createButDiv();
        add(butDiv);
        createButEquals();
        add(butEquals);
        createButBack();
        add(butBack);

    }

    public void createBut7() {
        but7 = new JButton();
        but7.setText("7");
        but7.setFont(new Font("Serif", Font.BOLD, 30));
        but7.setBounds(10, 110, buttonSize, buttonSize);
        but7.addActionListener(e ->
        {if(screen.getText().equals("Nie można dzielić przez 0")) {
            screen.setText("7");
        }
        else{
            screen.append("7");
        }
        });
    }

    public void createBut8() {
        but8 = new JButton();
        but8.setText("8");
        but8.setFont(new Font("Serif", Font.BOLD, 30));
        but8.setBounds(10+buttonSize, 110, buttonSize, buttonSize);
        but8.addActionListener(e ->
        {if(screen.getText().equals("Nie można dzielić przez 0")) {
            screen.setText("8");
        }
        else{
            screen.append("8");
        }
        });
    }

    public void createBut9() {
        but9 = new JButton();
        but9.setText("9");
        but9.setFont(new Font("Serif", Font.BOLD, 30));
        but9.setBounds(10+2*buttonSize, 110, buttonSize, buttonSize);
        but9.addActionListener(e ->
        {if(screen.getText().equals("Nie można dzielić przez 0")) {
            screen.setText("9");
        }
        else{
            screen.append("9");
        }
        });
    }

    public void createButAdd() {
        butAdd = new JButton();
        butAdd.setText("+");
        butAdd.setFont(new Font("Serif", Font.BOLD, 30));
        butAdd.setBounds(10+3*buttonSize, 110, buttonSize, buttonSize);
        butAdd.addActionListener(e -> {
            screen.append("+");
            calcSign = "+";
        });
    }

    public void createButLeftBracket() {
        butLeftBracket = new JButton();
        butLeftBracket.setText("(");
        butLeftBracket.setFont(new Font("Serif", Font.BOLD, 30));
        butLeftBracket.setBounds(10+4*buttonSize, 110, buttonSize, buttonSize);
        butLeftBracket.addActionListener(e -> {if(screen.getText().equals("Nie można dzielić przez 0")) {
            screen.setText("(");
        }
        else{
            screen.append("(");
            calcSign = "(";
        }
        });
    }

    public void createBut4() {
        but4 = new JButton();
        but4.setText("4");
        but4.setFont(new Font("Serif", Font.BOLD, 30));
        but4.setBounds(10, 190, buttonSize, buttonSize);
        but4.addActionListener(e ->
        {if(screen.getText().equals("Nie można dzielić przez 0"))
            screen.setText("4");
        else
            screen.append("4");
        });
    }

    public void createBut5() {
        but5 = new JButton();
        but5.setText("5");
        but5.setFont(new Font("Serif", Font.BOLD, 30));
        but5.setBounds(10+buttonSize, 190, buttonSize, buttonSize);
        but5.addActionListener(e ->
        {if(screen.getText().equals("Nie można dzielić przez 0"))
            screen.setText("5");

        else
            screen.append("5");
        });
    }

    public void createBut6() {
        but6 = new JButton();
        but6.setText("6");
        but6.setFont(new Font("Serif", Font.BOLD, 30));
        but6.setBounds(10+2*buttonSize, 190, buttonSize, buttonSize);
        but6.addActionListener(e -> {if(screen.getText().equals("Nie można dzielić przez 0")) {
            screen.setText("6");
        }
        else{
            screen.append("6");
        }
        });
    }


    public void createButSubtr() {
        butSubtr = new JButton();
        butSubtr.setText("-");
        butSubtr.setFont(new Font("Serif", Font.BOLD, 30));
        butSubtr.setBounds(10+3*buttonSize, 190, buttonSize, buttonSize);
        butSubtr.addActionListener(e ->
        {
            screen.append("-");
            calcSign = "-";
        });
    }

    public void createButRightBrackett() {
        butRightBracket = new JButton();
        butRightBracket.setText(")");
        butRightBracket.setFont(new Font("Serif", Font.BOLD, 30));
        butRightBracket.setBounds(10+4*buttonSize, 190, buttonSize, buttonSize);
        butRightBracket.addActionListener(e ->
        {if(screen.getText().equals("Nie można dzielić przez 0")) {
            screen.setText(")");
            calcSign = "-";
        }
        else{
            screen.append(")");
            calcSign = "-";
        }
        });
    }

    public void createBut1() {
        but1 = new JButton();
        but1.setText("1");
        but1.setFont(new Font("Serif", Font.BOLD, 30));
        but1.setBounds(10, 270, buttonSize, buttonSize);
        but1.addActionListener(e -> {if(screen.getText().equals("Nie można dzielić przez 0")) {
            screen.setText("1");
        }
        else{
            screen.append("1");
        }
        });
    }

    public void createBut2() {
        but2 = new JButton();
        but2.setText("2");
        but2.setFont(new Font("Serif", Font.BOLD, 30));
        but2.setBounds(10+buttonSize, 270, buttonSize, buttonSize);
        but2.addActionListener(e -> {if(screen.getText().equals("Nie można dzielić przez 0")) {
            screen.setText("2");
        }
        else{
            screen.append("2");
        }
        });
    }

    public void createBut3() {
        but3 = new JButton();
        but3.setText("3");
        but3.setFont(new Font("Serif", Font.BOLD, 30));
        but3.setBounds(10+2*buttonSize, 270, buttonSize, buttonSize);
        but3.addActionListener(e -> {if(screen.getText().equals("Nie można dzielić przez 0")) {
            screen.setText("3");
        }
        else{
            screen.append("3");
        }
        });
    }

    public void createButMult() {
        butMult = new JButton();
        butMult.setText("*");
        butMult.setFont(new Font("Serif", Font.BOLD, 30));
        butMult.setBounds(10+3*buttonSize, 270, buttonSize, buttonSize);
        butMult.addActionListener(e ->
        {
            screen.append("*");
            calcSign = "*";
        });

    }

    public void createButReset() {
        butReset = new JButton();
        butReset.setText("CE");
        butReset.setFont(new Font("Serif", Font.BOLD, 30));
        butReset.setBounds(10+4*buttonSize, 270, buttonSize, buttonSize);
        butReset.addActionListener(e ->
            screen.setText("")
        );
    }

    public void createBut0() {
        but0 = new JButton();
        but0.setText("0");
        but0.setFont(new Font("Serif", Font.BOLD, 30));
        but0.setBounds(10, 110+3*buttonSize, buttonSize, buttonSize);
        but0.addActionListener(e -> {if(screen.getText().equals("Nie można dzielić przez 0")) {
            screen.setText("0");
        }
        else{
            screen.append("0");
        }
        });
    }

    public void createButDot() {
        butDot = new JButton();
        butDot.setText(".");
        butDot.setFont(new Font("Serif", Font.BOLD, 30));
        butDot.setBounds(10+buttonSize, 110+3*buttonSize, buttonSize, buttonSize);
        butDot.addActionListener(e -> screen.append("."));

    }

    public void createButDiv() {
        butDiv = new JButton();
        butDiv.setText("/");
        butDiv.setFont(new Font("Serif", Font.BOLD, 30));
        butDiv.setBounds(10+2*buttonSize, 110+3*buttonSize, buttonSize, buttonSize);
        butDiv.addActionListener(e ->
        {
            screen.append("/");
            calcSign = "/";
        });
    }


    public void createButEquals() {
        butEquals = new JButton();
        butEquals.setText("=");
        butEquals.setFont(new Font("Serif", Font.BOLD, 30));
        butEquals.setBounds(10+3*buttonSize, 110+3*buttonSize, buttonSize, buttonSize);
        butEquals.addActionListener(e ->
        {try {
            screen.setText(Calculations.performCalculations(screen.getText()).toString());
        }
        catch (UnsupportedOperationException ex){
            screen.setText("Nie można dzielić przez 0");
        }
        });
    }

    public void createButBack() {
        butBack = new JButton();
        butBack.setText("<<");
        butBack.setFont(new Font("Serif", Font.BOLD, 30));
        butBack.setBounds(10+4*buttonSize, 110+3*buttonSize, buttonSize, buttonSize);
        butBack.addActionListener(e -> {if(screen.getText().equals("Nie można dzielić przez 0")) {
            screen.setText("0");
        }
        else if(screen.getText().length()>0){
            String currentText = screen.getText();
            screen.setText(currentText.substring(0,currentText.length()-1));
        }
        });
    }


    public void createScreen() {
        screen = new JTextArea();
        screen.setBounds(10, 10, 400, 100);
        screen.setFont(new Font("Serif", Font.BOLD, 30));
        screen.setBorder(createNewBlackBorder());

    }

    public static Border createNewBlackBorder() {
        return BorderFactory.createLineBorder(Color.BLACK);
    }
}
