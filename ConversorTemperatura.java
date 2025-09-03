import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        // Passo 1: Criar um objeto Scanner para ler a entrada do usuário.
        Scanner entrada = new Scanner(System.in);

        // Passo 2: Pedir ao usuário para digitar a temperatura em Celsius.
        System.out.print("Digite a temperatura em Graus Celsius: ");
        double celsius = entrada.nextDouble();

        // Passo 3: Calcular a temperatura em Fahrenheit.
        // A fórmula é F = C * (9/5) + 32
        // Note que usamos 9.0/5.0 para garantir uma divisão de ponto flutuante.
        double fahrenheit = celsius * (9.0 / 5.0) + 32;

        // Passo 4: Exibir o resultado formatado.
        // Usamos %.2f para formatar o número com duas casas decimais.
        System.out.printf("A temperatura de %.2f °C equivale a %.2f °F.%n", celsius, fahrenheit);

        // Passo 5: Fechar o objeto Scanner para liberar recursos.
        entrada.close();
    }
}