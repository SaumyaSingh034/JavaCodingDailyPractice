package CodePadQuestions;

public class AddFraction {

        /**
         * Given two fractions passed in as int arrays,
         * returns the fraction which is result of adding the two input fractions.
         */
        public static int[] addFractions( int[] fraction1, int[] fraction2 ) {
            if(fraction1.length!=2 || fraction2.length!=2){
                throw new IllegalArgumentException("Argument passed should be two-element array");
            }
            int n1 = fraction1[0];
            int d1 = fraction1[1];
            int n2 = fraction2[0];
            int d2 = fraction2[1];
            int resultN = 0;
            int resultD = 1;
            if(d1 == 0 || d2 ==0){
                throw new IllegalArgumentException("Dominator should not be zero");
            }else{
                resultN = (n1 * d2) + (n2 * d1);
                resultD = (d1 * d2);
            }
            if(resultN == 0){
                return(new int[] {0,1});
            }

            int gcd = findGCD(resultN, resultD);
            return ( new int[]{ resultN/gcd, resultD/gcd } );
        }

    private static int findGCD(int a, int b) {
            if(a == 0 || b == 0)
                return 0;
            if(a == b )
                return a;
            if(a > b)
                return findGCD(a-b, b);
            return findGCD(a, b-a);
    }


    public static void main( String[] args ) {
            int[] result = addFractions( new int[]{ 2, 3 }, new int[]{ 1, 2 } );

            if( result[ 0 ] == 7 && result[ 1 ] == 6 ) {
                System.out.println( "Test passed." );
            } else {
                System.out.println( "Test failed." );
                //new commit
            }
        }
    }
