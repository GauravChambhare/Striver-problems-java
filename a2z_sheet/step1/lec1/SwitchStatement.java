package a2z.step1.lec1;
import java.util.*;
class SwitchStatement {
    static double switchCase(int choice, List<Double> arr) {
        // code here
        switch (choice) {
            case 1:
                return Math.PI * Math.pow(arr.get(0), 2);
            case 2:
                return arr.get(0) * arr.get(1);
            default:
                return 0;
        }


    }
/*
    public static void main(String[] args) {
        // Example usage
        List<Double> circle = List.of(3.0); // radius
        List<Double> rectangle = List.of(3.0, 4.0); // length and width

        System.out.println("Area of Circle: " + switchCase(1, circle));
        System.out.println("Area of Rectangle: " + switchCase(2, rectangle));
    }

 */

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("SwitchStatement usgae: <choice> <num1> <num2>");
            return;
        }

        int choice = Integer.parseInt(args[0]); // the reason why we have returned parse int is that because
        // in command line all external arguments that we passed are considered of string datatype.
        List<Double> arr = new ArrayList<>();

        for (int i = 1; i< args.length; i++ ){
            arr.add(Double.parseDouble(args[i]));
        }
        try {
            double result = switchCase(choice, arr);
            System.out.println("Result is -- " + result);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}


