import java.util.Scanner;

public class Parte3 {

    // Realizar una funcion llamada infoLenguajes que permita llenar la matriz lenguajes  con datos por teclado a partir de la segunda fila
    public static void infoLenguajes ( Object[][] value ) {

        // Se crea un scanner para el input de datos
        Scanner input = new Scanner(System.in);

        // Se crea un array simple para usar mas adelante
        String datos[] = {"NOMBRE", "ANIO", "AUTOR", "DETALLES", "FRAMEWORKS"};

        // Recorre la matriz
        for ( int fila = 0; fila < 5; fila++ ) {

            for ( int columna = 1; columna < 8; columna++ ) {

                System.out.print("Ingrese un " + datos[fila] + " en la fila " + fila + " y columna " + columna + ": ");
                
                // Almacena el input del usuario en la fila y columna especifica de value
                value[fila][columna] = input.nextLine();

            }

        }
        
    }
    
    // Realizar una funcion que reciba como parametro el nombre de un lenguaje y retorna verdadero si este se encuentra dentro de la matriz lenguajes, de lo contrario retorna falso.
    public static boolean findLang ( Object[][] value, String name ) {

        // Recorre la matriz
        for (int fila = 0; fila < 5; fila++) {
                
            // Si value en la fila y columna especifica es igual a name retornar true
            if ( value[fila][1].equals(name) ) {

                return true;
                
            }

        }

        // Si luego de recorrer esta no retorna true entonces retornar false
        return false;

    }

    // Realizar una función que reciba como parámetro el nombre de un lenguaje y retorna las coordenadas (fila, columna) si este se encuentra encuentra dentro de la matriz lenguajes, de lo contrario retorna null.
    public static String coordLang ( Object[][] value, String name ) {

        // Recorre la matriz
        for (int fila = 0; fila < 5; fila++) {
                
            // Si value en la fila y columna especifica es igual a name retornar un String
            if ( value[fila][1].equals(name) ) {

                return (name + " se encuentra en las coordenadas: Fila " + fila + ", Columna 1 ");
                
            }

        }

        // Si luego de recorrer esta no retorna true entonces retornar null
        return "null";

    }

    public static void main(String[] args) {
        
        // Declarar e inicializar una matriz de 5 x 8 de tipo Object en una variable llamada lenguajes
        Object[][] lenguajes = new Object[5][8];






        // Se crea un scanner para el input de datos
        Scanner input = new Scanner(System.in);

        // A la primera linea de la matriz lenguajes se debe asignar los siguientes valores en ese orden: [NOMBRE, ANIO, AUTOR, DETALLES, FRAMEWORKS]
        String datos[] = {"NOMBRE", "ANIO", "AUTOR", "DETALLES", "FRAMEWORKS"};

        // Recorre la primera fila y agrega los valores de datos en la matrix
        for ( int fila = 0; fila < 5; fila++ ) {

            lenguajes[fila][0] = datos[fila];

        }

        // ejecuta la funcion lenguajes
        infoLenguajes(lenguajes);

        System.out.println("Por favor ingrese un lenguaje para buscar, RECUERDE QUE ES SENSIBLE A MAYUSCULAS: ");

        // Almacena el input del usuario en la fila y columna especifica de value
        String valor = input.nextLine();

        // Si al ejecutar la funcion el valor que retorna es verdadero imprime
        if ( findLang(lenguajes, valor) ) {

            System.out.println(valor + " esta en la matriz");
            
        // De lo contrario imprime
        } else {

            System.out.println(valor + " no esta en la matriz");
            
        }

        System.out.println("Por favor ingrese un lenguaje para buscar sus coordenadas, RECUERDE QUE ES SENSIBLE A MAYUSCULAS: ");

        // Almacena el input del usuario en la fila y columna especifica de value
        valor = input.nextLine();

        String ans = coordLang(lenguajes, valor);

        // Si ans retorna null imprime
        if (ans == "null") {

            System.out.println("El lenguaje " + valor + " no esta en la matriz (La funcion retorno NULL)");
        
        // De lo contrario imprime
        } else {

            System.out.println(ans);

        }






        input.close();

    }

}
