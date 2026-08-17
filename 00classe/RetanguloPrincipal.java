class RetanguloPrincipal {
  public static void main(String args[ ]){
  Retangulo obRetangulo; //declaração de um objeto
  double area;

  obRetangulo = new Retangulo(); //criação do objeto
//iniciando os atributos
  obRetangulo.largura = 5;
  obRetangulo.altura = 4;
//calcula a área do Retângulo
  area = obRetangulo.largura * obRetangulo.altura;
  System.out.println("Area do Retangulo: " + area);
  } //fim do método principal
}//fim da classe