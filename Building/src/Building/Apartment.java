package Building;

public class Apartment extends SpaceInBuildong{
    private int terraces;

    public Apartment(double area, Building building, int terraces) {
        super(area, building);
        this.terraces = terraces;
    }
}
