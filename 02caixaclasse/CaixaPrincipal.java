import java.util.Scanner;

class CaixaPrincipal {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        Caixa caixa = new Caixa();

        System.out.print("Digite a largura da caixa: ");
        caixa.largura = entrada.nextDouble();

        System.out.print("Digite a altura da caixa: ");
        caixa.altura = entrada.nextDouble();

        System.out.print("Digite a profundidade da caixa: ");
        caixa.profundidade = entrada.nextDouble();

        double area = 2 * (
            caixa.largura * caixa.altura +
            caixa.largura * caixa.profundidade +
            caixa.altura * caixa.profundidade
        );

        double volume = caixa.largura * caixa.altura * caixa.profundidade;

        System.out.println("Area da caixa: " + area);
        System.out.println("Volume da caixa: " + volume);

        entrada.close();
    }
}