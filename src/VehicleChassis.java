/* Implements the feature of interface "Chassis"
    Vehicle Chassis objects hold the name of the chassis
 */
public class VehicleChassis implements Chassis {

  String chassisName;

  public VehicleChassis() {
    this.chassisName = Chassis.chassis;
  }

  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  public String toString() {
    return "Chassis Name    : " + chassisName;
  }

  @Override
  public Chassis getChassisType() {
    return this;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }


}

/*
class testMain {

  public static void main(String[] args){

    VehicleChassis defaultChassis = new VehicleChassis();
    VehicleChassis customChassis = new VehicleChassis("custom");

    System.out.println(defaultChassis + "\n" + customChassis);
  }
}
*/
