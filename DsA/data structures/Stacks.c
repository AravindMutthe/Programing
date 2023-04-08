STACK: DS + ADT
* a stack is a logical data structure which follows the same kind of rules.
* It works on LIFO (Last In First Out) policy. 
* It means that the item which enters at last is removed first.
* it can implement it using a linked list as well as with an array.
* A stack supports few basic operations.
* All these operations need to implement (either with a linked list or an array) to make a stack

1. Push → dds a new element to the stack,any element added to the stack goes at the top
2. Pop → removes and also returns the top-most element from the stack.
3. Top → only returns (doesn’t remove) the top-most element of a stack.
4. isEmpty → checks whether a stack is empty or not i.e., if there is any element present in the stack or not.

* Stack has 2 errors
	stack underflow: When we try to pop an element from an empty stack
	stack overflow.if the number of elements exceeds the stated size of a stack
* A stack is definitely an ADT because it works on LIFO policy.
	which provides operations like push, pop, etc. for the users to interact with the data.
* A stack can be implemented in different ways and these implementations are hidden from the user.


Stack Using Array:

bottom: use the element at the beginig index of the array as the 'bottom' of the stack
top: use the last index element of the stack as the top of the stack
add: we need to add and remove elements from the top of the stack

we are going to use a pointer which is always going to point the topmost element of the stack. i.e 0 index o array
It will point to the element at index 0 when the stack is empty.


1. isEmpty(): a function to check whether a stack is empty or not.

IS_EMPTY(S)
  if S.top == 0
      return TRUE
  return FALSE

--------------------------------------

2. Push: 

PUSH(S, x)  //start by passing the item goin to push (x) and the Stack (s) to a function
  S.top = S.top+1
  if S.top > S.size //if maximum size of the stack
      Error "Stack Overflow"
  else
      S[S.top] = x // if not add x

To add an item to stack, ust need to increment the top pointer by 1 and add the element there.

-------------------------------------------------------------

3. pop:

POP(S) // start by passing the stack S
  if IS_EMPTY(S) //first check if the stack is empty or not.
      Error “Stack Underflow”
  else
      S.top = S.top-1 // otherwise remove the element from the stack and return it.
      return S[S.top+1]


  #include <stdio.h>

#define SIZE 10

int S[SIZE+1];
int top = 0;

int is_empty() {
if(top == 0)
  return 1;
return 0;
}

void push(int x) {
top = top+1;
if(top > SIZE) {
  printf("Stack Overflow\n");
}
else {
  S[top] = x;
}
}

int pop() {
if(is_empty()) {
  printf("Stack Underflow\n");
  return -1000;
}
else {
  top = top-1;
  return S[top+1];
}
}

int main() {
pop();
push(10);
push(20);
push(30);
push(40);
push(50);
push(60);
push(70);
push(80);
push(90);
push(100);
push(110);

int i;
for(i=1; i<=SIZE; i++) {
  printf("%d\n",S[i]);
}
return 0;
}

-------------------------------------------------

Stack Using Linked List :



1. isEmpty()

* A stack will be empty if the linked list won’t have any node

IS_EMPTY(S) // start by passing Stack
  if S.top == null // when the top pointer of the linked list will be null.
      return TRUE
  return FALSE

2. Push()
* to push any node to stack, first check if the stack is empty or not.
* If the stack is empty,make the new node head of the ll and also point the top pointer to it.

PUSH(S, n)
  if IS_EMPTY(S) //stack is empty
      S.head = n //new node is the head of the linked list
      S.top = n //new node is the also the top
  else
      S.top.next = n
      S.top = n

3. Pop()
* to pop ,first check if the stack is empty or not

POP(S)
  if IS_EMPTY(S)
      Error "Stack Underflow"
  else
      x = S.top.data //we will first store the value in top node in a temporary variable because we need to return it after deleting the node.
      if S.top == S.head //only one node,make both top and head null.
          S.top = NULL
          S.head = NULL
      else //or will move to the node previous to the top node and make the next of point it to null and also point the top to it.
          tmp = S.head
          while tmp.next != S.top //iterating to the node previous to top
              tmp = tmp.next
          tmp.next = NULL //making the next of the node null
          S.top = tmp //changing the top pointer
      return x





#include <stdio.h>
#include <stdlib.h>

typedef struct node {
int data;
struct node *next;
}node;

typedef struct linked_list {
struct node *head;
struct node *top;
}stack;

//to make new node
node* new_node(int data) {
node *z;
z = malloc(sizeof(struct node));
z->data = data;
z->next = NULL;

return z;
}

//to make a new stack
stack* new_stack() {
stack *s = malloc(sizeof(stack));
s->head = NULL;
s->top = NULL;

return s;
}

void traversal(stack *s) {
node *temp = s->head; //temporary pointer to point to head

while(temp != NULL) { //iterating over stack
  printf("%d\t", temp->data);
  temp = temp->next;
}

printf("\n");
}

int is_empty(stack *s) {
if(s->top == NULL)
  return 1;
return 0;
}

void push(stack *s, node *n) {
if(is_empty(s)) { //empty
  s->head = n;
  s->top = n;
}
else {
  s->top->next = n;
  s->top = n;
}
}

//function to delete
int pop(stack *s) {
if(is_empty(s)) {
  printf("Stack Underflow\n");
  return -1000;
}
else {
  int x = s->top->data;
  if(s->top == s->head) {// only one node
    free(s->top);
    s->top = NULL;
    s->head = NULL;
  }
  else {
    node *temp = s->head;
    while(temp->next != s->top) // iterating to the last element
      temp = temp->next;
    temp->next = NULL;
    free(s->top);
    s->top = temp;
  }
  return x;
}
}

int main() {
stack *s = new_stack();

node *a, *b, *c;
a = new_node(10);
b = new_node(20);
c = new_node(30);

pop(s);
push(s, a);
push(s, b);
push(s, c);

traversal(s);
pop(s);
traversal(s);


return 0;
}

