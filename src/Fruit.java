public class Fruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }
//Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
//(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
    public float getWeight() {
        return weight;
    }
}
