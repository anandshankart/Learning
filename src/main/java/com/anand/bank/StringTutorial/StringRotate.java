package com.anand.bank.StringTutorial;

public class StringRotate {

	
	// Statement : Given a string rotate rotate by a given index.
	public static void main(String[] args) {
		StringRotate st = new StringRotate("testing ", 9);
		long time1 = System.currentTimeMillis();
		System.out.println(st.rotateLogic1());
		long time2 = System.currentTimeMillis();
		System.out.println("Time Taken : "+(time2-time1));

	}
	private String inputString;
	private int index;

	public boolean validateString(){
		if(inputString.length() ==0 || index ==0||inputString.length()<index)
			return false;
		else 
			return true;
	}
	
	public StringRotate(String inputString, int index){
		initialize(inputString, index);
	}
	
	public void initialize(String inputString, int number){
		this.inputString = inputString;
		this.index = number;
	}
	
	public String rotateLogic1(){
		if(validateString()){
			return inputString.substring(index+1, inputString.length()) + 
					inputString.substring(0, index+1);
		}
		else
			return "Invalid Input String or index value";
	}
	
	public String rotateLogic2(){
		if(validateString()){
			
			char inputArray[]  = inputString.toCharArray();
			String result = "";
			
			for(int i=index+1; i<inputArray.length; i++){
				result.concat(""+inputArray[i]);
			}
			return  result;
		}
		else
			return "Invalid Input String or index value";	
	}
}
