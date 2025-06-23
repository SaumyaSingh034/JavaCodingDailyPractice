package InterviewQuestions;

public class FetchNumberAndSum {
    public static void main(String[] args){
        String input = "saumya23456&*^yu2";
        fetchNumberAndSum(input);
    }

    private static void fetchNumberAndSum(String input) {
        int digit;
        int sum = 0;
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
    }
}
