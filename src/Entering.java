import java.util.InputMismatchException;
import java.util.Scanner;

public class Entering {

    /**
     * Функция ввода имени
     *
     * @return возвращает введёное пользователем имя
     */
    public String enterNameClient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String nameClient = sc.nextLine();
        return nameClient;
    }


    /**
     * Функция ввода суммы для снятия с баланса, вслучае ввода букв пробрасывается исключение
     * InputMismatchException и предлагается повторный ввод
     *
     * @return возвращает сумму для снятия с баланса в формате float
     * @throws InputMismatchException - исключение ввода букв вместо цифр
     */
    public float enteringSum() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите необходимую сумму: ");
        float sum = 0;
        try {
            sum = sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода суммы для снятия. \nПовторите ввод.");
            enteringSum();
        }
        sc.close();
        return sum;
    }
}

