import java.util.ArrayList;
import java.util.Scanner;

public class Likes {

    public static void main(String[] args) {

        try (var scan = new Scanner(System.in)){

            var likes = new ArrayList<String>();

            while(true) {
                System.out.println("Informe um nome: (Digite 0 para encerrar)");
                var name = scan.nextLine();

                if(name.equals("0")) {
                    break;
                }

                likes.add(name);
            }

                
            System.out.println(showLikes(likes));
                
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    private static String showLikes(ArrayList<String> likes) {

        var likesNumber = likes.size();
        var message = "";

        switch(likesNumber) {
            case 0 -> message += "Ninguém curtiu isso";
            case 1 -> message += String.format("%s curtiu isso", likes.get(0));
            case 2 -> message += String.format("%s e %s curtiram isso", likes.get(0), likes.get(1));
            case 3 -> message += String.format("%s, %s e %s curtiram isso", likes.get(0), likes.get(1), likes.get(2));
            default -> {
                var othersLike = likesNumber - 2;
                message += String.format("%s, %s e outras %d pessoas curtiram isso", likes.get(0),likes.get(1), othersLike);
            }
        }
        return message;
    }
    
}
