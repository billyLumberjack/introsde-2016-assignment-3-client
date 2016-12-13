package introsde.assignment.soap.client;

import introsde.assignment.soap.ws.People;
import introsde.assignment.soap.ws.PeopleService;

import java.io.PrintWriter;
import java.util.List;

import introsde.assignment.soap.ws.Measure;
import introsde.assignment.soap.ws.Person;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 //STEP2
		
		
		try {
			PrintWriter writer = new PrintWriter("soap-client.log", "UTF-8");
			//STEP 1
			writer.println("https://sm-introsde-assignment-3.herokuapp.com/ws/people?wsdl");
			
			PeopleService service = new PeopleService();
			People lifecoach = service.getPeopleImplPort();
			
			//M7
			List<String> tt = lifecoach.readMeasuresTypes();
			if(tt.size()>0)
				writer.println("M7: Avaiable measurement types \n response: " + tt + "\n");
	       	
			//M1: ask for people list
			List<Person> pp = lifecoach.getPeopleList();
			if(pp.size()>0)
				writer.println("M1: People list size, \n response " + pp.size() + "\n");			
			
			//M2: ask for first person inside the response
			Person p1 = lifecoach.readPerson(pp.get(0).getId());
			if(p1 != null)
				writer.println("M2: Retrieved person with id " + p1.getId() + "\n response: "+ p1.toString() +"\n");
			
			//M3: update p1
			p1.setFirstname("Samuele");
			p1.setLastname("Malavasi");
			p1 = lifecoach.updatePerson(p1);
			if(p1.getFirstname().equals("Samuele") && p1.getLastname().equals("Malavasi"))
				writer.println("M3: p1 updated succesfully! set firstname: Samuele and lastname:Malavasi\n response "+p1.toString()+"\n");
			
			//M4
			Person p2 = new Person();
			p2.setBirthdate("15/7/1991");
			p2.setFirstname("Davide");
			p2.setLastname("Falezza");
			p2.setHealthHistory(p1.getHealthHistory());
			for(Measure m : p1.getHealthHistory().getHealthHistory()){
				m.setId(0);
			}
			p2 = lifecoach.createPerson(p2);
			
			if(p2.getId()>0)
				writer.println("M4: p2 created! \n response:"+p2.toString()+"\n");
			
			//M5: 
			if(lifecoach.deletePerson(p2.getId()) == 0)
				writer.println("M5: p2 deleted!\nresponse: "+p2.toString()+"\n");
			
			//M6: 
			List<Measure> mm = lifecoach.readPersonHistory(p1.getId(), tt.get(0));
			if(mm.size()>0)
				writer.println("M6: person whose id is "+p1.getId()+" history size,\n response size: "+ mm.size() + "\n");

			
			//M8: 
			Measure m = lifecoach.readPersonMeasure(p1.getId(), tt.get(0), mm.get(0).getId());
			if(m!=null)
				writer.println("M8: Retrieved measure with id "+ m.getId() + "\n response: "+m.toString()+"\n");
			
			//M9: 
			m = new Measure();
			m.setDateRegistered("08/03/1992");
			m.setMeasureType("height");
			m.setMeasureValue("200.0");
			m.setMeasureValueType("double");
			
			m = lifecoach.savePersonMeasure(p1.getId(), m);
			if(m.getId()!=0)
				writer.println("M9: measure stored!\n response: "+m.toString()+"\n");
			
			//M10: 
			m.setMeasureValue("199");
			m = lifecoach.updatePersonMeasure(p1.getId(), m);
			if(m.getId()!=0)
				writer.println("M10: measure updated! set value to 199\n response: "+m.toString()+"\n");  
			
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}
}
