package homework_6;

public class ATM {
    /*
    Задача *:
Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
принимает сумму денег, а возвращает булевое значение - успешность выполнения
операции. При снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
количеством купюр каждого номинала.
     */
    private int banknotesS = 0;
    private int banknotesM = 0;
    private int banknotesL = 0;
    private int allSum;

    public boolean countBanknotes(int sum) {
        if (sum < 20 || sum == 30 || sum % 10 != 0) {
            System.out.println("Сумму невозможно выдать банкнотами: 20, 50, 100");
            return false;
        }
        while (sum > 0) {
            if (sum >= 100 && (sum - 100 != 10) && (sum - 100 != 30)) {
                banknotesL++;
                sum -= 100;
                allSum += 100;
            } else if (sum >= 50 && (sum - 50) % 20 == 0) {
                banknotesM++;
                sum -= 50;
                allSum += 50;
            } else if (sum >= 20) {
                banknotesS++;
                sum -= 20;
                allSum += 20;
            } else {
                break;
            }
        }
        return true;
    }

    public void check() {
        System.out.println("Вы сняли: " + allSum + "$");
        if (banknotesL != 0) {
            System.out.println("Получили " + banknotesL + " банкноту(ы) номиналом по 100$");
        }
        if (banknotesM != 0) {
            System.out.println("Получили " + banknotesM + " банкноту(ы) номиналом по 50$");
        }
        if (banknotesS != 0) {
            System.out.println("Получили " + banknotesS + " банкноту(ы) номиналом по 20$");
        }
    }
}
