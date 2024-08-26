import java.util.*;

public class Solution {
    private class Node {
        int index;
        Node prev;
        Node next;
        
        Node(int index) {
            this.index = index;
        }
    }
    
    public String solution(int n, int k, String[] cmd) {
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }
        
        for (int i = 1; i < n; i++) {
            nodes[i - 1].next = nodes[i];
            nodes[i].prev = nodes[i - 1];
        }
        
        Node current = nodes[k];
        Stack<Node> deleted = new Stack<>();
        
        for (String command : cmd) {
            String[] parts = command.split(" ");
            String action = parts[0];
            
            if ("U".equals(action)) {
                int x = Integer.parseInt(parts[1]);
                while (x-- > 0) current = current.prev;
                
            } else if ("D".equals(action)) {
                int x = Integer.parseInt(parts[1]);
                while (x-- > 0) current = current.next;
                
            } else if ("C".equals(action)) {
                deleted.push(current);
                Node prevNode = current.prev;
                Node nextNode = current.next;
                
                if (prevNode != null) prevNode.next = nextNode;
                if (nextNode != null) nextNode.prev = prevNode;
                
                current = (nextNode != null) ? nextNode : prevNode;
                
            } else if ("Z".equals(action)) {
                Node node = deleted.pop();
                Node prevNode = node.prev;
                Node nextNode = node.next;
                
                if (prevNode != null) prevNode.next = node;
                if (nextNode != null) nextNode.prev = node;
            }
        }
        
        StringBuilder result = new StringBuilder("O".repeat(n));
        while (!deleted.isEmpty()) {
            result.setCharAt(deleted.pop().index, 'X');
        }
        
        return result.toString();
    }
}