void setup(){
  size(1000,1000);
}
void draw(){
  background(255,0,0);
  fill(0,0,255);
  ellipse(200,500,200,200);
  ellipse(500,500,200,200);
  fill(0,255,0);
  int x = mouseX;
  int y = mouseY;
  if (mouseX>250){
  x = 250;
  }
  else if (mouseX<150){
  x = 150;
  }
  if (mouseY<450){
  y = 450;
  }
  else if (mouseY>550){
  y = 550;
  }
    ellipse(x,y,100,100);
    ellipse(x + 300,y,100,100);
}