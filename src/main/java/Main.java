

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CalcJFrame okno = new CalcJFrame(10,10,"KALKULATOR");
                okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                okno.setVisible(true);
            }
        });


    }
}
