package ArraysCircuitsCalculator;

import ArraysCircuitsCalculator.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int i =0;
        Scanner  scan = new Scanner(System.in);

        System.out.println("1. Kwadrat.");
        System.out.println("2. Trójkąt.");
        System.out.println("3. Koło.");
        System.out.println("4. Graniastosłup Prawidłowy czworokątny.");
        System.out.println("5. Wyjście z programu");



        while(i!=5) {
            System.out.println();
            System.out.println("Podaj numer figury, której pole i obwód chcesz obliczyć:");
            i=scan.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Podaj długość boku: ");
                    Square square = new Square(scan.nextDouble());
                    square.print();
                    break;
                case 2:
                    System.out.println("Podaj długość 3 boków i wysokość: ");
                    Triangle triangle = new Triangle(scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
                    triangle.print();
                    break;
                case 3:
                    System.out.println("Podaj długość promienia: ");
                    Circle circle = new Circle(scan.nextDouble());
                    circle.print();
                    break;
                case 4:
                    System.out.println("Podaj długość boku i wysokość: ");
                    Prism prism = new Prism(scan.nextDouble(), scan.nextDouble());
                    prism.print();
                case 5:
                    break;
                default:
                    System.out.println("Podałeś/aś złą liczbę");
                    break;
            }
        }



    }
}
