package ivanovkm.java.javatwo.lesson2;

public class MainClass {
    public static void main(String[] args) {

        Object[][] arr;
        int sum = 0;
        try {
            arr = addArray(4,4);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            return;
        }
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += (int) arr[i][j];
                } catch (RuntimeException e) {
                    throw new MyArrayDataException("\n2. в(-о) " + ++i +" ряду ячейки № " + ++j + " находятся некорректные данные." );
                }
            }
        System.out.println("\n2. Сумма элементов массива = " + sum);
    }
    public static Object[][] addArray(int row, int col) throws MyArraySizeException {
        if (row != 4 || col != 4) {
            throw new MyArraySizeException("\n1. Задайте массив размером 4 на 4");
        }
        return new Object[][]{{1,2,3,"4"},{1,2,3,4}};
    }
}
