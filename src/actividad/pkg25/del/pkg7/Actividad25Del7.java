
package actividad.pkg25.del.pkg7;

import java.util.Scanner;

public class Actividad25Del7 {

   
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);    
    Scanner letras = new Scanner(System.in);
    Estudiante datos[] = new Estudiante[10];
        
        int op =0;
        while(op!=5){
            System.out.println(" ");  
        System.out.println("---Menu---");
        
            System.out.println("1. nuevo aluno");
            System.out.println("2. ver alumno");
            System.out.println("3. buscar alumno");
            System.out.println("4. modificar alumno");
            System.out.println("5. Salir");
            System.out.println(" ");
            System.out.println("ingrese el numero de opcion");
        op = teclado.nextInt();
        
        if (op==1) {
            System.out.println("Ingrese el numero de clave");
            int clave = teclado.nextInt();
            System.out.println("Ingrese el nombre");
            String nombre = letras.nextLine();
            System.out.println("Igresa el grado a cursar");
            String grado = letras.nextLine();
             nuevoAlumno(clave,nombre,grado,datos);
        
           }       
        } 
    }
    
    public static String nuevoAlumno(int clave,String nombre,String grado,Estudiante arreglo[]){
        Estudiante es1 = new Estudiante(clave,nombre,grado);
        
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = new Estudiante(clave,nombre,grado);
            }
        }
        
        return "Se guardo con exito";
    
    }
}
