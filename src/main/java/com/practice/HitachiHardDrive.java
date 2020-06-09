package com.practice;

import org.springframework.stereotype.Component;

@Component
public class HitachiHardDrive implements HardDrive {

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
