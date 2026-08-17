class Caixa {
    double largura;
    double altura;
    double profundidade;

    // sem parâmetros
    Caixa() {
        largura = 0;
        altura = 0;
        profundidade = 0;
    }

    // com três parâmetros
    Caixa(double largura, double altura, double profundidade) {
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    // recebe apenas um valor
    Caixa(double tamanho) {
        largura = tamanho;
        altura = tamanho;
        profundidade = tamanho;
    }

    // Método para calcular o volume
    double calcularVolume() {
        return largura * altura * profundidade;
    }

    // Sobrecarga do método calcularVolume
    double calcularVolume(double largura, double altura, double profundidade) {
        return largura * altura * profundidade;
    }

    // Método para calcular a área
    double calcularArea() {
        return 2 * (
            largura * altura +
            largura * profundidade +
            altura * profundidade
        );
    }

    
    double calcularArea(double largura, double altura, double profundidade) {
        return 2 * (
            largura * altura +
            largura * profundidade +
            altura * profundidade
        );
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