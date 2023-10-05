public class Emprestimo {
    private double valorEmprestimo;
    private int periodoAnual;
    private double taxaJuros;

    public Emprestimo(double valorEmprestimo, int periodoAnual, int taxaJuros){
        this.valorEmprestimo = valorEmprestimo;
        this.periodoAnual = periodoAnual;
        this.taxaJuros = (double) taxaJuros / 100;

        System.out.println(taxaJuros);
    }

    public double calcularEmprestimo(){
        System.out.println(valorEmprestimo + " - " + periodoAnual + " - " + taxaJuros);
        double resultado = valorEmprestimo * Math.pow((1 + taxaJuros), periodoAnual);
        return resultado;
    }

}
