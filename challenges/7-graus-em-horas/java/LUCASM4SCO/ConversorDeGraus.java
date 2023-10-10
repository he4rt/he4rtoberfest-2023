import javax.swing.JOptionPane;

public class ConversorDeGraus {
    public static double qtdMinutosPorGrau = (12 * 60) / 360 ;

    public static void main(String[] args) {
        try {
            iniciarConversor();
        } catch (Exception e) {
            System.out.println("Finalizando execução do programa..." + e);
        }
    }

    public static void iniciarConversor() {
        while(true) {
            String inputUsuario = JOptionPane.showInputDialog("Digite a quantidade de graus para converter em horas:");
            int graus = Integer.parseInt(inputUsuario.trim());
            String valorEmHoras = converterParaHoras(graus);
            JOptionPane.showMessageDialog(null, valorEmHoras);
        }
    }

    public static String converterParaHoras(int graus){
        double minutosTotais = graus * qtdMinutosPorGrau;

        int horas = (int) (minutosTotais / 60);
        int minutos = (int) (minutosTotais % 60);

        if (minutos < 10)
            return horas + ":0" + minutos;

        return horas +  ":" + minutos;
    }
}