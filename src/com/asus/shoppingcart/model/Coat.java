package com.asus.shoppingcart.model;

import java.util.Scanner;

import com.asus.shoppingcart.model.utils.IProduct;

public class Coat extends Product implements IProduct {

	private String coatSize;

	public Coat(String productName, String brand, String property, int stock, double rawPrice, int numberOfChosen,
			String coatSize) {
		super(productName, brand, property, stock, rawPrice, numberOfChosen);
		this.coatSize = coatSize;

	}

	public String getCoatSize() {
		return coatSize;
	}

	public void setCoatSize(String coatSize) {
		this.coatSize = coatSize;
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
