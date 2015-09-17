 Bacteria [] colonyOne;  

 void setup()   
 {     
 	background(255,255,255);
 	size(500,500);
 	colonyOne = new Bacteria[300];
 	for(int i = 0; i < colonyOne.length; i++)
 	{
 		colonyOne[i] = new Bacteria((int)(Math.random()*500),(int)(Math.random()*500));
 	}
 }   

 void draw()   
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
 	  void move()
 	  {
 	  	theX = theX + (int)(Math.random()*3)-1;
 	  	theY = theY + (int)(Math.random()*3)-1;
 	  }
 	  void show()
 	  {
 	  	noStroke();
 	  	fill(color1, color2, color3);
 	  	ellipse(theX, theY, theSize, theSize);
 	  }
 }    

 void mousePressed()
 {
 	background(255,255,255);
 	redraw();
 }