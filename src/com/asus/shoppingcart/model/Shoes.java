package com.asus.shoppingcart.model;

import java.util.Scanner;

import com.asus.shoppingcart.model.utils.IProduct;

public class Shoes extends Product implements IProduct {

	private int shoeSize;

	public Shoes(String productName, String brand, String property, int stock, double rawPrice, int numberOfChosen,
			int shoeSize) {
		super(productName, brand, property, stock, rawPrice, numberOfChosen);

		this.shoeSize = shoeSize;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
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
