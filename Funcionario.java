public class Funcionario {
    public String nome;
    public String sobrenome;
    public int horasTrabalhadas;
    public float valorPorHora;
    public int horaIncrementada;

    public String nomeCompleto()
    {
        return(nome + " " + sobrenome);
    }
    public float calcularSalario()
    {
        float salario = horasTrabalhadas * valorPorHora;
        return salario;
    }
    public void incrementarHoras()
    {
        float horasIncrementadas = valorPorHora + horaIncrementada;
        float resultado = horasIncrementadas * horasTrabalhadas;
        System.out.println("O salario com o valor incrementado é: " + resultado);
    }
}

