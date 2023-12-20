import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;
        do {
            System.out.print("Ingrese sus tiempos de viaje (0 para detenerse): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                numeros.add(numero);
            }

        } while (numero != 0);
        int sum = numeros.stream().mapToInt(Integer::intValue).sum();
        int horas = sum/60;
        int minutos = sum-horas*60;
        if (minutos<=9){
            System.out.println("Tiempo total de viaje: "+horas+":0"+minutos+ " horas");
        }else {
            System.out.println("Tiempo total de viaje: " + horas + ":" + minutos + " horas");
        }
    }
}
