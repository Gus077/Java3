import java.lang.reflect.Array;
import java.util.*;

public class Main {
    /*
    1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
2. Написать метод, который преобразует массив в ArrayList;
3. Большая задача:
a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку
нельзя сложить и яблоки, и апельсины;
c. Для хранения фруктов внутри коробки можете использовать ArrayList;
d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в
compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку
фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в
другую перекидываются объекты, которые были в этой коробке;
g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String s [] = {"java", "qweqwe", "123", "qwe"};
        swap(s,1,3);

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange or1 = new Orange();
        Orange or2 = new Orange();
        Orange or3 = new Orange();
        Orange or4 = new Orange();

        Box<Apple> b1 = new Box<>(apple1,apple2,apple3,apple4);
        Box<Orange> b2 = new Box<>(or1,or2,or3,or4);
        Box<Orange> b3 = new Box<>();

        b2.layOutFromBox(b3);

        System.out.println(b1.getWeight());
        System.out.println(b2.getWeight());


    }

//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static <T> void swap (T[] arr, int ind1, int ind2){
        T cache = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = cache;
        System.out.println(Arrays.toString(arr));
    }

//2. Написать метод, который преобразует массив в ArrayList;
    public static <T> List<T> transformToList (T[] arr){
       return Arrays.asList(arr);
    }
}
