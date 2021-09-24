package main.java.com.bsuir.beltyukov.classes.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private ArrayList<Ball> ballList;
	private double basketWeight;
	
	public Basket() {
		this.ballList = new ArrayList<Ball>();
	}
	
	public Basket(List<Ball> ballList) {
		this.ballList = new ArrayList<Ball>(ballList);
	}
	
	public ArrayList<Ball> getBallList() {
		return this.ballList;
	}
	
	public double getBasketWeight() {
		this.basketWeight = ballList.stream().mapToDouble(ball -> ball.getWeight()).sum();
		return this.basketWeight;
	}
	
	public void addBall(Ball ball) {
		this.ballList.add(ball);
	}
}
