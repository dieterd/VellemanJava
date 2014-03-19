package com.deramoudt.velleman.edu05;

public class Edu05Demo {
    public Edu05Demo() {
        super();
    }

   
    public static void main(String[] args) {
        
        Edu05Library.INSTANCE.OpenDevice() ;
        
        Edu05Library.INSTANCE.LCDClear();
        Edu05Library.INSTANCE.LCDWriteString("Dieter Likes Java", 0);
        
        for ( int i = 1 ; i < 6 ; i++) {
            int read = Edu05Library.INSTANCE.ReadAnalogChannel(i) ;
            System.out.println(" Channel "+i+" : "+read) ;
        }
        
        int temp1 = Edu05Library.INSTANCE.ReadAnalogChannel(3) ;
        double temp2 = (temp1 / 10 ) ;
        System.out.println("Temperature : "+ temp2 ) ;
      
        // knightrider 
        int ch = 0 ;
        int pr = - 1 ;
        Edu05Library.INSTANCE.ClearAllDigital();
        while (true) {
            ch = ch + 1  ;
            pr = pr + 1 ;
            if (ch == 9) {  ch = 1; } ;
            if (pr == 9) {  pr = 1 ; } ;
            Edu05Library.INSTANCE.SetDigitalChannel(ch) ;
            Edu05Library.INSTANCE.ClearDigitalChannel(pr) ;
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
      
    }
}
