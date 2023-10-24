import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        decision();
        again();
    }

    public static void decision(){
        Scanner scanner =new Scanner(System.in);
        int taskNumb ;

        do {
            System.out.println("Введіть номер завдання для виконання (1, 2, 3 ) при вводі 4 будуть виведені відповіді на кр питання ");
            taskNumb = scanner.nextInt();

            switch (taskNumb) {
                case 1:
                    task1.tasks();
                    break;
                case 2:
                    task2.tasks();
                    break;
                case 3:
                    task3.tasks();
                    break;
                case 4:
                    Answers.answers();
                    break;
                default:
                    System.out.println("Невірний номер завдання. Спробуйте ще раз.");
            }
        } while (taskNumb < 1 || taskNumb > 4);
    }
    public static void again()
    {
        Scanner scanner = new Scanner(System.in);
      int i;
        do {
            System.out.println("Чи хочете ви вибрате ще якесь завдання? 1 - так , 2 - ні");
             i = scanner.nextInt();
            switch (i){
                case 1 :
                    decision();
                    break;
                case 2 :
                    System.out.println("bye");
                    break;
            }
        }while (i==1);
    }
}
class task1 {
    public static void tasks() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть z");
        double z = in.nextDouble();
        double k = 15;
        if (z < 0) {
            throw new IllegalArgumentException("z має бути більше за нуль");
        }
        else {
            double sum = 0;
            for (int i = 1; i<k; i++) {
                sum += Func(z, i ,k);
            }
            System.out.println("Результат: " + sum);
        }
    }

    public static double Func(double z,int i , double k) {
        return ((1/(sqrt(z*i))) + tan(k/i));
    }
}

    class task2 {
        public static void tasks() {
            Scanner in = new Scanner(System.in);
            System.out.println("Введіть t");
            double t = in.nextDouble();
            System.out.println("Введіть i");
            double i = in.nextDouble();
            double x = 0;
            if (i == 1) {
                if (t < 0) {
                    throw new IllegalArgumentException("корінь із від'ємного числа в даній програмі не вираховується");
                }
                x = sqrt(t);
                System.out.println(x);
            }
            if (i == 2) {
                if (t < 0) {
                    throw new IllegalArgumentException("корінь із від'ємного числа в даній програмі не вираховується");
                }
                x = 1 / (sqrt(t));
                System.out.println(x);
            }
            if (i != 1 && i != 2) {
                double k;
                for (k = 1; k <= i; k++) {
                    x += k * t;
                }
                System.out.println(x);
            }


        }
    }

class task3 {
    public static void tasks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення ε (ε > 0):");
        double epsilon = scanner.nextDouble();

        if (epsilon <= 0) {
            throw new IllegalArgumentException("ε should be greater than 0");
        }

        double sum = calculateInfiniteSum(epsilon);
        System.out.println("Результат: " + sum);
    }

    public static double calculateInfiniteSum(double epsilon) {
        double sum = 0;
        double term;
        int i = 0;

        do {
            term = Math.pow(-2, i) / (factorial(i) * (i + 1.0));
            sum += term;
            i++;
        } while (Math.abs(term) >= epsilon);
        return sum;
    }

    public static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
    class Answers {
        public static void answers() {
            Scanner in = new Scanner(System.in);
            System.out.println("Чи хочете ви побачити відповіді на питання? 1-так , 2-ні");
            double x = in.nextDouble();
            if (x == 1) {

                System.out.println("1.Що таке структурне програмування?");
                System.out.println("- Структурне програмування - це підхід до програмування, який спрямований на покращення якості, зрозумілості та ефективності коду за допомогою використання трьох основних конструкцій: послідовність, вибір та цикл.");
                System.out.println("2.Назвіть основні конструкції структурного програмування.");
                System.out.println("- Основні конструкції структурного програмування: послідовність, вибір (if-else, switch) та цикл (for, while, do-while).");
                System.out.println("3.Назвіть основні принципи структурного програмування.");
                System.out.println("- Основні принципи структурного програмування: модульність, локальність, однозначність, гнучкість, ефективність.");
                System.out.println("4.Поясніть, чому в більшості мов програмування не радять використовувати оператор GOTO, а в мові Java його взагалі немає?");
                System.out.println("- Використання оператора GOTO може призвести до 'спагеті-коду', який важко розуміти та підтримувати. В Java його немає, щоб забезпечити більшу структурну зрозумілість коду.");
                System.out.println("5.Що таке спагеті-код?");
                System.out.println("- 'Спагеті-код' - це код, який має складну та незрозумілу структуру, в якому важко зрозуміти потік виконання програми.");
                System.out.println("6.Що таке проектування зверху-вниз? В чому його переваги?");
                System.out.println("- Проектування зверху-вниз - це методологія розробки програм, при якій спочатку створюється загальна структура програми, а потім деталізуються її окремі частини. Переваги: зрозумілість, легкість управління та підтримка.");
                System.out.println("7.Що таке область видимості ідентифікатора?");
                System.out.println("- Область видимості ідентифікатора - це частина коду, в якій даний ідентифікатор може бути використаний.");
                System.out.println("8.Що таке блок? Як блоки впливають на область видимості?");
                System.out.println("- Блок - це частина коду, обмежена фігурними дужками. Ідентифікатори, оголошені в межах блоку, видимі лише в межах цього блоку.");
                System.out.println("9.Приклади випадків, коли краще використовувати наступні оператори та конструкції:");
                System.out.println("- if: Коли потрібно виконати певний блок коду за заданою умовою.");
                System.out.println("- if-else: Коли потрібно виконати один з двох блоків коду в залежності від умови.");
                System.out.println("- ланцюги if-else if -else if...: Коли є кілька умов, які потрібно перевірити послідовно.");
                System.out.println("- switch: Коли потрібно виконати один з кількох блоків коду в залежності від значення змінної.");
                System.out.println("- тернарна умовна операція ?: Коли потрібно присвоїти змінній одне з двох значень в залежності від умови.");
                System.out.println("10.Приклади випадків, коли краще використовувати наступні оператори та конструкції:");
                System.out.println("- while: Коли кількість ітерацій невідома заздалегідь.");
                System.out.println("- do-while: Коли потрібно виконати блок коду хоча б один раз.");
                System.out.println("- for: Коли кількість ітерацій відома заздалегідь.");
                System.out.println("11.Чим оператор break відрізняється від оператора continue?");
                System.out.println("- Оператор break завершує виконання циклу, а оператор continue переходить до наступної ітерації.");
                System.out.println("12.Навіщо у мові Java є мітки, якщо немає goto?");
                System.out.println("- Мітки в Java використовуються для вказівки місця, куди потрібно перейти при використанні операторів break або continue для керування вкладеними циклами.");
                System.out.println("13.До якого результату призведе виконання наступного фрагменту коду?");
                System.out.println("- В першому `if` виразі `a = false` присвоює `false` змінній `a` і повертає `false`. Тому блок коду після `if` не виконується.");
                System.out.println("- В другому `if` виразі `b = true` присвоює `true` змінній `b` і повертає `true`. Тому блок коду після `if` виконується, і виводиться 'b is true'.");
                System.out.println("- В третьому `if` виразі `a = b` присвоює значення `b` (яке є `true`) змінній `a` і повертає `true`. Тому блок коду після `if` виконується, і виводиться 'a = b'.");
                System.out.println("14. До якого результату призведе виконання наступного фрагменту коду?");
                System.out.println("- Коли виконується оператор switch, він знаходить case 3 і виводить 3. Оскільки немає оператора break, він продовжує виконання і виводить 4.");
                System.out.println("15. До якого результату призведе виконання наступного фрагменту коду (true/false)?");
                System.out.println("- False. Щоб отримати True, треба замінити 1/i на 1.0/i");
            } else {
                System.out.println("Гарного дня!");
            }

        }
    }



