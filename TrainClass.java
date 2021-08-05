public class TrainClass
{
    protected int trainType = null;
    protected String trainName = null;
    protected Engine engineObj = null;

    private TrainClass()
    {
    }

    public TrainClass(int theTrainType, String theTrainName)
    {
        this.trainType = theTrainType;
        this.trainName = theTrainName;
        this.engineObj = new Engine();
    }

    public int getTrainType()
    {
        return this.trainType;
    }

    public String getTrainName()
    {
        return this.trainName;
    }

    public Engine getEngineObj()
    {
        return this.engineObj;
    }

    public int setTrainType(int theTrainType)
    {
        this.trainType = theTrainType;
        return this.trainType;
    }

    public String setTrainName(String theTrainName)
    {
        this.trainName = theTrainName;
        return this.trainName;
    }
}
