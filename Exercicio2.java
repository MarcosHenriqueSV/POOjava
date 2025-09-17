/* 2- Usando a classe Scanner para entrada de dados, 
faça uma classe que receba dois valores inteiros. 
O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro de futebol. 
O segundo valor corresponde à quantidade de pontos do time lanterna. 
Considerando que cada vitória vale 3 pontos, elabore uma classe que calcule o número de vitórias necessárias para que o time 
lanterna alcance (ou ultrapasse) o líder. Por exemplo, supondo que as quantidades de ponto fornecidas sejam 40 e 22,
então o número de vitórias apresentada na saída deverá ser 6, pois (40 - 22)/3 = 6;*/

import java.util.Scanner;

public class AtingirLider {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos pontos
        System.out.print("Digite os pontos do líder: ");
        int pontosLider = scanner.nextInt();

        System.out.print("Digite os pontos do lanterna: ");
        int pontosLanterna = scanner.nextInt();

        // Calcula a diferença
        int diferenca = pontosLider - pontosLanterna;

        // Se a lanterna já tiver mais ou os mesmos pontos
        if (diferenca <= 0) {
            System.out.println("O time lanterna já alcançou ou ultrapassou o líder!");
        } else {
            // Cada vitória vale 3 pontos → precisa arredondar pra cima (caso não dê exato)
            int vitoriasNecessarias = (int) Math.ceil(diferenca / 3.0);

            // Saída
            System.out.println("Vitórias necessárias para alcançar ou ultrapassar o líder: " + vitoriasNecessarias);
        }

        scanner.close();
    }
}

