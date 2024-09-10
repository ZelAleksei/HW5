import java.util.Scanner;

public class Entering {

    public String enterNameClient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String nameClient = sc.nextLine();
        return nameClient;
    }

    public float enteringSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите необходимую сумму: ");
        float sum = sc.nextFloat();
        return sum;
    }
}
