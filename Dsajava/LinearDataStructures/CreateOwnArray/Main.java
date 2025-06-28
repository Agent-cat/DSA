package Dsajava.LinearDataStructures.CreateOwnArray;

public class Main {

    public static void main(String[] args) {

        OwnArray array = new OwnArray(6);
        array.insert(2);
        array.insert(3);
        array.insert(19);
        System.out.println("GetByIndex : "+array.getByIndex(0));
        // array.removeAt(0);
        array.insertAt(0, 10);
        System.out.println("Max : "+array.Max());
        System.out.println("Min : "+array.min());
        System.out.println("IndexOf : "+array.indexOf(5));
        System.out.println(array);
    }

}
