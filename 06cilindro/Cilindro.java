class Cilindro {
    double raio;
    double altura;

    double calcularArea() {
        return 2 * Math.PI * raio * (raio + altura);
    }

    double calcularVolume() {
        return Math.PI * raio * raio * altura;
    }
}