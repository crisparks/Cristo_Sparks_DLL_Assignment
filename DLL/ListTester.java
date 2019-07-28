package DLL;
public class ListTester {

    public static void main(String[] args) {
        SinglyLinkedList a = new SinglyLinkedList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        System.out.println("testing removal");
        a.pop();
        a.pop();
        System.out.println("testing print values");
        a.printValues();
        System.out.println("testing size method");
        a.size();
        System.out.println("testing printing in reverse");
        a.printValuesBackward(a.head);
        System.out.println("testing boolean method");
        a.contains(4);
    }
}