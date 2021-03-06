package model;

import java.util.ArrayList;
import java.util.Map;

/**
 * Model for the Animator. One instance of AnimatorModel is one animation. Each animation has a
 * hashmap? of shapes that will be drawn, move and change color as determined by user input.
 */
public interface AnimatorModel {

  /**
   * Gets the state of the model and outputs each queued action as a sentence. If the shape2
   * specified in the action does not exist, it gets skipped. If it does exist, it outputs the time
   * frame where the action will take place, then whether the position, size and color change.
   */
  String getState();

  /**
   * Gets width of screen.
   */
  int getWidth();

  /**
   * Gets the state of a shape at a given tick.
   *
   * @param t the time to get the state of the animation
   */
  ArrayList<Keyframe> interpolate(double t);

  /**
   * Gets height of screen.
   */
  int getHeight();

  /**
   * Gets the largest tick in the animation.
   *
   * @return the int representing the largest tick
   */
  double getLargestTick();

  /**
   * Gets the left most x value.
   *
   * @return left most y value
   */
  int getLeftX();

  /**
   * Gets the top most y value.
   *
   * @return top most y value
   */
  int getTopY();

  /**
   * Returns the shape with the given name.
   *
   * @param s of the shape to be returned
   * @return the shape with the given name
   */
  String getShape(String s);

  ArrayList<Keyframe> getKeyframes();

  /**
   * Gets the entire map of shapes.
   *
   * @return the map of strings.
   */
  Map<String, String> getAllShapes();

  /**
   * Get the size of the hashmap of shapes.
   *
   * @return the size of the hashmap as an int
   */
  int numOfShapes();
}

