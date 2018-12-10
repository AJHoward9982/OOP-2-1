import java.util.Date;

/* Implements the feature of interface "Engine"
    Manufactured Engine objects hold: Manufacturer , Date , Make , Model , Type , Cylinders , and Drive Train
 */
public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private String engineType;
  private int engineCylinders;
  private String driveTrain;

  public ManufacturedEngine() {
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineType = "85 AKI";
    this.engineCylinders = 0;
    this.driveTrain = "2WD: Two-Wheel Drive";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineType = engineType;
    this.engineCylinders = engineCylinders;
    this.driveTrain = driveTrain;
  }

  public String getEngineManufacturer() {
    return engineManufacturer;
  }

  @Override
  public void setEngineManufacturer(String engineManufacturer) {
    this.engineManufacturer = engineManufacturer;
  }

  public Date getEngineManufacturedDate() {
    return engineManufacturedDate;
  }

  @Override
  public void setEngineManufacturedDate(Date engineManufacturedDate) {
    this.engineManufacturedDate = engineManufacturedDate;
  }

  public String getEngineMake() {
    return engineMake;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  public String getEngineModel() {
    return engineModel;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  public String getEngineType() {
    return engineType;
  }

  @Override
  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  public int getEngineCylinders() {
    return engineCylinders;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  public String toString() {

    return "Engine Manufacturer : " + engineManufacturer + "\n" +
        "Engine Manufactured :  " + engineManufacturedDate + "\n" +
        "Engine Make :  " + engineMake + "\n" +
        "Engine Model :  " + engineModel + "\n" +
        "Engine Type :  " + engineType + "\n" +
        "Engine Cylinders :  " + engineCylinders + "\n" +
        "Drive Train :  " + driveTrain + "\n";

  }

}

/*
class testMain {

  public static void main(String[] args) {

    Date date = new Date();

    ManufacturedEngine defManufactured = new ManufacturedEngine();
    ManufacturedEngine cusManufactured = new ManufacturedEngine("Honda", date, "H-Series", "H23A1",
        "88 AKI", 4, "4wd: Four-Wheel Drive");
    System.out.println(defManufactured + "\n" + cusManufactured);

  }
}*/
