/**
 * Реализуйте метод getAgeString(), который будет принимать параметром целое число (возраст) и возвращать строку
 * вида: "Вам N лет". Программа должна учитывать правила русского языка.
 *
 * <p>Пример верного исполнения кода: "Вам 5 лет", "Вам 4 года".
 * Пример неверной работы программы: "Вам 14 года".
 *
 * <p>Также необходимо учесть негативные сценарии. Например, попытку передать в метод невалидное значение - например,
 * отрицательное число. В таких случаях ожидается, что метод вернет строку "Некорректный ввод".
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите сколько вам лет:");
        int age = in.nextInt();
        int calcAge = age;
        String defis;
        while (calcAge > 10) {
            if (calcAge == 11) {
                break;
            }
            calcAge %= 10;
        }
        if (calcAge == 1) {
            defis = "год";
        } else if (calcAge > 1 & calcAge < 5) {
            defis = "года";
        } else {
            defis = "лет";
        }
        PrintStream printf = System.out.printf("Вам %d %s", age, defis);
    }
}
