package NewPackage;

import java.util.HashMap;
import java.util.Map;

/**
 * Тестовое задание для ООО "РТ-ИНФОРМ"  (Подсчитать количество всех элементов списка/массива
 * и вернуть ассоциативных массив, где ключ – элемент списка, значение – количество этих
 * элементов в списке. Порядок не имеет значения.
 * Пример: [1, 3, 4, 5, 1, 5, 4] -> {1 : 2, 3 : 1, 4 : 2, 5 : 2}
 * @author Разумова Ирина
 */
public class Test {
        /**
         * @param arr входной массив
         * @return возврвт ассоциативного массива (в виде карты) где ключ – элемент входного
         * массива, значение – количество этих элементов в массиве
         */
        public static Map<Integer, Integer> assArr(Integer[] arr) {
            Map<Integer, Integer> map = new HashMap<>(){
                @Override
                public String toString() {
                    return super.toString().replace("=", ":");
                }
            };

            for (Integer integer : arr) {
                map.merge(integer, 1, Integer::sum);
            }
            return map;
        }

        public static void main(String[] args) {

            Integer[] arr = {1, 2, 3, 1, 5, 6, 6, 8, 9, 10, 10, 1, 1, 6};
            System.out.println(assArr(arr));
        }
}
