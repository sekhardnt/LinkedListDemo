import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList l=new LinkedList();
        l.add("sekhar");
        l.add(30);
        l.add(null);
        l.add("sekhar");
        l.set(0,"software");
        l.add(0,"surya");
        l.addFirst("koushik");
        System.out.println(l);
    }
}
