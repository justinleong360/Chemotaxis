import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 Bacteria [] colonyOne;  

 public void setup()   
 {     
 	background(255,255,255);
 	size(500,500);
 	colonyOne = new Bacteria[300];
 	for(int i = 0; i < colonyOne.length; i++)
 	{
 		colonyOne[i] = new Bacteria((int)(Math.random()*500),(int)(Math.random()*500));
 	}
 }   

 public void draw()   
 {    
 	for(int i = 0; i < colonyOne.length; i++)
 	{
 	colonyOne[i].move();
 	colonyOne[i].show();
 	}   
 }  

 class Bacteria    
 {     
 	  int theX, theY, color1, color2, color3, theSize; 
 	  Bacteria(int x, int y)
 	  {
 	  	theX = x;
 	  	theY = y;
 	  	color1 = (int)(Math.random()*254)+1;
 	  	color2 = (int)(Math.random()*254)+1;
 	  	color3 = (int)(Math.random()*254)+1;
 	  	theSize = (int)(Math.random()*10)+10;
 	  }
 	  public void move()
 	  {
 	  	theX = theX + (int)(Math.random()*3)-1;
 	  	theY = theY + (int)(Math.random()*3)-1;
 	  }
 	  public void show()
 	  {
 	  	noStroke();
 	  	fill(color1, color2, color3);
 	  	ellipse(theX, theY, theSize, theSize);
 	  }
 }    

 public void mousePressed()
 {
 	background(255,255,255);
 	redraw();
 }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
