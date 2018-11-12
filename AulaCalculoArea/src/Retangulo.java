/**
 * Created by Step Academy 10 on 02/09/2017.
 */
public class Retangulo implements IShape {

    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public double calcPerimetro(){return (base+altura)*2;};
    public double calcArea(){return base*altura;};

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
