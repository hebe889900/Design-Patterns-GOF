package Behavior.State;

interface VendingMachineState {
	 public void addNickel(VendingMachine v);
	 public void addDime(VendingMachine v);
	 public void addQuarter(VendingMachine v);
	 public int getBalance();
	}