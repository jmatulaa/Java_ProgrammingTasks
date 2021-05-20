package RecruitmentTasks;

//Changing numbers

import java.util.Scanner;

public class SecondTask {

    int a;
    int b;

    public SecondTask(int a, int b)
    {
        this.a=a;
        this.b=b;
    }


    public void swap(int first, int second)
    {
        int tmp = first;
        this.a=second;
        this.b=first;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int first = scanner.nextInt();
        System.out.println("Second number: ");
        int second = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println(first+"  and  "+second);
        int tmp = first;
        first=second;
        second=tmp;
        System.out.println("After swapping:");
        System.out.println(first+"  and  "+second);


        SecondTask secondTask = new SecondTask(4,5);

        System.out.println("Before swapping:");
        System.out.println(secondTask.a+"  and  "+secondTask.b);
        secondTask.swap(secondTask.a,secondTask.b);
        System.out.println("After swapping:");
        System.out.println(secondTask.a+" and "+ secondTask.b);

    }
}
