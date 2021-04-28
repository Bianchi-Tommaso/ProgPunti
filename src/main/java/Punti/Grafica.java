package Punti;

import java.awt.Color;
import java.awt.Container;
import javax.swing.*;

public class Grafica extends JFrame
{
    Container c = new Container();
    JPanel p1 = new JPanel();
    JLabel testoPunti = new JLabel("Inserisci Punti Da Generare");
    JTextField inserimentoPunti = new JTextField();
    JButton bottonePunti = new JButton("Genera Punti");
    
    public Grafica()
    {
        c = this.getContentPane();
        p1.setLayout(null);
        this.setSize(400, 400);
        this.setTitle("Unione Punti");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        p1.setBackground(Color.orange);
        
        testoPunti.setBounds(110, 20, 200, 20);
        inserimentoPunti.setBounds(113, 40, 150, 20);
        
        
        p1.add(testoPunti);
        p1.add(inserimentoPunti);
        c.add(p1);
        
    }
}
