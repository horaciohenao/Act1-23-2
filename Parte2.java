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

        int[] arrayValues = new int[value.length];

        int[] steps = new int[value.length];

        // Recorre el array
        for ( int i = 0; i < value.length; i++ ) {

            // Sumarle a promedio de venta el valor del array en i
            promedio += value[i];

            // Agrega el valor de value en i en i de arrayValues
            arrayValues[i] = value[i];

        }

        // Divide la suma total de los valores entre la longitud
        promedio /= value.length;

        for ( int i = 0; i < arrayValues.length; i++ ) {
            
            while ( arrayValues[i] ) {
                
            }

        }
        

        System.out.println("El promedio de las ventas es de " + promedio);
        
    }

    public static void main(String[] args) {

        // Variables para usar más adelante
        int promedio = 0;
    
        // Crear un random para el genarador de ints random
        Random randomInt = new Random();
        
        // Declarar un arreglo de enteros en una variable llamada ventas,
        // Inicializar el arreglo ventas con una cantidad aleatoria de elementos.
        int[] ventas = new int[ randomInt.nextInt(50) ];

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
        System.out.println("El promedio de ventas es " + promedio);

        highSell(ventas);
        lowSell(ventas);
        totalSell(ventas);
        averagePrice(ventas);

    }

}
