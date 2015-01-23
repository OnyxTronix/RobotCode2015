package org.usfirst.frc2231.utils;

public enum Direction {
	LEFT (-1.0), 
	RIGHT (1.0);
	
	public double value;
	private Direction(double value) {
		this.value = value;
	}
};
	