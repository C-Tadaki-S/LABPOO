import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        if (args.length > 0) {
            opcao = Integer.parseInt(args[0]);
        } else {

            System.out.println("Digite o número da opção desejada:");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("3 - Celsius para Kelvin");
            System.out.println("4 - Kelvin para Celsius");
            System.out.println("5 - Kelvin para Fahrenheit");

            opcao = scan.nextInt();
        }

        System.out.println("Digite a temperatura a ser convertida: ");
        double temperatura = scan.nextDouble();

        switch (opcao) {
            case 1: // C para F
                double fahrenheit = (temperatura * 9 / 5) + 32;
                System.out.println(temperatura + "em Celsius é igual a " + fahrenheit + "em fahrenheit");
                break;
            case 2: // F para C
                double celsius = (temperatura - 32) * 5 / 9;
                System.out.println(temperatura + "em Fahrenheit é igual a " + celsius + "em celsius");
                break;
            case 3: // C para K
                double kelvin = temperatura + 273.0;
                System.out.println(temperatura + "em Celsius é igual a " + kelvin + "em kelvin");
                break;
            case 4: // K para C
                double celsius2 = temperatura - 273.0;
                System.out.println(temperatura + "em Kelvin é igual a " + celsius2 + "em celsius");
                break;
            case 5: // K para F
                double fahrenheit2 = (temperatura - 273.15) * 1.8 + 32;
                System.out.println(temperatura + "em Kelvin é igual a " + fahrenheit2 + "em fahrenheit");
                break;
            default:
                System.out.println("Opção inválida!!!");
                break;
        }
        scan.close();
    }
}
