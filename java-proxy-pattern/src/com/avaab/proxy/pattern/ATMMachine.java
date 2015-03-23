package com.avaab.proxy.pattern;

public class ATMMachine implements GetATMData{
	
	
	public ATMState getYesCardState() { ATMState hasCard = null;
	return hasCard; }
	public ATMState getNoCardState() { ATMState noCard = null;
	return noCard; }
	public ATMState getHasPin() { ATMState hasCorrectPin = null;
	return hasCorrectPin; }
	public ATMState getNoCashState() { ATMState atmOutOfMoney = null;
	return atmOutOfMoney; }
	
	// NEW STUFF
	
	public ATMState getATMState() { ATMState atmState = null;
	return atmState; }

	public int getCashInMachine() {
		int cashInMachine = 0;
	return cashInMachine; }
}
