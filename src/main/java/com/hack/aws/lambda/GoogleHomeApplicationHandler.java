/**
 * 
 */
package com.hack.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * @author kkanaparthi
 *
 */
public class GoogleHomeApplicationHandler implements RequestHandler<String, String> {
	
	  public String handleRequest(String input, Context context) {
	        context.getLogger().log("Input: " + input);
	        return "This is the Response for the request from Google Home - " + input;
	    }
}
