public class InteriorFeature implements Feature {
  //All interior features of the Car
  String interiorFeature;

  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }


  @Override
  public String getFeature() {
    return this.interiorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }

  public String toString() {
    return "Interior [" + interiorFeature + "]";
  }
}
/*
class testMain {

  public static void main(String[] args) {

    InteriorFeature defInterior = new InteriorFeature();
    InteriorFeature cusInterior = new InteriorFeature("Climate Control");

    System.out.println(defInterior + "\n" + cusInterior);

  }
}*/
