//Prototype Code Implementation for getting and storing each data entry
Class DataEnt
{

  int DataEntNum;
	String Title;
	String Desc;
	String Pub;
  String PubID;
	String Date;
	String Images;
	String Files;
	
  //Default Constructor
  DataEnt()
  {
    this.DataEntNum = 0;
    this.Title = "";
    this.Desc = "";
    this.Pub = "";
    this.PubID = "";
    this.Date = "";
    this.Images = "";
    this.Files = "";
    }
    
    //Constructor
    DataEnt(int DataEntNum, String Title, String Desc, String Pub, String PubID, String Date, String Images, String Files)
	{
		this.DataEntNum = DataEntNum;
		this.Title = Title;
		this.Desc = Desc;
		this.Pub = Pub;
    this.PubID = PubID;
		this.Date = Date;
		this.Images = Images;
		this.Files = Files;
			}
      
      
      public int getDataEntNum()
	{
		return DataEntNum;
	}
	
	public void setDataEntNum( int DataEntNum )
	{
		this.DataEntNum = DataEntNum;
	}
	
	public String getTitle()
	{
		return Title;
	}
	
	public void setTitle(String Title)
	{
		this.Title = Title;
	}
	
	public String getDesc()
	{
		return Desc;
	}
		
	public void setDesc(String Desc)
	{
		this.Desc = Desc;
	}	
	
	public String getPub()
	{
		return Pub;
	}
		
	public void setPub(String Pub)
	{
		this.Pub = Pub;
	}	
  
public String getPubID()
	{
		return PubID;
	}
		
	public void setPubID(String PubID)
	{
		this.PubID = PubID;
	}	
	public String getDate()
	{
		return Date;
	}
		
	public void setDate(String Date)
	{
		this.Date = Date;
	}	
	
	public String getImages()
	{
		return Images;
	}
		
	public void setImages(String Images)
	{
		this.Images = Images;
	}	

	public String getFiles()
	{
		return Files;
	}
		
	public void setFiles(String Files)
	{
		this.Files = Files;
	}
	
	public String DisplayDataInfo()
	{
		return (DataEntNum + "\n" + Title + "\n" + Desc + "\n" +Pub + "\n" +PubID + "\n" +Date + "\n" +Images + "\n" +Files);
	}
