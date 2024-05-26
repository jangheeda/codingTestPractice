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
    private int size;

    public LinkedListStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;
    }

    public int size() {

        return size;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void empty() {
        if (isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        LinkedListStack stack = new LinkedListStack();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push": {
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "top": {
                    System.out.println(stack.top());
                    break;
                }
                case "pop": {
                    System.out.println(stack.pop());
                    break;
                }
                case "size": {
                    System.out.println(stack.size());
                    break;
                }
                case "empty": {
                    stack.empty();
                    break;
                }
                default: {
                    System.out.println("Invalid command");
                }
            }
        }


    }
}