/* 1- Usando a classe BufferedReader para entrada de dados, 
crie uma classe que receba o valor de um produto e a porcentagem de desconto, 
calcule e mostre o valor do desconto e o valor do produto com o desconto. 
Observação: o valor do desconto é calculado por meio da fórmula: 
valor do desconto = valor do produto * percentual de desconto /100.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DescontoProduto {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Recebe o valor do produto
            System.out.print("Digite o valor do produto: ");
            double valorProduto = Double.parseDouble(reader.readLine());

            // Recebe o percentual de desconto
            System.out.print("Digite o percentual de desconto (%): ");
            double percentualDesconto = Double.parseDouble(reader.readLine());

            // Calcula o valor do desconto
            double valorDesconto = valorProduto * percentualDesconto / 100;

            // Calcula o valor final com desconto
            double valorFinal = valorProduto - valorDesconto;

            // Exibe os resultados
            System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
            System.out.printf("Valor com desconto: R$ %.2f\n", valorFinal);

        } catch (IOException e) {
            System.out.println("Erro ao ler os dados de entrada.");
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Certifique-se de digitar números válidos.");
        }
    }
}
