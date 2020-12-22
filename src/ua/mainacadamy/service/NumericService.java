package ua.mainacadamy.service;

public class NumericService {

    // 12345
    public static int getSumByTypes(int number) {
        int result = 0;
        String numAsText = String.valueOf(number); // "12345"
        char[] symbols = numAsText.toCharArray();  // id - value
//        for (int i = 0; i < symbols.length; i++) {
////            result = result + Character.getNumericValue(symbols[i]);
//            result += Character.getNumericValue(symbols[i]);
//        }
        for (char symbol : symbols) {
            result += Character.getNumericValue(symbol);
        }
        return result;
    }

    // 12345
    public static int getSumByMath(int number) {
        int result = 0;
        while (number != 0 ) {
            result += number % 10; // 5, 4, 3, ... 1
            number = number/10; // 1234, 123, 12, ... 0
        }
        return result;
    }
}
