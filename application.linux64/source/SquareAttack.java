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

public class SquareAttack extends PApplet {

//Author Richard Rosenthal
//Purpose: Generates random colored squares on a canvas. 
//Date 3-14-21 

 
 
 public void setup(){
  
}

public void draw() {
    //Not sure how this creates an infinite loop but it does...now it's a feature
    for(int i = 0; i<1; i++){
    float randomNumX = random(800); //seed a random x location
    float randomNumY = random(800); //seed a random y location
    float x = randomNumX; 
    float y = randomNumY;
    sketch(x, y);
    x++;
    y++;
    delay(50); //slow down the loop
    }
  }

public void sketch(float xcord, float ycord){
   if (mousePressed) {
   fill(0);
 } else {
  fill(random(255), random(255), random(255));
 }
 rect(xcord, ycord, 80, 80);
}
  public void settings() {  size(800, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "SquareAttack" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
