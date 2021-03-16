package Task3;

import java.util.ArrayList;
import java.util.List;

public class Box {

    public float weightBox;
    public ArrayList<Fruit> fruitBox;

    public Box() {
        fruitBox = new ArrayList<>();
        this.weightBox = 0;
    }

    public void setWeightBox(float weightBox) {
        this.weightBox = weightBox;
    }



    public void toBox(List boxList, Fruit fruit) {
        if (boxList.isEmpty()) {
            boxList.add(fruit);
            setWeightBox(weightBox += fruit.weight);
        }
        if (boxList.get(0) instanceof Apple && fruit instanceof Apple) {
            boxList.add(fruit);
            setWeightBox(weightBox += fruit.weight);
        }
        if (boxList.get(0) instanceof Orange && fruit instanceof Orange) {
            boxList.add(fruit);
            setWeightBox(weightBox += fruit.weight);
        }
    }

    public  float getWeight(List list) {
        float weight = 0;
        if (list instanceof Orange) {
            weight = ((Orange) list).weight * list.size();
        }
        if (list instanceof Apple) {
            weight = ((Apple) list).weight * list.size();
        }
        return weight;
    }

    public boolean compare(Box box) {
        if (box.weightBox == this.weightBox) {
            return true;
        } else return false;
    }

   public void pourBox(Box box1, Box box2){
        if(box2.fruitBox.isEmpty() ){
            ArrayList<Fruit> arr = new ArrayList<>();

            box2.fruitBox.addAll(box1.fruitBox);
            box1.fruitBox.clear();
        }
      else if(box2.fruitBox.get(0) instanceof Apple && box1.fruitBox.get(0) instanceof Apple ){
           box2.fruitBox.addAll(box1.fruitBox);
           box1.fruitBox.clear();
       }
       else if(box2.fruitBox.get(0) instanceof Orange && box1.fruitBox.get(0) instanceof Orange ){
           box2.fruitBox.addAll(box1.fruitBox);
           box1.fruitBox.clear();
       }
   }
}