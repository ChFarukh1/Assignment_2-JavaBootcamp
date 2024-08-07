import java.util.Scanner;

public class ConvertToRomanNumerals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Roman Numeral representation: " + intToRoman(number));
    }

    public static String intToRoman(int num) {
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder roman = new StringBuilder();
        int i = 0;

        while (num > 0) {
            while (num >= romanValues[i]) {
                roman.append(romanSymbols[i]);
                num -= romanValues[i];
            }
            i++;
        }
        return roman.toString();
    }
}
