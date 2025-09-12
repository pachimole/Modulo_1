import java.util.Scanner;

public class Calculadora {
    //Crear una clase Calculadora con métodos estáticos que usen funciones de la clase Math.
    //La calculadora además de tener como atributo el n° PI debe permitir:

    private static final Double NUMERO_PI = Math.PI;



    //Elevar un número a una potencia.

    public static Double elevarNumeroAPotencia(Double num1,int potencia){
        Double resultado = Math.atan2(num1,potencia);
        System.out.println(resultado);
        return resultado;
    }

    //Permitir al usuario adivinar un número aleatorio del 1 al 10 teniendo la posibilidad de ingresar tres intentos.

    public static String adivinarNumero(){
    Double numAleatorio = Math.random()*10;
    Double numRedondeado = (double) Math.round(numAleatorio);
    System.out.println(numRedondeado);
    System.out.println("Ingrese un numero:");
//-----------------------------------------------------------------------PRIMER INTENTO
    Scanner scanner= new Scanner(System.in);
    Double numeroIngresado = scanner.nextDouble();
    if (numeroIngresado.equals(numRedondeado)){
        return "Adivinaste, el numero era "+ numRedondeado;
    }else System.out.println("No adivinaste, vuelve a intentarlo:");
//-----------------------------------------------------------------------SEGUNDO INTENTO
    numeroIngresado = scanner.nextDouble();
    if (numeroIngresado.equals(numRedondeado)){
        return "Adivinaste, el numero era "+ numRedondeado;
    }else System.out.println("No adivinaste, vuelve a intentarlo:");
//-----------------------------------------------------------------------TERCER INTENTO
    numeroIngresado = scanner.nextDouble();

    if (numeroIngresado.equals(numRedondeado)){
        return "Adivinaste, el numero era "+ numRedondeado;
    }else return "No adivinaste, el numero era "+ numRedondeado;
    }

    //Obtener el mínimo entre dos números ingresados
    public static Double obtenerNumMaximo(Double num1, Double num2){
        Double resultado = Math.max(num1, num2);
        System.out.println(resultado);
        return resultado;
    }

    //Calcular la circunferencia de un círculo (perímetro) al ingresar el radio. --> 2 * PI * radio.
    public Double calcularAreaCircunferencia(Double radio){
        Double resultado = NUMERO_PI*Math.pow(radio,2);
        System.out.println(NUMERO_PI+Math.pow(radio,2));
        return resultado;
    }
}
