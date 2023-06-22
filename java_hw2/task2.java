// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
            for (int i = 0; i < n; i++)
            {
                System.out.println("Введите число: ");
                array[i] = scanner.nextInt(); 
            }
        
            if (array[0] == array[1])
            {
                System.out.println("Нет последовательности");
                return;
            }
        boolean isAscending = array[0] < array[1];
            for (int i = 2; i < array.length; i++)
            {
                if ((array[i - 1] >= array[i] && isAscending) ||
                        (array[i - 1] <= array[i] && !isAscending))
                {
                    System.out.println("Нет последовательности");
                    return;
                }
            }
        System.out.println(isAscending ? "Восходящая" : "Нисходящая");
    }
}

