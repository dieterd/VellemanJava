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

import com.sun.jna.Library;
import com.sun.jna.Native;


public interface Edu05Library extends Library {
        
        Edu05Library INSTANCE = (Edu05Library)
            Native.loadLibrary("EDU05D",Edu05Library.class);
        
        int OpenDevice() ;
        void CloseDevice() ;
        int Connected() ;
            
        void InOutMode(int IOMode) ;
        
        //Analog to Digital converter function
        int ReadAnalogChannel(int Channel) ;
        
        //PWM Output function
        void SetPWM(int Channel, int Data) ;//Sets the status the PWM output
        
        //Digital Output functions
        void OutputAllDigital(int Data) ;//Sets the digital outputs according to the data
        void ClearDigitalChannel(int Channel) ;//Clears the output channel
        void ClearAllDigital() ;//Clears all output channels
        void SetDigitalChannel(int Channel) ;//Sets the output channel
        void SetAllDigital(); //Sets all output channels
       
        //Digital Input functions
        int ReadAllDigital() ; // Reads the status of all the input channels
       
        //LCD functions
        void LCDInit(); //Initializes the LCD display module
        void LCDClear(); //Clears the text on the LCD display
        void  LCDWriteString(String Data, int Position); // 
    }
