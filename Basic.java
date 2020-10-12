/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3cs4450;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.util.glu.GLU;

/**
 *
 * The basic method that is a addition to the tutorial on openGl. This class 
 * starts the drawing board for the shape
 */
public class Basic {
    
    
    //Initializes the GL libraru.
    public void initGL(DisplayMode displayMode) 
    {
        
	glClearColor(0.0f, 0.0f, 0.0f, 0.0f); //clears the color
	glMatrixMode(GL_PROJECTION); //projects the matrix
	glLoadIdentity(); //load
	GLU.gluPerspective(100.0f, (float)displayMode.getWidth()/(float) //sets the perspective for the window
	displayMode.getHeight(), 0.1f, 300.0f); //display dimension in float values
	glMatrixMode(GL_MODELVIEW);
	glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST);
    }

    //Creates the window
    public DisplayMode createWindow() throws Exception
    {
	Display.setFullscreen(false);
	DisplayMode d[] = Display.getAvailableDisplayModes();
        DisplayMode displayMode = null;
        //gives the size for the window 
	for (int i = 0; i < d.length; i++) 
        {
	    if (d[i].getWidth() == 640
		&& d[i].getHeight() == 480
		&& d[i].getBitsPerPixel() == 32) 
            {
		displayMode = d[i];
		break;
	    }
	}
        
	Display.setDisplayMode(displayMode);
	Display.setTitle("Final Project Checkpoint 1");
	Display.create();
        return displayMode;
    }
    
    public void startDrawing(){
               
        FPCameraController fp;
        DisplayMode displayMode = null;
        try {
            displayMode = createWindow();
            initGL(displayMode);
            fp = new FPCameraController(0f, 0f, 0f);
            fp.gameLoop();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
