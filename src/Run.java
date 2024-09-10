
public class Run {

    /**
     * Метод запуска программы
     * @param bankAccountOwnerName - имя аккаунта, в формате String
     * @param bankAccountBalance - баланс счёта
     * @throws ExceptionOfInsufficientFunds - исключение недостатка средств на балансе
     */
    public void run(String bankAccountOwnerName, float bankAccountBalance) throws ExceptionOfInsufficientFunds {
        System.out.println("Добро пожаловать!");
        Entering ent = new Entering();
        String name = ent.enterNameClient();
        float sum = ent.enteringSum();
        boolean check = checkName(name, bankAccountOwnerName);
        if (check) {
            checkSum(sum, bankAccountBalance);
        }
    }

    /***
     * Функция проверки имени аккаунта
     * @param name - имя введённое пользователем
     * @param bankAccountOwnerName - имя указанное в main
     * @return - возвразает результат проверки
     * @throws ExceptionNameInconsistency - исключение при не совпадении имён
     */
    public static boolean checkName(String name, String bankAccountOwnerName)
            throws ExceptionNameInconsistency {
        boolean check;
        if (!name.equals(bankAccountOwnerName)) {
            throw new ExceptionNameInconsistency("Не существует клиента с таким именем.");
        } else {
            System.out.println("Имя клиента найдено!");
            check = true;
        }
        return check;
    }

    /***
     * Метод проверки возможности снятия суммы
     * @param sum - введёная пользовотелем сумма для снятия
     * @param bankAccountBalance - баланс счёта, указанного в main
     * @throws ExceptionOfInsufficientFunds - исключение при снятии больщей суммы чем есть на балансе
     */
    public static void checkSum(float sum, float bankAccountBalance) throws ExceptionOfInsufficientFunds {
        if (sum <= bankAccountBalance) {
            float actualBalance = bankAccountBalance - sum;
            System.out.println("Операция выполнена успешно. \n Ваш баланс: " + actualBalance);
        } else {
            throw new ExceptionOfInsufficientFunds("Недостаточно средств на счете");
    }
    }
}
