import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yo, what team is your favorite?");
        String teamInput = sc.nextLine();
        Cities teamCity;

        switch (teamInput.substring(0, 3).toLowerCase()) {
            case "chi":
                teamCity = Cities.CHICAGO;
                break;
            case "det":
                teamCity = Cities.DETROIT;
                break;
            case "gre":
                teamCity = Cities.GREEN;
                break;
            case "minn":
                teamCity = Cities.MINN;
                break;
            default:
                teamCity = Cities.GREEN;
        }
        System.out.println(Namer.getName(teamCity));
    }
}
