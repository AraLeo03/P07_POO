/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p07pooherencia;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
/**
 *
 * @author Dell
 */
class IUDispositivoElectronico extends Canvas implements MouseListener {
    protected BufferedImage image;
    protected DispositivoElectronico dispositivo;

    public IUDispositivoElectronico(String imagenFile, DispositivoElectronico dispositivo) {
        try {
            image = ImageIO.read(new File(imagenFile));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dispositivo = dispositivo;
        this.addMouseListener(this);
    }

    public void paint(Graphics g) {
        // Dibujar la imagen en el objeto Canvas
        g.drawImage(image, 10, 10, 50, 50, this);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println(dispositivo.toString());
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }
}