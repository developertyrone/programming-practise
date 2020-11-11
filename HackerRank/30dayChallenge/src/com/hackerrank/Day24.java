package com.hackerrank;

import java.io.*;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Day24
{

    public static Node removeDuplicates(Node head) {
        //Write your code here
        if(head.next == null){
            return head;
        }else{

            Node cur = head;
            while(cur.next != null){
                if(cur.next.data == cur.data){
                    cur.next = cur.next.next;
                }else{
                    cur = cur.next;
                }
            }
            return head;    

            /* Slower solution
            int cur = head.data;
            Node curNode = head;
            Node removedHead = new Node(cur);
            while(curNode != null){
                if(cur != curNode.data){
                    insert(removedHead, curNode.data);
                    cur = curNode.data;
                }
                curNode = curNode.next;
            }
            return removedHead;
            */


        }
    }

	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }