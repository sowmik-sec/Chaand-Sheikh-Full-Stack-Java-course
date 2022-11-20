package com.sowmik.composition.laptop;

import com.sowmik.composition.laptop.component.GraphicsCard;
import com.sowmik.composition.laptop.component.Processor;

public class Laptop {
	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicsCard graphicsCard;
	private String opticalDrive;
	private String keyboard;
	public Laptop() {
		super();
		this.screen = 14.1f;
		this.processor = new Processor();
		this.ram = "ddr4";
		this.hardDrive = "1 TB";
		this.graphicsCard = new GraphicsCard();
		this.opticalDrive = "Multi layer";
		this.keyboard = "backlit";
		
	}
	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}
	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}
	public Processor getProcessor() {
		return processor;
	}
	public float getScreen() {
		return screen;
	}
	public String getRam() {
		return ram;
	}
	public String getHardDrive() {
		return hardDrive;
	}
	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}
	public String getOpticalDrive() {
		return opticalDrive;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public String gamingMode() {
		processor.setFrequency(processor.getMaxFrequency());
		return "Success";
	}
}
