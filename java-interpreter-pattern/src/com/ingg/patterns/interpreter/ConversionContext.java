package com.ingg.patterns.interpreter;

public class ConversionContext {

	private String conversionQues = "";
	
	private String conversionResponse = "";
	
	private String fromConversion = "";
	
	private String toConversion = "";
	
	String[] partsOfQues;
	
	Double quantity;
	

	public ConversionContext(String input) {		
		conversionQues = input;
		partsOfQues = getInput().split(" ");
		fromConversion = getCapitalized(partsOfQues[1]);
		toConversion = getLowerCase(partsOfQues[3]);
		quantity = Double.valueOf(partsOfQues[0]);
		
		conversionResponse = partsOfQues[0] + " " + partsOfQues[1] + " equals ";
	}


	public String getLowerCase(String string) {
		return string.toLowerCase();
	}
	
	public String getFromConversion() {
		return fromConversion;
	}	
	
	public String getToConversion() {
		return toConversion;
	}	

	public Double getQuantity() {
		return quantity;
	}


	private String getCapitalized(String wordToCapitalize) {
		wordToCapitalize = wordToCapitalize.toLowerCase();
		wordToCapitalize = Character.toUpperCase(wordToCapitalize.charAt(0)) + wordToCapitalize.substring(1);		
		int lengthOfword = wordToCapitalize.length();
		
		if(wordToCapitalize.charAt(lengthOfword - 1) != 's') {
			wordToCapitalize = new StringBuffer(wordToCapitalize).insert(lengthOfword, "s").toString();						
		}		
		return wordToCapitalize;		
	}

	private String getInput() {
		return conversionQues;
	}


	public String getResponse() {
		// TODO Auto-generated method stub
		return conversionResponse;
	}
	
}
