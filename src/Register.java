import java.util.Scanner;
public class Register {
    static String login()
    {
        System.out.println("podaj nazwe użytkownika");
        Scanner myObj = new Scanner(System.in);
        return myObj.nextLine();
    }
    static String passwd()
    {
        System.out.println("podaj haslo");
        Scanner myObj = new Scanner(System.in);
        return myObj.nextLine();
    }
}
