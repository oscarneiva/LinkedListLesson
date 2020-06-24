package project;

public class Project {
    public static void main(String[] args) {
        Array array = new Array();
        List list = new List();

        for (int i = 0; i < array.readArray().length; i++) {
            System.out.println("Array element:" + array.readArray()[i]);
        }

        // list.readList().
        // list.readList().remove(1);


        for (int i = 0; i < list.readList().size(); i++) {
            System.out.println("LinkedList element: " + list.readList().get(i).getColour());
        }
    }
}

