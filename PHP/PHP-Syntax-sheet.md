PHP CODING FORMATS

# EX PHP CODE:
 <?PHP
 ECHO" HELLO ARAVIND";
 ?>
# PHP IS CASE SENSITIVE:
 $x="HELLO";
 ECHO "$X"; IS DIFFERENT THAN ECHO "$x";

# COMMENTS:
 SINGLE LINE--->  //HELLO
 DOUBLE LINE--->  /*HII
         HELLO
      */
# VARIABLE:
 VARIABLE IS A CONTAINER OR MEMORY OR STORAGE UNIT.
 IN WCH VALUES OR DATA IS STORED
    VARIABLE SCOPE:
     1.GLOBAL=DECLARED OUTSIDE OF FUNCTION.
     2.LOCAL=DECLARED INSIDE OF FUNCTION.
     3.STATIC=WN A FUN EXECUTED ALL OF ITS LOCAL VARIABLES ARE DELETED.
       BY USING STATIC KEYWORD LOCAL VARIABLES ARE NOT DELATED.
     4.FUN PARAMETER VARIABLE:DECLARED INSIDE FUN PARAMETER.

     #VARIABLE TYPE CASTING:
  Type casting is converting a ONE DATA TYPE variable or value into a desired DATATYPE.
  This is very useful when performing arithmetic computations.
  Type casting in PHP is done by the interpreter.
  <?php
  $a = 1;
  $b = 1.5;
  $c = $a + $b;
  $c = $a + (int) $b;
  echo $c;
  ?>

# PHP HAS 8 DATA TYPES:
 1.INT    $INT=6;
 2.DOUBLE $DOUB=10.90;
 3.NULL  $X=NULL;
 4.BOOLEAN $BOL=FALSE;
 5.STRINGS $STR="HELLO KMIT";

  STRING FUNCTIONS:
   EX:$STRING="HELLO KMIT";
   STRREV("$STRING");
   STR_WORD_COUNT("$STRING");
   STRPOS("$STRING","K");
   STRLEN("$STRING");
   STR_REPLACE("KMIT","WORLD","$STRING");

  STRING OPERATORS:
  . -->CONCATINATION.
  .= -->CONCATINATION ASSINMENT.

 6.OBJECTS: BLUEPRINT OF CLASS
 7.ARRAYS:COLLECTION OF SAME DATAYPE
 8.RESOURECES: USED IN DATABASE CONNECTION

# PHP OPERATORES:
 1.ARITHMATIC(USED TO PERFORM ARITHMATIC OPERATIONS ON NUMARIC DATA)
  1+1 =2;
  2-1 =1;
  1*2 =3;
  3/2 =1;
  2%2 =0;
  -(-3)=3;
  2.2= 22;
 2.LOGICAL(USED TO COMPARE CONDITIONS OR VALUES &EVALUATES TRUE OR FALSE)
  X&&Y
  !=Y
  X||Y
  X^Y
  PHP CONDITION STATEMENTS
   IF
   executes some code if one condition is true
   IF...ELSEIF....ELSE
   executes different codes for more than two conditions
   SWITCH
   selects one of many blocks of code to be executed

 3.ASSIGNMENT(USED TO ASIGN VALUE TO VARIABLE)
   X=10
  X+=2
  X-=2
  X*=2
  X/=2
  X%=2
  X.=2
 4.COMPARISION(USED TO COMPARE VALUES OR VARIABLES)
  X==Y
  X>Y
  X>=Y
  X<=Y

# CONSTANTS

A constant is an identifier (name) for a simple value. The value cannot be changed during the script.
IT CAN ACCESED IN ANYWARE IN SCRIPT COZ ITS GLOBAL.
To create a constant, use the define() function.
SYNTAX: define(name, value, case-insensitive)
<?php
define("GREETING", "Welcome to W3Schools.com!", true);
echo greeting;
?>

# FUNCTIONS
A function is a block of statements that can be used repeatedly in a program.
A function will not execute immediately when a page loads.
A function will be executed by a call to the function.
 RAND()
 SRAND()
