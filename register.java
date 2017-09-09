import java.io.*;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;
import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;

public class register extends JFrame implements ActionListener {

    JButton chooseButton;
    JTextField tf1;
    JFileChooser fc;
    BufferedImage image;

    public register() {
        super("Register new user");

        //Create a file chooser
        fc = new JFileChooser();

        chooseButton = new JButton("Open a File...");

        JLabel label1=new JLabel("Enter Username");
	JLabel label2=new JLabel("Select Image for password");
	tf1=new JTextField("Enter a username");

	label1.setBounds(10,10,190,20);

	tf1.setBounds(250,10,170,20);

	label2.setBounds(10,40,190,20);

	chooseButton.setBounds(250,40,170,20);

add(label1);add(label2);add(tf1);add(chooseButton);
chooseButton.addActionListener(this);
setLayout(null);
setSize(450,110);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

     public void actionPerformed(ActionEvent e) {


	String username=tf1.getText();
	File check = new File("E:\\Soft proj\\Software Project\\picpassword\\images\\"+username+"1.jpg");
	if (check.exists()){JOptionPane.showMessageDialog(this,"Sorry, username already exists, try another one");}
	else{
        //Handle open button action.
        if (e.getSource() == chooseButton) {
            int returnVal = fc.showOpenDialog(register.this);

            if (returnVal == JFileChooser.APPROVE_OPTION){
                File file = fc.getSelectedFile();
		try{
		image = ImageIO.read(file);
		String filename=file.getName();
	filename=filename.substring(0,filename.lastIndexOf("."));
        FileInputStream fis = new FileInputStream(file);
        BufferedImage image = ImageIO.read(fis); //reading the image file

        int rows = 3; //You should decide the values for rows and cols variables
        int cols = 3;
        int chunks = rows * cols;


        int chunkWidth = image.getWidth() / cols; // determines the chunk width and height
        int chunkHeight = image.getHeight() / rows;


        Double sx = 100/(double)(chunkWidth);
        Double sy = 100/(double)(chunkHeight);
	AffineTransform affineTransform = new AffineTransform();
	affineTransform.scale(sx, sy);
        int count = 0;
	BufferedImage temp;
        BufferedImage imgs[] = new BufferedImage[chunks]; //Image array to hold image chunks
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                //Initialize the image array with image chunks
                imgs[count] = new BufferedImage(100, 100, image.getType());
		temp=new BufferedImage(chunkWidth, chunkHeight, image.getType());

                // draws the image chunk
                Graphics2D gr = temp.createGraphics();
                gr.drawImage(image, 0, 0, chunkWidth, chunkHeight, chunkWidth * y, chunkHeight * x, chunkWidth * y + chunkWidth, chunkHeight * x + chunkHeight, null);
                gr.dispose();
		Graphics2D gd = imgs[count].createGraphics();
		gd.drawImage(temp, affineTransform, null);
		count++;
            }
        }

        //writing mini images into image files
        for (int i = 0; i < imgs.length; i++) {
            ImageIO.write(imgs[i], "jpg", new File("E:\\Soft proj\\Software Project\\picpassword\\images\\"+username+(i+1) + ".jpg"));
        }
        JOptionPane.showMessageDialog(this,"Registration successful. You can now proceed for login");
		}
		catch(IOException error){JOptionPane.showMessageDialog(this,"Error: "+error);}
		}
        }
	}
    }
 public static void main(String args[]) {

new register();
    }
}
