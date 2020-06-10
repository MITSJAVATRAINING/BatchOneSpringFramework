package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop {


//	@Autowired
//	public Laptop(@Qualifier("hitachiHardDrive") HardDrive hardDrive, @Qualifier("mediaTekProcessor") Processor processor) {
//		super();
//		this.hardDrive = hardDrive;
//		this.processor = processor;
//	}

	@Autowired
	@Qualifier("hitachiHardDrive")
	HardDrive hardDrive;

	@Autowired
	@Qualifier("mediaTekProcessor")
	Processor processor;

	public HardDrive getHardDrive() {
		return hardDrive;
	}

//	@Autowired
//	@Qualifier("hitachiHardDrive")
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
