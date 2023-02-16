package edu.canisius.csc.lsp;

import java.io.*;
import java.util.ArrayList;

/** Exercise 3 - kindly generated by ChatGPT! **/

public class ArrayListSerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        String filename = "list.ser";
        FileOutputStream fileOut = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(list);
        out.close();
        fileOut.close();

        FileInputStream fileIn = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        ArrayList<String> newList = (ArrayList<String>) in.readObject();
        in.close();
        fileIn.close();

        System.out.println("Contents of list read from file:");
        for (String s : newList) {
            System.out.println(s);
        }
    }
}
