import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку
//нельзя сложить и яблоки, и апельсины;
public class Box<T extends Fruit> {

    private List<T> list;

    public Box(T... obj) {
        list = Arrays.asList(obj);
    }
    public Box() {
        list = new ArrayList<T>();
    }

//Не забываем про метод добавления фрукта в коробку.
    void add (T obj){
        list.add(obj);
    }

    public float getWeight (){
        float weight = 0.0f;
        for (T t : list) {
            weight += t.getWeight();
        }
        return weight;
    }

//Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в
//compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
    public boolean compare (Box<T> box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.000001f;
    }

//Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку
//фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в
//другую перекидываются объекты, которые были в этой коробке;
    public void layOutFromBox (Box<T> box){
        for (T t : list) {
            box.add(t);
        }
        list = new ArrayList<>(list);
    }
}
