import java.util.Scanner;

class CaixaPrincipal {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        double largura = entrada.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite a profundidade: ");
        double profundidade = entrada.nextDouble();

        // Usando o construtor com 3 parâmetros
        Caixa caixa = new Caixa(largura, altura, profundidade);

        System.out.println("Largura: " + caixa.getLargura());
        System.out.println("Altura: " + caixa.getAltura());
        System.out.println("Profundidade: " + caixa.getProfundidade());

        System.out.println("Area: " + caixa.calcularArea());
        System.out.println("Volume: " + caixa.calcularVolume());

        // Usando o método sobrecarregado
        System.out.println(
            "Volume usando parametros: " +
            caixa.calcularVolume(largura, altura, profundidade)
        );

        entrada.close();
    }
}