/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguritasGeo;
import java.util.Scanner;
/**
 *
 * @author pavilion
 */
public class Datitos {
    Scanner doritos = new Scanner (    System.in);
    double radio;
    double lado;
    double base;
    double altura;
    double base1;
    double altura1;
    double radio1;
    double arista;
    
public void valores(){
    System.out.println("\t\s //Area del Circulo//");
       System.out.println("\t\sIngresa el valor del radio");
       radio = doritos.nextDouble();
    System.out.println("\t\s //Area del Cuadrado//");
       System.out.println("\t\sIngresa el valor del lado");
       lado = doritos.nextDouble();
    System.out.println("\t\s //Area del Triangulo//");
       System.out.println("\t\sIngresa el valor de la base y altura");
       base = doritos.nextDouble();
       altura = doritos.nextDouble();
    System.out.println("\t\s //Area del Rectangulo//");
       System.out.println("\t\sIngresa el valor de la base y altura");
       base1 = doritos.nextDouble();
       altura1 = doritos.nextDouble();
    System.out.println("\t\s //Area del Esfera//");
       System.out.println("\t\sIngresa el valor del radio");
       radio1 = doritos.nextDouble();
    System.out.println("\t\s //Area del Cubo//");
       System.out.println("\t\sIngresa el valor de la arista");
       arista = doritos.nextDouble();
   
   Figuritas dorilocos = new Figuritas();
   dorilocos.FiguritaCir(radio);
   dorilocos.FiguritaCua(lado);
   dorilocos.FiguritaCub(arista);
   dorilocos.FiguritaEsf(radio1);
   dorilocos.FiguritaRec(base1, altura1);
   dorilocos.FiguritaTri(base, altura);
}
}