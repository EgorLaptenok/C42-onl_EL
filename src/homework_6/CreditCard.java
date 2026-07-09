package homework_6;

public class CreditCard {
    /*
    Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
выводит текущую информацию о карточке. Напишите программу, которая создает три
объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек.
     */
    private String accountNumber;
    private double amount;

    public CreditCard(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAmount(double amount, String operation) {
        double check = this.amount;
        this.amount = (operation.equals("+")) ? check + amount : check - amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }
}
