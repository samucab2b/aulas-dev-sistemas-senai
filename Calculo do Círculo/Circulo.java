public class Circulo {

    private Double raio;

    public Circulo(Double raio){
        this.raio = raio;
    }

    public Double calcArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public Double calcPerimetro(){
        return 2 * Math.PI * raio;
    }

}
