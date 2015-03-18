package com.imc.cxf.sample.security.authenticate.helper;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.imc.cxf.sample.security.data.UserData;

public class UserDataHelperImpl {
	private static Map<String, UserData> userDataMap;
	
	private static UserDataHelperImpl _instance;
	
	private UserDataHelperImpl(){
		 initializeData();
	}
	
	public static UserDataHelperImpl getInstance(){
		if(_instance == null){
			_instance = new UserDataHelperImpl();
		}
		return _instance;
	}
	
	private static void initializeData(){
		userDataMap = new Hashtable<String, UserData>();
		
		UserData userData = new UserData();
		userData.setUserId("IMC_WEB1");
		userData.setUserPassword("IMC_WEB1_PWD");
		
		List<String> roles = new ArrayList<String>();
		roles.add("ROLE_ADD_ADMIN");
		roles.add("ROLE_SUB_ADMIN");
		
		userData.setRoles(roles);
		
		userDataMap.put("IMC_WEB1", userData);
		
		userData = new UserData();
		userData.setUserId("IMC_WEB2");
		userData.setUserPassword("IMC_WEB2_PWD");
		
		roles = new ArrayList<String>();
		roles.add("ROLE_SUB_ADMIN");
		
		userData.setRoles(roles);
		
		userDataMap.put("IMC_WEB2", userData);
	}
	
	public UserData getUserData(String userId){
		return userDataMap.get(userId);
	}
}
