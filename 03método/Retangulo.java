class Retangulo {
    double largura;
    double altura;

    double getLargura() {
        return largura;
    }

    double getAltura() {
        return altura;
    }

    double getDiagonal() {
        return Math.sqrt(
            (largura * largura) + (altura * altura)
        );
    }
}