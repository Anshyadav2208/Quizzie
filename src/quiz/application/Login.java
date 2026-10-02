
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules,back;
    JTextField tfname;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Quizzie  Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(800, 150, 300, 25);
        name.setFont(new Font("Mongolian Balti", Font.BOLD, 20));
        name.setForeground(Color.BLUE);
        add(name);
        
        rules = new JButton("Instructions");
        rules.setBounds(735,270, 120 ,25);
        rules.setBackground(new Color(30,150,230));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915,270, 120 ,25);
        back.setBackground(new Color(30,150,230));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 21));
        add(tfname);
        
        setSize(1200, 500);             //creates frame
        setLocation(200, 150);
        setVisible(true);  
    }
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
            
        }else if(ae.getSource() == back){
        setVisible(false);
    }
    }
    public static void main(String[]args){
        new Login();
    }
    
}
