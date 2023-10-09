import java.util.Arrays;
import java.util.Random;

public class Parte2 {

    // Funcion para buscar valor más grande
    public static void highSell( int[] value ) {
        
        // Crea una variable con el posible valor más bajo
        int high = 0;

        // Recorre el array
        for ( int i = 0; i < value.length; i++ ) {

            // Si valor en posicion i es mayor que high
            if ( value[i] > high ) {

                // Cambiar valor de high por valor en valor en posicion i
                high = value[i];

            }

        }

        System.out.println("La mayor venta fue de " + high);
    }

    // Funcion para buscar valor más bajo
    public static void lowSell( int[] value ) {
        
        // Crea una variable con el posible valor más alto
        int low = 1000;

        // Recorre el array
        for ( int i = 0; i < value.length; i++ ) {

            // Si valor en posicion i es mayor que high
            if ( value[i] < low ) {

                // Cambiar valor de high por valor en valor en posicion i
                low = value[i];

            }

        }

        System.out.println("La menor venta fue de  " + low);
    }

    // Funcion para obtener total de ventas
    public static void totalSell( int[] value ) {

        // Crea una variable para contabilizar el total de ventas
        int total = 0;

        // Recorre el array
        for ( int i = 0; i < value.length; i++ ) {

            // Sumarle a total de venta el valor del array en i
            total += value[i];

        }
        
        System.out.println("El total de ventas fue de " + total);
        
    }

    // Funcion para obtener el promedio
    public static void averagePrice( int[] value ) {
        
        // Crea una variable para contabilizar el total de ventas
        int promedio = 0;

        // Recorre el array
        for ( int i = 0; i < value.length; i++ ) {

            // Sumarle a promedio de venta el valor del array en i
            promedio += value[i];

        }

        // Divide la suma total de los valores entre la longitud
        promedio /= value.length;

        System.out.println("El promedio de las ventas es de " + promedio);
    }

    // Funcion para obtener el valor más cerca del promedio
    public static void closeAverage( int[] value ) {
        
        // Crea una variable para contabilizar el total de ventas
        int promedio = 0;

        // Recorre el array
        for ( int i = 0; i < value.length; i++ ) {

            // Sumarle a promedio de venta el valor del array en i
            promedio += value[i];

        }

        // Divide la suma total de los valores entre la longitud
        promedio /= value.length;

        // Crea un array para contabilizar los valores
        int[] cacheArray = new int[value.length];

        // Crea unas variables para usar más adelante
        int cache = 0;
        int cache2 = 0;
        int inArrPos = 0;

        System.out.println("Calculando el valor más cerca del promedio de las ventas");

        // Recorre el array
        for ( int i = 0; i < value.length; i++ ) {

            // Si el valor es mayor que el promedio aumenta cache hasta que sea igual al valor
            if ( value[i] > promedio ) {

                while ( cache != value[i] ) {

                    cache++;

                } 

            // Si el valor es menor que el promedio reduce cache hasta que sea igual al valor
            } else {

                while ( cache != value[i] ) {

                    cache--;

                } 

            }

            // Almacena el valor de cache en la posición actual del array cacheArray
            cacheArray[inArrPos] = cache;

            // Cambia el valor de inArrPos para el siguiente valor
            inArrPos++;

            System.out.print(".");

        }

        for ( int i = 0; i < cacheArray.length; i++ ) {
            // Si el valor actual de cacheArray es menor que cache2, almacena ese valor en cache
            if (cacheArray[i] < cache2) {
                cache = cacheArray[i];
            }
        }

        // Almacena el valor final de cache en cache2
        cache2 = cache;

        System.out.println("\nEl valor es: " + cache2);
    }

    // Funcion para ordenar de forma descendente
    public static void sortDesc ( int[] value ) {

        // Crea una copia del array original
        int[] ogArr = Arrays.copyOf(value, value.length);
        
        // Recorre el array
        for ( int i = 0; i < value.length; i++ ) {

            // Recorre nuevamente el array
            for ( int j = 0; j < value.length; j++ ) {

                // si value[i] es mayor que value[j] los intercambia
                if ( value[i] > value[j] ) {

                    int temp = value[j];

                    value[j] = value[i];

                    value[i] = temp;
                    
                }
                
            }
            
        }

        System.out.println("==========");

        System.out.print("Se ordeno el array de forma desenciente: ");

        for (int i = 0; i < value.length; i++) {

            System.out.print(value[i] + " ");

        }

        System.out.print("\nEl array original era: ");

        for (int i = 0; i < ogArr.length; i++) {

            System.out.print(ogArr[i] + " ");

        }
        System.out.println("");

    }

    // Funcion para ordenar de forma ascendente
    public static void sortAsc ( int[] value ) {

        // Crea una copia del array original
        int[] ogArr = Arrays.copyOf(value, value.length);
        
        // Recorre el array
        for ( int i = 0; i < value.length; i++ ) {

            // Recorre nuevamente el array
            for ( int j = 0; j < value.length; j++ ) {

                // si value[i] es menor que value[j] los intercambia
                if ( value[i] < value[j] ) {

                    int temp = value[j];

                    value[j] = value[i];

                    value[i] = temp;
                    
                }
                
            }
            
        }

        System.out.println("==========");
        
        System.out.print("Se ordeno el array de forma ascendente: ");

        for (int i = 0; i < value.length; i++) {

            System.out.print(value[i] + " ");

        }

        System.out.print("\nEl array original era: ");

        for (int i = 0; i < ogArr.length; i++) {

            System.out.print(ogArr[i] + " ");

        }
        System.out.println("");

    }

    public static void main(String[] args) {

        // Variables para usar más adelante
        int promedio = 0;
    
        // Crear un random para el genarador de ints random
        Random randomInt = new Random();
        
        // Declarar un arreglo de enteros en una variable llamada ventas,
        // Inicializar el arreglo ventas con una cantidad aleatoria de elementos.
        int[] ventas = new int[ 5 ];
        // int[] ventas = new int[ randomInt.nextInt(50) ];

        // Llenar el arreglo ventas con valores aleatorios entre 1 y 1000
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = randomInt.nextInt(1000) + 1;
        }

        // Imprimir los valores de intArray
        System.out.println("\nVentas realizadas:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Venta n" + (i+1) + ": " + ventas[i] + "\n");
        }
        System.out.println("Total de ventas: " + ventas.length);

        // Recorre el array
        for (int i = 0; i < ventas.length; i++) {
            // Sumarle a promedio de venta el valor del array en i
            promedio += ventas[i];
        }
        // Divide la suma total de los valores entre la longitud
        promedio /= ventas.length;
        System.out.println("El promedio de ventas es " + promedio + "\n");

        System.out.println("==========");

        highSell(ventas);
        lowSell(ventas);
        totalSell(ventas);
        averagePrice(ventas);
        // closeAverage(ventas);
        sortDesc(ventas);
        sortAsc(ventas);

    }

}
