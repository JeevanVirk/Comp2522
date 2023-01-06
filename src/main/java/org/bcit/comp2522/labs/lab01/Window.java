package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

/**
 * This program draws a figure using 2D primitives.
 */
public class Window extends PApplet {

  public void settings() {
    size(1000, 500);
  }

  /**
   * Drawing figure.
   */
  public void draw() {
    ellipse(mouseX, mouseY, 50, 50);
    circle(134, 184, 150);
    circle(350, 184, 150);
    line(210, 184, 275, 184);
    line(425, 164, 550, 94);
    line(144, 110, 275, 60);
  }

  public void mousePressed() {
    background(64);
  }

  /**
   * Runs the program.
   *
   * @param args unused.
   */
  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }
}
