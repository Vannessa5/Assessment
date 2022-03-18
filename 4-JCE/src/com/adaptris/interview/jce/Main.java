/*
 *
 */
package com.adaptris.interview.jce;
import java.io.File;

public class Main {

  private static final String EXPECTED_OUTPUT = "Hm41alUwoB3UCnlWajOem2gOKKEoy4IucUExcrDgBGwogbM6gI1ciI/1FfC00nEb";
  public static void main(String[] argv)  throws Exception {
    Encryptor p = new EncryptorImp();
    String charsetEncoding = "UTF-8";
    byte[] encryptedBytes = p.encrypt("The quick brown fox jumps over the lazy dog", charsetEncoding, "password".toCharArray());
    String base64String = p.convertToBase64(encryptedBytes);
    if (!base64String.equals(EXPECTED_OUTPUT)) {
      throw new Exception("Output is not similar");
    }
  }
}