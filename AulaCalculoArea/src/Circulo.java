/**
 * Created by Step Academy 10 on 02/09/2017.
 */
public class Circulo implements IShape{

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcArea() {
        return Math.PI*Math.pow(raio,2);
    }
    public double calcPerimetro() {return Math.PI*2*raio;}

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
