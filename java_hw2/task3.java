// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
// Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
// Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
// Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}

import java.util.Scanner;;

public class task3 {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int count = 0;
            for (int i = 0; i < n; i++)
                {
                    System.out.println("Введите число: ");
                    array[i] = scanner.nextInt(); 
                    
                }
        
            for (int i = 0; i < n; i++) {
                if(array[i] / 100 == 0 ) {
                    count = count + i;
                }
            }
            System.out.println("Сумма индексов двузначных элементов = " + count);

            System.out.println("Массив до преобразования: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            } 
            System.out.println();
            System.out.println("Массив после преобразования: ");
            for (int i = 0; i < n; i++) {
                if (array[i] < 0) {
                    array[i] = count;
                }
            System.out.print(array[i] + " ");
            } 
    }
}
