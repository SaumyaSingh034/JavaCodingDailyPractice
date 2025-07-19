package InterviewQuestions;

public class Coforge_CountLetterDigit {
    public static void main(String[] args){
        String str = "Saumya12345";
        countLetterAndDigit(str);

    }

    private static void countLetterAndDigit(String str) {
        int digit=0;
        int letter = 0;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c))
                digit++;
            else if (Character.isAlphabetic(c)) {
                letter++;
            }
        }
        System.out.println("Digit : "+digit+" Letter : "+letter);
    }
}
