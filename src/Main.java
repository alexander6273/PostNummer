import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("enter a zip code to finde the corresponding city name: ");

        PostNummerListe psl = new PostNummerListe();
        ArrayList<Postinfo> postNummerList = psl.getPostnummerListe();


        Scanner sc = new Scanner(System.in);
        int postNummerInput = sc.nextInt();

        for (int i = 0; i < postNummerList.size(); i++)
        {
            if (postNummerList.get(i).getPostNummer() == postNummerInput){
                System.out.println(postNummerList.get(i).toString());
                System.out.println(postNummerList.get(i).toString());
            }
        }
    }
}
