import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua altura (em metros): ");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.print("Informe seu peso (em kg): ");
        double peso = Double.parseDouble(scanner.nextLine());

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Interpretação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Interpretação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Interpretação: Sobrepeso");
        } else {
            System.out.println("Interpretação: Obesidade");
        }

        scanner.close();
    }
}
