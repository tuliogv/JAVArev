/**
 * Created by Step Academy 10 on 02/09/2017.
 */
public class Printer{


    public void MostraArea(IShape iShape){
        System.out.println(iShape.calcArea());
    };

    public void MostraPerimetro(IShape iShape){
        System.out.println(iShape.calcPerimetro());
    };

}
