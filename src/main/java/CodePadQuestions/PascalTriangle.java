package CodePadQuestions;

import java.util.HashMap;
import java.util.Map;

public class PascalTriangle {
    /*
     **  Below formation is called Pascals Triangle.
     **
     **  Example:
     **               1
     **              1 1
     **             1 2 1
     **            1 3 3 1
     **           1 4 6 4 1
     **         1 5 10 10 5 1
     **        1 6 15 20 15 6 1
     **
     **  Complete the 'pascal' function below so that given a
     **  col and a row it will return the value in that positon.
     **
     **  Example, pascal(1,2) should return 2
     **
     */

    /*
     *					******** IMPORTANT ********
     *
     * THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
     * USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
     *
     */
    public static Map<Integer, Map<Integer, Integer>> pascalHash = new HashMap<>();


    public static  int pascal(int col, int row){
        if(col == 0 || col == row) {
            return 1;
        }
        int pascalValue = 0;
        if(pascalHash.containsKey(col)){
            if(pascalHash.get(col).containsKey(row)){
                return pascalHash.get(col).get(row);
            }
            else{
                pascalValue = pascal(col, row - 1) + pascal(col - 1, row - 1);
                pascalHash.get(col).put(row,pascalValue);
            }
        }
        else{
            pascalValue = pascal(col, row - 1) + pascal(col - 1, row - 1);
            Map<Integer, Integer> rowHashMap = new HashMap();
            rowHashMap.put(row,pascalValue);
            pascalHash.put(col,rowHashMap);
        }
        return pascalValue;
    }

        public static void main(String[] args) {
            if(pascal(0,0) ==  1 &&
                    pascal(1,2) ==  2 &&
                    pascal(5,6) ==  6 &&
                    pascal(4,8) ==  70 &&
                    pascal(6,6) ==  1) {
                System.out.println("Pass");
            }else {
                System.out.println("Failed");
            }
        }
    }


