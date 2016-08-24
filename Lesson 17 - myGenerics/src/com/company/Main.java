package com.company;

public class Main {

    public static void main(String[] args) {

        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(3);
        Node n4 = new Node(7);
        Node n5 = new Node(9);
        Node n6 = new Node(3);

        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n3.left = n5;
        n4.right = n6;

        max(n1);

    }

    public static int max(Node node){
        int max = node.value;
        if(node.left != null){
            int maxLeft = max(node.left); //this is a different max
            if(maxLeft > max)
                max = maxLeft;
        }
        if (node.right != null){
            int maxRight = max(node.right);
            if (maxRight > max)
                max = maxRight;
        }
        return max;
    }

    // now we do a non static



    public  static int sum(Node node){
        int sum = node.value;
        if(node.left != null){
            sum += sum(node.left);
        }
        if(node.right !=null){
            sum += sum(node.right);
        }
        return sum;
    }

    public static boolean compare(Node node1, Node node2){
        return true;
    }

}

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
    }

    // now we do a non static max

    public int max(){
        int max = value;
        if(left != null){
            int maxLeft = left.max();
            if(maxLeft > max)
                max = maxLeft;
        }
        if(right != null){
            int maxRight = right.max();
            if(maxRight > max)
                max = maxRight;
        }
        return max;
    }


}
