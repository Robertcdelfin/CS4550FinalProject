/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3cs4550;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.Sys;

/**
 *PUrpose: The class FP CameraControl is the first person controller
 */
public class FPCameraController {
    
    //2d vector to store camer psoition
    private Vector3f position = null;
    private Vector3f positionI = null;
          
    //rotation around Y axis of camer
    private float yaw = 0.0f;
    //roation around X axis of the camera
    private float pitch = 0.0f;
    private Vector3Float me;
    
    //The instatiation of positon and xyz
    public FPCameraController(float x, float y, float z){
        //instatinte position Vector 3f to the xyz 
        position = new Vector3f(x,y,z);
        positionI = new Vector3f(x,y,z);
        positionI.x = 0f;
        positionI.y = 15f;
        positionI.z = 0f;
    }
    //increment the camera's current yaw rotation
    public void yaw(float amount){
        yaw += amount;
    }
    
    //increment the camera's current yaw rotaiton.
    public void pitch(float amount){
        //increment the pitch  by the amount param
        pitch -=amount;
    }
    //moves the cmaer forward relative to current rotaiton
    public void walkForward(float distance){
        float xOffset = distance*(float)Math.sin(Math.toRadians(yaw));
        float zOffset = distance*(float)Math.cos(Math.toRadians(yaw));
        position.x -= xOffset;
        position.z += zOffset;
    }
    public void walkBackwards(float distance){
        float xOffset = distance*(float)Math.sin(Math.toRadians(yaw));
        float zOffset = distance*(float)Math.cos(Math.toRadians(yaw));
        position.x += xOffset;
        position.z -= zOffset;
    }
    public void strafeLeft(float distance){
        float xOffset = distance*(float)Math.sin(Math.toRadians(yaw-90));
        float zOffset = distance*(float)Math.cos(Math.toRadians(yaw-90));
        position.x -= xOffset;
        position.z += zOffset;
    }
    public void strafeRight(float distance){
        float xOffset = distance*(float)Math.sin(Math.toRadians(yaw+90));
        float zOffset = distance* (float)Math.cos(Math.toRadians(yaw+90));
        position.x -= xOffset;
        position.z += zOffset; 
    }
    
}
