# QUEUE: head + tail pointer

* queue is also an Abstract Data Type or ADT. 
* A queue follows FIFO (First-in, First out) policy.
* a new element enters a queue at the last (tail of the queue) and removal of an element occurs from the front (head of the queue).
* can implement the queue using a linked list as well as with an array.
* operations which are done on a queue are:
	1.  Enqueue() 
	which adds an element to the queue. 
	any new item enters at the tail of the queue, so Enqueue adds an item to the tail of a
	2. Dequeue()
	similar to the pop operation of stack 
	it returns and deletes the front element from the queue.
	3. isEmpty() → It is used to check whether the queue has any element or not.
	4. isFull() → It is used to check whether the queue is full or not.
	5. Front() → It is similar to the top operation of a stack i.e., it returns the front element of the queue (but don’t delete it).


## Queue Using an Array: 

* We will maintain two pointers - tail and head to represent a queue
* head= head will always point to the oldest element which was added
* tail= tail will point where the new element is going to be added.
* To insert any element, we add that element at tail and increase the tail by one to point to the next element of the array.
* Initially, the queue will be empty i.e., both head and tail will point to the same location i.e., at index 1

1. isEmpty= whether the queue has any element or not.

```
IS_EMPTY(Q) // start by passing queue
  If Q.tail == Q.head //if head and tail are pointing to the same location or not at any time.
      return True // q is empty
  return False

```
2. isFull= whether the queue is full or not.

```
IS_FULL(Q)	// start by passing queue
  if Q.head = Q.tail+1 //if the head of a queue is 1 more than the tail
      return True //ueue is full.
  Return False
```

1. Enqueue = add item to queue

* To enqueue any item to the queue, we will first check if the queue is full .
  
```  
Enqueue(Q, x)   //start by passing that item going to add x and queue Q
  if isFull(Q) //check if the queue is full or not 
      Error “Queue Overflow”
  else //if not full
      Q[Q.tail] = x //add the element to the tail 
      if Q.tail == Q.size //if added element goes at last(tail) of the array, 
          Q.tail = 1 // the tail will go to the first element of the array.
      else
          Q.tail = Q.tail+1 // otherise increase the tail by 1.

```

4.  Dequeue:

* To dequeue, we will first store the item which we are going to delete from the queue in a variable because we will be returning it at last.

```
Dequeue(Q, x)
  if isEmpty(Q) // check q empty or not 
      Error “Queue Underflow”
  else
      x = Q[Q.head] //store the item which we are going to delete from the queue in a variable
      if Q.head == Q.size //head is at the last element of the array
          Q.head = 1 //increase the head pointer by 1.
      else
          Q.head = Q.head+1 //increase the head pointer by 1.
      return x
```
```c
 #include <stdio.h>
#include <stdlib.h>

typedef struct queue {
int head;
int tail;
int size;
int Q[];
}queue;

queue* new_queue(int size) {
queue *q = malloc(sizeof(queue) + size*sizeof(int));

q->head = 1;
q->tail = 1;
q->size = size;

return q;
}

int is_empty(queue *q) {
if(q->tail == q->head)
  return 1;
return 0;
}

int is_full(queue *q) {
if(q->head == q->tail+1)
  return 1;
return 0;
}

void enqueue(queue *q, int x) {
if(is_full(q)) {
  printf("Queue Overflow\n");
}
else {
  q->Q[q->tail] = x;
  if(q->tail == q->size)
    q->tail = 1;
  else
    q->tail = q->tail+1;
}
}

int dequeue(queue *q) {
if(is_empty(q)) {
  printf("Underflow\n");
  return -1000;
}
else {
  int x = q->Q[q->head];
  if(q->head == q->size) {
    q->head = 1;
  }
  else {
    q->head = q->head+1;
  }
  return x;
}
}

void display(queue *q) {
int i;
for(i=q->head; i<q->tail; i++) {
  printf("%d\n",q->Q[i]);
  if(i == q->size) {
    i = 0;
  }
}
}

int main() {
queue *q = new_queue(10);
enqueue(q, 10);
enqueue(q, 20);
enqueue(q, 30);
enqueue(q, 40);
enqueue(q, 50);
display(q);

printf("\n");

dequeue(q);
dequeue(q);
display(q);

printf("\n");

enqueue(q, 60);
enqueue(q, 70);
display(q);
return 0;
}

```

**Queue Using Linked List:**

* a linked list is a dynamic data structure and we can change the size of it whenever it is needed.
* so, we are not going to consider that there is a maximum size of the queue and thus the queue will never overflow
* However, can set a maximum size to restrict the ll from growing more than that size.


1. is_empty

```
IS_EMPTY(Q)

  if Q.head == null //if head will point to NULL.
      return True
  return False
```


2. Enqueue: 

```
 ENQUEUE(Q, n)
  if IS_EMPTY(Q)
      Q.head = n  // if queue is empty 
      Q.tail = n // if empty queue, make the new node head and tail of the queue.
  else
     Q.tail.next = n //adds a new element to the last of a linked list.
     Q.tail = n

```

 3. Dequeue:

```
 DEQUEUE(Q, n)
  if IS_EMPTY(Q)
      Error "Queue Underflow"
  else
      x = Q.head.data //to dequeue, remove the head of the linked list
      Q.head = Q.head.next
      return x
```

**EXAMPLE**

```c
#include <stdio.h>
#include <stdlib.h>

typedef struct node {
int data;
struct node *next;
}node;

typedef struct linked_list {
struct node *head;
struct node *tail;
}queue;

//to make new node
node* new_node(int data) {
node *z;
z = malloc(sizeof(struct node));
z->data = data;
z->next = NULL;

return z;
}

//to make a new queue
queue* new_queue() {
queue *q = malloc(sizeof(queue));
q->head = NULL;
q->tail = NULL;

return q;
}

void traversal(queue *q) {
node *temp = q->head; //temporary pointer to point to head

while(temp != NULL) { //iterating over queue
  printf("%d\t", temp->data);
  temp = temp->next;
}

printf("\n");
}

int is_empty(queue *q) {
if(q->head == NULL)
  return 1;
return 0;
}

void enqueue(queue *q, node *n) {
if(is_empty(q)) {
  q->head = n;
  q->tail = n;
}
else {
  q->tail->next = n;
  q->tail = n;
}
}

int dequeue(queue *q) {
if(is_empty(q)) {
  printf("Underflow\n");
  return -1000;
}
else {
  int x = q->head->data;
  node *temp = q->head;
  q->head = q->head->next;
  free(temp);
  return x;
}
}

int main() {
queue *q = new_queue();

node *a, *b, *c;
a = new_node(10);
b = new_node(20);
c = new_node(30);

dequeue(q);
enqueue(q, a);
enqueue(q, b);
enqueue(q, c);

traversal(q);
dequeue(q);
traversal(q);


return 0;
}

```