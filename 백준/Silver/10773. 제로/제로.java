import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack {
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {

        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public int sum() {
        int totalSum = 0;
        Node current = top;
        while (current != null) {
            totalSum += current.data;
            current = current.next;
        }
        return totalSum;
    }



}

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedListStack stack = new LinkedListStack();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int data = Integer.parseInt(br.readLine());
            if(data == 0) {
                stack.pop();
            }else {
                stack.push(data);
            }
        }
        System.out.println(stack.sum());
    }
}