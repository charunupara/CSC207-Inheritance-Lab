package uparacha.util;

public class NamedCounter extends BasicCounter {
  String name;

  public NamedCounter(String name, int start) {
    super(start);
    this.name = name;
  }
  
  @Override
  public String toString() {
    return this.name + super.toString();
  }
}
