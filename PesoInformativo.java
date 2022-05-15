package pesoinformativo;
import java.util.Scanner;

public class PesoInformativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, altura, ideal;
        char sexo;
        System.out.println("Informe o peso: ");
        peso = input.nextDouble();
        System.out.println("Informe a altura: ");
        altura = input.nextDouble();
        System.out.println("Informe o sexo H para homem ou M para mulher: ");
        sexo = input.next().charAt(0);
        if (sexo == 'M'){
            ideal = 72.7 * altura - 58;
            if (ideal > peso){
                System.out.println("O peso ideal está acima do peso real.");
            }
            else if (ideal == peso) {
                System.out.println("O peso ideal está igual ao peso real.");
            }
            else {
                System.out.println("O peso ideal está abaixo do peso real.");
            }
        }
        else {
            ideal = 62.1 * altura - 44.7;
            if (ideal > peso){
                System.out.println("O peso ideal está acima do peso real.");
            }
            else if (ideal == peso) {
                System.out.println("O peso ideal está igual ao peso real.");
            }
            else {
                System.out.println("O peso ideal está abaixo do peso real.");
            }
        }
    }
}
