/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec01;

import java.io.*;

public class Lec05TextWrite {
  public static void main(String[] args) {
    int[] values = {1, 2, 3, 4, 5};
    try {
      PrintWriter out = new PrintWriter(new 
        BufferedWriter(new FileWriter("out.txt")));
      for (int i = 0; i < values.length; i++) {
        out.println(values[i]);
      }
      out.close();
    }
    catch(IOException e) {
      System.out.println("Some error occurred!");
    }
  }
}


