import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        // Passo 1: Criar um objeto Scanner para ler a entrada do usuário.
        Scanner entrada = new Scanner(System.in);

        // Passo 2: Pedir ao usuário para digitar o peso.
        System.out.print("Digite seu peso em kg (ex: 75.5): ");
        double peso = entrada.nextDouble();

        // Passo 3: Pedir ao usuário para digitar a altura.
        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = entrada.nextDouble();

        // Passo 4: Calcular o IMC.
        // A fórmula é Peso / (Altura * Altura)
        double imc = peso / (altura * altura);

        // Passo 5: Exibir o resultado formatado.
        System.out.printf("Seu IMC é: %.2f%n", imc);

        // Passo 6: Fechar o objeto Scanner.
        entrada.close();
    }
}