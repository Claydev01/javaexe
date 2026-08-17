class RetanguloPrincipal {
    public static void main(String args[]) {

        Retangulo obRetangulo = new Retangulo();

        obRetangulo.largura = 5;
        obRetangulo.altura = 4;

        System.out.println("Largura: " + obRetangulo.getLargura());
        System.out.println("Altura: " + obRetangulo.getAltura());
        System.out.println("Diagonal: " + obRetangulo.getDiagonal());
    }
}