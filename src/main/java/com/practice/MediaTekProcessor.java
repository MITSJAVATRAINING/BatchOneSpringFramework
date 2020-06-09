package com.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTekProcessor implements Processor {

	public void displayProcessor() {
		System.out.println("Hello World !! We are mediatek");
		
	}

}
