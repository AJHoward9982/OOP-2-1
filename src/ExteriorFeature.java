//All exterior features of the Car
public class ExteriorFeature implements Feature {

  String exteriorFeature;

  public ExteriorFeature() {
    this.exteriorFeature = "Generic";
  }

  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }


  @Override
  public String getFeature() {
    return this.exteriorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.exteriorFeature = feature;
  }

  public String toString() {
    return "Exterior [" + exteriorFeature + "]";
  }
}

/*class testMain {

  public static void main(String[] args) {

    ExteriorFeature defExterior = new ExteriorFeature();
    ExteriorFeature cusExterior = new ExteriorFeature("Fog Lamps");

    System.out.println(defExterior + "\n" + cusExterior);

  }
}*/
