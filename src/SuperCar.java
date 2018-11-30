public class SuperCar extends Car {

  private int horsePower;
  private int ZeroToSixty;

  public SuperCar(int doors, Enumerations.CarType _carType, String make, String model, String modelType, int horsePower, int zeroToSixty) {
    super(doors, _carType, make, model, modelType);
    this.horsePower = horsePower;
    ZeroToSixty = zeroToSixty;
  }

  public int getHorsePower() {
    return horsePower;
  }

  public int getZeroToSixty() {
    return ZeroToSixty;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("This is a supercar! ");
    sb.append(super.toString())
            .append(" BHP: "  + this.horsePower)
            .append(" 0 to 60 in " + this.ZeroToSixty + " seconds");
    return sb.toString();
  }
}
