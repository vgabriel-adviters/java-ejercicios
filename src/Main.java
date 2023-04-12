import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ej10();
    }

    // Hola Mundo: Escribe un programa que imprima "Hola Mundo" en la consola.
    public static void ej1() {
        System.out.println("Hello world!");
    }


    // Calculadora: Crea un programa que solicite dos números al usuario y realice las operaciones básicas de suma, resta, multiplicación y división.
    public static void ej2() {
        System.out.print("Ingrese un número");
        Integer operador1 = input.nextInt();
        System.out.print("Ingrese otro número");
        Integer operador2 = input.nextInt();
        System.out.println(operador1 + " + " + operador2 + " = " + (operador1 + operador2));
        System.out.println(operador1 + " - " + operador2 + " = " + (operador1 - operador2));
        System.out.println(operador1 + " * " + operador2 + " = " + (operador1 * operador2));
        System.out.println(operador1 + " / " + operador2 + " = " +  ((float)operador1 / (float)operador2));
    }


    // Números pares e impares: Escribe un programa que imprima los números pares e impares del 1 al 10.
    public static void ej3() {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        for (int numero = 1; numero <= 10; numero++) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else  {
                impares.add(numero);
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }


    // Factorial: Crea un programa que calcule el factorial de un número entero ingresado por el usuario.
    public static Integer factorial(Integer numero) {
        if (numero == 1 || numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
    public static void ej4() {
        System.out.print("Ingrese un numero entero: ");
        int numero = input.nextInt();
        System.out.println("El factorial de " + numero + " es " + factorial(numero));
    }


    // Área de un círculo: Escribe un programa que calcule el área de un círculo a partir de su radio ingresado por el usuario.
    public static Double areaDeCirculo(Double radio) {
        return Math.PI * Math.pow(radio, radio);
    }
    public static void ej5() {
        System.out.print("Ingrese el radio de un circulo: ");
        Double numero = input.nextDouble();
        System.out.println("El area del circulo es " + areaDeCirculo(numero));
    }


    // Conversión de temperaturas: Crea un programa que convierta una temperatura en grados Celsius a grados Fahrenheit y viceversa, ingresada por el usuario.
    public static Double celsiusAFahrenheit(Double celsius) {
        return (celsius * 1.8) + 32;
    }
    public static Double fahrenheitACelsius(Double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
    public static void ej6() {
        System.out.println("1. Celsius a Fahrenheit.");
        System.out.println("2. Fahrenheit a Celsius.");
        System.out.print("Seleccione la conversion el numero de operación: ");
        Integer operacion = input.nextInt();
        System.out.print("Ingrese la temperatura a convertir: ");
        Double numero = input.nextDouble();
        switch (operacion) {
            case 1:
                System.out.println(numero + "°C son " + celsiusAFahrenheit(numero) + "F");
                break;
            case 2:
                System.out.println(numero + "F son " + fahrenheitACelsius(numero) + "°C");
                break;
        }
    }


    // Cálculo de promedio: Escribe un programa que solicite al usuario un conjunto de números enteros y calcule su promedio.
    public static void ej7() {
        boolean terminar = false;
        List<Integer> valores = new ArrayList<>();
        do {
            System.out.print("Ingrese un numero o 0 para terminar: ");
            int numero = input.nextInt();
            terminar = numero == 0;
            if (!terminar) {
                valores.add(numero);
            }
        } while (!terminar);
        int resultado = 0;
        for (int valor : valores) {
            resultado += valor;
        }
        System.out.println("El promedio es: " +  (double)resultado / (double)valores.size());
    }


    // Suma de matrices: Crea un programa que sume dos matrices de enteros de tamaño fijo y muestre el resultado en la consola.
    public static List sumarMatrices(List vector1, List vector2) {
        List<Integer> resultado = new ArrayList<>();
        int cantidadDeElementos = vector1.size();
        for (int elemento = 1; elemento <= cantidadDeElementos; elemento++) {
            int valor1 = (int)vector1.get(elemento - 1);
            int valor2 = (int)vector2.get(elemento - 1);
            resultado.add(valor1 + valor2);
        }
        return resultado;
    }
    public static void ej8() {
        List<Integer> m1 = new ArrayList<>();
        List<Integer> m2 = new ArrayList<>();

        System.out.print("Ingrese el tamaño de los los vectores: ");
        int longitudDeVector = input.nextInt();
        for (int ingreso = 0; ingreso < longitudDeVector; ingreso++) {
            System.out.print("Ingrese un numero para el vector 1 (Queda " + (longitudDeVector - ingreso) + "): ");
            int valor = input.nextInt();
            m1.add(valor);
        }

        for (int ingreso = 0; ingreso < longitudDeVector; ingreso++) {
            System.out.print("Ingrese un numero para el vector 2 (Queda " + (longitudDeVector - ingreso) + "): ");
            int valor = input.nextInt();
            m2.add(valor);
        }

        System.out.println(sumarMatrices(m1, m2));
    }


    // Contador de caracteres: Escribe un programa que cuente la cantidad de caracteres en una cadena de texto ingresada por el usuario, excluyendo los espacios en blanco.
    public static void ej9() {
        System.out.print("Ingrese una frase: ");
        String frase = input.nextLine();
        int cantidadDeCaracteres = 0;
        for (int i = 1; i <= frase.length(); i++) {
            if (Character.isSpaceChar(frase.charAt(i-1))) {
                continue;
            }
            cantidadDeCaracteres++;
        }
        System.out.println("Cantidad de caracteres sin espacio: " + cantidadDeCaracteres);
    }


    // Palíndromo: Crea un programa que verifique si una palabra ingresada por el usuario es un palíndromo, es decir, si se lee igual de izquierda a derecha que de derecha a izquierda.
    public static void ej10() {
        System.out.print("Ingrese una frase: ");
        String palabra = input.nextLine().toLowerCase();
        String reverse = new StringBuilder(palabra).reverse().toString().toLowerCase();
        if (palabra.equals(reverse)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("NO es palindromo");
        }

    }
}