package RecruitmentTasks;


import java.util.Locale;

public class ThirdTask {
    public static void main(String[] args) {
        String name1= "Julia";
        String name2= "Oliwia";

        /*
            == comparison of the memory location
            equals() value comparison
        */

        System.out.println(name1=="Julia"); //true
        System.out.println(name1.equals("Julia")); //true
        System.out.println(name1.equals(name2)); //false
        System.out.println("Here: "+name2.equals("Oliwia"));


        String name = new String("Julia");
        System.out.println(name1==name);  //false
        System.out.println(name1.equals(name)); //true


        //Demonstration of immutable
        System.out.println(name2.toUpperCase());
        System.out.println(name2);

        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Michał");
        //stringBuilder.reverse();
        stringBuilder.insert(2," LALA ");
        stringBuilder.deleteCharAt(2);
        System.out.println(stringBuilder);

    }
}
