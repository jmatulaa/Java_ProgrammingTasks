package ArraysCircuitsCalculator;

public class Circle extends Figure implements Printable {

    private double r;
    final static double PI= 3.14;

    Circle(double r)
    {
        this.r=r;
    }

    @Override
    double calculateArea() {
        return PI*r*r;
    }

    @Override
    double calculatePerimeter() {
        return 2*PI*r;
    }

    @Override
    public void print() {
        try
        {
            if(r==0) throw new NotNull("Promień nie może być równy 0");
            if(r<0) throw new NotNull("Promień nie może być mniejszy od 0");
            System.out.println("KOŁO");
            System.out.println("Promień: "+r);
            System.out.println("Średnica: "+2*r);
            System.out.println("Pole: "+calculateArea());
            System.out.println("Obwód: "+calculatePerimeter());
        } catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}

class NotNull extends Exception
{
    NotNull(String messeage)
    {
        super(messeage);
    }
}
