public interface VendingMachingState {
  void selectItem(VendingMachine vendingMachine);
  void insertCoin(VendingMachine vendingMachine, Double amount);
  void dispenseItem(VendingMachine vendingMachine);
  void setOutOfOrder(VendingMachine vendingMachine);
}
