package com.lmig.gfc.romannumerals.services;

public class HinduToRomanNumeralConverter {

	private String highRoman = "";

	public String convert(int input) {

		while (input != 0) {

			if (input >= 1000) {
				highRoman += "M";
				input -= 1000;
			} else if (input >= 900) {
				highRoman += "CM";
				input -= 900;
			} else if (input >= 500) {
				highRoman += "D";
				input -= 500;
			} else if (input >= 400) {
				highRoman += "CD";
				input -= 400;
			} else if (input >= 100) {
				highRoman += "C";
				input -= 100;
			} else if (input >= 90) {
				highRoman += "XC";
				input -= 90;
			} else if (input >= 50) {
				highRoman += "L";
				input -= 50;
			} else if (input >= 40) {
				highRoman += "XL";
				input -= 40;
			} else if (input >= 10) {
				highRoman += "X";
				input -= 10;
			} else if (input >= 9) {
				highRoman += "IX";
				input -= 9;
			} else if (input >= 5) {
				highRoman += "V";
				input -= 5;
			} else if (input >= 4) {
				highRoman += "IV";
				input -= 4;
			} else if (input >= 1) {
				highRoman += "I";
				input -= 1;
			}
		}
		return highRoman;
	}
}
