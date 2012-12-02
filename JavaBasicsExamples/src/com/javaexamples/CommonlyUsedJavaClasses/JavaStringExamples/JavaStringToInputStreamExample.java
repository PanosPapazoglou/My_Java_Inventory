package com.javaexamples.CommonlyUsedJavaClasses.JavaStringExamples;

/*
Java String to InputStream Example.
This Java String to InputStream example shows how to convert Java String to InputStream.

// DES AYTH THN EIKONA..!!!
http://docs.oracle.com/javase/tutorial/i18n/text/stream.html
  FileInputStream fis = new FileInputStream("test.txt");
  InputStreamReader isr = new InputStreamReader(fis, "UTF8");
*/

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class JavaStringToInputStreamExample {
public static void main(String args[]){
       
        String str1 = "Java convert String to InputStream Example";
       
        //convert string to bytes first using getBytes method of String class.
        byte[] bytes = str1.getBytes();
       
        /*
         * To convert Java String to InputStream, use
         * ByteArrayInputStream class.
         */
       
        InputStream inputStream = new ByteArrayInputStream(bytes);
        
}
}