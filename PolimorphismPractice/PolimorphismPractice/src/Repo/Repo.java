package Repo;

public class Repo {
    private double limit;

    private int numberOfDocuments;

    private double usedStorage;

    public Repo(double limit) {
        this.limit = limit;
        this.numberOfDocuments = 0;
        this.usedStorage = 0;
    }

    public Repo(double limit, int numberOfDocuments, double usedStorage) {
        this.limit = limit;
        this.numberOfDocuments = numberOfDocuments;
        this.usedStorage = usedStorage;
    }

    public double freeStorage(){
        return (this.limit-this.usedStorage);
    }

    public boolean uploadDocument(Document document){
        if(freeStorage()>=document.getDocSize()){
            this.usedStorage +=document.getDocSize();
            this.numberOfDocuments++;
            document.setRepo(this);
            return true;
        }else{
            return false;
        }
    }

    public double getLimit() {
        return limit;
    }

    public int getNumberOfDocuments() {
        return numberOfDocuments;
    }

    public double getUsedStorage() {
        return usedStorage;
    }

    @Override
    public String toString() {
        return "Repo{" +
                "limit=" + limit +
                ", numberOfDocuments=" + numberOfDocuments +
                ", usedStorage=" + usedStorage +
                '}';
    }
}
