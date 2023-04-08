library: is essentially a set of functions that you can call, 
			these days usually organized into classes. 
			Each call does some work and returns control to the client.

 framework:  embodies some abstract design, with more behavior built in. 
 			In order to use it you need to insert your behavior into various places in the framework either by subclassing or by plugging in your own classes. 
 			The frameworks code then calls your code at these points.



c++ template=java interface
c++ container=java collection

template: In C++ a templated function/class is a code-factory, 
			generates code specific to a type at compile time

 stl library: generic library provides predifined ds 
 	* set of funtions organized into classes
 	* ses template classes and functions which have type parameters,
 	* With template classes it is possible to design a general collection,
 		in which all of the elements are of the same type and 
 		for which the compiler can enforce that only objects of the correct type are added to the collection.
 	* STL include performance as part of the interface requirements. This is not normally the case for java collections.
 	* STL iterators differ from those in Java. STL has a hierarchy of iterators which different capabilities, 
 		including moving either only forward or moving forward and backward,& providing random access to container elements. 
 	* Iterators in STL have values that can be compared. 
 	* In STL, containers can contain either objects or objects of primitive types, 
 		and many algorithms operate on either containers or arrays. 
 	* C++ allows passing functions as parameters which is not allowed in Java.

 jcf framework: 
 	* abstract design,
 	* collection classes provide collections of Objects,
 	* in Java, there is no way to create a general collection in which all of the elements have the same type. 
 		Instead, the collections are all collections of objects. These collections can hold objects of any type, and 
 		there is no way for the compiler to verify that all of the objects that are put in the collection are of the same type.
 	* In Java, the algorithms are organized by container, 
 		while in STL the algorithms are independent of the container on which they operate.
 	* Container classes are characterized by the iterators that they provide, 
 		and generic algorithms are characterized by the iterators that they use. 
 	* Java only provides Iterator&ListIterator.Random access iterators are not provided,& interators do not have values that can be compared.”
    * Java relies heavily on interfaces which do not exist in C++.
    * In Java, containers contain only objects, and algorithms must be defined separately for containers and for arrays.

Java
----
 java.lang
 Object
 Stings
 StringBuffer
 StringBuileder
 Math
 Number
 Wrappers
 System
 java.util
 random


    STL:
      <cctype>: to handle char,
      <string>: to handle narrow char string.
      <string>: string class template.
      <string-view>: template class,
      <format>:



STL                                                    JCF

sequence: (arr,ll)                                 list:               //allows duplicates):
   vector(array)                                      arraylist
   dequeue                                            linked List,
   list(ll)                                           vector. 

Associate:(BT)                                     Set:                 //sorted no dups
   set,(no dup)                                       harsh
   multiset,                                          inthash_set
   map,(no dup key)                                   sorted set. 
   multimap.



un_associative(hash tbl):                          Map:                  
   hash table                                         hashtable,
   unorderd set/multiset                              linked hash
   unorderd map/multimap                              hashmap
                                                      sorted map

Adapters:                                          queue:
   queue
   stack
   priority queue                                                

                                                      

                                                      COLLECTIONS:
 List:  ArrayList,Vector extends Stack
 Set:   HashSet(Not Sync),TreeSet
 Queue: LinkedList
 Map:   Hashtable(sync), HashMap(Not Sync)
 
 Non Sync:  not thread-safe operation
 if it’s used in multithread environment then "more than 1 thread can access" and process the <Interface> at a time
 Sync:  thread-safe operation
 "no more than one thread can access" the Hashtable at a given moment of time. 
 ================================================
                        LIST
            
 ArrayList:
 ---------
Careation=      ArrayList<T> as=new ArrayList<T>()
Insertion=      add()
Deletion=       remove()
updation ele=   set(indx obj)
Traversinf=     Adv for loop
Size of=        size()
Sorting=         sort()
 ------
|Stack |
 ------
implemented by vector
 
insertion=         push(obj ele)
deletion=          pop()
check emty or not= isempty()
check full or not= isFull()
return top ele=    peek()
===============================================
                        QUEUE
 Queue:
 ------
implemented with LL, priorityqueue
insertion= add()
deletion=remove()
HeadOfeleme=peek(), element()
removesHead= poll()
SizeofQue= size()

-----------------------------------
LinkeList(Single,doublle,priority)|
-----------------------------------

Creation = LinkedList<> ls=new LinkedList<>()
Insert ele
Delete ele
Traverse ll
Search ele
Concatenation ll
Display ll
 
===============================================================
                        SET
                
HashSet:(Not Sync)
-------------------

creation=    Hashset<T> hs=new Hashset<T>(); 
insertion=   add(E)
Deleation=   remove(Obj o)
checkElePresents= Contains(o)
Taversing=   I                  terator()
ChecksetEmptyornot= isEmpty()
size of set= size()

 
 
 
============================================================
                        MAP
                        
HashTable(Sync, not accpet null ob)
 

HashMap(non Sync allows 1 null key any num of null val)
-------


creation    HashMap<Integer, String> hmap= new HashMap<Integer, String>();
insertion:  put(Key k, Value v)
delation:   remove(Object key)
traversing: keySet()
            For loop
            while loop+Iterator
get an ele: get(Object key)
Copy Map to another:    putall(Map,m)
Size        Size()