package com.arun.beans;

import org.springframework.stereotype.Component;

@Component(value="dsa")
public class DSABook implements Book
{
	public DSABook()
	{
		System.out.println("DSABook Object Created");
	}
	

	@Override
	public boolean bookSelected() 
	{
		System.out.println("DSABook is Selected");
		return true;
	}
	
	

}
