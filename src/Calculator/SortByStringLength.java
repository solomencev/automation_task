package Calculator;
/*Решить алгоритмическую задачу.
Sort list or array by string length (Отсортировать список по длине строк)*/
public class SortByStringLength {
    public static void main(String[] args) {
        SortByStringLength.sortArrayAsc(new String[] {"abcde", "abcd", "abc", "ab", "a"});
        SortByStringLength.sortArrayDesc(new String[] {"a", "ab", "abc", "abcd", "abcde"});
    }

    static void sortArrayAsc(String [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j].length() > array[j + 1].length()){
                    String swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
                else continue;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void sortArrayDesc(String [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j].length() < array[j + 1].length()){
                    String swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
                else continue;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}