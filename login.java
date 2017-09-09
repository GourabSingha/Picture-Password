import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.*;

public class login extends JFrame implements ActionListener{

JButton load,b1,b2,b3,b4,b5,b6,b7,b8,b9,login;
JFileChooser fc;
Icon ic1,ic2,ic3,ic4,ic5,ic6,ic7,ic8,ic9;
int r1=8;int r2=5;int r3=1;int r4=7;int r5=2;int r6=9;int r7=4;int r8=6;int r9=3;int temp;

JTextField tf1=new JTextField("Enter a username");
    public login() {
super("Picture Password");
fc=new JFileChooser();
JLabel label1=new JLabel("Enter Username");
label1.setBounds(10,10,190,20);
tf1.setBounds(120,10,190,20);
load =new JButton("Load");
load.setBounds(35,40,250,20);
b1=new JButton(ic1);
b1.setBounds(10,70,100,100);
b2=new JButton(ic2);
b2.setBounds(110,70,100,100);
b3=new JButton(ic3);
b3.setBounds(210,70,100,100);
b4=new JButton(ic4);
b4.setBounds(10,170,100,100);
b5=new JButton(ic5);
b5.setBounds(110,170,100,100);
b6=new JButton(ic6);
b6.setBounds(210,170,100,100);
b7=new JButton(ic7);
b7.setBounds(10,270,100,100);
b8=new JButton(ic8);
b8.setBounds(110,270,100,100);
b9=new JButton(ic9);
b9.setBounds(210,270,100,100);
login=new JButton("Login");
login.setBounds(35,380,250,20);
add(b1);b1.setVisible(false);
add(b2);b2.setVisible(false);
add(b3);b3.setVisible(false);
add(b4);b4.setVisible(false);
add(b5);b5.setVisible(false);
add(b6);b6.setVisible(false);
add(b7);b7.setVisible(false);
add(b8);b8.setVisible(false);
add(b9);b9.setVisible(false);
add(load);add(label1);add(tf1);
add(login);login.setVisible(true);
load.addActionListener(this);b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); b4.addActionListener(this); b5.addActionListener(this); b6.addActionListener(this); b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this); login.addActionListener(this);
setLayout(null);
setSize(340,110);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {

        String exchange;int exchangeno=0;


        if(e.getSource()==load)
        {String username=tf1.getText();
        File check = new File("E:\\Soft proj\\Software Project\\picpassword\\images\\"+username+"1.jpg");
	if (check.exists()){
            b1.setVisible(true);
            b2.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            b5.setVisible(true);
            b6.setVisible(true);
            b7.setVisible(true);
            b8.setVisible(true);
            b9.setVisible(true);
            login.setVisible(true);
            ic1=new ImageIcon("E:\\Soft proj\\Software Project\\picpassword\\images\\"+username+"1.jpg");
            ic2=new ImageIcon("E:\\Soft proj\\Software Project\\picpassword\\images\\"+username+"2.jpg");
            ic3=new ImageIcon("E:\\Soft proj\\Software Project\\picpassword\\images\\"+username+"3.jpg");
            ic4=new ImageIcon("E:\\Soft proj\\Software Project\\picpassword\\images\\"+username+"4.jpg");
            ic5=new ImageIcon("E:\\Soft proj\\Software Project\\picpassword\\images\\"+username+"5.jpg");
            ic6=new ImageIcon("E:\\Soft proj\\Software Project\\picpassword\\images\\"+username+"6.jpg");
            ic7=new ImageIcon("E:\\Soft proj\\Software Project\\picpassword\\images\\"+username+"7.jpg");
            ic8=new ImageIcon("E:\\Soft proj\\Software Project\\picpassword\\images\\"+username+"8.jpg");
            ic9=new ImageIcon("E:\\Soft proj\\Software Project\\picpassword\\images\\"+username+"9.jpg");
            b1.setIcon(ic8);
            b2.setIcon(ic5);
            b3.setIcon(ic1);
            b4.setIcon(ic7);
            b5.setIcon(ic2);
            b6.setIcon(ic9);
            b7.setIcon(ic4);
            b8.setIcon(ic6);
            b9.setIcon(ic3);
            setSize(340,450);
        }
        else
        {JOptionPane.showMessageDialog(this,"User not found, please check your username");}
        }
        if(e.getSource()==b1){
            Icon s1=b1.getIcon();
            Icon s2=s1;
            exchange=JOptionPane.showInputDialog(null,"Enter the box you want to exchange with");
            if (exchange==null)
            JOptionPane.showMessageDialog(null,"Cancel Button Pressed");
            else if(exchange.isEmpty())
            JOptionPane.showMessageDialog(null,"Empty Input");
            else
            {exchangeno=Integer.parseInt(exchange);
            switch(exchangeno)
            {
 case 1: JOptionPane.showMessageDialog(this,"Can't exchange with itself");
 break;
 case 2: s2=b2.getIcon();
         b2.setIcon(s1);
         b1.setIcon(s2);
         temp=r1;
         r1=r2;
         r2=temp;

 break;
 case 3: s2=b3.getIcon();
         b3.setIcon(s1);
         b1.setIcon(s2);
         temp=r1;
         r1=r3;
         r3=temp;
 break;
 case 4: s2=b4.getIcon();
         b4.setIcon(s1);
         b1.setIcon(s2);
         temp=r1;
         r1=r4;
         r4=temp;
 break;
 case 5: s2=b5.getIcon();
         b5.setIcon(s1);
         b1.setIcon(s2);
         temp=r1;
         r1=r5;
         r5=temp;
 break;
 case 6: s2=b6.getIcon();
         b6.setIcon(s1);
         b1.setIcon(s2);
         temp=r1;
         r1=r6;
         r6=temp;
 break;
 case 7: s2=b7.getIcon();
         b7.setIcon(s1);
         b1.setIcon(s2);
         temp=r1;
         r1=r7;
         r7=temp;
 break;
 case 8: s2=b8.getIcon();
         b8.setIcon(s1);
         b1.setIcon(s2);
         temp=r1;
         r1=r8;
         r8=temp;
 break;
 case 9: s2=b9.getIcon();
         b9.setIcon(s1);
         b1.setIcon(s2);
         temp=r1;
         r1=r9;
         r9=temp;
 break;
 default:JOptionPane.showMessageDialog(this,"Invalid Input");
            }
            }
        }
if(e.getSource()==b2){
            Icon s1=b2.getIcon();
            Icon s2=s1;
            exchange=JOptionPane.showInputDialog(null,"Enter the box you want to exchange with");
            if (exchange==null)
            JOptionPane.showMessageDialog(null,"Cancel Button Pressed");
            else if(exchange.isEmpty())
            JOptionPane.showMessageDialog(null,"Empty Input");
            else
            {exchangeno=Integer.parseInt(exchange);
            switch(exchangeno)
 {
 case 1: s2=b1.getIcon();
         b1.setIcon(s1);
         b2.setIcon(s2);
         temp=r2;
         r2=r1;
         r1=temp;
 break;
 case 2: JOptionPane.showMessageDialog(this,"Can't exchange with itself");
 break;
 case 3: s2=b3.getIcon();
         b3.setIcon(s1);
         b2.setIcon(s2);
         temp=r2;
         r2=r3;
         r3=temp;
 break;
 case 4: s2=b4.getIcon();
         b4.setIcon(s1);
         b2.setIcon(s2);
         temp=r2;
         r2=r4;
         r4=temp;
 break;
 case 5: s2=b5.getIcon();
         b5.setIcon(s1);
         b2.setIcon(s2);
         temp=r2;
         r2=r5;
         r5=temp;
 break;
 case 6: s2=b6.getIcon();
         b6.setIcon(s1);
         b2.setIcon(s2);
         temp=r2;
         r2=r6;
         r6=temp;
 break;
 case 7: s2=b7.getIcon();
         b7.setIcon(s1);
         b2.setIcon(s2);
         temp=r2;
         r2=r7;
         r7=temp;
 break;
 case 8: s2=b8.getIcon();
         b8.setIcon(s1);
         b2.setIcon(s2);
         temp=r2;
         r2=r8;
         r8=temp;
 break;
 case 9: s2=b9.getIcon();
         b9.setIcon(s1);
         b2.setIcon(s2);
         temp=r2;
         r2=r9;
         r9=temp;
 break;
 default:JOptionPane.showMessageDialog(this,"Invalid Input");
            }
     }
}
if(e.getSource()==b3){
            Icon s1=b3.getIcon();
            Icon s2=s1;
            exchange=JOptionPane.showInputDialog(null,"Enter the box you want to exchange with");
            if (exchange==null)
            JOptionPane.showMessageDialog(null,"Cancel Button Pressed");
            else if(exchange.isEmpty())
            JOptionPane.showMessageDialog(null,"Empty Input");
            else
            {exchangeno=Integer.parseInt(exchange);
            switch(exchangeno)
 {
 case 1: s2=b1.getIcon();
         b1.setIcon(s1);
         b3.setIcon(s2);
         temp=r3;
         r3=r1;
         r1=temp;
 break;
 case 2: s2=b2.getIcon();
         b2.setIcon(s1);
         b3.setIcon(s2);
         temp=r3;
         r3=r2;
         r2=temp;
 break;
 case 3: JOptionPane.showMessageDialog(this,"Can't exchange with itself");
 break;
 case 4: s2=b4.getIcon();
         b4.setIcon(s1);
         b3.setIcon(s2);
         temp=r3;
         r3=r4;
         r4=temp;
 break;
 case 5: s2=b5.getIcon();
         b5.setIcon(s1);
         b3.setIcon(s2);
         temp=r3;
         r3=r5;
         r5=temp;
 break;
 case 6: s2=b6.getIcon();
         b6.setIcon(s1);
         b3.setIcon(s2);
         temp=r3;
         r3=r6;
         r6=temp;
 break;
 case 7: s2=b7.getIcon();
         b7.setIcon(s1);
         b3.setIcon(s2);
         temp=r3;
         r3=r7;
         r7=temp;
 break;
 case 8: s2=b8.getIcon();
         b8.setIcon(s1);
         b3.setIcon(s2);
         temp=r3;
         r3=r8;
         r8=temp;
 break;
 case 9: s2=b9.getIcon();
         b9.setIcon(s1);
         b3.setIcon(s2);
         temp=r3;
         r3=r9;
         r9=temp;
 break;
 default:JOptionPane.showMessageDialog(this,"Invalid Input");
            }
    }
}
if(e.getSource()==b4){
            Icon s1=b4.getIcon();
            Icon s2=s1;
            exchange=JOptionPane.showInputDialog(null,"Enter the box you want to exchange with");
            if (exchange==null)
            JOptionPane.showMessageDialog(null,"Cancel Button Pressed");
            else if(exchange.isEmpty())
            JOptionPane.showMessageDialog(null,"Empty Input");
            else
            {exchangeno=Integer.parseInt(exchange);
            switch(exchangeno)
 {
 case 1: s2=b1.getIcon();
         b1.setIcon(s1);
         b4.setIcon(s2);
         temp=r4;
         r4=r1;
         r1=temp;
 break;
 case 2: s2=b2.getIcon();
         b2.setIcon(s1);
         b4.setIcon(s2);
         temp=r4;
         r4=r2;
         r2=temp;
 break;
 case 3: s2=b3.getIcon();
         b3.setIcon(s1);
         b4.setIcon(s2);
         temp=r4;
         r4=r3;
         r3=temp;
 break;
 case 4: JOptionPane.showMessageDialog(this,"Can't exchange with itself");
 break;
 case 5: s2=b5.getIcon();
         b5.setIcon(s1);
         b4.setIcon(s2);
         temp=r4;
         r4=r5;
         r5=temp;
 break;
 case 6: s2=b6.getIcon();
         b6.setIcon(s1);
         b4.setIcon(s2);
         temp=r4;
         r4=r6;
         r6=temp;
 break;
 case 7: s2=b7.getIcon();
         b7.setIcon(s1);
         b4.setIcon(s2);
         temp=r4;
         r4=r7;
         r7=temp;
 break;
 case 8: s2=b8.getIcon();
         b8.setIcon(s1);
         b4.setIcon(s2);
         temp=r4;
         r4=r8;
         r8=temp;
 break;
 case 9: s2=b9.getIcon();
         b9.setIcon(s1);
         b4.setIcon(s2);
         temp=r4;
         r4=r9;
         r9=temp;
 break;
 default:JOptionPane.showMessageDialog(this,"Invalid Input");
            }
    }
}
if(e.getSource()==b5){
            Icon s1=b5.getIcon();
            Icon s2=s1;
            exchange=JOptionPane.showInputDialog(null,"Enter the box you want to exchange with");
            if (exchange==null)
            JOptionPane.showMessageDialog(null,"Cancel Button Pressed");
            else if(exchange.isEmpty())
            JOptionPane.showMessageDialog(null,"Empty Input");
            else
            {exchangeno=Integer.parseInt(exchange);
            switch(exchangeno)
 {
 case 1: s2=b1.getIcon();
         b1.setIcon(s1);
         b5.setIcon(s2);
         temp=r5;
         r5=r1;
         r1=temp;
 break;
 case 2: s2=b2.getIcon();
         b2.setIcon(s1);
         b5.setIcon(s2);
         temp=r5;
         r5=r2;
         r2=temp;
 break;
 case 3: s2=b3.getIcon();
         b3.setIcon(s1);
         b5.setIcon(s2);
         temp=r5;
         r5=r3;
         r3=temp;
 break;
 case 4: s2=b4.getIcon();
         b4.setIcon(s1);
         b5.setIcon(s2);
         temp=r5;
         r5=r4;
         r4=temp;
 break;
 case 5: JOptionPane.showMessageDialog(this,"Can't exchange with itself");
 break;
 case 6: s2=b6.getIcon();
         b6.setIcon(s1);
         b5.setIcon(s2);
         temp=r5;
         r5=r6;
         r6=temp;
 break;
 case 7: s2=b7.getIcon();
         b7.setIcon(s1);
         b5.setIcon(s2);
         temp=r5;
         r5=r7;
         r7=temp;
 break;
 case 8: s2=b8.getIcon();
         b8.setIcon(s1);
         b5.setIcon(s2);
         temp=r5;
         r5=r8;
         r8=temp;
 break;
 case 9: s2=b9.getIcon();
         b9.setIcon(s1);
         b5.setIcon(s2);
         temp=r5;
         r5=r9;
         r9=temp;
 break;
 default:JOptionPane.showMessageDialog(this,"Invalid Input");
            }
    }
}
if(e.getSource()==b6){
            Icon s1=b6.getIcon();
            Icon s2=s1;
            exchange=JOptionPane.showInputDialog(null,"Enter the box you want to exchange with");
            if (exchange==null)
            JOptionPane.showMessageDialog(null,"Cancel Button Pressed");
            else if(exchange.isEmpty())
            JOptionPane.showMessageDialog(null,"Empty Input");
            else
            {exchangeno=Integer.parseInt(exchange);
            switch(exchangeno)
 {
 case 1: s2=b1.getIcon();
         b1.setIcon(s1);
         b6.setIcon(s2);
         temp=r6;
         r6=r1;
         r1=temp;
 break;
 case 2: s2=b2.getIcon();
         b2.setIcon(s1);
         b6.setIcon(s2);
         temp=r6;
         r6=r2;
         r2=temp;
 break;
 case 3: s2=b3.getIcon();
         b3.setIcon(s1);
         b6.setIcon(s2);
         temp=r6;
         r6=r3;
         r3=temp;
 break;
 case 4: s2=b4.getIcon();
         b4.setIcon(s1);
         b6.setIcon(s2);
         temp=r6;
         r6=r4;
         r4=temp;
 break;
 case 5: s2=b5.getIcon();
         b5.setIcon(s1);
         b6.setIcon(s2);
         temp=r6;
         r6=r5;
         r5=temp;
 break;
 case 6: JOptionPane.showMessageDialog(this,"Can't exchange with itself");
 break;
 case 7: s2=b7.getIcon();
         b7.setIcon(s1);
         b6.setIcon(s2);
         temp=r6;
         r6=r7;
         r7=temp;
 break;
 case 8: s2=b8.getIcon();
         b8.setIcon(s1);
         b6.setIcon(s2);
         temp=r6;
         r6=r8;
         r8=temp;
 break;
 case 9: s2=b9.getIcon();
         b9.setIcon(s1);
         b6.setIcon(s2);
         temp=r6;
         r6=r9;
         r9=temp;
 break;
 default:JOptionPane.showMessageDialog(this,"Invalid Input");
            }
    }
}
if(e.getSource()==b7){
            Icon s1=b7.getIcon();
            Icon s2=s1;
            exchange=JOptionPane.showInputDialog(null,"Enter the box you want to exchange with");
            if (exchange==null)
            JOptionPane.showMessageDialog(null,"Cancel Button Pressed");
            else if(exchange.isEmpty())
            JOptionPane.showMessageDialog(null,"Empty Input");
            else
            {exchangeno=Integer.parseInt(exchange);
            switch(exchangeno)
 {
 case 1: s2=b1.getIcon();
         b1.setIcon(s1);
         b7.setIcon(s2);
         temp=r7;
         r7=r1;
         r1=temp;
 break;
 case 2: s2=b2.getIcon();
         b2.setIcon(s1);
         b7.setIcon(s2);
         temp=r7;
         r7=r2;
         r2=temp;
 break;
 case 3: s2=b3.getIcon();
         b3.setIcon(s1);
         b7.setIcon(s2);
         temp=r7;
         r7=r3;
         r3=temp;
 break;
 case 4: s2=b4.getIcon();
         b4.setIcon(s1);
         b7.setIcon(s2);
         temp=r7;
         r7=r4;
         r4=temp;
 break;
 case 5: s2=b5.getIcon();
         b5.setIcon(s1);
         b7.setIcon(s2);
         temp=r7;
         r7=r5;
         r5=temp;
 break;
 case 6: s2=b6.getIcon();
         b6.setIcon(s1);
         b7.setIcon(s2);
         temp=r7;
         r7=r6;
         r6=temp;
 break;
 case 7: JOptionPane.showMessageDialog(this,"Can't exchange with itself");
 break;
 case 8: s2=b8.getIcon();
         b8.setIcon(s1);
         b7.setIcon(s2);
         temp=r7;
         r7=r8;
         r8=temp;
 break;
 case 9: s2=b9.getIcon();
         b9.setIcon(s1);
         b7.setIcon(s2);
         temp=r7;
         r7=r9;
         r9=temp;
 break;
 default:JOptionPane.showMessageDialog(this,"Invalid Input");
            }
    }
}
if(e.getSource()==b8){
            Icon s1=b8.getIcon();
            Icon s2=s1;
            exchange=JOptionPane.showInputDialog(null,"Enter the box you want to exchange with");
            if (exchange==null)
            JOptionPane.showMessageDialog(null,"Cancel Button Pressed");
            else if(exchange.isEmpty())
            JOptionPane.showMessageDialog(null,"Empty Input");
            else
            {exchangeno=Integer.parseInt(exchange);
            switch(exchangeno)
 {
 case 1: s2=b1.getIcon();
         b1.setIcon(s1);
         b8.setIcon(s2);
         temp=r8;
         r8=r1;
         r1=temp;
 break;
 case 2: s2=b2.getIcon();
         b2.setIcon(s1);
         b8.setIcon(s2);
         temp=r8;
         r8=r2;
         r2=temp;
 break;
 case 3: s2=b3.getIcon();
         b3.setIcon(s1);
         b8.setIcon(s2);
         temp=r8;
         r8=r3;
         r3=temp;
 break;
 case 4: s2=b4.getIcon();
         b4.setIcon(s1);
         b8.setIcon(s2);
         temp=r8;
         r8=r4;
         r4=temp;
 break;
 case 5: s2=b5.getIcon();
         b5.setIcon(s1);
         b8.setIcon(s2);
         temp=r8;
         r8=r5;
         r5=temp;
 break;
 case 6: s2=b6.getIcon();
         b6.setIcon(s1);
         b8.setIcon(s2);
         temp=r8;
         r8=r6;
         r6=temp;
 break;
 case 7: s2=b7.getIcon();
         b7.setIcon(s1);
         b8.setIcon(s2);
         temp=r8;
         r8=r7;
         r7=temp;
 break;
 case 8: JOptionPane.showMessageDialog(this,"Can't exchange with itself");
 break;
 case 9: s2=b9.getIcon();
         b9.setIcon(s1);
         b8.setIcon(s2);
         temp=r8;
         r8=r9;
         r9=temp;
 break;
 default:JOptionPane.showMessageDialog(this,"Invalid Input");
            }
    }
}
if(e.getSource()==b9){
            Icon s1=b9.getIcon();
            Icon s2=s1;
            exchange=JOptionPane.showInputDialog(null,"Enter the box you want to exchange with");
            if (exchange==null)
            JOptionPane.showMessageDialog(null,"Cancel Button Pressed");
            else if(exchange.isEmpty())
            JOptionPane.showMessageDialog(null,"Empty Input");
            else
            {exchangeno=Integer.parseInt(exchange);
            switch(exchangeno)
 {
 case 1: s2=b1.getIcon();
         b1.setIcon(s1);
         b9.setIcon(s2);
         temp=r9;
         r9=r1;
         r1=temp;
 break;
 case 2: s2=b2.getIcon();
         b2.setIcon(s1);
         b9.setIcon(s2);
         temp=r9;
         r9=r2;
         r2=temp;
 break;
 case 3: s2=b3.getIcon();
         b3.setIcon(s1);
         b9.setIcon(s2);
         temp=r9;
         r9=r3;
         r3=temp;
 break;
 case 4: s2=b4.getIcon();
         b4.setIcon(s1);
         b9.setIcon(s2);
         temp=r9;
         r9=r4;
         r4=temp;
 break;
 case 5: s2=b5.getIcon();
         b5.setIcon(s1);
         b9.setIcon(s2);
         temp=r9;
         r9=r5;
         r5=temp;
 break;
 case 6: s2=b6.getIcon();
         b6.setIcon(s1);
         b9.setIcon(s2);
         temp=r9;
         r9=r6;
         r6=temp;
 break;
 case 7: s2=b7.getIcon();
         b7.setIcon(s1);
         b9.setIcon(s2);
         temp=r9;
         r9=r7;
         r7=temp;
 break;
 case 8: s2=b8.getIcon();
         b8.setIcon(s1);
         b9.setIcon(s2);
         temp=r9;
         r9=r8;
         r8=temp;
 break;
 case 9: JOptionPane.showMessageDialog(this,"Can't exchange with itself");
 break;
 default:JOptionPane.showMessageDialog(this,"Invalid Input");
            }
    }
}
if(e.getSource()==login)
{
if((r1==1)&&(r2==2)&&(r3==3)&&(r4==4)&&(r5==5)&&(r6==6)&&(r7==7)&&(r8==8)&&(r9==9))
    JOptionPane.showMessageDialog(this,"Authentication Successful");
else
    JOptionPane.showMessageDialog(this,"Wrong Password, please try again");

    }
}
    public static void main(String args[]) {

new login();
    }
}
