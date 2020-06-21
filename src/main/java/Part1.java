
import java.util.Arrays;
import java.util.Random;



 public class Part1 {
        public static void main(String[] args) {
            int b = 0;
            int[] x = new int[15];
            for (int i = 0; i < x.length; i++) {
                Random rnd = new Random();
                x[i] = rnd.nextInt(10);
                System.out.print(x[i] + " ");
                if (x[i] > 0 & x[i] % 2 == 0) b++;
            }
            System.out.println(" ");
            System.out.println("Всего в массиве " + b + " четных");
            System.out.print("\nСортировка по возврастанию: \n");// сортировка по возврастанию
            Arrays.sort(x); //Выводим отсортированный массив
            for (int value : x) System.out.print(value + "  ");
        }
    }


