
public class Run {

    /**
     * Метод запуска программы
     * @param bankAccountOwnerName - имя аккаунта, в формате String
     * @param bankAccountBalance - баланс счёта
     * @throws ExclusionOfInsufficientFunds - исключение недостатка средств на балансе
     */
    public void run(String bankAccountOwnerName, float bankAccountBalance) throws ExclusionOfInsufficientFunds {
        System.out.println("Добро пожаловать!");
        Entering ent = new Entering();
        String name = ent.enterNameClient();
        float sum = ent.enteringSum();
        boolean checkStatus = checkName(name, bankAccountOwnerName);
        if (checkStatus == true) {
            checkSum(sum, bankAccountBalance);
        }
    }

    /***
     * Функция проверки имени аккаунта
     * @param name - имя введённое пользователем
     * @param bankAccountOwnerName - имя указанное в main
     * @return - возвразает булево значение результата проверки
     * @throws ExclusionNameInconsistency - исключение при не совпадении имён
     */
    public static boolean checkName(String name, String bankAccountOwnerName)
            throws ExclusionNameInconsistency {
        boolean check;
        if (!name.equals(bankAccountOwnerName)) {
            throw new ExclusionNameInconsistency("Имя клиента не соответствует!");
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
     * @throws ExclusionOfInsufficientFunds - исключение при снятии больщей суммы чем есть на балансе
     */
    public static void checkSum(float sum, float bankAccountBalance) throws ExclusionOfInsufficientFunds {
        if (sum <= bankAccountBalance) {
            System.out.println("Операция выполнена успешно. \n Ваш баланс: " + (bankAccountBalance - sum));
        } else {
            throw new ExclusionOfInsufficientFunds("Недостаточно средств на счете");
    }
    }
}
