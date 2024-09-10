
public class Run {

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

    public static boolean checkName(String name, String bankAccountOwnerName)
            throws ExclusionNameInconsistency {
        boolean check = false;
        if (!name.equals(bankAccountOwnerName)) {
            throw new ExclusionNameInconsistency("Имя клиента не соответствует!");
        } else {
            System.out.println("Имя клиента найдено!");
            check = true;
        }
        return check;
    }

    public static void checkSum(float sum, float bankAccountBalance) throws ExclusionOfInsufficientFunds {
        if (sum <= bankAccountBalance) {
            System.out.println("Операция выполнена успешно. \n Ваш баланс: " + (bankAccountBalance - sum));
        } else {
            throw new ExclusionOfInsufficientFunds("Недостаточно средств на счете");
    }
    }
}
