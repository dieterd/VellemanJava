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

    Edu05Library INSTANCE = (Edu05Library) Native.loadLibrary("EDU05D", Edu05Library.class);

    /**
     *
     * @return int status of opened device
     */
    int OpenDevice();

    /**
     * closes device connectivity from the PC.
     */
    void CloseDevice();

    /**
     * @return int status of connectivity
     */
    int Connected();


    /**
     * @param IOMode
     */
    void InOutMode(int IOMode);

    /**
     * Analog to Digital converter function
     * @param Channel 1-5
     * @return
     */
    int ReadAnalogChannel(int Channel);

    /**
     * Sets the status the PWM output.
     * @param Channel
     * @param Data
     */
    void SetPWM(int Channel, int Data); 

    /**
     * Digital Output functions.
     *
     * Sets the digital outputs according to the data.
     * @param Data
     */
    void OutputAllDigital(int Data); 

    /**
     * Clears the output channel
     * @param Channel 1 to 8
     */
    void ClearDigitalChannel(int Channel); 
    
    /**
     * Clears all output channels
     */
    void ClearAllDigital();

    /**
     * @param Channel 1 to 8
     */
    void SetDigitalChannel(int Channel); 

    /**
     * Sets all output channels.
     */

    void SetAllDigital(); 

    /**
     * Digital Input functions
     * 
     * Reads the status of all the input channels
     * @return
     */
    int ReadAllDigital();

    /**
     * LCD Functions
     * Initializes the LCD display module
     */
    void LCDInit(); 
    
    /**
     * Clears the text on the LCD display
     */
    void LCDClear(); 

    /**
     * @param Data String to be displayed on the LCD 
     * @param Position where to set first character, starting from the left.
     */
    void LCDWriteString(String Data, int Position);
}
