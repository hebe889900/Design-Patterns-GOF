package Behavior.State;

class Credit0 implements VendingMachineState {
	 private Credit0(){ }
	 private static Credit0 _theInstance;
	 static Credit0 instance(VendingMachine v) {
	 if (_theInstance == null) {
	 _theInstance = new Credit0();
	 }
	 v.welcome(); return _theInstance;
	 }
	 public void addNickel(VendingMachine v) {
	 v.changeState(Credit5.instance()); }
	 public void addDime(VendingMachine v) {
	 v.changeState(Credit10.instance()); }
	 public void addQuarter(VendingMachine v) {
	 v.dispenseProduct();
	 v.changeState(Credit0.instance(v)); }
	 public int getBalance() { return 0; }
	}
