/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.p07pooherencia;

import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class AppDemoHerencia {
    
    public static void main(String[] args) {
         Pantalla pantallaSmartphone1 = new Pantalla("Samsung", "12345", "Galaxy", "Smartphone1", 299.99f, null, 1080, 1920);
         Sensor sensorHuella1 = new Sensor("Samsung", "12345", "Galaxy", "SensorHuella1", 12.99f, pantallaSmartphone1, "Huella Digital", "N/A", 0);
        Microprocesador cpuSmartphone1 = new Microprocesador("Samsung", "12345", "Galaxy", "CPU1", 199.99f, pantallaSmartphone1, 4096, 2000);
        Smartphone smartphone1 = new Smartphone("Samsung", "12345", "Galaxy", "Smartphone1", 999.99f, cpuSmartphone1, 4096, sensorHuella1, pantallaSmartphone1);

        Pantalla pantallaSmartphone2 = new Pantalla("Apple", "67890", "iPhone", "Smartphone2", 1299.99f, null, 720, 1280);
        Sensor sensorHuella2 = new Sensor("Apple", "67890", "iPhone", "SensorHuella2", 29.99f, pantallaSmartphone2, "Huella Digital", "N/A", 0);
        Microprocesador cpuSmartphone2 = new Microprocesador("Apple", "67890", "iPhone", "CPU2", 299.99f, pantallaSmartphone2, 8192, 2500);
        Smartphone smartphone2 = new Smartphone("Apple", "67890", "iPhone", "Smartphone2", 1299.99f, cpuSmartphone2, 8192, sensorHuella2, pantallaSmartphone2);

        // Crear objetos de tipo Television
        Pantalla pantallaTV1 = new Pantalla("Sony", "54321", "Bravia", "Television1", 1499.99f, null, 3840, 2160);
        Television tv1 = new Television("Sony", "54321", "Bravia", "Television1", 1499.99f, pantallaTV1);

        Pantalla pantallaTV2 = new Pantalla("LG", "98765", "OLED", "Television2", 1999.99f, null, 1920, 1080);
        Television tv2 = new Television("LG", "98765", "OLED", "Television2", 1999.99f, pantallaTV2);

        // Crear listas
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
        listaDeSmartphones.add(smartphone1);
        listaDeSmartphones.add(smartphone2);

        ArrayList<Television> listaDeTVs = new ArrayList<>();
        listaDeTVs.add(tv1);
        listaDeTVs.add(tv2);

        // Mostrar atributos de los Smartphones
        System.out.println("Atributos de los Smartphones:");
        for (Smartphone smartphone : listaDeSmartphones) {
            System.out.println(smartphone.toString());
        }

        // Mostrar atributos de las Televisiones
        System.out.println("\nAtributos de las Televisiones:");
        for (Television tv : listaDeTVs) {
            System.out.println(tv.toString());
        }
    }
}
