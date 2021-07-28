/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.activity2;

import java.text.DecimalFormat;

/**
 *
 * @author Benzee
 */
public class T20Match extends Match{
  int targetLeft;
  float overLeft;
  float calculateRunRate ()
  {
    targetLeft = getTarget () - getScore ();
    overLeft = 20 - getOver ();

    return targetLeft / overLeft;
  }
  int calculateBalls ()
  {
    return (int) overLeft *6;
  }
  void display (double reqRunRate, int balls)
  {
      DecimalFormat df = new DecimalFormat ("###.#");
    System.out.println ("Requirements:");
    System.out.println ("Need " + targetLeft + " runs in " + balls+" balls");
    System.out.println ("Required Runrate: " + df.format (reqRunRate));
  }   
}
