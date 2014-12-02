package model;

import java.util.List;

public class CaseFactory implements ICaseFactory{
	public CaseFactory() {}
	
	public List<SingleCase> createSingleCase(int n, String mode){
		List<SingleCase> result = new List<SingleCase>();
		if(mode.equals("random")){
			for(int i = 0; i < n; i++)
				result.add(new SingleCase());
		}else{
			for(int i = 0; i < n; i++)
				result.add(new SingleCase());
		}
		return result;
	}
}
