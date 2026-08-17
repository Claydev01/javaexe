class Caixa {
    double largura;
    double altura;
    double profundidade;

    double getLargura() {
        return largura;
    }

    double getAltura() {
        return altura;
    }

    double getProfundidade() {
        return profundidade;
    }

    double getArea() {
        return 2 * (
            largura * altura +
            largura * profundidade +
            altura * profundidade
        );
    }

    double getVolume() {
        return largura * altura * profundidade;
    }
}