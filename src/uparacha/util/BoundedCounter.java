package uparacha.util;

public class BoundedCounter extends BasicCounter {
  int bound;
  
  public BoundedCounter(int start, int bound) {
    super(start);
    this.bound = bound;
  }
  
  @Override
  public void increment() throws Exception {
    this.count += 1;
    
    if(this.count == this.bound) {
      throw new Exception("Out of bound");
    }
  }
}
