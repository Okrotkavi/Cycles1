package ru.netology.sqr;

public class SQRService {
    public int squareOfNumbers(int lowlimit, int highlimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowlimit && i * i <= highlimit) {
                count = count + 1;
            }
        }
        System.out.println("Количество квадратов чисел, попавших в диапазон: " + count);
        return count;

    }

}
