package CodePadQuestions;

import java.util.ArrayList;
import java.util.HashMap;

public class BestAverageGrade {
    public static Integer bestAvgGrade(String[][] scores)
    {
        if(scores.length == 0)
            return 0;
        HashMap<String, ArrayList<Integer>> studentsToScores = new HashMap<>();
        for(String[] scoreR : scores){
            if(scoreR.length != 2)
                return 0;
            String student = scoreR[0];
            Integer score = Integer.parseInt(scoreR[1]);
            ArrayList<Integer> currentScores = studentsToScores.get(student);
            if(currentScores == null){
                currentScores = new ArrayList<>();
                currentScores.add(score);
                studentsToScores.put(student, currentScores);
            }else{
                currentScores.add(score);
            }
        }
        // write your code goes here
        return 0;
    }

    public static boolean pass()
    {
        String[][] s1 = { { "Rohan", "84" },
                { "Sachin", "102" },
                { "Ishan", "55" },
                { "Sachin", "18" } };

        return bestAvgGrade(s1) == 84;
    }

    public static void main(String[] args)
    {
        if(pass())
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Some Fail");
        }
    }
}

