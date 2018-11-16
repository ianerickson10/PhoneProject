package phone.model;

public class Phone
{
	private String type;
	private double screenSize;
	private boolean isAndroid;
	
	public Phone()
	{
		
	}
	
	public String getType()
	{
		return type;
	}
	public double getScreenSize()
	{
		return screenSize;
	}
	public boolean getIsAndroid()
	{
		return isAndroid;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	public void setScreenSize(double screenSize)
	{
		this.screenSize = screenSize;
	}
	public void setIsAndroid(boolean isAndroid)
	{
		this.isAndroid = isAndroid;
	}
	
}
