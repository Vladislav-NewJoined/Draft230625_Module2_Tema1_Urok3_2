package lessons.java;

import java.util.function.Function;




//        Пример _ ППППППППППППППППППППППППППППППППППП
// 04.15  Check RegExp
// здесь пример: видео мин 1.33  https://youtu.be/yiF9tFGtPug
public class Draft1_Task2_1_3 {
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tНаписать лямбда выражение, которое принимает на вход число и возвращает " +
                "\nзначение “Положительное число”, “Отрицательное число” или  “Ноль”. Используем " +
                "\nфункциональный интерфейс Function\n\nРешение: ");

            Function<Integer, String> function = i -> {
                String result = "Ноль";
                if (i > 0) {
                    result = "Положительное число";
                } else if (i < 0) {
                    result = "Отрицательное число";
                }
                return result;
            };

        System.out.println(function.apply(-9));
        System.out.println(function.apply(0));
        System.out.println(function.apply(99));
    }
}
//        Конец Примера _ КККККККККККККККК







////        Пример _ ППППППППППППППППППППППППППППППППППП
//// 04.15  Check RegExp
//public class Draft1_Task2_1_3 {
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tНаписать лямбда выражение, которое принимает на вход число и возвращает " +
//                "значение “Положительное число”, “Отрицательное число” или  “Ноль”. Используем " +
//                "функциональный интерфейс Function\n\nРешение: ");
//        int[] array = {-1, -3, -5, 0, 4, 10};
//        System.out.println(arraySum(array, (a) -> a > 0));
//    }
//
//    static int arraySum(int[] array, Filter filter) {
//        int summ = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (filter.filter(array[i])) {
//                summ += array[i];
//            }
//        }
//        return summ;
//    }
//}
////        Конец Примера _ КККККККККККККККК










