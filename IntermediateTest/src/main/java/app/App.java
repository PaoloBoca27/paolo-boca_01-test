package app;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




import com.google.gson.Gson;



public class App {
	
	

	public static void main(String[] args) {
		
		HDFSLogic logic=new HDFSLogic();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);
		int scelta=1;
		while(scelta==1) {
			try {
			System.out.println("Type 1 to insert an Employee or 2 to close application ");
			scelta = Integer.parseInt(br.readLine());
			if(scelta==2) {
				break;
			}
			else {
				
				System.out.println("Insert a new Employee");
				List<ProgrammingLanguages> l=new ArrayList<ProgrammingLanguages>();
				System.out.println("Insert name,surname,age and living place");
				String name=sc.nextLine();
				String surname=sc.nextLine();
				int age=Integer.parseInt(br.readLine());
				String city=sc.nextLine();
				String province=sc.nextLine();
				LivingPlace lp=new LivingPlace(city,province);
				System.out.println("How many pl do you know?");
				int number=Integer.parseInt(br.readLine());
				for (int i = 0; i < number; i++) {
					System.out.println("Insert ProgrammingLanguages,description and levelofconfidence");
					String pl=sc.nextLine();
					String d=sc.nextLine();
					int lof=Integer.parseInt(br.readLine());
					ProgrammingLanguages p=new ProgrammingLanguages(pl,d,lof);
					l.add(p);
					
					
				}
				Employee e=new Employee(name,surname,age,lp,l);
				String jsonInString = new Gson().toJson(e);
				logic.write("/user/paolo/survey.txt",jsonInString);
				System.out.println(jsonInString);
				
				
				}} catch (IOException ioe) {
		         System.out.println(ioe);
		      }
		
		
		
		
		
		
		
		
		
		
		
	
}
}
}
