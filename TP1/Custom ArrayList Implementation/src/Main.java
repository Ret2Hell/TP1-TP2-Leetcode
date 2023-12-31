public class Main {
    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        System.out.println("Is list empty? "+list.isEmpty());
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        System.out.println("Size after adding elements: "+list.size());
        System.out.println("Element at index 1: "+list.get(1));
        System.out.println("Is 'Element2' in list? "+list.isIn("Element2"));
        System.out.println("Index of 'Element3': "+list.find("Element3"));
        list.add(1, "Element4");
        System.out.println("Element at index 1 after inserting 'Element4': "+list.get(1));
        list.remove("Element1");
        System.out.println("Is 'Element1' in list after removal? "+list.isIn("Element1"));
        System.out.println("Size after removing 'Element1': "+list.size());
        for (int i=4;i<=15;i++) {
            list.add("Element" + i);
        }
        System.out.println("Size after adding more elements: "+list.size());
    }
}
