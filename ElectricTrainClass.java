public class ElectricTrainClass extends TrainClass
{
    protected int yearBuilt = null;

    private ElectricTrainClass()
    {
    }

    public ElectricTrainClass(int theYearBuilt)
    {
        this.yearBuilt = theYearBuilt;
    }

    public int getYearBuilt()
    {
        return this.yearBuilt;
    }

    public int setYearBuilt(int theYearBuilt)
    {
        this.yearBuilt = theYearBuilt;
        return this.yearBuilt;
    }
}
