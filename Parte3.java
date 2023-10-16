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
        for ( int fila = 0; fila < 5; fila++ ) {
                
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
        for ( int fila = 0; fila < 5; fila++ ) {
                
            // Si value en la fila y columna especifica es igual a name retornar un String
            if ( value[fila][1].equals(name) ) {

                return (name + " se encuentra en las coordenadas: Fila " + fila + ", Columna 1 ");
                
            }

        }

        // Si luego de recorrer esta no retorna true entonces retornar null
        return "null";

    }

    // Realizar una función que reciba como parámetro una fila y retorne el registro completo (datos en la fila) del lenguaje en esa fila. Si la fila está errada (no existe en la matriz lenguajes) entonces, debe retornar una excepción con un mensaje informando el problema.
    public static String[] rowPrint ( Object[][] value, int row ) throws Exception {

        // Si el numero de la fila es invalido entonces lanza una excepcion con un mensaje personalizado
        if ( row <= 0 || row >= 6) {

            throw new Exception("El numero de filas ingresado no es valido");
            
        // De lo contrario
        } else {

            // Array para almacenar valores
            String[] Valores = new String[8];
            
            // Recorre la matriz
            for ( int fila = row; fila < row+1; fila++ ) {

                for ( int columna = 1; columna < 8; columna++ ) {

                    // Transforma un objeto de la matriz a string y lo guarda en la posicion columna de valores
                    Valores[columna] = String.valueOf(value[row][columna]);

                }
                
            }
            
            return Valores;
            
        }

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

        // Almacena el resultado en una variable
        String ansStr = coordLang(lenguajes, valor);

        // Si ans retorna null imprime
        if (ansStr == "null") {

            System.out.println("El lenguaje " + valor + " no esta en la matriz (La funcion retorno NULL)");
        
        // De lo contrario imprime
        } else {

            System.out.println(ansStr);

        }

        System.out.println("Por favor ingrese una fila para imprimir: ");

        // Almacena el input del usuario en la fila y columna especifica de value
        int ansInt = input.nextInt();

        // "intenta" ejecutar el codigo
        try {
            String[] rowString = rowPrint(lenguajes, ansInt);

            // Si lo ejecuta correctamente imprime el array
            System.out.print("Los valores de la fila son [ ");

            for ( int i = 0; i < rowString.length; i++ ) {
                
                System.out.print(rowString[i] + " ");

            }

            System.out.print("]");

        // Si ocurre un error lo "atrapa" y lo imprime en la cosola
        } catch ( Exception e ) {

            System.out.println("Error al ejecutar el codigo: " + e.getMessage());

        }
        






        input.close();

    }

}
