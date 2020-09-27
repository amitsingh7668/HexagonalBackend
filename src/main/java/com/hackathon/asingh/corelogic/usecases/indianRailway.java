package com.hackathon.asingh.corelogic.usecases;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class indianRailway {

	
	public void handle () {
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
			.url("https://indianrailways.p.rapidapi.com/index.php?pnr=1234567890")
			.get()
			.addHeader("x-rapidapi-host", "indianrailways.p.rapidapi.com")
			.addHeader("x-rapidapi-key", "SIGN-UP-FOR-KEY")
			.build();
		

		try {
			Response response = client.newCall(request).execute();
			System.out.println("what i got is "+response.code());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		indianRailway i = new indianRailway();
		i.handle();
	}
}
