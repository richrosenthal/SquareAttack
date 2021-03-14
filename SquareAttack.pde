//Author Richard Rosenthal
//Purpose: Generates random colored squares on a canvas. 
//Date 3-14-21 

 
 
 void setup(){
  size(800, 600);
}

void draw() {
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

void sketch(float xcord, float ycord){
   if (mousePressed) {
   fill(0);
 } else {
  fill(random(255), random(255), random(255));
 }
 rect(xcord, ycord, 80, 80);
}
