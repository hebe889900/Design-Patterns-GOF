package Behavior.State;

public class VendingMachine {
	 public VendingMachine() {
		 _state = Credit0.instance(this);
		 }
		 // methods welcome(), dispenseProduct() etc.
		 // same as before
		 void changeState(VendingMachineState s) {
		 _state = s; displayBalance();
		 }
		 private void displayBalance() {
			// TODO Auto-generated method stub
			
		}
		public void addNickel() { _state.addNickel(this); }
		 public void addDime() { _state.addDime(this); }
		 public void addQuarter() { _state.addQuarter(this); }
		 private VendingMachineState _state;
		public void welcome() {
			// TODO Auto-generated method stub
			
		}
		public void dispenseProduct() {
			// TODO Auto-generated method stub
			
		}
		public void refund(int i) {
			// TODO Auto-generated method stub
			
		}

}
