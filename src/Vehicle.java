import java.util.Date;

/* Implements the feature of interface "Engine" and "Chassis"
    Vehicle objects hold: Manufacturer , Date , Make , Model , Type , and Drive Train
    as well as an Engine and Chassis object
 */

public class Vehicle implements Engine, Chassis {

  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;

  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleType = "Generic";
    this.driveTrain = "Generic";
    this.vehicleEngine = new ManufacturedEngine();
  }

  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }


  @Override
  public Chassis getChassisType() {
    return this.vehicleFrame;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }


  public String toString() {
    return "Manufacturer Name : " + this.vehicleManufacturer + "\n"
        + "Manufacturer Date : " + this.vehicleManufacturedDate.toString() + "\n"
        + "Vehicle Make : " + this.vehicleMake + "\n"
        + "Vehicle Model : " + this.vehicleModel + "\n"
        + "Vehicle Type : " + this.vehicleType + "\n"
        + vehicleEngine.toString();

  }
}

/*class testMain {

  public static void main(String[] args) {

    Date date = new Date();
    Chassis chassis = new VehicleChassis("Chassis Name");
    ManufacturedEngine vehicleEngine = new ManufacturedEngine("Honda", date, "H-Series", "H23A1",
        "88 AKI", 4, "4wd: Four-Wheel Drive");

    Vehicle defVeh = new Vehicle();
    Vehicle cusVeh = new Vehicle(date, "vehicleManufacturer",
        "vehicleMake", "vehicleModel", chassis, "vehicleType",
        "driveTrain", vehicleEngine);

    System.out.println(defVeh + "\n" + cusVeh);

  }
}*/
