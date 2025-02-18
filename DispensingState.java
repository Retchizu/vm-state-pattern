public class DispensingState implements VendingMachingState{

  @Override
  public void selectItem(VendingMachine vendingMachine) {
    System.out.println("The vending machine is dispensing, please wait before selecting.");
  }

  @Override
  public void insertCoin(VendingMachine vendingMachine, Double amount) {
    System.out.println("The vending machine is dispensing, you can not insert a coin.");
  }

  @Override
  public void dispenseItem(VendingMachine vendingMachine) {
    vendingMachine.setItemInventory(Math.max(0, vendingMachine.getItemInventory() - 1));
    vendingMachine.setBalance(0.0);
    System.out.println("Item dispensed successfully, enjoy your purchase!");
    vendingMachine.setVendingMachingState(new IdleState());
  }

  @Override
  public void setOutOfOrder(VendingMachine vendingMachine) {
    System.out.println("The vending machine is dispensing, you can not set it out of order right now.");
  }
  
}
