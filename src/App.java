
import java.util.Scanner;

public class App {

    static Scanner teclado = new Scanner(System.in);

    
    public static int leerCantidad() {
        int cantidad;

        do {
            System.out.print("Ingrese la cantidad de mediciones (3-20): ");
            cantidad = teclado.nextInt();

            if (cantidad < 3 || cantidad > 20) {
                System.out.println("Error: debe ingresar un valor entre 3 y 20.");
            }

        } while (cantidad < 3 || cantidad > 20);
        System.out.println();
        return cantidad;
    }

    public static boolean validarTiempo(int tiempo) {
        return tiempo >= 20 && tiempo <= 500;
    }
    
    public static void cargarTiempos(int[] tiempos) {

        for (int i = 0; i < tiempos.length; i++) {

            do {
                System.out.print("Ingrese el tiempo de la medicion "
                        + (i + 1) + " (20-500 ms): ");

                tiempos[i] = teclado.nextInt();

                if (!validarTiempo(tiempos[i])) {
                    System.out.println("Error: tiempo invalido. "
                            + "Debe estar entre 20 y 500 ms.");
                }

            } while (!validarTiempo(tiempos[i]));
        }
    }

    
    public static int calcularSuma(int[] tiempos) {
        int suma = 0;

        for (int i = 0; i < tiempos.length; i++) {
            suma += tiempos[i];
        }

        return suma;
    }

    public static int contarRango(int[] tiempos, int minimo, int maximo) {
        int contador = 0;

        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] >= minimo && tiempos[i] <= maximo) {
                contador++;
            }
        }

        return contador;
    }

    
    public static int contarMayores(int[] tiempos, int limite) {
        int contador = 0;

        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] > limite) {
                contador++;
            }
        }

        return contador;
    }

    
    public static double calcularPromedio(int suma, int cantidad) {
        return (double) suma / cantidad;
    }

 
    public static int buscarMenor(int[] tiempos) {
        int menor = tiempos[0];

        for (int i = 1; i < tiempos.length; i++) {
            if (tiempos[i] < menor) {
                menor = tiempos[i];
            }
        }

        return menor;
    }

    
    public static int buscarPrimeraPosicion(int[] tiempos, int menor) {

        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] == menor) {
                return i + 1;
            }
        }

        return -1;
    }

    
    public static int contarInferioresPromedio(int[] tiempos, double promedio) {
        int contador = 0;

        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] < promedio) {
                contador++;
            }
        }

        return contador;
    }

   
    public static void mostrarTiempos(int[] tiempos) {

        System.out.println("\n--- LISTADO DE MEDICIONES ---");

        for (int i = 0; i < tiempos.length; i++) {
            System.out.println("Medicion " + (i + 1) + ": "
                    + tiempos[i] + " ms");
        }
    }

    public static void mostrarResumen(int[] tiempos) {

        int suma = calcularSuma(tiempos);

        int entreRango = contarRango(tiempos, 20, 200);

        int mayores = contarMayores(tiempos, 200);

        double promedio = calcularPromedio(suma, tiempos.length);

        int menor = buscarMenor(tiempos);

        int inferiores = contarInferioresPromedio(tiempos, promedio);

        int posicionMenor = buscarPrimeraPosicion(tiempos, menor);

        mostrarTiempos(tiempos);


        System.out.println("Mediciones entre 20 y 200 ms: "
                + entreRango);

        System.out.println("Mediciones superiores a 200 ms: "
                + mayores);

        System.out.println("Tiempo total acumulado: "
                + suma + " ms");

        System.out.printf("Promedio: %.2f ms%n", promedio);

        System.out.println("Menor tiempo registrado: "
                + menor + " ms");

        System.out.println("Mediciones inferiores al promedio: "
                + inferiores);

        System.out.println("Primera aparicion del menor tiempo: "
                + "Medicion " + posicionMenor);

    }


    public static void main(String[] args) {

        int cantidad = leerCantidad();

        int[] tiempos = new int[cantidad];

        cargarTiempos(tiempos);

        mostrarResumen(tiempos);

        teclado.close();
    }
}

