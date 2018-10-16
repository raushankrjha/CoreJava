

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.mysql.jdbc.DatabaseMetaDataUsingInfoSchema;

public class GetValues
{
   public static Vector<String> getCourse()
   {
	   Vector<String> v=new Vector<>();
	  
	   try
	   {
		   String query="select * from course order by name";
		   PreparedStatement ps=DBInfo.con.prepareStatement(query);
		   ResultSet res=ps.executeQuery();
		   while(res.next())
		   {
			   String course=res.getString(2);
			   v.add(course);
			   
		   }
		   
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   
	   return v;
   }
   public static Vector<String> getBranch()
   {
	   Vector<String> v=new Vector<>();
	  
	   try
	   {
		   String query="select * from branch order by name";
		   PreparedStatement ps=DBInfo.con.prepareStatement(query);
		   ResultSet res=ps.executeQuery();
		   while(res.next())
		   {
			   String branch=res.getString(2);
			   v.add(branch);
			   
		   }
		   
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	 
	   return v;
   }
  
   
   public static Vector<String> getfacultyregistration()   {
	   Vector<String> v=new Vector<>();

	   try
	   {
		   String query="select * from facultyregistration order by name";
		   PreparedStatement ps=DBInfo.con.prepareStatement(query);
		   ResultSet res=ps.executeQuery();
		   while(res.next())
		   {
			   String branch=res.getString(2);
			   v.add(branch);
			   
		   }
		   
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	 
	   return v;
   }
  
	   
   }

