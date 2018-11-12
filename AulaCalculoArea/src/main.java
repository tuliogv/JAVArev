import com.sun.javafx.image.impl.ByteIndexed;

/**
 * Created by Step Academy 10 on 02/09/2017.
 */
public class main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(10,5);
        Quadrado q2 = new Quadrado(15,8);
        Retangulo r1 = new Retangulo(12,7);
        Retangulo r2 = new Retangulo(8,19);
        Circulo c1 = new Circulo(5);
        Circulo c2 = new Circulo(18);

        Printer mostrarValores = new Printer();

        System.out.print("A área de q1 é ");mostrarValores.MostraArea(q1);
        System.out.print("O perímetro de q1 é ");mostrarValores.MostraPerimetro(q1);
        System.out.println();
        System.out.print("A área de q2 é ");mostrarValores.MostraArea(q2);
        System.out.print("O perímetro de q2 é ");mostrarValores.MostraPerimetro(q2);
        System.out.println();
        System.out.print("A área de r1 é ");mostrarValores.MostraArea(r1);
        System.out.print("O perímetro de r1 é ");mostrarValores.MostraPerimetro(r1);
        System.out.println();
        System.out.print("A área de r2 é ");mostrarValores.MostraArea(r2);
        System.out.print("O perímetro de r2 é ");mostrarValores.MostraPerimetro(r2);
        System.out.println();
        System.out.print("A área de c1 é ");mostrarValores.MostraArea(c1);
        System.out.print("O perímetro de c1 é ");mostrarValores.MostraPerimetro(c1);
        System.out.println();
        System.out.print("A área de q1 é ");mostrarValores.MostraArea(c2);
        System.out.print("O perímetro de c2 é ");mostrarValores.MostraPerimetro(c2);

    }
}
