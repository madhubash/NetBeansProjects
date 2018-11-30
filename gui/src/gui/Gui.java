/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author ADITHYA
 */
public class Gui extends JFrame implements ActionListener{

    JPanel Panel;
    JButton btn;
    JButton btnCancel;
    
    public Gui()
    {
        Panel = new JPanel();
        btn = new JButton("press me");
        btn.addActionListener(this);
        btnCancel = new JButton("cancel");
        btnCancel.addActionListener(this);
        
        Panel.add(btn);
        this.add(Panel);
        Panel.add(btnCancel);
    }
    public static void main(String[] args) {
        Gui v=new Gui();
        v.setSize(1000,500);
        v.setTitle("my first gui");
        v.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btn){
            btn.setText("clicked");
        }
        else if (ae.getSource()==btnCancel);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
