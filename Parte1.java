import java.util.Scanner;

class Parte1 {

    public static void main(String[] args) {
        
        // Declarar un arreglo por cada uno de los tipos de datos primitivos (byte, Byte,
        // char, Character, short, Short, int, Integer, long, Long, float, Float, double,
        // Double, Object, String)

        // Declarar un array del tipo byte llamado byteArray con 5 espacios en memoria
        byte[] byteArray = new byte[5];
        byteArray[0] = 5;
        byteArray[1] = 15;
        byteArray[2] = 25;
        byteArray[3] = 35;
        byteArray[4] = 45;

        // Imprimir los valores de byteArray
        System.out.println("\nValores en byteArray:");
        for ( int i = 0; i < byteArray.length ; i++) {
            System.out.print("Valor en posicion " + i + ": " + byteArray[i] + "\n");
        }

        // Declarar un array del tipo char llamado charArray con 5 espacios en memoria
        char[] charArray = new char[5];
        charArray[0] = 'a';
        charArray[1] = 'b';
        charArray[2] = 'c';
        charArray[3] = 'd';
        charArray[4] = 'e';

        // Imprimir los valores de charArray
        System.out.println("\nValores en charArray:");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print("Valor en posicion " + i + ": " + charArray[i] + "\n");
        }

        // Declarar un array del tipo short llamado shortArray con 5 espacios en memoria
        short[] shortArray = new short[5];
        shortArray[0] = 0;
        shortArray[1] = 10;
        shortArray[2] = 20;
        shortArray[3] = 30;
        shortArray[4] = 40;

        // Imprimir los valores de shortArray
        System.out.println("\nValores en shortArray:");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print("Valor en posicion " + i + ": " + shortArray[i] + "\n");
        }

        // Declarar un array del tipo int llamado intArray con 5 espacios en memoria
        int[] intArray = new int[5];
        intArray[0] = 10;
        intArray[1] = 15;
        intArray[2] = 20;
        intArray[3] = 25;
        intArray[4] = 30;

        // Imprimir los valores de intArray
        System.out.println("\nValores en intArray:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Valor en posicion " + i + ": " + intArray[i] + "\n");
        }

        // Declarar un array del tipo long llamado longArray con 5 espacios en memoria
        long[] longArray = new long[5];
        longArray[0] = 5100;
        longArray[1] = 5150;
        longArray[2] = 5200;
        longArray[3] = 5250;
        longArray[4] = 5300;

        // Imprimir los valores de longArray
        System.out.println("\nValores en longArray:");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print("Valor en posicion " + i + ": " + longArray[i] + "\n");
        }

        // Declarar un array del tipo float llamado floatArray con 5 espacios en memoria
        float[] floatArray = new float[5];
        floatArray[0] = 1.0f;
        floatArray[1] = 1.5f;
        floatArray[2] = 2.0f;
        floatArray[3] = 2.5f;
        floatArray[4] = 3.0f;

        // Imprimir los valores de floatArray
        System.out.println("\nValores en floatArray:");
        for (int i = 0; i < floatArray.length; i++) {
            System.out.print("Valor en posicion " + i + ": " + floatArray[i] + "\n");
        }

        // Declarar un array del tipo double llamado doubleArray con 5 espacios en memoria
        double[] doubleArray = new double[5];
        doubleArray[0] = 1.05;
        doubleArray[1] = 1.55;
        doubleArray[2] = 2.05;
        doubleArray[3] = 2.55;
        doubleArray[4] = 3.05;

        // Imprimir los valores de doubleArray
        System.out.println("\nValores en doubleArray:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print("Valor en posicion " + i + ": " + doubleArray[i] + "\n");
        }

        // Declarar un array del tipo Object llamado objectArray con 5 espacios en memoria
        Object[] objectArray = new Object[5];
        objectArray[0] = 1;
        objectArray[1] = 'a';
        objectArray[2] = "b";
        objectArray[3] = 1.5f;
        objectArray[4] = "ac";

        // Imprimir los valores de objectArray
        System.out.println("\nValores en objectArray:");
        for (int i = 0; i < objectArray.length; i++) {
            System.out.print("Valor en posicion " + i + ": " + objectArray[i] + "\n");
        }

        // Declarar un array del tipo String llamado stringArray con 5 espacios en memoria
        String[] stringArray = new String[5];
        stringArray[0] = "Array";
        stringArray[1] = "String";
        stringArray[2] = "Con";
        stringArray[3] = "5";
        stringArray[4] = "valores";

        // Imprimir los valores de stringArray
        System.out.println("\nValores en stringArray:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print("Valor en posicion " + i + ": " + stringArray[i] + "\n");
        }

        // Declarar y definir otro arreglo de tipo String en una variable llamada dataStructs, e inicializarlo con los siguientes datos, usando la sintaxis de llaves.
        String[] dataStructs = { "Listas", "Colas", "Pilas", "Mapas", "Conjuntos" };

        // Declarar y definir otro arreglo de tipo String en una variable llamada características, con 5 elementos.
        String[] caracteristicas = new String[5];

        // Ingresar los siguientes datos por teclado:
        // Simples, Circulares y Enlazadas
        // Primero en entrar, Primero en Salir. Último en entrar, Primero en salir
        // Primero en entrar, Último en salir
        // Parejas de clave y valor
        // Elementos no repetidos
        
        // Crear un scanner para el input de datos
        Scanner input = new Scanner(System.in);

        // Usar un bucle for para leer los inputs y guardarlos en la posicion i del array
        System.out.println("\nIngrese las caracteristicas:");
        for (int i = 0; i < caracteristicas.length ; i++) {
            System.out.print("Ingrese una caracteristica en " + i  + ": ");
            caracteristicas[i] = input.nextLine();
        }

        // Cerrar el input
        input.close();

        // Imprimir los valores de caracteristicas y dataStructs
        System.out.println("\nValores en caracteristicas y dataStructs:");
        for (int i = 0; i < caracteristicas.length ; i++) {
            System.out.print("Valor en posicion " + (i) + "; caracteristicas: " + caracteristicas[i] + ",\tdataStructs: " + dataStructs[i] + " \n");
        }

    }

}
