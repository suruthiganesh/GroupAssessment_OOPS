package Groupassessment;

public class HrDepartment 
{
	public String departmentName()
	{
		return "HrDepartment";
	}
	
	public String getTodaysWork()
	{
		return "Fill today's timesheet and mark your attendance";
	}
	
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
	public String doActivity()
	{
		return "team Lunch";
	}
	
	public static void main(String[] args)
	{
		
		HrDepartment hd = new HrDepartment();
		hd.departmentName();
		hd.getTodaysWork();
		hd.getWorkDeadline();
		hd.doActivity();
	}
	
}
