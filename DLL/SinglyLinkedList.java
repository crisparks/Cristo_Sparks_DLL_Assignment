package DLL;
public class SinglyLinkedList{
    public Node head;
    //Constructors
    public SinglyLinkedList(){
        this.head = null;
    }
    //Methods
    public void add(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
        }
        else{
            Node runner = this.head;
            while(runner.next != null){
                runner = runner.next;
        }
            runner.next = newNode;
        }
    }

    public void pop(){
        if(head.next == null){
            this.head = null;
        }
        Node runner = this.head;
        while(runner.next.next != null){
            runner = runner.next;
        }
        System.out.println(runner.next.value);
        runner.next = null;
    }

    public void printValues(){
        Node runner = this.head;
        if(head == null){
            System.out.println("No nodes!");
        }
        while(runner.next != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
        System.out.println(runner.value);
    }
    
    public void printValuesBackward(Node head){
        if(head == null){
            return;
        }
        printValuesBackward(head.next);
        System.out.println(head.value + " ");
        
    }
    
    public boolean contains(int a){
        Node runner = this.head;
        if(head == null){
             System.out.println("No nodes!");
             return false;
        }
        while(runner.next != null){
            runner = runner.next;
            if(runner.value == a){
                System.out.println("There is value "+ a);
                return true;
            }
            else if (runner.next == null && runner.value != a){
                System.out.println("There is not value "+ a);
                return false;
            }
            
        }
        return runner.value != a && runner != null;
    }
    
    public int size(){
        Node runner = this.head;
        int count = 1;
        if(head == null){
            System.out.println("No nodes!");
        }
        while(runner.next != null){
            count++;
            runner = runner.next;
        }
        System.out.println("Node count:" + count);
        return count;
    }
    
}