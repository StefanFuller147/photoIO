package pictureObj;

public class Pixel {
	//values
	private int alpha;
	private int red;
	private int green;
	private int blue;
	private int xCoordinate;
	private int yCoordinate;
	
	//gets and sets
	public int getAlpha() {
		return alpha;
	}
	public void setAlpha(int alpha) {
		this.alpha = alpha;
	}
	public int getRed() {
		return red;
	}
	public void setRed(int red) {
		this.red = red;
	}
	public int getGreen() {
		return green;
	}
	public void setGreen(int green) {
		this.green = green;
	}
	public int getBlue() {
		return blue;
	}
	public void setBlue(int blue) {
		this.blue = blue;
	}
	public int getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	//toString
	@Override
	public String toString() {
		return "Pixel [alpha=" + alpha + ", red=" + red + ", green=" + green + ", blue=" + blue + ", xCoordinate="
				+ xCoordinate + ", yCoordinate=" + yCoordinate + "]";
	}
	
	
	//cTor
	public Pixel(int alpha, int red, int green, int blue, int xCoordinate, int yCoordinate) {
		this.alpha = alpha;
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	//default no args cTor
	public Pixel(){
		
	}
	
	
	
	
	
}
