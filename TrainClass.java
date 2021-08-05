public class TrainClass
{
    protected int trainType = null;
    protected String trainName = null;

    private TrainClass()
    {
    }

    public TrainClass(int theTrainType, String theTrainName)
    {
        this.trainType = theTrainType;
        this.trainName = theTrainName;
    }

    public int getTrainType()
    {
        return this.trainType;
    }

    public String getTrainName()
    {
        return this.trainName;
    }
}
