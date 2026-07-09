package homework_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    ArrayList<CreditCard> clientCard = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    protected int choose;
    protected int id;
    protected double money;

    public void client(int countClient) {
        String cart;
        for (int i = 0; i < countClient; i++) {
            cart = "1000-0000-000" + i;
            clientCard.add(new CreditCard(cart, 0));
        }
        System.out.println("Клиентов банка: " + clientCard.size());
    }

    public void manager() {
        System.out.println("Вы вошли в банк \nВыберите куда вы подойдёт:");
        boolean flag = true;
        while (flag) {
            System.out.println("1.К кассе\n2.К ATM");
            choose = scanner.nextInt();
            if (choose == 1) {
                flag = cashRegister();
            } else if (choose == 2) {
                flag = atmRegister();
            } else {
                flag = false;
                System.out.println("Некорректный выбор, куда вы подойдёт:");
            }
        }
    }

    private void statusMoneyForClient(int client) {
        System.out.println(clientCard.get(client).getAmount());
    }

    private void putMoneyIn(int client, double sum) {
        clientCard.get(client).setAmount(sum, "+");
    }

    private void withdrawMoney(int client, double sum) {
        clientCard.get(client).setAmount(sum, "-");
    }

    private void checkingCardNumber(int client) {
        System.out.println("Номер счёта: " + clientCard.get(client).getAccountNumber());
    }

    private boolean verificationId() {
        System.out.println("Вас приветствует персональный помощник банка, назовите свой ID:");
        id = scanner.nextInt();
        if (id < 0 || id >= clientCard.size()) {
            System.out.println("Не существующий ID");
            return false;
        } else {
            System.out.println("Ваш ID подтверждён");
            return true;
        }

    }

    private boolean cashRegister(){
        if (verificationId()) {
            System.out.println("Что вы хотите: ");
            System.out.println("1.Проверить счёт\n2.Узнать номер своей карты");
            System.out.println("3.Снять деньги\n4.Положить деньги\n5.Уйти");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Ваш баланс:");
                    statusMoneyForClient(id);
                    break;
                case 2:
                    System.out.println("Номер вашей карты: ");
                    checkingCardNumber(id);
                    break;
                case 3:
                    System.out.println("Какую сумму вы хотите снять: ");
                    money = scanner.nextDouble();
                    withdrawMoney(id, money);
                    break;
                case 4:
                    System.out.println("Какую сумму вы хотите положить на счёт: ");
                    money = scanner.nextDouble();
                    putMoneyIn(id, money);
                    break;
                case 5:
                    System.out.println("Хорошего дня");
                    return false;
                default:
                    System.out.println("Выберите снова: ");
                    break;
            }
        } else {
            System.out.println("Вы назвали не верный ID");
        }
        return true;
    }
    private boolean atmRegister(){
        ATM atm = new ATM();
        if (verificationId()) {
            System.out.println("Что вы хотите: ");
            System.out.println("1.Проверить счёт\n2.Снять деньги");
            System.out.println("3.Положить деньги\n4.Уйти");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Ваш баланс:");
                    statusMoneyForClient(id);
                    break;
                case 2:
                    System.out.println("Банкомат может выдать банкнотами: 20, 50, 100");
                    System.out.println("Какую сумму вы хотите снять: ");
                    money = scanner.nextDouble();
                    atm.countBanknotes((int) money);
                    atm.check();
                    withdrawMoney(id, money);
                    break;
                case 3:
                    System.out.println("Какую сумму вы хотите положить на счёт: ");
                    money = scanner.nextDouble();
                    putMoneyIn(id, money);
                    break;
                case 4:
                    System.out.println("Хорошего дня");
                    return false;
                default:
                    System.out.println("Выберите снова: ");
                    break;
            }
        } else {
            System.out.println("Вы назвали не верный ID");
        }
        return true;
    }
}
