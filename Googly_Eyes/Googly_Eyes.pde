void setup(){
  size(1000,1000);
}
void draw(){
  background(255,0,0);
  fill(0,0,255);
  ellipse(200,500,200,200);
  ellipse(500,500,200,200);
  fill(0,255,0);
  if (mouseX>250){
    ellipse(250,mouseY,100,100);
    ellipse(250 + 300,mouseY,100,100);
  }
  else if (mouseX<150){
    ellipse(150,mouseY,100,100);
    ellipse(150 + 300,mouseY,100,100);
  }
  else if (mouseY<350){
    ellipse(mouseX,350,100,100);
    ellipse(mouseX+300,350,100,100);
  }
  else{
    ellipse(mouseX,mouseY,100,100);
    ellipse(mouseX + 300,mouseY,100,100);
  }
}