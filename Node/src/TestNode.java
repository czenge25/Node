/*
CZ
9/22/23
HK
 */
public class TestNode {
    public static void main(String[] args) {

        //Creates three nodes with different data values and uses all constructors
        Node n1 = new Node(2);
        Node n2 = new Node(4);
        Node n3 = new Node(8, n1, n2);

        //Creates an array of nodes and initializes it with the created nodes
        Node[] list;
        list = new Node[]{n1, n2, n3};

        //Prints the data stored in each node in the list
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getData());
        }

        //Sets the data in each node to 10 and prints the updated values
        for (int i = 0; i < list.length; i++) {
            list[i].setData(10);
            System.out.println(list[i].getData());
        }

        //Tests the Node equals method on each Node
        System.out.println(n1.equals(n2));  //Checks if n1 is equal to n2
        System.out.println(n2.equals(n3));  //Checks if n2 is equal to n3
        System.out.println(n1.equals(n3));  //Checks if n1 is equal to n3

        //Prints string representations of nodes
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].toString());
        }

        //Creates a node with a String data type
        Node n4 = new Node("Hello");
        System.out.println(n4.toString());    //Prints string representation of n4
        System.out.println(n4.getData());      //Prints data stored in n4
        n4.setData(3.14159265358979);          //Changes data in n4 to a double of pi
        System.out.println(n4.getData());      //Prints n4 again
    }
}