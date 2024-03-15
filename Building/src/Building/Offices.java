package Building;

public class Offices extends SpaceInBuildong{

    private int workSpaces;

    public Offices(double area, Building building, int workSpaces) {
        super(area, building);
        this.workSpaces = workSpaces;
    }
}
