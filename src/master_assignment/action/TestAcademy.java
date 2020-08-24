package master_assignment.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.swing.SortingFocusTraversalPolicy;

import master_assignment.bean.Student;
import master_assignment.bean.TestResult;
import master_assignment.bean.Transaction;
import master_assignment.manager.CourseManager;
import master_assignment.manager.StudentManager;
import master_assignment.bean.Academy;
import master_assignment.bean.Course;
public class TestAcademy {
	public static void main(String[] args) {
// ------------q1---------------------- 
//			HashMap<Integer, List<Student>> hm= Academy.studentMap;
//			
//			int id=0,max=0;
//			
//			Set<Entry<Integer,List<Student>>> ss=hm.entrySet();
//			
//			for(Entry<Integer,List<Student>> e:ss)
//			{
//				if(max<e.getValue().size())
//				{
//					max = e.getValue().size();
//					id = e.getKey();
//				}
//			}
//			
//			ArrayList<Course> al = Academy.courseList;
//			for(int i=0;i<al.size();i++)
//			{
//				Course c = al.get(i);
//				if(id==c.courseId)
//				{
//					System.out.println(c.course_name);
//				}
//			}
		
		
		//----------------------q2--------------------------//
	
//		LinkedHashMap<Integer,List<Integer>> li = new LinkedHashMap<>();
//		HashMap<Integer,Integer> stud = new HashMap<>();
//		
//		HashMap<Integer,List<Transaction>> trans = Academy.transactionMap;
//		
//		Set<Entry<Integer,List<Transaction>>> ss=trans.entrySet();
//		int cFees;
//		
//		for(Entry<Integer,List<Transaction>> e :ss)
//		{
//			Course c = CourseManager.GetCourse(e.getKey());
//			cFees = c.courseFees;
//			List<Transaction> tl = e.getValue();
//			for(Transaction t :tl)
//			{
//				if(stud.containsKey(t.studId))
//				{
//					int i= stud.get(t.studId);
//					i = i+t.paidfees;
//					stud.put(t.studId, i);
//				}
//				else {
//					stud.put(t.studId, t.paidfees);
//				}
//			}
//			Set<Entry<Integer,Integer>> h=stud.entrySet();
//			for(Entry<Integer,Integer> ee:h)
//			{
//				if(cFees==ee.getValue())
//				{
//					if(li.containsKey(c.courseId))
//					{
//						List<Integer> l = li.get(c.courseId);
//						l.add(ee.getValue());
//					}
//					else
//					{
//						ArrayList<Integer> a = new ArrayList<>();
//						a.add(ee.getKey());
//						li.put(c.courseId, a);
//					}
//				}
//			}
//			
//			System.out.println(" list of student and course how had paid full fees");
//			System.out.println(li);
//			
//		}
	
//------------------------q3-------------------------------------//
		
//		
//		LinkedHashMap<Integer,List<Integer>> li = new LinkedHashMap<>();
//		HashMap<Integer,Map<Integer,Double>> stud = new HashMap<>();
//		
//		HashMap<Integer,List<TestResult>> test = Academy.test_map;
//		
//		Set<Entry<Integer, List<TestResult>>> ss=test.entrySet();
//		
//		
//		for(Entry<Integer, List<TestResult>> e :ss)
//		{
//			Course c = CourseManager.GetCourse(e.getKey());
//			List<TestResult> tl = e.getValue();
//			for(TestResult t :tl)
//			{
//				if(stud.containsKey(t.studentId))
//				{
//					Map m= stud.get(t.studentId);
//					Set<Entry<Integer,Double>> s = m.entrySet();
//							for(Entry<Integer,Double> ee:s)
//							{
//								int i = ee.getKey()+1;
//								double d = ee.getValue()+((t.marks/t.out_of_marks)*100);
//										m.put(i,d/i);
//								stud.put(t.studentId, m);
//							}
//				}
//				else {
//					Map<Integer,Double> m = new HashMap<>();
//					m.put(1, (double) ((t.marks/t.out_of_marks)*100));
//					stud.put(t.studentId,m);
//				}
//			}
//			Set<Entry<Integer, Map<Integer, Double>>> h=stud.entrySet();
//			for(Entry<Integer, Map<Integer, Double>> ee:h)
//			{
//				Map m = ee.getValue();
//				Set<Entry<Integer,Double>> s = m.entrySet();
//				for(Entry<Integer,Double> mm:s)
//				{
//					if(mm.getValue()<40)
//					{
//						if(li.containsKey(c.courseId))
//						{
//							List l = li.get(c.courseId);
//							l.add(ee.getKey());
//						}
//						else
//						{
//							List<Integer> l = new ArrayList<>();
//							l.add(ee.getKey());
//							li.put(c.courseId,l );
//						}
//					}
//				}
//			}
//		}
//			System.out.println(" student and there course with lessmarks or avg <40");
//			System.out.println(li);
//	
	
	//----------------------q4-------------------------
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" enter the course id");
//		int c = sc.nextInt();
//		HashMap<Integer,List<TestResult>> test = Academy.test_map;
//		
//		List<TestResult> l = test.get(c);
//		
//		Collections.sort(l);
//		
//		for(TestResult t:l)
//		{
//			System.out.println(t);
//		}
//		// for sorting applied comparable in testresult class;
		
		
		//------------------------------q5-------------------//
	
	
	
	
	
	
	
	
	
	
	
	}
}
