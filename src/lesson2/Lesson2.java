package lesson2;

public class Lesson2 {


    public static void main(String[] args) {
        String arr1[][] = new String[][]{{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "o", "12"},
                {"13", "14", "15", "16"}};


        try {
            try {
                int result = arrayCount(arr1);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер не 4Х4");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в " + e.i +"х" + e.j);

        }
    }

    public static int arrayCount(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int count = 0;
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length !=4) {
                    throw new MyArraySizeException();
                }
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        count = count + Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }return count;
    }
}
