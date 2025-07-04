package CodePadQuestions;

public class SmallestNumber {
        /*
         * public static int FindMin(int a[])
         * Returns the smallest number in array that has been rotated
         * For example - Array {3,4,5,6,1,2} returns 1
         */

        public static int FindMin(int a[])
        {
            if (a == null)
                throw new IllegalArgumentException("Invalid input");
            int smallestNumber = Integer.MAX_VALUE;
            for(int i : a){
                if(smallestNumber > i){
                    smallestNumber = i;
                }
            }
            return smallestNumber;
        }

        public static void main(String args[])
        {
            boolean result = true;
            result = result && FindMin(new int[]{3,4,5,6,1,2}) == 1;
            result = result && FindMin(new int[]{2,1}) == 1;
            result = result && FindMin(new int[]{1}) == 1;

            try {
                FindMin(null);
                result = false;
            }
            catch(Exception e)
            {
                result = result && true;
            }

            if(result)
            {
                System.out.println("All tests pass");
            }
            else
            {
                System.out.println("There are test failures");
            }
        }
    }

