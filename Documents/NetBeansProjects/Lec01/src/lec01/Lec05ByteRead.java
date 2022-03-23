/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec01;

import java.io.*;

public class Lec05ByteRead {
  public static void main(String[] args) {
    int[] values = new int[5];
    try {
      DataInputStream in = new DataInputStream(new 
        FileInputStream("out.bin"));
      for (int i = 0; i < values.length; i++) {
        values[i] = in.readInt();
      }
      in.close();
    }
    catch(IOException e) {
      System.out.println("Some error occurred!");
    }
  }
}

