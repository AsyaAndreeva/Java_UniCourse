package University;
import java.util.ArrayList;
import java.util.List;

public class ClassesProcessing {

    private List<ObjectWithDuration> lectures;

    public ClassesProcessing() {
        this.lectures = new ArrayList<>();
    }

    public boolean addLecture(Lecture lecture){
        return this.lectures.add(lecture);
    }

    public double totalDuration(){
        double totalSum = 0;
        return totalSum;
    }

}
