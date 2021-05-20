package ArraysCircuitsCalculator;

import ArraysCircuitsCalculator.Figure;
import ArraysCircuitsCalculator.Printable;
import ArraysCircuitsCalculator.Square;

public class Prism extends Figure implements Printable {

    private double a, H;
    Prism(double a, double H)
    {
        this.a=a;
        this.H=H;

    }
    Square square = new Square(this.a);

    @Override
    double calculateArea() {
        return square.calculateArea()+4*this.a*H;
    }

    @Override
    double calculatePerimeter() {
        return 2*square.calculatePerimeter()+4*H;
    }

    double volume(){
        return square.calculateArea()*H;
    }


    @Override
    public void print() {
        try {

            if (a == 0 || a < 0 || H<0 || H==0) throw new WrongDimensions("Długość boku nie może być mniejsza od zera ani równa zero");
            System.out.println("GRANIASTOSŁUP PRAWIDŁOWY CZWOROKĄTNY");
            System.out.println("Długość boku: "+ a);
            System.out.println("Pole: "+ calculateArea());
            System.out.println("Obwód: "+ calculatePerimeter());
            System.out.println("Objętość: "+ volume());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
