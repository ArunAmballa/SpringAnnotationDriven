package com.arun.beans;

import org.springframework.stereotype.Component;

@Component(value="python")
public class PythonBook implements Book
{
	public PythonBook()
	{
		System.out.println("PythonBook Object is created");
	}

	@Override
	public boolean bookSelected() 
	{
		
		System.out.println("PythonBook is Selected");
		return true;
	}

}
