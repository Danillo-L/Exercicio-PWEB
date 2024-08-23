import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String args[])
    {
           Scanner leitor = new Scanner(System.in);

           Funcionario funcionario = new Funcionario();
           System.out.println("========================");
           System.out.println("Digite o nome do funcionario: ");
           funcionario.nome = leitor.next();


           System.out.println("Digite o sobrenome do funcionário: ");
           funcionario.sobrenome = leitor.next();
           System.out.println("O nome completo do funcionário é: " + funcionario.nomeCompleto());

           System.out.println("Digite a quantidade de horas trabalhadas: ");
           funcionario.horasTrabalhadas = leitor.nextInt();

           System.out.println("Digite o valor à ser pago por hora: ");
           funcionario.valorPorHora = leitor.nextInt();
           System.out.println("O salário é: " + funcionario.calcularSalario());

           System.out.println("Digite o valor a ser incrementado: ");
           funcionario.horaIncrementada = leitor.nextInt();
           funcionario.incrementarHoras();
    }
}

