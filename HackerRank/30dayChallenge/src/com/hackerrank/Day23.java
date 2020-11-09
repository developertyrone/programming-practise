package com.hackerrank;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Day23{

    static void levelOrder(Node root){
        //Write your code here
        Queue<Node> nodeOrders = new LinkedList<>();
        nodeOrders.add(root);

        while(!nodeOrders.isEmpty()){
            Node cur = nodeOrders.remove();
            System.out.print(cur.data + " ");
            if(cur.left != null){nodeOrders.add(cur.left);}
            if(cur.right != null){nodeOrders.add(cur.right);}
        }

    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }                                                                                                                                                                                                                                                                                                
        levelOrder(root);
    }	
}
