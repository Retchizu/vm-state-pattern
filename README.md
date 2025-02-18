**Problem:**

A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.

**Requirements:**

- **Idle State:**
  - Allows item selection.
  - Does not allow dispensing items or inserting coins.
- **ItemSelected State:**
  - Allows inserting coins and dispensing items.
  - Does not allow item selection.
- **Dispensing State:**
  - Does not allow any operations.
  - Automatically transitions back to the "Idle" state after dispensing is complete.
- **OutOfOrder State:**
  - Does not allow any operations.

**Current System:**

The system currently relies on conditional statements within the `VendingMachine` class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

**Solution: Implement the State Pattern to improve code maintainability and flexibility.**

### Steps to Implement:

1. **Define VendingMachine States:**
   - Create separate classes representing different machine states: `IdleState`, `ItemSelectedState`, `DispensingState`, and `OutOfOrderState`.

2. **Implement a State Interface:**
   - Define an interface `VendingMachineState` with methods for common actions like `selectItem()`, `insertCoin()`, `dispenseItem()`, and `setOutOfOrder()`.

3. **Implement State Behaviors:**
   - Each concrete state class implements the `VendingMachineState` interface, defining specific behaviors for its respective state.
   - For example, `IdleState` allows item selection, while `OutOfOrderState` does not allow any operations.

4. **Refactor VendingMachine Class:**
   - Include attributes for item inventory and balance.
   - Remove state-specific logic from the `VendingMachine` class.
   - Introduce a reference to the current `VendingMachineState` object.
   - Delegate actions like `selectItem()`, `insertCoin()`, `dispenseItem()`, and `setOutOfOrder()` to the current state object.

This approach improves modularity, readability, and maintainability, making it easier to modify or add new states in the future.

## UML

<img src="https://github.com/Retchizu/vm-state-pattern/blob/master/Baltazar-state-design-pattern-UML.png" alt="uml"/>
