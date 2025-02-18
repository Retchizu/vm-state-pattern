public class ItemSelectedState implements VendingMachingState {

  @Override
  public void selectItem(VendingMachine vendingMachine) {
    System.out.println("You have already selected an item. Selection is not allowed!");
  }
    

  @Override
  public void insertCoin(VendingMachine vendingMachine, Double amount) {
    vendingMachine.setBalance(vendingMachine.getBalance() - amount);
    System.out.println("Inserted P " + amount + ". Current balance: P " + vendingMachine.getBalance());
    boolean sufficientBalance = vendingMachine.getBalance() <= 0;

    vendingMachine.setVendingMachingState(sufficientBalance ? new DispensingState() : this);
  }

  @Override
  public void dispenseItem(VendingMachine vendingMachine) {
    System.out.println("Please insert a coin first!");
  }

  @Override
  public void setOutOfOrder(VendingMachine vendingMachine) {
    vendingMachine.setVendingMachingState(new OutOfOrderState());
    System.out.println("Vending Machine is now out of order");
  }
  
}
