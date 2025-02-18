public class VendingMachine {
  private Integer itemInventory;
  private final Double itemPrice = 2.0;
  private Double balance = 0.0;
  private VendingMachingState vendingMachingState;
  
  public VendingMachine(Integer itemInventory) {
    this.itemInventory = itemInventory;
    this.vendingMachingState = new IdleState();
  }

  public Integer getItemInventory() {
    return itemInventory;
  }

  public void setItemInventory(Integer itemInventory) {
    this.itemInventory = itemInventory;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public VendingMachingState getVendingMachingState() {
    return vendingMachingState;
  }

  public void setVendingMachingState(VendingMachingState vendingMachingState) {
    this.vendingMachingState = vendingMachingState;
  }

  public Double getItemPrice() {
    return itemPrice;
  }

  public void selectItem() {
    vendingMachingState.selectItem(this);
  }

  public void insertCoin(Double amount) {
    vendingMachingState.insertCoin(this, amount);
  }

  public void dispenseItem() {
    vendingMachingState.dispenseItem(this);
  }

  public void setOutOfOrder(){
    vendingMachingState.setOutOfOrder(this);
  }
}
