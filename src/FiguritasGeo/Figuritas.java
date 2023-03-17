/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguritasGeo;

/**
 *
 * @author pavilion
 */
public class Figuritas {
    double area;
    
    public void FiguritaCir (double radio){
        area = Math.PI*Math.pow(radio, 2);
        System.out.printf("\t\nEl area del circulo es: " + "%2.2f", area);    
    }
    public void FiguritaCua(double lado){
        area = lado * lado;
        System.out.printf("\t\nElarea del cuadrado es: " + "%2.2f", area);
    }
    public void FiguritaTri(double base, double altura){
        area = base * altura /2;
        System.out.printf("\t\nElarea del triangulo es: " + "%2.2f", area);
    }
    public void FiguritaRec(double base1, double altura1){
        area = base1 * altura1;
        System.out.printf("\t\nElarea del rectangulo es: " + "%2.2f", area);
    }
    public void FiguritaEsf(double radio1){
        area = 4 * (Math.PI)*Math.pow(radio1, 2);
        System.out.printf("\t\nElarea de la esfera es: " + "%2.2f", area);
    }
    public void FiguritaCub(double arista){
        area = 6 * Math.pow(arista, 2);
        System.out.printf("\t\nElarea del cubo es: " + "%2.2f", area);
    }
}
