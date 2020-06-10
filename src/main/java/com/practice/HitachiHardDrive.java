package com.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HitachiHardDrive implements HardDrive {

	@Value("512")
	int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void displayHardDriveName() {
		System.out.println("We are Hitachi harddrive of " + size);
	}

}
