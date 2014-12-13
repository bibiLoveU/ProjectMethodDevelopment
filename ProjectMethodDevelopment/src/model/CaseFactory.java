package model;

import exception.ExceptionCreation;



public class CaseFactory {
	
	public static ICase getCase(EnumTypeCase type) throws ExceptionCreation{
		ICase c;
		if(type.equals(EnumTypeCase.SIMPLE_CASE)){
			c= new Case();
		}else{
			throw new ExceptionCreation(type.toString());
		}
		return c;
	}
	
	
}
	