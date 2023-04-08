# CLASS:

**Class class-name**
{
**DM:** var, arrays, obj,
**MF:** friend, virtual

**private:** DM+MF

**public:** DM + MF

**Static:** DM+MF

**Const:** DM+MF

**Friend Functions**
**Constructors**(default,para,copy)
**Destructors**

};

# FUNCTIONS:

**Syntax:** return type - function name(arg-list)

**Function can return:**

* void (nothing)
* primitives data
* objects data
* reference data

**Function arguments can take input as:**

* primitives value
* Object address or value
* primitive types
* Class types
* Pointers types
* Arrays

# VARIABLE vs OBJECT:

**constructor:** used to initilize values of data members.

**initialization can be:**

* Ststic initialization-> default constructor.
* Dynamic  initialization-> parameterized(call by value).
* Copy initialization-> Copy constructor (call by address).

## Declaration of variable and object

```
int a;
class obj;
```

## static Initialisation of objects and variables: (default values, default constructor).

```
int a =10, b=20;
constructor()
{
a=10;
b=20;
}
```
## Dynamic Initialization of objects: (parameterized , call by value).

```
cin>>a>>b;
constructor(int x int y)
{
a=x;
b=y;
}
```

## Copying one Object to another: (copy, call by adress).

```
a=b;
b=c;

constructor (class &x,)
{
a=x.b;
b=x.a;
}
```

## Static allocating Memory to objects: (static constructors)

**fixed in size**

## Dynamically Allocating Memory  to objects: (Dynamic Constructor)

* done using
    1. pointers
    2. new and delete

