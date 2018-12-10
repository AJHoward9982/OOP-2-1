import java.util.Date;


//Final Class Blueprint - Combines Engine , Frame , and Features from Vehicle.
public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
    Feature[] carFeature = {new InteriorFeature("none"), new ExteriorFeature("none")};
    feature = carFeature;
    carAxle = 2;
  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, Engine vehicleEngine, Feature[] feature, int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;

  }
/*
The get methods can't currently differentiate between Interior and Exterior Features
 */
  public String getExteriorFeatures() {
    String allExtFeatures = "";

    for (int i = 0; i < this.feature.length; i++) {

      allExtFeatures += (feature[i] + "\n");

    }
    return allExtFeatures;
  }

  public String getInternalFeatures() {
    String allIntFeatures = "";
    for (int i = 0; i < this.feature.length; i++) {

      allIntFeatures += (feature[i] + "\n");

    }
    return allIntFeatures;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + this.getExteriorFeatures() + this.getInternalFeatures();
  }

}

/*
class testMain {

  public static void main(String[] args) {

    Car defCar = new Car();

    Date date = new Date();
    VehicleChassis vc = new VehicleChassis("Unibody");
    ManufacturedEngine me = new ManufacturedEngine("Honda", date, "V-Tech", "I4", "e85", 4,
        "DriveTrain");
    Feature[] fe = {
        new InteriorFeature("AC"),
        new InteriorFeature("Radio"),
        new ExteriorFeature("Stickers"),
        new ExteriorFeature("Cheap Body Kit")
    };

    Car cusCar = new Car(date, "Honda", "Civic", "R-Type", vc, "Ricer", "2wd: Front Wheel Drive",
        me, fe, 2);

    System.out.println(defCar);
    System.out.println("\n -------------------------------------- \n");
    System.out.println(cusCar);
  }

}*/
