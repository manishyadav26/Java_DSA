import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
       data=d;
       next=null;
    }
}
public class InsertatStart {
    Node head;

    void InsertatStart(int val){

        Node newNode =  new Node(val);

        newNode.next=head;

        head=newNode;
    }
    void display(){
        Node temp=head;
        System.out.println("elements are:");

        while(temp != null){
            System.out.print(temp.data  + " ->");
            temp=temp.next;

        }
        System.out.println("Null");

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        InsertatStart list= new InsertatStart();

        System.out.print("Enter number of elements to insert at start: ");
        int n = sc.nextInt();

        for(int i=0; i< n;i++){
            System.out.print("Enter value: ");
            int val = sc.nextInt();
            list.InsertatStart(val);
        }
        list.display();
        sc.close();
    }
}
