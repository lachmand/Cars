public class FamilyCar extends Car {
  private int childSeats;

  public FamilyCar(int doors, Enumerations.CarType carType, String make, String model, String modelType, int childSeats) throws Exception {
    super(doors, carType, make, model, modelType);

    if (!(carType== Enumerations.CarType.Estate || carType==Enumerations.CarType.SUV))
      throw new Exception("Family cars can only be of type Estate or SUV");

    if (childSeats<1)
      throw new Exception("Family car have to have at least one child seat");
    this.childSeats=childSeats;
  }

  public int getChildSeats() {
    return childSeats;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();

      sb.append("This is a family car! ")
              .append(super.toString())
              .append(" Number of child seats:" + this.childSeats);
      return sb.toString();
  }
}
