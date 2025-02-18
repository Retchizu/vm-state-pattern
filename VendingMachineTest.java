public class VendingMachineTest {
   public static void main(String[] args) {
    VendingMachine vendingMachine = new VendingMachine(15);

    vendingMachine.dispenseItem(); // idle state, needs to select an item first
    vendingMachine.selectItem(); // state is now in itemSelected state
    vendingMachine.dispenseItem(); // can not dispense an item because no coins are inserted
    vendingMachine.insertCoin(1.5); // reduced balance to 0.5 because an item cost 2 pesos, balance is 0.5 pesos
    vendingMachine.dispenseItem(); // can not dispense an item because of the remaining balance
    vendingMachine.insertCoin(0.5); // no more remaining balance
    vendingMachine.dispenseItem(); // dispensed successfully, going idle state
    vendingMachine.insertCoin(3.5); //can not insert a coin, vending machine is in idle state
    vendingMachine.setOutOfOrder(); // vending machine is now out of order
    vendingMachine.selectItem(); // can not select an item because vending machine is out of order
   }
}
