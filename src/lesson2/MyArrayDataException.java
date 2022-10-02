package lesson2;

public class MyArrayDataException extends Exception{


    public String i;
    public String j;


    public MyArrayDataException(int i, int j) {
        this.i= String.valueOf(i);
        this.j= String.valueOf(j);
      //  super();
    }

}
