public class Main {
    public static void main(String[] args) throws ExceptionNameInconsistency, ExceptionOfInsufficientFunds {

        String bankAccountOwnerName = "Вася";
        float bankAccountBalance = 10000;

        Run run = new Run();
        run.run(bankAccountOwnerName,bankAccountBalance);
        }
}