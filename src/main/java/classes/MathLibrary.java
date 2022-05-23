package classes;

import java.util.List;

public class MathLibrary {


    public static int add(int num1, int num2) {
        return num1 + num2;

    }

    public static int add(List<Integer> nums) {
        int result = 0;

        if (nums != null) {
            for (Integer i : nums) {
                if (i != null) {
                result += i;

                }
            }

        }
        return result;


    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }


}
