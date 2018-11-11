import java.util.Date;

/**
 * Tracks a single experimental trial in puzzle-solving in birds.  A piece of food,
 * such as a nut, is floated in a beaker of water.  The bird must add rocks or twigs
 * to the beaker to raise the water level so it can reach the treat.  The experiment
 * measures change in water level and whether the bird successfully extracted the treat.
 */
public class birdTrialSolution{

    Date experimentDate;
    String experimentType;
    int trialCategory;
    int trialNumber;
    boolean birdSuccessfulExtractingFood;
    float waterLevelBefore;
    float waterLevelAfter;
    String notes;



    public Date getExperimentDate()
    {
        return experimentDate;
    }

    public void setExperimentDate(Date experimentDate)
    {
        this.experimentDate = experimentDate;
    }

    public String getExperimentType()
    {
        return experimentType;
    }

    public void setExperimentType(String experimentType)
    {
        this.experimentType = experimentType;
    }

    public int getTrialCategory()
    {
        return trialCategory;
    }

    public void setTrialCategory(int trialCategory)
    {
        this.trialCategory = trialCategory;
    }

    public int getTrialNumber()
    {
        return trialNumber;
    }

    public void setTrialNumber(int trialNumber)
    {
        this.trialNumber = trialNumber;
    }

    public boolean isBirdSuccessfulExtractingFood()
    {
        return birdSuccessfulExtractingFood;
    }

    public void setBirdSuccessfulExtractingFood(boolean birdSuccessfulExtractingFood)
    {
        this.birdSuccessfulExtractingFood = birdSuccessfulExtractingFood;
    }

    public float getWaterLevelBefore()
    {
        return waterLevelBefore;
    }

    public void setWaterLevelBefore(float waterLevelBefore)
    {
        this.waterLevelBefore = waterLevelBefore;
    }

    public float getWaterLevelAfter()
    {
        return waterLevelAfter;
    }

    public void setWaterLevelAfter(float waterLevelAfter)
    {
        this.waterLevelAfter = waterLevelAfter;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }


}
