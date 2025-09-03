public class MostrarVersaoJava {

    public static void main(String[] args) {
        
        // Passo 1: Obter a propriedade do sistema "java.version"
        String versaoJava = System.getProperty("java.version");
        
        // Passo 2: Exibir a versão na tela
        System.out.println("A versão do Java que está executando este programa é: " + versaoJava);
    }
}