package com.ashokit;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdUtils {

	public String pwdencode(String pwd) {
		
		Encoder encoder =  Base64.getEncoder();
		
		    byte[] encode = encoder.encode(pwd.getBytes());
		    
		    String encodepwd = new String(encode);
		    
		    return encodepwd;
	}
}
