import java.util.Scanner;

public class ContadorDeLikes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            while(true) {
                System.out.print("Digite o array para separar: ");
                String input = scanner.nextLine();
                String[] valoreNomes = receberArrayCurtidas(input);
                imprimirCurtidas(valoreNomes);
            }
        } catch (Exception e) {
            System.out.print("Finalizando o programa...");
        }
    }

    public static String[] receberArrayCurtidas(String nomes){
        String limpeza = nomes.replaceAll("[\\[\\]']", "").trim();

        if (limpeza.length() ==  0) 
            return new String[0];

        return limpeza.split(",");
    }

    public static void imprimirCurtidas(String[] curtidas){
        int qtdCurtidas = curtidas.length;

        if (qtdCurtidas == 0) {
            System.out.println("Ninguém curtiu isso");
            return;
        }

        if (qtdCurtidas == 1) {
            System.out.println(String.format("%s curtiu isso", curtidas[0].trim()));
            return;
        }

        if (qtdCurtidas == 2) {
            System.out.println(String.format("%s e %s curtiram isso", curtidas[0].trim(), curtidas[1].trim()));
            return;
        }


        if (qtdCurtidas == 3) {
            System.out.println(String.format("%s, %s e %s curtiram isso", curtidas[0].trim(),  curtidas[1].trim(),  curtidas[2].trim()));
            return;
        }


        System.out.println(String.format("%s, %s e outras %d pessoas curtiram isso", curtidas[0].trim(),  curtidas[1].trim(),  qtdCurtidas - 2));
    }   
}