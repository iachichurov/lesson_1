package gb.android.java;

public class Main {

//    Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte aByte = 1;
        short aShort = 2;
        int anInt = 3;
        long aLong = 4L;
        float aFloat = 5.01f;
        double aDouble = 6.001;
        char aChar = '&';
        boolean aBoolean = true;


    public static void main(String[] args) {
        System.out.printf("%.2f\n", calc(1f, 3f,5f,6f));
        System.out.println(check(12,1));
        posOrNeg(10);
        System.out.println(negOrPos(1));
        greet("Жужа");
        whichYear(1963);
    }

/*
    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий
     результат, где a, b, c, d – аргументы этого метода, имеющие тип float.
*/

    public static float calc(float a, float b, float c, float d) {
        return(a*(b+(c/d)));
    }

/*
    Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
*/

    public static boolean check (int a1, int a2) {
        int sUmm = a1 + a2;
        return (sUmm <= 20) && (sUmm >= 10);
    }

/*
    Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали
    или отрицательное. Замечание: ноль считаем положительным числом
*/

    public static void posOrNeg (int x) {
        if (x >= 0) System.out.println("Положительное");
        else System.out.println("Отрицательное");
    }

/*
    Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное,
    и вернуть false если положительное.
*/

    public static boolean negOrPos(int y) {
        return (y < 0);
    }

/*
    Написать метод, которому в качестве параметра передается строка,
    обозначающая имя. Метод должен вывести в консоль
    сообщение «Привет, указанное_имя!»
*/

    public static void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }

/*
    *Написать метод, который определяет, является ли год високосным,
    и выводит сообщение в консоль. Каждый 4-й год является високосным,
    кроме каждого 100-го, при этом каждый 400-й – високосный.
*/

    public static void whichYear(int year) {
        if (year <= 1582) System.out.println("Может високосный, а может и нет. Папа Григорий XIII знал");
        else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.println("Високосный");
        else System.out.println("Не високосный");
  }
}