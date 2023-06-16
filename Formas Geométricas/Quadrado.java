public class Quadrado implements FiguraGeometrica{

    private Double lado;

    public Quadrado(Double lado){
        this.lado = lado;
    }

    @Override
    public Double getArea() {
       return Math.pow(this.lado, 2);
    }

    @Override
    public Double getPerimetro() {
       return this.lado*4;
    }
    
}
