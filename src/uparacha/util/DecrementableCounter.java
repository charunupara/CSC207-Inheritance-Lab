package uparacha.util;

public class DecrementableCounter extends BasicCounter {
  public DecrementableCounter(int start) {
    super(start);
  }
  
  public void decrement() {
    this.count -= 1;
  }
}
