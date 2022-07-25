package lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalPart4 {
    public static void main(String[] args) {

        /** Создайте массив из N-случайных целых чисел и выведите его на экран. Размер массива пусть
         задается с консоли и размер массива может быть больше 5 и меньше или равно 10 Если N не
         удовлетворяет условиям – выведите сообщение. Если пользователь ввел неподходящее N, то
         программа должна просить пользователя повторить ввод. Создайте второй массив только из четных
         элементов первого массива, если они там есть, и вывести эго на экран.
         */
        System.out.println("Задание №2.1");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int inputValue = sc.nextInt();

        while (inputValue < 5 || inputValue > 11) {
            System.out.println("Размер массива может быть от 5 до 10 включительно. Введите новое число: ");
            inputValue = sc.nextInt();
        }

        int[] array1 = new int[inputValue];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array1));

        int array2Length = array1.length;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array2Length--;
            }
        }
        int[] array2 = new int[array2Length];
        for (int i = 0, j = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[j] = array1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array2));

        System.out.println("----------------------");

        /**Создайте массив и заполните его. Выведите массив на экран в строку. Заменит каждый элемент с
         нечетным индексом на 0 Снова выведите массив на экран на отдельной строке.
         */
        System.out.println("Задание №2.2");

        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(array3));

        for (int i = 0; i < array3.length; i++) {
            if (i % 2 != 0) {
                array3[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array3));

        System.out.println("---------------------");

        /**Создайте массив строк. Заполните его произвольными именами людей. Отсортируйте массив.
         Результат выведите на консоль.
         */
        System.out.println("Задание №2.3");

        String[] namesArray = new String [8];
        namesArray [0] = "Надя";
        namesArray [1] = "Женя";
        namesArray [2] = "Артем";
        namesArray [3] = "Ира";
        namesArray [4] = "Карина";
        namesArray [5] = "Сергей";
        namesArray [6] = "Таня";
        namesArray [7] = "Вася";

        Arrays.sort(namesArray);
        System.out.println(Arrays.toString(namesArray));

        System.out.println("-----------------------");

        /**Реализуйте алгоритм сортировки пузырьком, проставляя комментарии на каждом шаге.
         */

        System.out.println("Задание №2.4");

        int[] bubbleArray = {9, 0, 3, 5, 1, 10, 2 ,7 ,8, 4, 6}; // создаем массив
        System.out.println(Arrays.toString(bubbleArray)); // выводим наш изначальный массив на экран

        boolean isSorted = false; // Создаем переменную типа boolean, по которой в дальнейшем мы будем понимать отсортирован ли массив
        int temp; // Создаем переменную, в которой в дальнейшем временно будем хранить элемент массива, чтобы потом совершать обмен

        while (!isSorted) {    // Создаем цикл while, который будет выполняться пока наш массив не отсортируется. Цикл будет выполняться пока переменная isSorted false
            isSorted = true;   // Присваем переменной значение true, для того, чтобы когда программа зайдет в цикл for, и не выолнится ни одного условия, для нашего If, чтобы в следцющий раз программа не зашла в цикл while

            for (int i = 0; i < bubbleArray.length - 1; i++) { // Создаем цикл for, чтобы пройтись по всем индексам массива. bubleArray.lenght - 1, чтобы не выйти за пределы массива
                if (bubbleArray[i] > bubbleArray[i + 1]) {     //Создаем if, с помощью которого будем сранивать значение левого индекса со значением правого
                    temp = bubbleArray[i];                     // В случае, если левое значение больше правого, сохраняем значение левого в нашу временную переменную
                    bubbleArray [i] = bubbleArray [i + 1];     // Левому индксу, элемент которого был больше - присваиваем меньшее значение из правого индекса
                    bubbleArray [i + 1] = temp;                // В правый индекс сохраняем значение из временной переменной, где хранилось большее число
                    isSorted = false;                          // Перменную isSorted делаем снова false, чтобы снова зайти в цикл while
                }
            }
            System.out.println(Arrays.toString(bubbleArray)); // Выводим отсортированный массив
        }
    }
}

