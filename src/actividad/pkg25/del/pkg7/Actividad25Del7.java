package actividad.pkg25.del.pkg7;

import java.util.Scanner;

public class Actividad25Del7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        Estudiante datos[] = new Estudiante[10];

        int op = 0;
        while (op != 5) {
            System.out.println(" ");
            System.out.println("-------Menu--------");

            System.out.println("1. nuevo aluno");
            System.out.println("2. ver alumnos");
            System.out.println("3. buscar alumno");
            System.out.println("4. modificar alumno");
            System.out.println("5. Salir");
            System.out.println("--------------------");
            System.out.println(" ");
            System.out.println("ingrese el numero de opcion");
            System.out.println(" ");
            op = teclado.nextInt();
            System.out.println(" ");
            if (op == 1) {
                System.out.println("--------------------");
                System.out.println("Ingrese el numero de clave");
                int clave = teclado.nextInt();
                System.out.println("Ingrese el nombre");
                String nombre = letras.nextLine();
                System.out.println("Igresa el grado a cursar");
                String grado = letras.nextLine();
                System.out.println(nuevoAlumno(clave, nombre, grado, datos));
                System.out.println("--------------------");

            } else if (op == 2) {
                System.out.println(imprimirTodo(datos));
            } else if (op == 3) {

                System.out.println("Ingrese la calve ");
                int clave = teclado.nextInt();

                System.out.println(buscarAlumno(clave, datos));
            } else if (op == 4) {
                System.out.println("Ingrese la clave del alumno a modificar");
                int clave = teclado.nextInt();

                if (buscarAlumnoBooleano(clave, datos)) {
                    System.out.println("Ingrese el nuevo Nombre del alumno");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el nuevo grado");
                    String grado = teclado.nextLine();
                    System.out.println(modificarDatos(clave, nombre, grado, datos));
                } else {
                    System.out.println("La clave no existe en el registro de datos");
                }
            }

        }
    }

    public static String nuevoAlumno(int clave, String nombre, String grado, Estudiante arreglo[]) {
        boolean lleno = true;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = new Estudiante(clave, nombre, grado);
                lleno = false;
                break;
            } else if (arreglo[i].getClave() == clave) {
                System.out.println("  ");
                return "Ya existe la clave";

            }
        }

        if (!lleno) {

            return "\n Se guardo con exito \n";

        } else {
            return "Ya no hay espacio";

        }
    }

    public static String imprimirTodo(Estudiante arreglo[]) {

        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
//            if (arreglo[i] == null) {
//                cadena = cadena + arreglo[i].getClave() + " | " + arreglo[i].getNombre() + " | " + arreglo[i].getGrado() + "\n";

            if (arreglo[i] != null) {
                 cadena = cadena + arreglo[i].getClave() + " | " + arreglo[i].getNombre() + " | " + arreglo[i].getGrado() + "\n";



            }

        }
        return cadena;
    }

    public static String buscarAlumno(int clave, Estudiante arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getClave() == clave) {

                return "\n Los datos son \n clave: " + arreglo[i].getClave() + "\n nombre: " + arreglo[i].getNombre() + "\n grado: " + arreglo[i].getGrado();

            }
        }
        return "No existe la clave ingresada";
    }

    public static boolean buscarAlumnoBooleano(int clave, Estudiante arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getClave() == clave) {
                return true;
            }

        }
        return false;
    }

    public static String modificarDatos(int clave, String nombre, String grado, Estudiante arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getClave() == clave) {
                arreglo[i].setNombre(nombre);
                arreglo[i].setGrado(grado);
                return "\n Se guardo exitosamente \n";
            }
        }
        return " ";
    }

}
