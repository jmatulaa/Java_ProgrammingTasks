package ArraysCircuitsCalculator;

import ArraysCircuitsCalculator.Figure;
import ArraysCircuitsCalculator.Printable;

public class Square extends Figure implements Printable {

    private double a;

    Square(double a)
    {
        this.a=a;
    }


    @Override
    double calculateArea() {
        return a*a;
    }

    @Override
    double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public void print() {
        try
        {

            if (a ==0 || a < 0 ) throw new WrongDimensions("Długość boku nie może być mniejsza od zera ani równa zero");

            System.out.println("KWADRAT");
            System.out.println("Długość boku: "+ a);
            System.out.println("Pole: "+ calculateArea());
            System.out.println("Obwód: "+ calculatePerimeter());
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}

