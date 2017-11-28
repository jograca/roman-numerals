package com.lmig.gfc.romannumerals.services;

public class HinduToRomanNumeralConverter {

	private String highRoman = "";

	public String convert(int input) {

		while (input != 0) {

			if (input >= 1000) {
				highRoman += "M";
				input -= 1000;
			}
			if (input >= 900) {
				highRoman += "CM";
				input -= 900;
			}
			if (input >= 500) {
				highRoman += "D";
				input -= 500;
			}
			if (input >= 400) {
				highRoman += "CD";
				input -= 400;
			}
			if (input >= 100) {
				highRoman += "C";
				input -= 100;
			}
			if (input >= 90) {
				highRoman += "XC";
				input -= 90;
			}
			if (input >= 50) {
				highRoman += "L";
				input -= 50;
			}
			if (input >= 40) {
				highRoman += "XL";
				input -= 40;
			}
			if (input >= 10) {
				highRoman += "X";
				input -= 10;
				System.out.println("Hit the 10");
				System.out.println("Remaining input: " + input);
			}
			if (input >= 9) {
				highRoman += "IX";
				input -= 9;
				System.out.println("Hit the 9");
			}
			if (input >= 5) {
				highRoman += "V";
				input -= 5;
			}
			if (input >= 4) {
				highRoman += "IV";
				input -= 4;
			}
			if (input >= 1) {
				highRoman += "I";
				input -= 1;
				System.out.println("Hit the 1");

			}
		}
		return highRoman;
	}
}
