package com.asus.shoppingcart;

import java.util.Scanner;

public class Dress extends Product implements IProduct {


	private String color;
	private int size;

	public Dress(String productName, String brand, String property, int stock, double rawPrice, int numberOfChosen,
			String color, int size) {
		super(productName, brand, property, stock, rawPrice, numberOfChosen);
		this.color = color;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public boolean buy(Scanner scan) {
		System.out.println("\n\nKac adet alacaginizi giriniz..");
		int numOfChosen = scan.nextInt();
		setNumberOfChosen(numOfChosen);

		return getStock() >= numOfChosen;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		System.out.println(getProductName() + " " + getBrand() + " " + getRawPrice() + "tl" + " ");

	}

}
