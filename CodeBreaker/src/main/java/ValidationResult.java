package main.java;

public class ValidationResult {
	private int rightColors;
	private int rightColorsAtRightPlace;
	
	public ValidationResult(int rightColors, int rightColorsAtRightPlace) {
		setRightColors(rightColors);
		setRightColorsAtRightPlace(rightColorsAtRightPlace);
	}
	
	public int getRightColors() {
		return rightColors;
	}
	
	public void setRightColors(int rightColors) {
		this.rightColors = rightColors;
	}
	
	public int getRightColorsAtRightPlace() {
		return rightColorsAtRightPlace;
	}
	
	public void setRightColorsAtRightPlace(int rightColorsAtRightPlace) {
		this.rightColorsAtRightPlace = rightColorsAtRightPlace;
	}
}