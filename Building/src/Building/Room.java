package Building;

public class Room extends SpaceInBuildong{
    private int peopleCapacity;

    private int beds;

    public Room(double area, Building building, int peopleCapacity, int beds) {
        super(area, building);
        this.peopleCapacity = peopleCapacity;
        this.beds = beds;
    }
}
