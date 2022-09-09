package chapter7;

public class Subject {

    private String name;
    private int scorePoint;

    public void setName(String name) {
        this.name = name;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }

    public String getName(){
        return this.name;
    }

    public int getScorePoint(){
        return this.scorePoint;
    }
}
