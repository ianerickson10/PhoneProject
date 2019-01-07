package phone.controller;

import javax.swing.JOptionPane;
import phone.model.Phone;

public class PhoneController
{
	private Phone[] phoneArray;
	
	public void start()
	{
		setVariables();
	}
	
	public void setVariables()
	{
		phoneArray = new Phone[5];
		
		
		for(int index = 0; index < phoneArray.length; index += 1)
		{
			if(index % 2 == 0)
			{
				phoneArray[index] = new Phone();
			}
		}
	}
	
	
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
				
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String mightBeDouble)
	{
		Boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal");
		}
		
		return isValid;
	}
}
