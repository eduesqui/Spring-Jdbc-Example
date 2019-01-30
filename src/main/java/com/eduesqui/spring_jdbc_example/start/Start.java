package com.eduesqui.spring_jdbc_example.start;



import com.eduesqui.spring_jdbc_example.bo.UserBo;
import com.eduesqui.spring_jdbc_example.environment.SpringEnvironment;

public class Start {


	public static void main(String args[]) {
		UserBo userBo= (UserBo) SpringEnvironment.context.getBean("userBo");
		System.out.println ("Id: " + userBo.findUserById(1).getLastName());
	}

}
