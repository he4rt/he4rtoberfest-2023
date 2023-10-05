public class GrausEmHoras {
    public static void main(String[] args) {
        Integer input = Integer.parseInt(args[0]);

        System.out.println(converterGrausEmHoras(input));
    }

    public static String converterGrausEmHoras(Integer graus) {
        Integer grausEmMinutos = graus * 2;
        Integer horas = grausEmMinutos / 60;
        Integer minutos = grausEmMinutos - (horas * 60);
        
        return String.format("%d:%02d", horas, minutos);
    }
}
