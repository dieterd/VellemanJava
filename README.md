VellemanJava
============

Java API to access Velleman Edu boards

To have this API to work: 

Step 1. Download and install JNA from https://github.com/twall/jna

Step 2. Create a jar from the EDUxx.DLL using the proper platform directory, go to directory where the EDUxx.DLL is located , example for Win32-64 bit
  
```
    mkdir win32-x86-64
      
    copy EDU*.DLL win32-x86-64
      
    jar cvf EDU.jar win32-x86-64 
```
  
Step 3. your classpath should be : jna.jar , jna-platform.jar and EDU.jar and current directory

Step 4. Compile the class for the demo and the library   

```
    javac -classpath .;jna.jar;jna-platform.jar;EDU.jar com\deramoudt\velleman\Edu05\*.java
```

Step 5. connect the EDU board and run the EDUxxDemo. eg.

```
    java -classpath .;jna.jar;jna-platform.jar;EDU.jar com.deramoudt.velleman.edu05.Edu05Demo
```
Warning : as the EDUxx.DLL is 32-bit, you should only use a 32 bit Java VM to run this, even on 64 bit Windows.




    
