package Person;

public class Student extends Person {
    private float scoreMath;
    private float scorePhysical;
    private float scoreChemistry;

    public Student(String name, String address, float scoreMath, float scorePhysical, float scoreChemistry) {
        super(name, address);
        this.scoreMath = scoreMath;
        this.scorePhysical = scorePhysical;
        this.scoreChemistry = scoreChemistry;
    }

    public float getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(float scoreMath) {
        this.scoreMath = scoreMath;
    }

    public float getScorePhysical() {
        return scorePhysical;
    }

    public void setScorePhysical(float scorePhysical) {
        this.scorePhysical = scorePhysical;
    }

    public float getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(float scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }
}
