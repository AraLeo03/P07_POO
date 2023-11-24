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
import java.util.ArrayList;

public class AppDemoIU {

    public static void main(String[] args) {
        IUComputadora iuComputadora = new IUComputadora("computadora.png", new Computadora("Intel", "123", "Dell", "PC1", 999.99f, new Microprocesador("Intel", "456", "Dell", "i7", 299.99f, null, 8192, 3000), 8192));
        
        IUSmartphone iuSmartphone = new IUSmartphone("smartphone.png", new Smartphone("Samsung", "789", "Galaxy", "S20", 799.99f, new Microprocesador("Samsung", "101", "Galaxy", "Exynos", 199.99f, null, 6144, 2700), 6144, null, null));
        Pantalla pantallaTV = new Pantalla("Samsung", "987654", "Samsung", "Pantalla1", 199.99f, null, 1920, 1080);
        
        IUTelevision iuTelevision = new IUTelevision("television.png", new Television("Sony", "54321", "Bravia", "Television1", 1499.99f, pantallaTV));

        Frame frame = new Frame();
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 200);
        frame.add(iuComputadora);
        frame.add(iuSmartphone);
        frame.add(iuTelevision);
        frame.setVisible(true);
    }
}
