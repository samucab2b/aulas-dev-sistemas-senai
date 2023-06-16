public class Triangulo implements FiguraGeometrica {

    private Double base;

    public Triangulo(Double base){
        this.base = base;
    }

    @Override
    public Double getArea() {
        return (Math.pow(base, 2)*Math.sqrt(3))/4;
    }

    @Override
    public Double getPerimetro() {
        return base*3;
    }
    
}
