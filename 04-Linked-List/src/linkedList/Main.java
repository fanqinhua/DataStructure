package linkedList;

public class Main {
    public static void main(String []args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0 ; i < 5 ; i ++){
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.add(666,2);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);
    }
}
