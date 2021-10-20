import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("From what currency would you like to Convert?");
        String curToConvert = scanner.nextLine();

        System.out.println("To what currency would you like to Convert?");
        String curToConvertTo = scanner.nextLine();

        System.out.println("Amount to convert");
        Double amountToConvert = scanner.nextDouble();

        CurrencyConverter currencyConverter = new CurrencyConverter();
        Double convertedCurrency = currencyConverter.convertCurrency(curToConvert,curToConvertTo,amountToConvert);
        System.out.printf("%.2f in %s is %.2f in %s",amountToConvert,curToConvert,convertedCurrency,curToConvertTo);

    }
}
