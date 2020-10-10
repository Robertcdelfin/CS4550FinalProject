/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3cs4550;



import java.io.File;
import java.io.FileNotFoundException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;
import org.lwjgl.input.Keyboard;

/**
 *
 * The basic method that is a addition to the tutorial on openGl. This class 
 * opens the file reader for openGL and reads the file input.
 */
public class Basic{
    
    //public  String inputFileName = null;
    
    //Creates the window
    private void createWindow() throws Exception{
        Display.setFullscreen(false);
        Display.setDisplayMode(new DisplayMode(640,480));
        Display.setTitle("Final Project CS4550");
        Display.create();
    }
    
    //intializes the GL library
    private void initGL(){
        glClearColor(0.0f,0.0f,0.0f, 0.0f);
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0,640,0,480,1,-1);
        glMatrixMode(GL_MODELVIEW);
        glHint(GL_PERSPECTIVE_CORRECTION_HINT,GL_NICEST);
        
    }
    
    //The render is the window that holds the display window
    private void render(){
            
        while(!Display.isCloseRequested()&&!Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)){
            draw();
            
        }
         
        Display.destroy();
    }
    
     
    //Method draw sets the identity and calls the data.
    public void draw(){
  
        
            try{
                glClear(GL_COLOR_BUFFER_BIT);
                glLoadIdentity();
                glPointSize(10);
                glColor3f(0.5f,0.6f,0.7f);
                glPushMatrix();        
           
                glBegin(GL_POLYGON);   
                glVertex2f(-350,-350);
                glVertex2f(-350,350);
                glVertex2f(350,350);
                glVertex2f(350,-350);
                glEnd();
                glPopMatrix();
                Display.update();
                Display.sync(60);
                
            }catch(Exception e){
           }
    }
    
    //starts the program
    public void start(){
        
        try{
           createWindow(); 
           initGL();
           //System.out.println("Start method in basic");
            //createWindow();
            render();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

