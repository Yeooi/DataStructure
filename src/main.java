public class main
{
    public static void main(String[] args) {
        
        /*
        LinkedList A = new LinkedList();
        A.initialise();
        A.addNodeToTail(5);
        A.addNodeToTail(3);
        A.addNodeToTail(10);
        A.addNodeToTail(6);
        A.addNodeToTail(20);
        A.addOneNode(2, 545);
        A.removeNode(2);
        A.printList();
        System.out.println("Number of Nodes in List : " + A.countList());
        */

        Stack S = new Stack();
        S.initialise(5);
        S.push(5);
        S.push(10);
        S.push(20);
        S.pop();
    }
}