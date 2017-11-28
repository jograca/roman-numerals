package com.lmig.gfc.romannumerals.services;

public class HinduToRomanNumeralConverter {

	private String highRoman = "";

	public String convert(int input) {

		while (input != 0) {

			if (input >= 1000) {
				highRoman += "M";
				input -= 1000;
				continue;
			}
			if (input >= 900) {
				highRoman += "CM";
				input -= 900;
				continue;
			}
			if (input >= 500) {
				highRoman += "D";
				input -= 500;
				continue;
			}
			if (input >= 400) {
				highRoman += "CD";
				input -= 400;
				continue;
			}
			if (input >= 100) {
				highRoman += "C";
				input -= 100;
				continue;
			}
			if (input >= 90) {
				highRoman += "XC";
				input -= 90;
				continue;
			}
			if (input >= 50) {
				highRoman += "L";
				input -= 50;
				continue;
			}
			if (input >= 40) {
				highRoman += "XL";
				input -= 40;
				continue;
			}
			if (input >= 10) {
				highRoman += "X";
				input -= 10;
				continue;
			}
			if (input >= 9) {
				highRoman += "IX";
				input -= 9;
				continue;
			}
			if (input >= 5) {
				highRoman += "V";
				input -= 5;
				continue;
			}
			if (input >= 4) {
				highRoman += "IV";
				input -= 4;
				continue;
			}
			if (input >= 1) {
				highRoman += "I";
				input -= 1;
				continue;
			}
		}
		return highRoman;
	}
}
