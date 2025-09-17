/*Considere a seguinte informação a respeito do cálculo da aposentadoria.
Para se aposentar por idade, as mulheres precisam ter atingido 60 anos de idade e os homens 65. 
Já na aposentadoria por tempo de contribuição, o tempo mínimo exigido é de 30 anos para as mulheres e de 35 anos para os homens. 
Com base nessas informações , elabore uma classe que receba a idade de uma pessoa, seu sexo e a quantidade de anos de contribuição. 
A seguir calcule a quantidade de anos que falta de contribuição para se aposentar, ou então emita a mensagem: "Você já tem o direito a aposentadoria".

import javax.swing.JOptionPane;

public class Aposentadoria {

    public static void main(String[] args) {
        try {
            // Entradas
            String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
            String sexo = JOptionPane.showInputDialog("Digite seu sexo (M para masculino, F para feminino):");
            String contribuicaoStr = JOptionPane.showInputDialog("Digite seu tempo de contribuição (em anos):");

            // Conversão
            int idade = Integer.parseInt(idadeStr);
            int contribuicao = Integer.parseInt(contribuicaoStr);
            sexo = sexo.trim().toUpperCase();

            boolean podeAposentar = false;
            int tempoMinimo = 0;

            if (sexo.equals("F")) {
                // Mulher
                if (idade >= 60 || contribuicao >= 30) {
                    podeAposentar = true;
                } else {
                    tempoMinimo = 30 - contribuicao;
                }
            } else if (sexo.equals("M")) {
                // Homem
                if (idade >= 65 || contribuicao >= 35) {
                    podeAposentar = true;
                } else {
                    tempoMinimo = 35 - contribuicao;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido! Use 'M' ou 'F'.");
                return;
            }

            // Exibe o resultado
            if (podeAposentar) {
                JOptionPane.showMessageDialog(null, "Você já tem o direito à aposentadoria.");
            } else {
                JOptionPane.showMessageDialog(null, 
                    "Faltam " + tempoMinimo + " ano(s) de contribuição para se aposentar.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite apenas números válidos para idade e contribuição.");
        }
    }
}
