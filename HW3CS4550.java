/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3cs4550;
import java.io.IOException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

/***************************************************************
* file: HW3CS4550.java
* author: Robert Delfin, Greg Kalaydjian, Hari Kifle
* Team: Lobsters
* class: CS 4550 – Computer Graphics
*
* assignment: program 3 Final Program Check Point 1
* date last modified: 10/10/2020
*
* 
* purpose: Display a cube in 3D space witch each face colored differently as well as navigate through the 
* environment using w,a,s,d keys as dwell as space bar and left shift keys.
*
****************************************************************/ 
public class HW3CS4550 {

    /**
     * Is the main method that starts the program.Calls the textReader Class
     */
    public static void main(String[] args) throws IOException {
        Basic basic = new Basic();
        basic.start();
    }
    
}
