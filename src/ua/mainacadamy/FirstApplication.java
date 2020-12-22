package ua.mainacadamy;

import ua.mainacadamy.service.NumericService;

public class FirstApplication {

    public static void main(String[] args) {
//
//        if (args.length < 1) {
//            System.out.println("There is no args!");
//            return;
//        }

        // check in future
//        int number = Integer.valueOf(args[0]);
        int number = 12345;

        int result1 = NumericService.getSumByTypes(number);
        int result2 = NumericService.getSumByMath(number); // %

        System.out.println("Number is " + number);
        System.out.println("Result #1 is " + result1);
        System.out.println("Result #2 is " + result2);
    }

}
