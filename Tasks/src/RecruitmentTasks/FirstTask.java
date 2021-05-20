package RecruitmentTasks;

//how to sum numbers from 1 to n

public class FirstTask {

    public static int sum(int n)
    {
        //it can go beyond the scope of the integer
        int result = 0;
        for (int j = 1; j <= n; j++) {
            result+=j;
        }

        return result;
    }

    public static int sumBetter(int n)
    {
        if(n%2==0)
        {
            return (n/2)*(n+1);
        }
        return ((n+1)/2)*n;
    }


    public static void main(String[] args) {

        System.out.println(sumBetter(6));

    }
}
