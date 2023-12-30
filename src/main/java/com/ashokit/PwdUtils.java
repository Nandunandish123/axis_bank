package com.ashokit;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdUtils {


          public String message(){

              return "hello";

              }


	public String pwdencode(String pwd) {
		
		Encoder encoder =  Base64.getEncoder();
		
		    byte[] encode = encoder.encode(pwd.getBytes());
		    
		    String encodepwd = new String(encode);
		    
		    return encodepwd;
	}

     // task 101
      public void m1(){

     system.out.printl("hello welcome to java coding);

        }
}
