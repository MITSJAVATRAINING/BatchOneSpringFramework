package com.practice;

public class Laptop {


	HardDrive hardDrive;

	Processor processor;

	public HardDrive getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void display() {
		hardDrive.displayHardDriveName();
		processor.displayProcessor();
	}
}
