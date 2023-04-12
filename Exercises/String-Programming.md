
/* Write a Java program to reverse the string and print it (without using predefined function)
sample
input =String
output = gnirtS

*/
import java.util.*;
class Test
{
public static void main(String args[])
{
String src,des="";
Scanner s=new Scanner(System.in);
src=s.nextLine();
int n=src.length();
for(int i=n-1;i>=0;i--)
{
des=des+src.charAt(i);
}
System.out.println(des);

}
}

/* Write a Java program to find number of words in a sentence
input =
Hello World
output =
2

*/
import java.util.*;
class Count_Words_Sen
{
String str;
Scanner s;
int count = 1;
Count_Words_Sen()
{
s=new Scanner(System.in);
str=s.nextLine();
}
void printWordCount()
{
for (int i = 0; i < str.length() - 1; i++)
  {
   if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
   {
    count++;

   }
  }
  System.out.println(count);
}

}
class Test
{
 public static void main(String args[])
 {
  Count_Words_Sen c=new Count_Words_Sen();
  c.printWordCount();
  
 }
}

/*Write a Java program to find sum of numbers in string
sample
input =
kmit123$4#
output =
10

*/
import java.util.*;
class Sum_Num_Str
{
int sum;
String str;
Scanner s=new Scanner(System.in);
void input()
{
str=s.next();
}
int calculate()
{
sum=0;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)>48 && str.charAt(i)<58)
//System.out.println(str.charAt(i)-48);
//System.out.println('a');
sum=sum+(str.charAt(i)-48);
}
return sum;
}
}
class Test
{
public static void main(String args[])
{
Sum_Num_Str sns=new Sum_Num_Str();
sns.input();
int sum= sns.calculate();
System.out.println(sum);
}
}

/*Write a Java program to count number of spaces in the sentence
sample
input =
count number of spaces in sentence  
output =
5

*/
import java.util.*;
class Count_Spaces
{
String str;
int c=0;
Scanner s=new Scanner(System.in);
void count()
{
str=s.nextLine();
/*for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='')
c++;
}
System.out.println(c);*/
String str1[]=str.split("");
System.out.println(str1.length-1);
}
}
class Test
{
public static void main(String args[])
{
Count_Spaces cs=new Count_Spaces();
cs.count();
}
}

/*Write a Java program to count number of words which starts with an vowel and then
print the word along with its length
sample
input =sum of all numbers in a string
output =of 2
all 3
in 2
a 1
Total number of words starting with vowel is 4

*/
import java.util.*;
class CVWordsLen
{
String str;
Scanner s=new Scanner(System.in);
int count = 0;
void find()
{
str=s.nextLine();
int j=0;
String str1[]=str.split("");
for(int i=0;i<str1.length;i++)
{

if(str1[i].charAt(j)=='a'||str1[i].charAt(j)=='e'||str1[i].charAt(j)=='i'||str1[i].charAt(j)=='o'||str1[i].charAt(j)=='u')
{
System.out.println(str1[i]+""+str1[i].length());
count++;
}
}
System.out.println("Total number of words starting with vowel is "+ count);
}
}
class Test
{
public static void main(String args[])
{
CVWordsLen c=new CVWordsLen();
c.find();
}
}

/*Write a Java program to reverse each word in a sentence and print it
sample
input =
123 $abc hi  
output =
321 cba$ ih

*/

import java.util.*;
class ReverseEachWordSen
{
String str;
Scanner s=new Scanner(System.in);
int count = 0;
void find()
{
str=s.nextLine();
String words[]=str.split("");
String reverseString = "";

for (int i = 0; i < words.length; i++)
{
String word = words[i];

String reverseWord = "";

for (int j = word.length()-1; j >= 0; j--)
{
reverseWord = reverseWord + word.charAt(j);
}

reverseString = reverseString + reverseWord + "";
}
System.out.println(reverseString);
}
}
class Test
{
public static void main(String args[])
{
ReverseEachWordSen r=new ReverseEachWordSen();
r.find();
}
}

/* Write a java program to sort the strings in lexographical order
sample
input =
4
work hard dream big
output =
big dream hard work

*/
import java.util.*;
class LexographicalOrder
{
int n;
String temp,names[];
Scanner s = new Scanner(System.in);
void input()
{
n = s.nextInt();
names = new String[n];
for(int i = 0; i < n; i++)
{
names[i] = s.next();
}
}
void sort()
{
for (int i = 0; i < n; i++)
{
for (int j = i + 1; j < n; j++)
{
if (names[i].compareTo(names[j])>0)
{
temp = names[i];
names[i] = names[j];
names[j] = temp;
}
}
}
}
void print()
{
for (int i = 0; i < n; i++)
{
System.out.print(names[i]+"");
}
}
}
class Test
{
public static void main(String args[])
{
LexographicalOrder l=new LexographicalOrder();
l.input();
l.sort();
l.print();
}
}

/* Write a Java program to check whether the entered string contains unique characters
sample

1. input =abcd
output =unique

2. input =aabbc
output =not unique

*/
import java.util.*;
class Unique
{
String str;
int flag=0;
Scanner s;
Unique()
{
s=new Scanner(System.in);
str=s.nextLine();
}
void check()
{
char a[]=str.toCharArray();
for(int i=0;i<str.length();i++)
{
for(int j=i+1;j<str.length();j++)
{
if(a[i]==a[j])
{
flag=1;
}
}
}
if(flag==0)
{
System.out.println("unique");
}
else
{
System.out.println("not unique");
}

}
}
class Test
{
public static void main(String args[])
{
Unique obj=new Unique();
obj.check();
}
}

/* Write a Java program to remove all the digits and special characters from the input string and display it

sample

1. input =
&Remo73%v*e
output =
Remove
2. input =
dis&((Play))Alpha&b*ets
output =
disPlayAlphabets

*/

import java.util.*;

class RemDigSym
{

String src="";
String res="";
Scanner s;
RemDigSym()
{
s=new Scanner(System.in);
src=s.nextLine();
}
void process()
{
for (int i=0;i<src.length();i++)
{
if (src.charAt(i)>=65&&src.charAt(i)<=90 || src.charAt(i)>=97&&src.charAt(i)<=122)  
{
res+=src.charAt(i);
}
}
System.out.println(res);
}

}

public class Test
{
public static void main(String[] args)
{
RemDigSym r= new RemDigSym();
r.process();

}
}

/*Write a Java program to display the maximum occurring character
in a string

sample
input =
console
output =
o
*/
import java.util.*;
class MaxOccuranceChar
{
final int ASCII_SIZE = 256;
char getMaxOccuringChar(String str)
{
int count[] = new int[ASCII_SIZE];
int len = str.length();
for (int i=0; i<len; i++)
count[str.charAt(i)]++;

int max = -1;
char result = '';
for (int i = 0; i < len; i++)
{
if (count[str.charAt(i)]> max)
{
max = count[str.charAt(i)];
result = str.charAt(i);
}
}

return result;
}
}
class Test
{
public static void main(String[] args)
{
MaxOccuranceChar m=new MaxOccuranceChar();
Scanner s=new Scanner(System.in);
String str = s.next();
System.out.println(m.getMaxOccuringChar(str));
}
}

/*Write a Java program to swap first and last characters of a word in a sentence and print it
sample
input =
words1 1234 $
output =
1ordsw 4231 $
*/
import java.util.*;
class SwapFirstLastCharacters
{
String count(String str)
{
char[] ch = str.toCharArray();
for (int i = 0; i < ch.length; i++)
{
int k = i;
while (i < ch.length && ch[i] != '')
i++;
char temp = ch[k];
ch[k] = ch[i - 1];
ch[i - 1] = temp;
}
return new String(ch);
}

}
class Test
{
public static void main(String[] args)
{

SwapFirstLastCharacters s=new SwapFirstLastCharacters();
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println(s.count(str));
}
}

/* Write a Java program to check whether the entered string contains unique characters
sample

1. input =abcd
output =unique

2. input =aabbc
output =not unique

*/
import java.util.*;
class Unique
{
String str;
int flag=0;
Scanner s;
Unique()
{
s=new Scanner(System.in);
str=s.nextLine();
}
void check()
{
char a[]=str.toCharArray();
for(int i=0;i<str.length();i++)
{
for(int j=i+1;j<str.length();j++)
{
if(a[i]==a[j])
{
flag=1;
}
}
}
if(flag==0)
{
System.out.println("unique");
}
else
{
System.out.println("not unique");
}

}
}
class Test
{
public static void main(String args[])
{
Unique obj=new Unique();
obj.check();
}
}

/* Write a Java program to sort a string in alphabetical order
sample
input =
AlphabeticalOrder
output =
aaabcdeehilloprrt

*/
import java.util.*;
class SortString
{
 String sortString(String inputString)
 {
  String in =inputString.toLowerCase();
  char tempArray[] = in.toCharArray();
  Arrays.sort(tempArray);
  return new String(tempArray);
 }
}
class Test
{
 public static void main(String[] args)
 {
     Scanner s=new Scanner(System.in);
  SortString g=new SortString();
  String inputString = s.next();
  String outputString = g.sortString(inputString);
  System.out.println(outputString);
 }
}

/*Write a java program to find longest word in the sentence
sample
input =
welcome to keshav memorial institute of technology
output =
technology 10

*/
import java.util.*;
class LongestWord
{
String str,sarr[],longstr="";
Scanner s=new Scanner(System.in);
int max;
void find()
{
str=s.nextLine();
sarr=str.split("");
max=0;
for(int i=0;i<sarr.length;i++)
{
if(sarr[i].length()>max)
{
max=sarr[i].length();
longstr=sarr[i];
}
}
System.out.println(longstr+""+max);

/*
logic to sort words in ascending order of length
for(int i=0;i<sarr.length-1;i++)
{
for(int j=i+1;j<sarr.length;j++)
{
if(sarr[i].length()>sarr[j].length())
{
longstr=sarr[i];
sarr[i]=sarr[j];
sarr[j]=longstr;
}
}
}
for(int i=0;i<sarr.length;i++)
{
System.out.print(sarr[i]+"");
}
*/
}
}
class Test
{
public static void main(String[] args)
{
LongestWord l=new LongestWord();
l.find();
}
}

/*Write a java program to find a string from the sentence which has highest vowel count
and print the word along with its vowelcount
sample
input =keshav memorial institute of technology
output =memorial 4
*/
import java.util.*;
class HighestVowelCountWord
{
String str,sarr[],longstr="";
Scanner s=new Scanner(System.in);
int max;
void find()
{
str=s.nextLine();
sarr=str.split("");
max=0;
int vc;
for(int i=0;i<sarr.length;i++)
{
vc=0;
for(int j=0;j<sarr[i].length();j++)
{
if(sarr[i].charAt(j)=='a'||sarr[i].charAt(j)=='e'||sarr[i].charAt(j)=='i'||sarr[i].charAt(j)=='o'||sarr[i].charAt(j)=='u')
{
vc++;
}
}
if(vc>max)
{
max=vc;
longstr=sarr[i];

}
}
System.out.println(longstr+""+max);

}
}
class Test
{
public static void main(String[] args)
{
HighestVowelCountWord h=new HighestVowelCountWord();
h.find();
}
}

/*  Write a Java Program to remove vowels from an character array and print it
and also print the vowel along with its ascii value.

note:
if no consonants are present in array after removing vowels,
print -1

sample
input = 5
x
e
r
o
x
output =
e 101
o 111
x r x

*/
import java.util.*;
class RemVow
{
char ch[];
int n,count=0;
Scanner s=new Scanner(System.in);;
RemVow()
{
n=s.nextInt();
ch=new char[n];
}
void input()
{
for(int i=0;i<n;i++)
{
ch[i]=s.next().charAt(0);
}
}
void rem()
{
String str="";
for(int i=0;i<n;i++)
{
if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
{
System.out.println(ch[i]+""+(int)ch[i]);
count++;
}
else
{
str=str+ch[i];
}

}
if(count!=n)
{
char ch1[]=str.toCharArray();
for(int i=0;i<ch1.length;i++)
{
System.out.print(ch1[i]+"");
}
}
else
System.out.println("-1");
}
}
class Test
{
public static void main(String[] args)
 {
     RemVow r=new RemVow();
     r.input();
     r.rem();
 }
}

/*Write a Java program to find difference between sum of vowels and consonants in String
note:difference should be postive value
sample
input =
vowel
output=
v 118
o 111
w 119
e 101
l 108
Sum of Vowels= 212
Sum of Consonants= 345
133  
*/
import java.util.*;
class DiffSumVowCon
{
String str;
int vsum=0,csum=0,diff=0;
Scanner s=new Scanner(System.in);
void find()
{
str=s.next();
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
System.out.println(str.charAt(i)+""+(int)str.charAt(i));
vsum=vsum+str.charAt(i);
}
else
{
System.out.println(str.charAt(i)+""+(int)str.charAt(i));
csum=csum+str.charAt(i);
}
}
if(vsum>csum)
{
diff=vsum-csum;
}
else
{
diff=csum-vsum;
}
System.out.println("Sum of Vowels= "+vsum);
System.out.println("Sum of Consonants= "+csum);
System.out.println(diff);
}
}
class Test
{
public static void main(String args[])
{
DiffSumVowCon d=new DiffSumVowCon();
d.find();
}
}

/*
Write a java program to remove the duplicate characters from string and display it
sample
input =
characters
output =
acehrst
*/
import java.util.*;
class RemoveDuplicateChar
{

 String removeDupsSorted(String str)
 {
  int r= 1, i = 1;
  char arr[] = str.toCharArray();
  while (i != arr.length)
  {
   if(arr[i] != arr[i-1])
   {
    arr[r] = arr[i];
    r++;
   }
   i++;
  }
  str = new String(arr);
  return str.substring(0,r);
 }
 
 String removeDups(String str)
 {
 
 char temp[] = str.toCharArray();
 
 Arrays.sort(temp);
 str = new String(temp);
 return removeDupsSorted(str);
 }
 
 /*
  int carr[]=new int[26];
         String rstr="";
         for(int i=0;i<str.length();i++)
         {
             char c=str.charAt(i);
             carr[c-'a']++;
         }
         for(int i=0;i<26;i++)
         {
             if(carr[i]!=0)
             {
                 rstr=rstr+(char)('a'+i);
             }
         }
         return rstr;
   */
}
class Test
{
 public static void main(String[] args)
 {
     Scanner s=new Scanner(System.in);
     RemoveDuplicateChar rm=new RemoveDuplicateChar();
     String str=s.next();
  System.out.println(rm.removeDups(str));
 }
}

/*Write a Java program to find the frequency of occurance of each character in
  the string
  sample
  input =
  kmit
  output =
  i 1
  k 1
  m 1
  t 1
 */
import java.util.*;
class Count_Freq_Char
{
    String str;
    Scanner s=new Scanner(System.in);
    void input()
    {
        str=s.next();
    }
    void find()
    {
        int carr[]=new int[26];
     for(int i=0;i<str.length();i++)
     {
         char c=str.charAt(i);
         carr[c-'a']++;
     }
     for(int i=0;i<26;i++)
     {
         if(carr[i]!=0)
         {
            System.out.println((char)(i+'a')+" "+carr[i]);
         }
     }
    }
}
class Test
{
    public static void main(String args[])
    {
        Count_Freq_Char c=new Count_Freq_Char();
        c.input();
        c.find();
    }
}

/*Write a Java program to find and print first non-repeating character in the string
  sample:

  1. input =Exception
        output =First non-repeating character is E
  2. input =abC#abC#
        output =All characters in string are repeating
  3. input =divya
        output =First non-repeating character is d
  */
import java.util.*;
class First_NonRepeating_Char
{
    int no_chars = 256;
    char carr[] = new char[256];
    void getCharCountArray(String str)
    {
         for (int i = 0; i < str.length();  i++)
              carr[str.charAt(i)]++;
    }
    int firstNonRepeatingChar(String str)
    {
        int index = -1, i;
        for (i = 0; i < str.length();  i++)
        {
            if (carr[str.charAt(i)] == 1)
            {
                index = i;
                break;
            }
        }  
        return index;
    }
}
class Test
{
    public static void main (String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str = s.next();
        First_NonRepeating_Char f=new First_NonRepeating_Char();
        f.getCharCountArray(str);
        int index =  f.firstNonRepeatingChar(str);
        if(index == -1)
        {
            System.out.println("All characters in string are repeating");
        }
        else
        {
            System.out.println("First non-repeating character is " +  str.charAt(index));
        }

    }
}

/*Write a Java program to swap two strings without using third variable, then concatenate and print resultant string
  and also print the substring from the range of indices entered from it
  sample
  1.
  input = Good (//enter str1)
        Mrng (//enter str2)
        3    (//enter 1st index to extract substr)
        6    (//enter 2nd index to extract substr)  
  output=
        MrngGood (// resultant str)
        gGo     (//resultant substr)
    2.
    input = Good
            Mrng
            -1
            3
    output =
            MrngGood
            entered indices are behind/beyond range of size of string
     3.
    input = Good
            Mrng
            1
            10
    output =
            MrngGood
            entered indices are behind/beyond range of size of string

  */
import java.util.*;
class Swap2Strings
{
     Scanner sc = new Scanner(System.in);
     String s1,s2,res;
     int li,ui;
    void input()
    {
  s1 = sc.next();
     s2 = sc.next();
     li=sc.nextInt();
     ui=sc.nextInt();
    }
 void swap()
    {
  s1 = s1 + s2;
  s2 = s1.substring(0, s1.length()-s2.length());
  s1 = s1.substring(s2.length());
  res=s1+s2;
  System.out.println(res);
  int len=res.length();
  if(li>=0 && ui<=len)
  {
      System.out.println(res.substring(li,ui));
     
  }
  else
  {
      System.out.println("entered indices are behind/beyond range of size of string");
  }
    }
}
public class Test
{  
 public static void main(String[] args)
 {   
  Swap2Strings s=new Swap2Strings();
  s.input();
  s.swap();
 } 
}
------------
/*Write a java program to sort the strings in lexographical order
sample
//input
4
word hard dream big
//output
big dream hard work
*/
import java.util.Scanner;
class LOrder
{
    Scanner sc= new Scanner(System.in);
    int n;
    String temp,Sarr[];
    void read()
    {  
        n=sc.nextInt();
        Sarr=new String[n];
        for(int i=0;i<Sarr.length;i++)
        {
            Sarr[i]=sc.next();
        }
    }
    void fun()
    {
        for(int i=0;i<Sarr.length-1;i++)
        {
             for(int j=i+1;j<Sarr.length;j++)
             {
                 if(Sarr[i].compareTo(Sarr[j])>0)
                 {
                     temp=Sarr[i];
                     Sarr[i]=Sarr[j];
                    Sarr[j]= temp;
                 }
             }
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(Sarr[i]);
        }
    }
}
class Test
{
    public static void main(String args[])
    {
        LOrder l=new LOrder();
        l.read();
        l.fun();
    }

}
/*Write a java program to find longest word in a sentence
sample
input =welcome to kmit
output =welcome
*/

import java.util.Scanner;
class test
{
    Scanner sc=new Scanner(System.in);
    String str,Sarr[];
    int temp;
    void read()
    {
        str=sc.nextLine();
        Sarr=str.split(" ");
    }
    void fun()
    {
        int max=Sarr[0].length();

        for(int i=0;i<Sarr.length;i++)
        {
            if(Sarr[i].length()>max)
            {
                max=Sarr[i].length();
                temp=i;
            }
            
        }
        System.out.println(Sarr[temp]);
    }
}
class Test
{
    public static void main(String args[])
    {
        test t=new test();
        t.read();
        t.fun();
    }
}
// write a java program to read n strings from keyboard and then print the srings wch begins with the particular character

import java.util.Scanner;
class ReadString
{
 Scannersc=new Scanner(System.in);
 int n;
 String s[];
 char sval,eval;
 void read()
 {
  n=sc.nextInt();
  s=new String[n];
  for(int i=0;i<n;i++)
  {
   s[i]=sc.nextLine();
  }
  sval=sc.next();
  eval=sc.next();
 }
 void fun()
 {
  for(int j=0;j<n;j++)
  {
   if(s[j].startswith(&ch) && s[j].endswith(&ch))
   {
    
   }
  }
  
 }
}
class Strings
{
 public static void main(String args[])
 {
  ReadString s=new ReadString();
  s.read();
  s.fun();
 }
}
/*Write a java program to remove all the digits and special characters from the
   input string and display the output in the specified format
   sample
   input = &*re(9m)o^v6e
   output = remove
            total number of digits removed = 2
            total number of special characters removed = 5
*/
import java.util.*;
class Aravind
{
    Scanner sc = new Scanner(System.in);
    String str,s;
    void read()
    {
        str=sc.next();
      int count=0,dcount=0;
        for(int i=0;i<str.length();i++)
        {
            if( str.charAt(i)>=48 && str.charAt(i)<=57)
            {
                dcount++;
            }
            if(!((str.charAt(i)>=65 && str.charAt(i)<=90)||(str.charAt(i)>=97 &&str.charAt(i)<=122)||(str.charAt(i)>=48 && str.charAt(i)<=57)))
            {

                count++;
                
            }
           if((str.charAt(i)>=65 && str.charAt(i)<=90) ||(str.charAt(i)>=97 &&str.charAt(i)<=122))
                {
                System.out.print(str.charAt(i));
                
                }
            }
            
        
         System.out.println("\ntotal number of digits removed ="+dcount);
    
        System.out.println("total number of special characters removed = "+(count));
    }
}
class Test
{
    public static void main(String args[])
    {
        Aravind m = new Aravind();
        m.read();
    }
}

////////////
import java.util.*;
class test
{
 Scanner sc = new Scanner(System.in);
 String str;
 int flag=0,i,j;
 void read()
 {
  str=sc.next();
  
 }
 void display()
 {
 char s[]=str.toCharArray();
    for(i=0;i<s.length-1;i++)
     {
  for(j=i+1;j<s.length;j++)
  {
    if(s[i]==s[j])
    {
     flag=1;
   
    }   
  } 
  }
  if (flag==1)
  {
   System.out.println("not unique");
  }
  else
  {
   System.out.println("unique");
  }
}
}
class unique
{
 public static void main(String args[])
 {
  test t = new test();
  t.read();
  t.display();
 }
}
 
 //////////////////
 //read a secntence and try to print words stating with vowel along with its length
import java.util.*;
class test
{
 Scanner sc = new Scanner(System.in);
 String str;
 void read()
 {
      str=sc.nextLine();
 int count=0;
  String s[]= str.split(" ");

     for(int i=0;i<s.length;i++)
     {
     char ch=s[i].charAt(0);
  
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
          {
  
     System.out.println(s[i]+"-"+s[i].length());
     
    count++;
    }     
  
 
     }
  System.out.println("no of words ="+count);
 }
}
class Test
{
 public static void main(String args[])
 {
  test t = new test();
  t.read();
 }
}
 
 /*Write a java program to sort the strings in lexographical order
sample
//input
4
word hard dream big
//output
big dream hard work
*/
import java.util.Scanner;
class LOrder
{
    Scanner sc= new Scanner(System.in);
    int n;
    String temp,Sarr[];
    void read()
    {  
        n=sc.nextInt();
        Sarr=new String[n];
        for(int i=0;i<Sarr.length;i++)
        {
            Sarr[i]=sc.next();
        }
    }
    void fun()
    {
        for(int i=0;i<Sarr.length-1;i++)
        {
             for(int j=i+1;j<Sarr.length;j++)
             {
                 if(Sarr[i].compareTo(Sarr[j])>0)
                 {
                     temp=Sarr[i];
                     Sarr[i]=Sarr[j];
                    Sarr[j]= temp;
                 }
             }
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(Sarr[i]);
        }
    }
}
class Test
{
    public static void main(String args[])
    {
        LOrder l=new LOrder();
        l.read();
        l.fun();
    }

}
