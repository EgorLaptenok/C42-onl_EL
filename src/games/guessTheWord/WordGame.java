package games.guessTheWord;

import java.util.Random;

import java.util.Arrays;
import java.util.Scanner;

public class WordGame {

    private static final String[] WORDS = {
            "яблоко", "банан", "апельсин", "программирование", "компьютер",
            "телефон", "машина", "самолет", "корабль", "солнце",
            "луна", "планета", "звезда", "космос", "книга",
            "тетрадь", "ручка", "город", "страна", "университет"
    };

    private static final int MAX_ATTEMPTS = 5;
    private final Scanner scanner;
    private final Random random;

    public WordGame() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void start() {
        boolean playAgain = true;

        while (playAgain) {
            playSingleSession();

            System.out.println("\nХотите начать заново? (Да/Нет):");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("нет")) {
                playAgain = false;
                System.out.println("До свидания");
            }
        }
    }

    private void playSingleSession() {
        String secretWord = WORDS[random.nextInt(WORDS.length)].toLowerCase();

        char[] playerProgress = new char[secretWord.length()];
        Arrays.fill(playerProgress, '*');

        int attemptsLeft = MAX_ATTEMPTS;

        System.out.println("\n--- Старт: ---");
        System.out.println("Загаданное слово: " + String.valueOf(playerProgress) + " (букв: " + secretWord.length() + ")");

        while (attemptsLeft > 0) {
            System.out.println("\nОсталось попыток: " + attemptsLeft);
            System.out.print("Введите букву или слово целиком: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.isEmpty()) {
                System.out.println("Ввод не может быть пустым!");
                continue;
            }

            if (input.length() > 1) {
                if (input.equals(secretWord)) {
                    System.out.println("Поздравляю! Вы угадали слово целиком: " + secretWord);
                    return;
                } else {
                    System.out.println("Неверное слово!");
                    attemptsLeft--;
                }
            }

            else {
                char guessedLetter = input.charAt(0);
                boolean found = false;

                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == guessedLetter) {
                        playerProgress[i] = guessedLetter;
                        found = true;
                    }
                }

                if (found) {
                    System.out.println("Правильно! Текущий прогресс: " + String.valueOf(playerProgress));
                } else {
                    System.out.println("Такой буквы нет!");
                    attemptsLeft--;
                }
            }

            if (String.valueOf(playerProgress).equals(secretWord)) {
                System.out.println("Поздравляю! Вы открыли все буквы: " + secretWord);
                return;
            }
        }

        System.out.println("\nКонец игры! Закончились попытки.");
        System.out.println("Было загадано слово: " + secretWord);
    }
}
