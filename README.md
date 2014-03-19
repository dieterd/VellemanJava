VellemanJava
============

Java API to access Velleman Edu boards

This API relies heavily on the JNA API : https://github.com/twall/jna

To have this API to work: 

1. Download and install JNA from https://github.com/twall/jna
2. Create a jar from the EDUxx.DLL using the proper platform directory

    (go to directory where the EDUxx.DLL is located) , example for Win32-64 bit
    mkdir win32-x86-64
    
    copy EDU*.DLL win32-x86-64
    
    jar cvf EDU.jar win32-x86-64 
    
3. your classpath should be : jna.jar , jna-platform.jar and EDU.jar 
4. connect the EDU board and run the EDUxxDemo. eg.
    
    java -classpath jna.jar;jna-platform.jar;EDU.jar com.deramoudt.velleman.edu05.Edu05Demo
    
Warning : as the EDUxx.DLL is 32-bit, you should only use a 32 bit Java VM to run this, even on 64 bit Windows.




    