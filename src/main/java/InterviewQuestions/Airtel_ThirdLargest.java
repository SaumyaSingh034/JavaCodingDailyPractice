package InterviewQuestions;

import java.util.Arrays;

public class Airtel_ThirdLargest {
    public static void main(String[] args){
        int[] arr = {1,2,5,6,3,4};
        int[] arr1 =  {1,0,1,0,-1};
        int[] arr2 =  {-1,-2,-3,-4,-5,-6,0};
      //  findThirdMax(arr);
        findThirdMax(arr1);
        findThirdMaxUsingSorting(arr);
    }

    private static void findThirdMaxUsingSorting(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int last = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--)
        {
            if(arr[i]!=last){
                count++;
                last = arr[i];
            }
            if(count == 3){
                System.out.println(arr[i]);
            }
        }
    }

    private static void findThirdMax(int[] arr1) {
        int largest = Integer.MIN_VALUE;
        int secondL = Integer.MIN_VALUE;
        int thirdL = Integer.MIN_VALUE;

        for(int i : arr1){
            if(largest < i){
                thirdL = secondL;
                secondL = largest;
                largest = i;
            } else if (secondL < i && i!=largest) {
                thirdL = secondL;
                secondL = i;

            } else if (thirdL < i && i!=secondL && i!=largest) {
                thirdL = i;
            }
        }
        System.out.println("Largest : "+largest);
        System.out.println("Second Largest : "+secondL);
        System.out.println("Third Largest : "+thirdL);
    }
}
