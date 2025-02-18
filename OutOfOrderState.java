public class OutOfOrderState implements VendingMachingState{

  @Override
  public void selectItem(VendingMachine vendingMachine) {
    System.out.println("You can not select an item. Out of order!");
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Double amount) {
    System.out.println("You can not insert coin. Out of order!");
  }

  @Override
  public void dispenseItem(VendingMachine vendingMachine) {
    System.out.println("You can not dispense an item. Out of order!");
  }

  @Override
  public void setOutOfOrder(VendingMachine vendingMachine) {
    System.out.println("Vending machine is already out of order");
  }
}
