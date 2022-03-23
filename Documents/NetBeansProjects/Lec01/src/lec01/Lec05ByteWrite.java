/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec01;

import java.io.*;

public class Lec05ByteWrite {
  public static void main(String[] args) {
    int[] values = {1, 2, 3, 4, 5};
    try {
      DataOutputStream out = new DataOutputStream(new FileOutputStream("out.bin"));
      for (int i = 0; i < values.length; i++) {
        out.writeInt(values[i]);
      }
      out.close();
    }
    catch(IOException e) {
      System.out.println("Some error occurred!");
    }
  }
}