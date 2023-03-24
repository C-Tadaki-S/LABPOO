import java.util.Scanner; //importar o scanner

public class ConversorTemperatura {

    public static void main(String[] args) { //o main recebe diretamente os args, que é um String
        int opcao = 0; //inicializa a opção
        Scanner sc = new Scanner(System.in); //instancia um scanner

        if (args.length > 0) {//se tem um argumento 
            opcao = Integer.parseInt(args[0]); //ele vira um valor inteiro
        } else {
            System.out.println("Digite o número da opção desejada:");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("3 - Celsius para Kelvin");
            System.out.println("4 - Kelvin para Celsius");
            System.out.println("5 - Kelvin para Fahrenheit");

            opcao = sc.nextInt(); //salva o próximo inteiro em opcao
        }

        System.out.println("Digite a temperatura a ser convertida:"); //printa e salva o próximo double
        double temperatura = sc.nextDouble();

        switch (opcao) { //abre um switch: cria a nova temp, printa e break
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

            default: //caso não dê, quebra
                System.out.println("Opção inválida!");
                break;
        }

        sc.close(); //fecha o scanner.
    }
}
