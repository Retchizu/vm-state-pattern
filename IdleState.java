public class IdleState implements VendingMachingState {

  @Override
  public void selectItem(VendingMachine vendingMachine) {
    System.out.println("Item selected, Please insert coins");
    vendingMachine.setBalance(vendingMachine.getItemPrice());
    vendingMachine.setVendingMachingState(new ItemSelectedState());
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Double amount) {
    System.out.println("Please select an item first");
  }

  @Override
  public void dispenseItem(VendingMachine vendingMachine) {
    System.out.println("You can not dispense an item without selecting");
  }

  @Override
  public void setOutOfOrder(VendingMachine vendingMachine) {
    vendingMachine.setVendingMachingState(new OutOfOrderState());
    System.out.println("Vending machine is now out of order");
  }
}