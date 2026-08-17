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

        System.out.println("Largura: " + caixa.getLargura());
        System.out.println("Altura: " + caixa.getAltura());
        System.out.println("Profundidade: " + caixa.getProfundidade());

        System.out.println("Area da caixa: " + caixa.getArea());
        System.out.println("Volume da caixa: " + caixa.getVolume());

        entrada.close();
    }
}