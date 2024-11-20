import java.util.Locale;
import java.util.Scanner;
import java.util.WeakHashMap;

public class test {
    public static void main(String[] args) {

        primeNumberArray(10);

    }

    public static void matematic(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int n = 1;
        for (int i = 1; i <= number; i++) {
            n *= i;
        }
        System.out.println(String.format("Факториал числа %d число %d", number, n));

        n = 0;
        for (int i = 1; i <= number; i++) {
            n += i;
        }
        System.out.println(String.format("Сумма чисел числа %d число %d", number, n));

    }

    public static void rectangle(int dl, int sh) {
        int count = 1;
        while (count <= sh) {
            for (int i = 1; i <= dl; i++) {
                if ((count == 1 || count == sh) & i == 1) {
                    System.out.print(" ");
                } else if ((count == 1 || count == sh) & i == dl) {
                    System.out.println(" ");
                } else if ((count == 1 || count == sh) & i > 1 & i < dl) {
                    System.out.print("_");
                } else if ((count > 1 & count < sh) & (i == 1)) {
                    System.out.print("|");
                } else if ((count > 1 & count < sh) & (i == dl)) {
                    System.out.println("|");
                } else {
                    System.out.print(" ");
                }
            }
            count++;
        }
    }

    public static void rectangleNew(int dl, int sh) {
        int count = 1;
        while (count <= sh) {
            String line = "";
            for (int i = 1; i <= dl; i++) {
                if (((count == 1 || count == sh) & i == dl) || ((count == 1 || count == sh) & i == 1)) {
                    line += " ";
                } else if ((count == 1 || count == sh) & i > 1 & i < dl) {
                    line += "_";
                } else if (((count > 1 & count < sh) & (i == 1)) || (count > 1 & count < sh) & (i == dl)) {
                    line += "|";
                } else {
                    line += " ";
                }
            }
            count++;
            System.out.println(line);
        }
    }

    public static void array_method() {
        char[] nameArray = {'К', 'о', 'с', 'т', 'я'};
        for (int i = 0; i < nameArray.length; i++) {
            if (i < nameArray.length - 1) {
                System.out.print(nameArray[i]);
            } else {
                System.out.println(nameArray[i]);
            }

        }
        String name = "";
        for (int i = 0; i < nameArray.length; i++) {
            name += nameArray[i];
        }
        System.out.println("Имя из строки: " + name);

        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int[] intersArray = new int[5];
        for (int i = 0; i < intersArray.length; i++) {
            if (i == 0) {
                System.out.println("Введите пять различных целых числа, после ввода каждого числа нажмите ENTER");
            }
            System.out.print("Введите число: ");
            intersArray[i] = in.nextInt();
        }

        int summ = 0;
        for (int i = 0; i < intersArray.length; i++) {
            if (i == 0) {
                summ += intersArray[intersArray.length - 1];
            } else {
                summ += intersArray[i - 1];
            }
        }

        System.out.println(summ);

        int numm;
        do {
            System.out.print("Угадайте число от 1 до 10: ");
            numm = in.nextInt();
        } while (numm != 5);
    }


    public static void primeNumberArray(int total) {
        int[] primeArray = new int[total];
        int i = 0;
        int numm = 1;

        while (i < primeArray.length) {
            do {
                int del = 1;
                numm += 1;

                do {
                    del += 1;
                } while ((numm % del) != 0);

                if (numm == del) {
                    primeArray[i] = numm;
                    i += 1;
                }
            } while (primeArray[i - 1] == 0);
        }

        for (int s = 0; s < primeArray.length; ++s) {
            System.out.println(primeArray[s]);
        }
    }
}
