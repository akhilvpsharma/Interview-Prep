// https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1/?category[]=Linked%20List#

/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

//Function to delete a node without any reference to head pointer.
class Solution
{
    void deleteNode(Node del)
    {
         del.data=del.next.data;
         Node temp=del.next;
         del.next=temp.next;
         temp=null;
    }
}