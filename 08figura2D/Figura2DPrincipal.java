import java.util.Scanner;

class Figuras2DPrincipal {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raio = entrada.nextDouble();

        System.out.print("Digite a largura do retangulo: ");
        double largura = entrada.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        double altura = entrada.nextDouble();

        double areaCirculo = Figuras2D.areaCirculo(raio);
        double areaRetangulo = Figuras2D.areaRetangulo(largura, altura);

        System.out.println("Area do circulo: " + areaCirculo);
        System.out.println("Area do retangulo: " + areaRetangulo);

        entrada.close();
    }
}