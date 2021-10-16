package pl.sda.lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoLauncher {

    public static void main(String[] args) {

        int[] userNumbers = {4, 14, 46, 38, 29, 44};
        System.out.println("User numbers: " + Arrays.toString(userNumbers));

        int[] randomNumbers = generateRandomNumbers();
        System.out.println("Random numbers: " + Arrays.toString(randomNumbers));

        int[] guessedNumbers = findGuessedNumbers(userNumbers, randomNumbers);
        System.out.println("Guessed numbers: " + Arrays.toString(guessedNumbers));
    }

    private static int[] findGuessedNumbers(int[] userNumbers, int[] randomNumbers) {
        int[] guessedNumbers = new int[6];
        int counter = 0;

        for (int userNumber : userNumbers) {
            for (int randomNumber : randomNumbers) {
                if (userNumber == randomNumber) {
                    guessedNumbers[counter] = userNumber;
                    counter++;
                }
            }
        }
        return guessedNumbers;
    }

    private static int[] generateRandomNumbers() {
        int[] randomNumbers = new int[6];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = new Random().nextInt(49) + 1;
        }
        return randomNumbers;
    }
}
