package phone.model;

public class PhoneModel
{
	private String type;
	private double screenSize;
	private boolean isAndroid;
	
	public PhoneModel()
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
