package com;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {

		try {
			GUI window = new GUI();
			window.start();
			window.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
