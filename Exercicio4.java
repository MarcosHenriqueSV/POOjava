/*Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba a nota de duas provas e de um trabalho. 
Calcule e mostre a média e o resultado final (aprovado ou reprovado). Para calcular a média utilize a fórmula seguinte: 
média = (nota da prova 1 + nota da prova 2 + nota do trabalho)/3. Considere que a média mínima para aprovação é 6.*/

import javax.swing.JOptionPane;

public class MediaAluno {

    public static void main(String[] args) {
        try {
            // Entradas das notas
            String prova1Str = JOptionPane.showInputDialog("Digite a nota da Prova 1:");
            String prova2Str = JOptionPane.showInputDialog("Digite a nota da Prova 2:");
            String trabalhoStr = JOptionPane.showInputDialog("Digite a nota do Trabalho:");

            // Conversão das notas para double
            double prova1 = Double.parseDouble(prova1Str);
            double prova2 = Double.parseDouble(prova2Str);
            double trabalho = Double.parseDouble(trabalhoStr);

            // Cálculo da média
            double media = (prova1 + prova2 + trabalho) / 3;

            // Determinação do resultado final
            String resultado = (media >= 6) ? "Aprovado" : "Reprovado";

            // Exibição da média e resultado final
            JOptionPane.showMessageDialog(null, String.format(
                "Média final: %.2f\nResultado: %s",
                media, resultado
            ));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite apenas números válidos para as notas.");
        }
    }
}
