package com.practice;

import org.springframework.stereotype.Component;

@Component
public class MediaTekProcessor implements Processor {

	public void displayProcessor() {
		System.out.println("Hello World !! We are mediatek");
		
	}

}
