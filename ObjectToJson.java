package com.anand.JacksonApi;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {

	public static void main(String[] a)
	{
		Organisation org = new Organisation();

		org = getObjectData(org);

		
		ObjectMapper Obj = new ObjectMapper();

		try {

			String jsonStr = Obj.writeValueAsString(org);

			System.out.println(jsonStr);
		}

		catch (IOException e) {

			
			e.printStackTrace();
		}
	}

	
	public static Organisation
	getObjectData(Organisation org)
	{

		org.setOrganisation_name("GeeksforGeeks");
		org.setDescription(
			"A computer Science portal for Geeks");
		org.setEmployees(2000);

		return org;
	}
}
