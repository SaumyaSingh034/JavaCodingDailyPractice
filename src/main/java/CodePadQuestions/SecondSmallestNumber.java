package CodePadQuestions;

public class SecondSmallestNumber {
        public static int secondSmallest(int[] x) {
            // Your code
            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;
            if (x.length == 1) {
                return x[0];
            } else {
                for (int i : x) {
                    if (smallest > i) {
                        secondSmallest = smallest;
                        smallest = i;
                    } else if (secondSmallest > i && i != smallest) {
                        secondSmallest = i;
                    }
                }

                return secondSmallest;
            }
        }

        public static void main(String args[]) {

            int[] a = { 0 };
            int[] b = { 0, 1 };

            boolean result = true;
            result &= secondSmallest(a) == 0;
            result &= secondSmallest(b) == 1;

            if (result) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }

        }

}
