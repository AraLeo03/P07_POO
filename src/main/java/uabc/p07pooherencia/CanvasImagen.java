/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p07pooherencia;

/**
 *
 * @author Dell
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class CanvasImagen extends Canvas {

   private BufferedImage image;

   public CanvasImagen() {
  	try {
     	// Cargar la imagen desde el archivo PNG
     	image = ImageIO.read(new File("chip.png"));
  	} catch (Exception e) {
     	e.printStackTrace();
  	}
   }

   public void paint(Graphics g) {
  	// Dibujar la imagen en el objeto Canvas
  	g.drawImage(image, 10, 10, 50,50, this);
   }

   public static void main(String[] args) {
    	CanvasImagen canvas = new CanvasImagen();
  	Frame frame = new Frame();
  	frame.setSize(300, 300);
  	frame.add(canvas);
  	frame.setVisible(true);
   }
}

