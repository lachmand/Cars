public class Car
{
  private int doors = 0;
  private Enumerations.CarType _carType;
  private String make;
  private String model;
  private String modelType;

  public Car(int doors, Enumerations.CarType _carType, String make, String model, String modelType) {
    this.doors = doors;
    this._carType = _carType;
    this.make = make;
    this.model = model;
    this.modelType = modelType;
  }

  public int getDoors() {
    return doors;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public Enumerations.CarType get_carType() {
    return _carType;
  }

  public String getModelType() {
    return modelType;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
      sb.append("This is a bog standard car. ");
            sb.append("The car properties are ")
                    .append(" doors: " + this.getDoors())
                    .append((" Make: " + this.getMake()))
                    .append((" Model: " + this.getModel()))
                    .append(" Model type: " + this.getModelType());

    return sb.toString();

  }
}
