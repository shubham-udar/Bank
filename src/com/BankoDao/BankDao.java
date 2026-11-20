package com.BankoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

import com.databaseConnection.JDBCUtil;
import com.entity.Bank;

public class BankDao {

	Connection con = JDBCUtil.createConnection();
	
/*	public String createDatabase()
	{
		try
		{
			
		
		Statement statement =con.createStatement();
		
		statement.execute("create database Bank");
		
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
	return " Database Created ";
}

*/
	
	
 /*	public void createTable()
	{
		
		try
		{
			
		Statement statement =con.createStatement();
		
		statement.execute("create table createAccount(AccountHolderName varchar(45), AccountHolderAddress varchar(45)) ");
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	*/
	
/*	public void insertTableValue(Bank bank)
	{
		
		try
		{
			
	     PreparedStatement statement = con.prepareStatement("insert into createAccount values(?,?)");
	     
	     statement.setString(1, bank.getAccountHolderName());
	     statement.setString(2, bank.getAccountHolderAddress());
	     
	     statement.executeUpdate();
	 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Data Inserted...");
	}  */
	
	
 /*	public void updateAccountDetails()
	{
		
		try
		{
	       Statement statement =	con.createStatement();
	       
	       statement.executeUpdate("update createAccount set AccountHolderName = 'sahil' where AccountHolderAddress = 'poos'");
	       
	       System.out.println(" AccountDetails Updated Sucesssully ");
	       
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} */
	
	
	public void deleteAccountDetails()
	{
		
		try
		{
		
	     Statement statement =	con.createStatement();
	     
	     statement.execute("delete  from createAccount where AccountHolderName ='sahil' ");
	     
	     System.out.println("Account details Deleted SucessFully...");
	     
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		BankDao dao = new BankDao();
		
		Bank bank = new Bank();
		
	/*	bank.setAccountHolderName("Shubham_Udare");
		bank.setAccountHolderAddress("Poos");
		
		List<Bank> list = Arrays.asList(bank);
		
		for(Bank b : list)
		{
			dao.insertTableValue(b);
		}   */
		
		
		
//		dao.createDatabase();
		
//		dao.createTable();
		
//		dao.updateAccountDetails();
		
		
		dao.deleteAccountDetails();
		
	}
	
}
