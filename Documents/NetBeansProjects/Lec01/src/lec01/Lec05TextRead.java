/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec01;

import java.io.*;

public class Lec05TextRead {
  public static void main(String[] args) {
    int[] values = new int[5];
    try {
      BufferedReader in = new BufferedReader(new
        FileReader("in.txt")); //InputStreamReader(System.in));
      for (int i = 0; i < values.length; i++) {
        values[i] = Integer.parseInt(in.readLine());
      }
      in.close();
    }
    catch(IOException e) {
      System.out.println("Some error occurred!");
    }
  }
}

