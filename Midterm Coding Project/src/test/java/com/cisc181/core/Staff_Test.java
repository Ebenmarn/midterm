package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	static ArrayList<Staff> staffList = new ArrayList<Staff>();
	@BeforeClass
	public static void setup() throws PersonalExceptions{
		Staff s1 = new Staff("Ha", "NA", "MA", new Date(1988, 5 ,5), "1 FAKE LANE","5555555555", "fakemail@mail.com", "6am-5pm", 1, 1000.00, new Date(1988, 5 ,5), eTitle.MR);
		Staff s2 = new Staff("CA", "DA", "LA", new Date(1988, 5 ,5), "1 FAKE LANE","6666666666", "fakemail1@mail.com", "6am-5pm", 1, 1000.00, new Date(1988, 5 ,5), eTitle.MR);
		Staff s3 = new Staff("May", "NAy", "SAy", new Date(1988, 5 ,5), "1 FAKE LANE","7777777777", "fakemail2@mail.com", "6am-5pm", 1, 1000.00, new Date(1988, 5 ,5), eTitle.MR);
		Staff s4 = new Staff("BAAY", "MAs", "sdad", new Date(1988, 5 ,5), "1 FAKE LANE","8888888888", "fakemail3@mail.com", "6am-5pm", 1, 1000.00, new Date(1988, 5 ,5), eTitle.MR);
		Staff s5 = new Staff("fake", "name", "weee", new Date(1988, 5 ,5), "1 FAKE LANE","999999999", "fakemail4@mail.com", "6am-5pm", 1, 1000.00, new Date(1988, 5 ,5), eTitle.MR);
	
		staffList.add(s1);
		staffList.add(s2);
		staffList.add(s3);
		staffList.add(s4);
		staffList.add(s5);
		
	}
	}
	
	@Test
	public void Averagesalary() {
		double AverageSalary = (s1.getSalary+s2.getSalary+s3.getSalary+s4.getSalary+s5.getSalary)
		assertEquals(AverageSalary,1000.00);
	}	

	@test
	public void BadPhonenumber throws PersonalException{
	s5.setPhone(555)
	}
	ublic void badDOB() throws PersonException{
		Calendar birth = GregorianCalendar.getInstance();
		birth.set(1990, Calendar.MARCH, 32);
		Date date1 = d1.getTime();
		s5.setDOB(birth);
		s5.PrintAge() ; 
			
	}
	
	@Test
	public void OLDMANEXCPETION() throws PersonException{
		Calendar birth = GregorianCalendar.getInstance();
		birth.set(1898, Calendar.MARCH, 2);
		Date date1 = d1.getTime();

		s5.setDOB(birth);
		s5.PrintAge() ; 		
	}
	
}
