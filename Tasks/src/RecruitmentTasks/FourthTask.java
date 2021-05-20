package RecruitmentTasks;


import java.util.HashSet;
import java.util.Set;

public class FourthTask  {


    public static int solution(int[] A)
    {
        Set<Integer> set = new HashSet<>();
        for(Integer i: A)
        {
            set.add(i);
        }
        for (int i = 0; i < set.size(); i++) {
            if(!set.contains(i)) return i;
        }


    return 0;
    }


    public static void main(String[] args) {

        int[] A ={0,1,2,3,1,2,6,5,6};
        System.out.println(solution(A));
    }
}
