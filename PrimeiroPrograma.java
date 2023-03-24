import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        if (args.length > 0) {
            opcao = Integer.parseInt(args[0]);
        } else {
            System.out.println("Digite o número da opção desejada:");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("3 - Celsius para Kelvin");
            System.out.println("4 - Kelvin para Celsius");
            System.out.println("5 - Kelvin para Fahrenheit");

            opcao = sc.nextInt();
        }

        System.out.println("Digite a temperatura a ser convertida:");
        double temperatura = sc.nextDouble();

        switch (opcao) {
            case 1:
                double fahrenheit = (temperatura * 1.8) + 32;
                System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
                break;

            case 2:
                double celsius = (temperatura - 32) / 1.8;
                System.out.println("A temperatura em Celsius é: " + celsius);
                break;

            case 3:
                double kelvin = temperatura + 273.15;
                System.out.println("A temperatura em Kelvin é: " + kelvin);
                break;

            case 4:
                double celsius2 = temperatura - 273.15;
                System.out.println("A temperatura em Celsius é: " + celsius2);
                break;

            case 5:
                double fahrenheit2 = (temperatura - 273.15) * 1.8 + 32;
                System.out.println("A temperatura em Fahrenheit é: " + fahrenheit2);
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.close();
    }
}
