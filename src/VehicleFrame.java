/* Implements the feature of interface "Chassis"
    Vehicle Frame objects hold the frame type
 */
public class VehicleFrame implements Chassis {

  public String vehicleFrameType;

  public VehicleFrame() {
    this.vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public Chassis getChassisType() {
    return this;
  }

  @Override
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  public String toString() {
    return "Chassis Name    : " + chassis + "\nVehicle Frame    : " + vehicleFrameType;
  }
}

/*
class testMain {

  public static void main(String[] args){

    VehicleFrame defaultVehicle = new VehicleFrame();
    VehicleFrame customVehicle = new VehicleFrame("Custom");

    System.out.println(defaultVehicle + "\n" + customVehicle);
  }
}*/
