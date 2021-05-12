package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class JavaApplication6 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Nombre del alumno:");
    String nombre=sc.next();
        int [] array={80, 90, 91, 85, 100};
        int total =0;
        for(int i=0;i<5;i++){
       total+=array[i]/5;
       System.out.println("calificacion" + i + " = " + array[i]);
   }
       System.out.println("Promedio: "+total);
       System.out.println("Calificacion: B "  );
   }
}
