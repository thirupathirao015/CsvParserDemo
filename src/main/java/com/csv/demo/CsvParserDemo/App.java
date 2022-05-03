package com.csv.demo.CsvParserDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import com.csv.demo.CsvParserDemo.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String fileName = "E:\\NewCsvFiles\\Employee.csv";    	
    	try {
    		CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');    		
    		//initialize the CSVParser object
    		CSVParser parser = new CSVParser(new FileReader(fileName), format);
    		List<Employee> emps = new ArrayList<Employee>();
    		for(CSVRecord record : parser){
    			Employee emp = new Employee();
    			emp.setEid(record.get("EID"));
    			emp.setEname(record.get("ENAME"));
    			emp.setAddress(record.get("ADDRESS"));
    			emp.setSalary(record.get("SALARY"));
    			emps.add(emp);    			
    		}
    		parser.close();
    		
    		System.out.println(emps.size());
    		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        //System.out.println( "Hello World!" );
        
    }
}
