package com.demo;

import java.awt.*;

interface Drawable{
    void draw();
}
class Rectangle implements Drawable {
    public void draw(){System.out.println("Drawing rectangle");}
}
class Circle implements Drawable{
    public void draw(){System.out.println("drawing circle");}
}
class polydemo{
    public static void main(String args[]){
        Drawable d=new Circle();
        d.draw();
        Drawable d1=new Rectangle();
        d1.draw();
    }
}
