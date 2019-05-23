package Behavior.State;

class Credit10 implements VendingMachineState {
	 private Credit10(){ }
	 private static Credit10 _theInstance;
	 static Credit10 instance(){
	 if (_theInstance == null){
	 _theInstance = new Credit10();
	 }
	 return _theInstance;
	 }
	 public void addNickel(VendingMachine v) {
	 v.changeState(Credit15.instance()); }
	 public void addDime(VendingMachine v) {
	 v.changeState(Credit20.instance()); }
	 public void addQuarter(VendingMachine v) {
	 v.dispenseProduct();
	 v.refund(10);
	 v.changeState(Credit0.instance(v)); }
	 public int getBalance(){ return 10; }
	}
