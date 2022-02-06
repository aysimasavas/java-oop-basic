package com.asus.shoppingcart;

import java.util.Scanner;

public class Product {


	private String productName;
	private String brand;
	private String property;
	private int stock;
	private double rawPrice;
	private int numberOfChosen;


	public Product(String productName, String brand, String property, int stock, double rawPrice, int numberOfChosen) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.property = property;
		this.stock = stock;
		this.rawPrice = rawPrice;
		this.numberOfChosen = numberOfChosen;
	}

	public int input(Scanner scan)
	{
		int option = -1;

		try {
			option = scan.nextInt();
		} catch (Exception e) {

		}
		finally {
			scan.close();
		}
		return option;

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getRawPrice() {
		return rawPrice;
	}

	public void setRawPrice(double rawPrice) {
		this.rawPrice = rawPrice;
	}

	public int getNumberOfChosen() {
		return numberOfChosen;
	}

	public void setNumberOfChosen(int numberOfChosen) {
		this.numberOfChosen = numberOfChosen;
	}



}
