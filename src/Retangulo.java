public class Retangulo {
    private double largura;
    private double altura;

    private double area ;

    private double perimetro ;


    //Metodos Getter

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }


    // Construtor


    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }


    // metodo para calculo da area
       public double getArea() {
        return largura*altura;
   }

   //metodo para calculo do perimetro
   public double getPerimetro() {
       return 2*largura+2*altura;
   }

}


