
class Arena extends DataType {

    private int arenaID;
    private String arenaName;
    private String arenaAddress;
    private float arenaLatitude;
    private float arenaLongitude;

    // default constructor
    Arena()
    {
        this.arenaID = 0;
        this.arenaName = "";
        this.arenaAddress = "";
        this.arenaLatitude = 0;
        this.arenaLongitude = 0;
    }

    // overloaded constructor
    Arena(int arenaID, String arenaName, String arenaAddress, float arenaLatitude, float arenaLongitude)
    {
        this.arenaID = arenaID;
        this.arenaName = arenaName;
        this.arenaAddress = arenaAddress;
        this.arenaLatitude = arenaLatitude;
        this.arenaLongitude = arenaLongitude;
    }


    // to String to return information
    public String toString()
    {
        return (arenaID + " " +arenaName + " " +arenaAddress + " " + arenaLatitude + " " + arenaLongitude);
    }

    // print all the information
    public void printAll()
    {
        System.out.println(arenaID + "  " +arenaName + "  " +arenaAddress + "  " + arenaLatitude + "  " + arenaLongitude);
    }

}