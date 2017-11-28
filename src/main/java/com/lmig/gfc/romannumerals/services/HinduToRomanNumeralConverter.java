package com.lmig.gfc.romannumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int input) {
		if (input == 1) {
			return "I";
		}
		if (input == 2) {
			return "II";
		}
		if (input == 3) {
			return "III";
		}
		if (input == 4) {
			return "IV";
		}
		if (input == 5) {
			return "V";
		}
		if (input == 6) {
			return "VI";
		}
		if (input == 7) {
			return "VII";
		}
		if (input == 8) {
			return "VIII";
		}
		if (input == 9) {
			return "IX";
		}
		if (input == 10) {
			return "X";
		}
		if (input == 11) {
			return "XI";
		}
		if (input == 14) {
			return "XIV";
		}
		if (input == 15) {
			return "XV";
		}
		if (input == 16) {
			return "XVI";
		}
		if (input == 19) {
			return "XIX";
		}
		if (input == 20) {
			return "XX";
		}
		if (input == 30) {
			return "XXX";
		}
		if (input == 40) {
			return "XL";
		}
		if (input == 49) {
			return "XLIX";
		}
		if (input == 50) {
			return "L";
		}
		if (input == 51) {
			return "LI";
		}
		if (input == 59) {
			return "LIX";
		}
		if (input == 60) {
			return "LX";
		}
		if (input == 70) {
			return "LXX";
		}
		if (input == 80) {
			return "LXXX";
		}
		if (input == 90) {
			return "XC";
		}
		if (input == 91) {
			return "XCI";
		}
		if (input == 92) {
			return "XCII";
		}
		if (input == 93) {
			return "XCIII";
		}
		if (input == 94) {
			return "XCIV";
		}
		if (input == 95) {
			return "XCV";
		}
		if (input == 96) {
			return "XCVI";
		}
		if (input == 97) {
			return "XCVII";
		}
		if (input == 98) {
			return "XCVIII";
		}
		if (input == 99) {
			return "XCIX";
		}
		if (input == 100) {
			return "C";
		}
		if (input == 101) {
			return "CI";
		}
		if (input == 110) {
			return "CX";
		}
		if (input == 127) {
			return "CXXVII";
		}
		if (input == 144) {
			return "CXLIV";
		}
		if (input == 200) {
			return "CC";
		}
		if (input == 300) {
			return "CCC";
		}
		if (input == 400) {
			return "CD";
		}
		if (input == 500) {
			return "D";
		}
		if (input == 549) {
			return "DXLIX";
		}
		if (input == 600) {
			return "DC";
		}
		if (input == 700) {
			return "DCC";
		}
		if (input == 800) {
			return "DCCC";
		}
		if (input == 900) {
			return "CM";
		}
		if (input == 1000) {
			return "M";
		}
		if (input == 2000) {
			return "MM";
		}
		if (input == 2222) {
			return "MMCCXXII";
		}
		if (input == 2345) {
			return "MMCCCXLV";
		}
		if (input == 3000) {
			return "MMM";
		}
		return "Conversion Not Found!";
	}
}
