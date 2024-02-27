package classes;

public class Retangulo {
    
    public double altura;
    public double largura;

    public double area () {
        return this.altura * this.largura;
    }

    public double perimetro () {
        double perimetro = 2 * (this.largura + this.altura);
        return perimetro;
    }

    public double diagonal () {
        double diagonal = (Math.sqrt((Math.pow(perimetro(), 2)) - 8 * area())) / 2;
        return diagonal;
    }

    public String toString () {
        String text = "AREA = " + area() + " PERIMETRO = " + perimetro() + " DIAGONAL = " + diagonal();
        return text;
    }

}
