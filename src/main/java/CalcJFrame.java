

import javax.swing.*;

public class CalcJFrame extends JFrame {


    public CalcJFrame (int x, int y, String title){

        setLocation(x,y);
        setTitle(title);
        setResizable(false);
        CalcJPanel panel = new CalcJPanel();
        add(panel);
        pack();

    }
}
