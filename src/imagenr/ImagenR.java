/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenr;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.*;
import javafx.scene.control.ToggleButton;
import javax.swing.JToggleButton;
public class ImagenR extends JPanel{
public static void main(String ar[]) throws IOException, InterruptedException{
boolean stop=false; String stop1;
String cads[]={"/recursos/TeoriaT.jpg","/recursos/star_platinum.png","/recursos/the_world.png"};

ImageIcon i1=new ImageIcon("C:\\Users\\Juan Carlos Castillo\\Documents\\NetBeansProjects\\ImagenR\\src\\recursos\\star_platinum.png");
i1=new ImageIcon(i1.getImage().getScaledInstance(200,200,100));
ImageIcon i2=new ImageIcon("C:\\Users\\Juan Carlos Castillo\\Documents\\NetBeansProjects\\ImagenR\\src\\recursos\\the_world.png");
i2=new ImageIcon(i2.getImage().getScaledInstance(200,200,100));
ImageIcon i3=new ImageIcon("C:\\Users\\Juan Carlos Castillo\\Documents\\NetBeansProjects\\ImagenR\\src\\recursos\\TeoriaT.jpg");
i3=new ImageIcon(i3.getImage().getScaledInstance(200,200,100));
JFrame v=new JFrame();
v.setBounds(30, 30, 500, 300);
v.setLayout(new FlowLayout());

JToggleButton b1=new JToggleButton("Stop!");
v.add(b1);
JButton l1=new JButton();

v.add(l1);

v.setVisible(true);
v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
do{
l1.setIcon(i1);
Thread.sleep(100);
l1.setIcon(i2);
Thread.sleep(100);
l1.setIcon(i3);
Thread.sleep(100);
}while(stop==false);
if(b1.isSelected()){stop=true;}

}
}
