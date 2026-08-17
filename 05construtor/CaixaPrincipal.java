import java.util.Scanner;

class CaixaPrincipal {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a largura da caixa: ");
        double largura = entrada.nextDouble();

        System.out.print("Digite a altura da caixa: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite a profundidade da caixa: ");
        double profundidade = entrada.nextDouble();

        // Criando a caixa usando o construtor
        Caixa caixa = new Caixa(largura, altura, profundidade);

        System.out.println("Largura: " + caixa.getLargura());
        System.out.println("Altura: " + caixa.getAltura());
        System.out.println("Profundidade: " + caixa.getProfundidade());

        System.out.println(
            "Area da caixa: " +
            caixa.calcularArea(largura, altura, profundidade)
        );

        System.out.println(
            "Volume da caixa: " +
            caixa.calcularVolume(largura, altura, profundidade)
        );

        entrada.close();
    }
}