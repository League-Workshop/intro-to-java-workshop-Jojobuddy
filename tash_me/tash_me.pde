PImage mustache;
PImage stickfigure;
void setup(){
  stickfigure = loadImage("stick figure.png");
  size(300,500);
  stickfigure.resize(300,500);
  mustache = loadImage("mustache.png");
}
  void draw(){
    background(stickfigure);
  }
  void draw(){
    