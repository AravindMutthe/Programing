# whats is serializtion.

* Any programming language work is to store data or values in computer memory i.e RAM and manipulate that stored data.
* premitive datatypes holds only single values.
* in java objects holds premitive types.
* java objects holds data or value ratherthen reference.

**"serilization is a translation i.e translation of object's data into stream of Bytes"**
* Byte is a memory unit which is written into a file.that file could be stored in harddisk or in a DATABASE or it could be send over a NETWORK to another computer.
* this end-computer performs Deserialization"

**"Deserialization  is nothing but reading that file from a hard-disk or database and converting that stream bytes to represent an object.** 
* This stream of bytes used to recreate the original object in computer memory i.e RAM".

CPU can't understands the object form of data.it can understands only binary format of  data so byte is a group of 8 bits. so these bits send to the CPU from MainMemory and it proceses that data and sent back to RAM.

* JVM is responsible for this serialization process.

* If you want a class objects to be serializable, all you need to do it implement the java.io.Serializable interface through ObjectInputStream and ObjectOutputStream classes.

#  SERIALIZATION LIBRARIES AND FRAMEWORKS IN JAVA:

1. Arzarel API
2. Xson
3. Kryo
4. BlazeDS.

* Azrael is a serialization library or API. It allows Java objects to bE serialized to some data format, and to be deserialized from that SERIALIZED data at a later time.

* XSON is a Java object serialization and deserialization framework. It supports the serialization of Java objects into byte arrays and deserialization from byte arrays to Java objects.

# Build tools

* Build tools compiles a project's source code.
* to manage and organize your builds we use build tools,and are very important in environments where there are many projects, especially if they are inter-connected. 
* They serve to make sure that where various people are working on various projects, they don't break anything. And to make sure that when you make your changes, they don't break anything either.
* Build tools not only compile a project's source code, but also download dependencies and run tests.

* As of now three build tools have historically dominated the scene: Apache Ant (released 2000), Apache Maven (released around 2004), and Gradle (released 2007).
* These can run in Java IDEs.


* Ant has no default directory layout.
Ant was the first build tool for Xml format Scripts.
XML being hierarchical in nature, it is not a good fit for procedural programming approach.
XML tends to become unmanageably big when used with all but very small projects.




* It has improved few of the problem of ANT. 
Maven uses a more declarative approach,The POM file describes your project resources - not how to build it.
an Ant file describes how to build your project. 
In Maven, how to build your project is predefined in the Maven Build Life Cycles, Phases and Goals. 
Maven continues using XML as the format to write build script, however, structure is diametrically different.
The Most important addition, was the ability to download dependencies over the network(later on adopted by Ant through Ivy).
in maven Dependencies management does not handle conflicts well between different versions of the same library.


* Gradle was released in 2012. Google adopted Gradle as the default build tool for the Android OS. Gradle does not use XML. Instead, it had its own DSL based on Groovy (one of JVM languages). As a result, Gradle build scripts tend to be much shorter and clearer than those written for Ant or Maven.

# JSON Libraries:

1. JACKSON: it is a multi-purpose Java library for processing JSON data format. Jackson aims to be the best possible combination of fast, correct, lightweight, and ergonomic for developers.
Jackson offers three methods for processing JSON format,
   1. Streaming API: reads and writes JSON content as discrete events
   2. Tree model: provides a mutable in-memory tree representation of a JSON document
   3. Data binding: converts JSON to and from POJO’s.

2. GSON: it capable of converting Java objects into their JSON representation and JSON strings to an equivalent Java object without the need for placing Java annotations in your classes.
It has extensive support of Java Generics. Allow custom representation for objects and pre-existing unmodifiable objects to be converted to and from JSON.

# XML Librarries:

1. DOM4J:
This is one of the most popular libraries to work with XML files, since it allows us to perform bi-directional reading, create new documents and update existing ones.
DOM4J can work with DOM, SAX, XPath and XLST. SAX is supported via JAXP.

ex:
```
SAXReader reader = new SAXReader();
Document document = reader.read(file);
List<Node> elements = document.selectNodes("//*[@internId='" + id + "']");
return elements.get(0);
```
SAXReader class is responsible for creating a DOM4J tree from SAX parsing events. Once we have a org.dom4j.Document we just need to call the necessary method and pass to it the XPath expression as a String.

2. JDOM

JDOM's working style is pretty similar to DOM4J's

```
SAXBuilder builder = new SAXBuilder();
Document doc = builder.build(this.getFile());
Element tutorials = doc.getRootElement();
List<Element> titles = tutorials.getChildren("internship");
```

# websocket vs https:

* WebSocket is a protocol providing full-duplex communication channels over a single TCP connection. Where as, HTTP  providing half-duplex communication i.e request and responce.

* Information exchange mode of WebSocket is bidirectional. Means, server can push information to the client (which does not allow direct HTTP).

=====================================================================

Reducing the dependency to each other of objects in application.
Every objects in application could individually unit testing with different mock implementation.
Loosely couple or it promotes decoupling to application.
Promotes re-usability of code or objects in different applications.
Promotes logical abstraction of components.

Frameworks for DI:
Spring (Java)
Google Guice (Java)
Dagger (Java and Android)

===============================================================


# SOFTWARE ARCHITECTURE:

* I assume that software architechture plays very vital role like an interface in java.

* Assume that software architechture is an interface interface is a blueprint for classes and abstract classes.
  
* it is a structuted defination for data and its operations like s/w arch.

* by using interface we can manage complete abstraction and it provides commmunication between different classes like components in s/w arch.
=================================================================

# HADOOP:

* Hadoop is an open source distributed processing framework that manages data processing and storage for big data applications in scalable clusters of computer servers.

* It's at the center of an ecosystem of big data technologies that are primarily used to support advanced analytics initiatives, including predictive analytics, data mining and machine learning. 

* Hadoop systems can handle various forms of structured and unstructured data, giving users more flexibility for collecting, processing, analyzing and managing data than relational databases and data warehouses provide.