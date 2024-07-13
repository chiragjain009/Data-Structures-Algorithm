import list.ArrayListJi;

public class prac {
    public static void main(String[] args) {
        ArrayListJi<Integer> list = new ArrayListJi<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(5);

        System.out.println(list);

        ArrayListJi<String> list1 = new ArrayListJi<>();
        list1.add("ed");
        list1.add("ad");
        list1.add("edd");
        list1.add("sa");
        list1.add("sa");
        list1.add("ad");
        list1.clear();

        System.out.println(list1.getSize());

    }
}
