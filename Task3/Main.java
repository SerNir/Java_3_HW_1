package Task3;

public class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Apple a4 = new Apple();
        Apple a5 = new Apple();
        Apple a6 = new Apple();


        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();


        Box box = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box.toBox(box.fruitBox, a1);
        box.toBox(box.fruitBox, a2);
        box.toBox(box.fruitBox, a3);
        box.toBox(box.fruitBox, o1);
        box.toBox(box.fruitBox, o2);
        box.toBox(box.fruitBox, o3);
        box2.toBox(box2.fruitBox, o1);
        box2.toBox(box2.fruitBox, o2);
        box2.toBox(box2.fruitBox, o3);
        box2.toBox(box2.fruitBox, a1);
        box2.toBox(box2.fruitBox, a2);
        box2.toBox(box2.fruitBox, a3);
        box3.toBox(box3.fruitBox, a4);
        box3.toBox(box3.fruitBox, a5);
        box3.toBox(box3.fruitBox, a6);

        System.out.println(box.weightBox);
        System.out.println(box.fruitBox);
        System.out.println(box2.weightBox);
        System.out.println(box2.fruitBox);
        System.out.println(box3.weightBox);
        System.out.println(box3.fruitBox);

        System.out.println(box.compare(box2));
        System.out.println(box.compare(box3));


        box.pourBox(box, box3);
        System.out.println(box.fruitBox);
        System.out.println(box3.fruitBox);
    }
}
