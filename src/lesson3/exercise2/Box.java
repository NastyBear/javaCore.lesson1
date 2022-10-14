package lesson3.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit>{

    private ArrayList<T> boxFruit;

    public Box(ArrayList<T> boxFruit) {

        this.boxFruit = boxFruit;
    }

    public static void main(String[] args) {
        Apple apple1 = new Apple(2,"apple1");
        Apple apple2 = new Apple(2,"apple2");
        Apple apple3 = new Apple(2,"apple3");
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
       Box<Apple> box1 =new Box<>(apples);
        System.out.println(box1.getWeight());
        Orange orange1 = new Orange(2,"orange1");
        Orange orange2 = new Orange(2,"orange2");
        Orange orange3 = new Orange(2,"orange3");
        ArrayList<Orange> oranges = new ArrayList<>();
        oranges.add(orange1);
        oranges.add(orange2);
        oranges.add(orange3);
        Box<Orange> box2 =new Box<>(oranges);
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2));
        Orange orange4 = new Orange(2,"orange4");
        Orange orange5 = new Orange(2,"orange5");
        ArrayList<Orange> oranges1 = new ArrayList<>();
        oranges1.add(orange4);
        oranges1.add(orange5);
        Box<Orange> box3 = new Box<>(oranges1);
        System.out.println(box3.getWeight());
        box2.sprinkle(box3);
        System.out.println(box1.get());

    }

    public Integer getWeight(){
        Integer result = 0;
        for(T t: getBoxFruit()){
            if(t!=null) {
                Integer value = t.getWeight();
                result = result + value;
            }
        }
        return result;
    }
    public Boolean compare(Box <?extends Fruit> box){
        if(this.getWeight().intValue()==box.getWeight().intValue())return true;
return false;
}
   public void sprinkle(Box<T>box){
       System.out.println("В коробке до:" + this.getWeight());
       System.out.println("В коробке до добавления :" + box.getWeight());
       for (T t: box.getBoxFruit()){
           this.getBoxFruit().add(t);
       }
       box.getBoxFruit().clear();
       System.out.println("В коробке после:" + this.getWeight());
       System.out.println("В добавочной коробке после:" + box.getWeight());
   }

   private int get(){
        int result =0;
        for (T t:getBoxFruit()){
           if(t!=null)result++;
        }
        return result;
   }

    public ArrayList<T> getBoxFruit() {
        return boxFruit;
    }

}
