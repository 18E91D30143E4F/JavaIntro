package main.java.com.bsuir.beltyukov.classes.basket;

public class Ball {
	private double weight;
	private String color;
	
	public Ball(double weight, String color) {
		this.weight = weight;
		this.color = color;
	}
	
    public double getWeight() {
        return this.weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
    	return String.format("�����: %f, ����: %s", this.weight, this.color);
    }
}
