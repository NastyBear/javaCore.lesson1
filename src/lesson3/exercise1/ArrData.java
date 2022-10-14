package lesson3.exercise1;


public class ArrData <T> {
    T a;

    public T[] ArrData(T[] arr,int indexA, int indexB){
        a = arr[indexA];
        arr[indexA]=arr[indexB];
        arr[indexB]=a;
        return arr;
    }
}
