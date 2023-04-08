LL: A linked list is a collection of nodes where each node contains
	 data and
	 a pointer to the next node.

1. Node=data+next ptr; 

* The first part is to create a node (structure).

struct node
{
    int data;
   	struct Node *next;
};
-------------------------------------
c++:

class Node
{
   int data;
   Node next;

   Node(int d) 
   {
   	data = d; 
   	next = null; 
   }
}
-----------------------------------


2. linked_list= head + tail+funtions

* Now, we will create a class ‘linked_list’ which will contain all the functions and data members required for a linked list.
* This class will use the structure ‘node’ for the creation of the linked list.


class linked_list
{
private:
    node *head,*tail;
}



3. keep track head/first node
* most important part of a linked list is to always keep the track of the first node because access to the first node means access to the entire list. 
  So, let’s call our first node as ‘ head’.

public:
    linked_list()
    {
        head = NULL;
        tail = NULL;
    }


* constructor of the linked list is making both ‘head ’ and ‘ tail’ NULL because we have not yet added any element to our ll and thus both are NULL.
* We will store the first node in ‘head’ and the last node in ‘tail’.

4. Add a node to linked_list

* Now, let’s create a function of adding a node to our linked list

void add_node(int n)
    {
        node *tmp = new node; //creating a node to add in ll
        tmp->data = n;
        tmp->next = NULL;

        if(head == NULL)  // if head is not storing/ pointing any node
        {
            head = tmp;		// if yes then store temp node in head
            tail = tmp;
        }
        else
        {
            tail->next = tmp; // if no store temp node in head's next
            tail = tail->next;
        }
    }


  * allocating the space required for a node in heap by the new operator.



#include <iostream>

using namespace std;
----------------------------------1 node=data+nxt ptr
struct node
{
    int data;
    node *next;
};
----------------------------------2. linked_list= head + tail+funtions
class linked_list
{
private:
    node *head,*tail;
----------------------------------3. keep track head/first node
public:
    linked_list()
    {
        head = NULL;
        tail = NULL;
    }
----------------------------------4. Add a node to linked_list
    void add_node(int n)
    {
        node *tmp = new node;
        tmp->data = n;
        tmp->next = NULL;

        if(head == NULL)
        {
            head = tmp;
            tail = tmp;
        }
        else
        {
            tail->next = tmp;
            tail = tail->next;
        }
    }
};
----------------------------------drivin code
int main()
{
    linked_list a;
    a.add_node(1);
    a.add_node(2);
    return 0;
}


TRAVERSING Linked List
-------------------------

* means visiting each node in ll
* We start from the beginning and visit one node at a time until the end of the list (until the ‘next’ is NULL).
* We need the first element (head) to reach to any element of the list.
* we will do the traversal using the ‘head’ and print its element and then proceed to the next
* Steps for the Node traversal of the linked list are:
	1 Check if the node element is not NULL.
	2 If it is not, then print its node ‘data’.
	3 Change the node to the element stored in the node ‘next’.

		while(p != NULL)            // 1 Check if the node element is not NULL.
		{
    		printf("%d\n",p->data); // 2 If it is not, then print its node ‘data’
    		p = p->next;            // 3 Change the element(node) to the element stored in the node ‘next’. // changing pointer ith nxt elemnt

		}

void display()
    {
        node *tmp;
        tmp = head;
        while (tmp != NULL)
        {
            cout << tmp->data << endl;
            tmp = tmp->next;
        }
    }
};


1 traversal

TRAVERSE(L)            //We will pass the linked list (L) to it - TRAVERSE(L).
  temp = L.head        //make a temporary pointer and point it to the head of the linked list (L) 
  while(temp != null)  //start a loop and end it when this pointer will point to null (last element) i.e., while(temp != null)
      temp = temp.next //At the end of each iteration, we have to just point the temp pointer to the next of the node

----------------------------------------------

2 insert at beginning of linked_list

INSERT_AT_BEGINNING(L, n) //start by passing the node (n) and the linked list (L) to a function
  n.next = L.head        //point the next of the node to the head of the linked list
  L.head = n            //head should always point to the first element of the linked list, so we change the head to point to the new node 


-------------------------------------------------
3. inserting at end of linked_list

INSERT_AT_LAST(L, n)		//start by passing the linked list and the node to the function
  temp = L.head’			//will first start from the head of the linked list
  while(temp.next != null) //next task is to iterate to the last of the linked list.
      temp = temp.next

  temp.next = n // add new node

--------------------------------------------------
4. inserting node in middle of linked_list i.e our nodes z, b, c, a, x, y

* start by passing the node to be inserted (n) and 
* after which node we are going to insert this node (a)

INSERT_NODE_AFTER(n, a)
  n.next = a.next //We point next of the new node (n) to next of the node a.
  a.next = n //point next of the a to the new node n


  ----------------------------------------------
5. Deleting a Node from a Linked List

* We delete any node of a linked list by connecting its prev node of the node to be deleted by the successor node of the node.
* We might need to clean this garbage ourself in some languages like C by using the free function.
 while some languages like Java does it automatically.

 DEL(L, n)
  tmp = L.head //will first start iterate from the head of the linked list
  if tmp == n // If the node we are going to delete is the head of the linked list (node to be deleted is head
      L.head = n.next // then we will just update the head pointer 
  		free(n);

  else // Otherwise, (node to be deleted is not head
      while(tmp != null)
          if tmp.next == n //node previous to node to be deleted
              tmp.next = n.next //then link the node previous of the node to be deleted to the next of it (linking)
          	  free(n);
              break
          tmp = tmp.next