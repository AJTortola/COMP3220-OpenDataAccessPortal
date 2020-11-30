abstract class DataType
{
    private int IDDat;
    private String DatName;

    // default constructor
    DataType()
    {
        this.IDDat = 0;
        this.DatName = "";
    }


    public String toString()
    {
        return (IDDat + " " + DatName);
    }


    public abstract void printAll();
}
