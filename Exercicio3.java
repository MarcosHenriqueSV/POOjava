/*O Imposto sobre a Transmissão de Bens Imóveis (ITBI) é aplicado sobre o valor de um imóvel a ser negociado. 
A base de cálculo do ITBI (o valor a ser considerado no cálculo) será o maior valor entre o valor de transação 
(o valor negociado) e o valor venal de referência (fornecido pela Prefeitura). 
Com base nisso, elabore uma classe que receba o valor da transação, o valor venal e o percentual de imposto. 
Após isso, encontre o maior valor e aplique o percentual sobre ele. Ao final, apresente o valor do imposto a ser pago. 
Observação: o valor do imposto a ser pago é calculado por meio da fórmula: valor do imposto = maior valor * percentual / 100. Para entrada e saída de dados utilize a classe JOptionPane.*/

import javax.swing.JOptionPane;

public class CalculoITBI {

    public static void main(String[] args) {
        try {
            // Entrada de dados via caixas de diálogo
            String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor de transação (R$):");
            String valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal de referência (R$):");
            String percentualStr = JOptionPane.showInputDialog("Digite o percentual de imposto (%):");

            // Conversão para números
            double valorTransacao = Double.parseDouble(valorTransacaoStr);
            double valorVenal = Double.parseDouble(valorVenalStr);
            double percentual = Double.parseDouble(percentualStr);

            // Determina o maior valor
            double baseCalculo = Math.max(valorTransacao, valorVenal);

            // Calcula o imposto
            double valorImposto = baseCalculo * percentual / 100;

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, String.format(
                "Base de cálculo do ITBI: R$ %.2f\nValor do imposto a ser pago: R$ %.2f",
                baseCalculo, valorImposto
            ));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Certifique-se de digitar apenas números válidos.");
        }
    }
}
