import java.util.Scanner;

class CilindroPrincipal {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        Cilindro cilindro = new Cilindro();

        System.out.print("Digite o raio do cilindro: ");
        cilindro.raio = entrada.nextDouble();

        System.out.print("Digite a altura do cilindro: ");
        cilindro.altura = entrada.nextDouble();

        System.out.println("Area do cilindro: " + cilindro.calcularArea());
        System.out.println("Volume do cilindro: " + cilindro.calcularVolume());

        entrada.close();
    }
}