package phone.controller;

import javax.swing.JOptionPane;
import phone.model.Phone;

public class PhoneController
{
	public void start()
	{
		setVariables();
	}
	
	private Phone[] phoneArray;
	
	public void setVariables()
	{
		phoneArray = new Phone[5];
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
