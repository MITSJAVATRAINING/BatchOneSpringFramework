package com.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SamsungHardDrive implements HardDrive{
	
	int size;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void displayHardDriveName() {
		System.out.println("We are Samsung hardrive of size " + size);
	}

}
