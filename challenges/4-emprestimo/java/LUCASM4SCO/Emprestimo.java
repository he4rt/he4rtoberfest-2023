import java.math.BigDecimal;
import java.math.RoundingMode;

public class Emprestimo {
    private BigDecimal valorEmprestimo;
    private int periodoAnual;
    private double taxaJuros;

    public Emprestimo(String valorEmprestimo, int periodoAnual, int taxaJuros){
        this.valorEmprestimo = new BigDecimal(valorEmprestimo);
        this.periodoAnual = periodoAnual;
        this.taxaJuros = (double) taxaJuros / 100;
    }

    public BigDecimal calcularEmprestimo(){
        BigDecimal juros = BigDecimal.ONE.add(BigDecimal.valueOf(taxaJuros)).pow(periodoAnual);
        BigDecimal resultado = valorEmprestimo.multiply(juros);
        return resultado.setScale(2, RoundingMode.HALF_UP);
    }
}
