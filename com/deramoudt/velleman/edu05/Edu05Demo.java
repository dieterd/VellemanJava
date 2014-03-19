/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
