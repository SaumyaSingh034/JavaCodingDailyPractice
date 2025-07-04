package CodePadQuestions;

public class Power {

        /* Given base and integer exponent, compute value of base raised to the power of exponent.
         */
        public static double power(double base, int exp) {
            //Your code goes here
            double product = 1;
            while(exp>0){
                product = base * base;
                exp--;
            }
            return product;
        }

        public static boolean doTestPass() {
            boolean testsPass = true;
            double result = power(2,2);
            return testsPass && result==4;
        }

        public static void main( String[] args ) {
            if(doTestPass()){
                System.out.println("Pass");
            }
            else{
                System.out.println("There are failures");
            }
        }

}
