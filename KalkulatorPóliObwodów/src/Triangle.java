public class Triangle extends Figure implements Printable{

    private double a, b, c, h;
    Triangle(double a, double b, double c, double h)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }


    @Override
    double calculateArea() {
        return (a*h)/2;
    }

    @Override
    double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public void print() {
        try {
            if (a + b < c || a + c < b || b + c < a) throw new WrongDimensions("Suma dwóch dowolnych boków nie może być mniejsza od długości boku 3.");
            if(a == 0 || a<0 || b==0 || b<0 || c==0 || c<0 || h==0 || h<0) throw new WrongDimensions("Długości boków nie mogą być mniejsze od zera, ani równe zero.");
            System.out.println("TRÓJKĄT");
            System.out.println("Długość boków: a="+a+", b="+b+", c="+c);
            System.out.println("Wysokość trójkąta: "+h);
            System.out.println("Pole: "+calculateArea());
            System.out.println("Obwód: "+calculatePerimeter());
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
class WrongDimensions extends Exception
{
    public WrongDimensions(String string)
    {
        super(string);
    }
}
