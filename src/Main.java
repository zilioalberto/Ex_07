public class Main {
    public static void main(String[] args) {

      Retangulo retangulo = new Retangulo(10 , 20);

      System.out.println("Altura do Retangulo: " + retangulo.getAltura());
      System.out.println("Largura do Retangulo: " + retangulo.getLargura());
      System.out.println("Area do Retangulo (L x A): " + retangulo.getArea());
      System.out.println("Perimetro do Retangulo (2 x L1 + 2 X L2): " + retangulo.getPerimetro());

    }
}