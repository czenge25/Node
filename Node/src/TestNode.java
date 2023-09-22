import java.util.Random;

public class TestNode {
    public static void main(String[] args) {

        Node n1 = new Node(2);
        Node n2 = new Node(4);
        Node n3 = new Node(8,n1,n2);

        Node[] list;
        list = new Node[]{n1, n2, n3};

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getData());
        }

        for (int i = 0; i < list.length; i++) {
            list[i].setData(10);
            System.out.println(list[i].getData());
        }

        System.out.println(n1.equals(n2));
        System.out.println(n2.equals(n3));
        System.out.println(n1.equals(n3));

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].toString());
        }

        Node n4 = new Node("Hello");
        System.out.println(n4.toString());
        System.out.println(n4.getData());
        n4.setData(3.14159265358979);
        System.out.println(n4.getData());
    }
}
