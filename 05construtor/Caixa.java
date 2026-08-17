class Caixa {
    double largura;
    double altura;
    double profundidade;

    // Construtor
    Caixa(double largura, double altura, double profundidade) {
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    // Método com parâmetro
    double calcularArea(double largura, double altura, double profundidade) {
        return 2 * (
            largura * altura +
            largura * profundidade +
            altura * profundidade
        );
    }

    // Método com parâmetro
    double calcularVolume(double largura, double altura, double profundidade) {
        return largura * altura * profundidade;
    }

    double getLargura() {
        return largura;
    }

    double getAltura() {
        return altura;
    }

    double getProfundidade() {
        return profundidade;
    }
}