package client.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import final1.ws.Goal;
import final1.ws.Healthprofile;
import final1.ws.People;
import final1.ws.PeopleService;
import final1.ws.Person;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

@Stateless // will work only inside a Java EE application
@LocalBean // will work only inside a Java EE application
@Path("/person")
public class PersonCollectionResource {

    // Allows to insert contextual objects into the class,
    // e.g. ServletContext, Request, Response, UriInfo
    @Context
    UriInfo uriInfo;
    @Context
    Request request;

  PeopleService service = new PeopleService();
  People pService = service.getPeopleImplPort();
  ObjectMapper objectMapper = new ObjectMapper();
	    String arrayToJson = "";
    // Return the list of people
    @GET
    @Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
    public String getPersonsBrowser() {
	System.out.println(" Getiing data ");
	arrayToJson = "";
	  try {
	   List<Person> hp = pService.getAllPeople();
	     arrayToJson = objectMapper.writeValueAsString(hp);
	} catch (JsonProcessingException ex) {
	    Logger.getLogger(PersonCollectionResource.class.getName()).log(Level.SEVERE, null, ex);
	}
	return arrayToJson;
    }


//Save new person    
@POST
@Consumes({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML})
public Person createPerson(String pp){
	 return  pService.savePerson(pp);
}

//Edit person 
@PUT
@Path("/user")
   @Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML})
   @Consumes({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML})
    public String newPerson(String person) {

	String ss = pService.updatePerson(person).toString();
	   System.out.println("sssss "+ss);
      return ss;
    }
    
    
//Delete a person
    @DELETE
    @Path("/{personId}")
    public String delPerson(@PathParam("personId") int id) throws IOException {
	System.out.println("deleting person with id " + id );            
      Person p = new Person();
      p.setPid(id);
      System.out.println("fififi "+pService.removePerson(id));
      arrayToJson = "";
      try {
	    List<Person> pip = pService.getAllPeople();
	     arrayToJson = objectMapper.writeValueAsString(pip);
	} catch (JsonProcessingException ex) {
	    Logger.getLogger(PersonCollectionResource.class.getName()).log(Level.SEVERE, null, ex);
	}
	return arrayToJson;
    }

    //Delete a health profile
    @DELETE
    @Path("/hp/{hid}")
    public String delHP(@PathParam("hid") int id) throws IOException {
	System.out.println("deleting hp with id " + id );            
      
      pService.removeHealth(id);
      arrayToJson = "";
      try {
	    List<Person> pip = pService.getAllPeople();
	     arrayToJson = objectMapper.writeValueAsString(pip);
	} catch (JsonProcessingException ex) {
	    Logger.getLogger(PersonCollectionResource.class.getName()).log(Level.SEVERE, null, ex);
	}
	return arrayToJson;
    }    
    
    //Get a person using their id
    @GET
    @Path("/{personId}")
    @Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML})
    public Person getPerson(@PathParam("personId") int id) {
	
	//System.out.println("hp "+pService.getHealthprofByPid(id));
	//Personz p = PersonMtd.returnPersonById(int personId);
        return pService.getPersonById(id);
    }

//Get a person's health details
@GET
@Path("/hp_detls/{pid}")
@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
public String getPersonhp(@PathParam("pid") int id){
      arrayToJson = "";
      try {
	    List<Healthprofile> hp = pService.getHealthprofByPid(id);
	    if(!hp.isEmpty()){
		String wt="";String ht="";
		for(Healthprofile h:hp){
		if(h.getTid().getType().equals("weight"))
		    wt = h.getValue();
		if(h.getTid().getType().equals("height"))
		    ht = h.getValue();
		}
arrayToJson = "{pid:\""+hp.get(0).getPid().getPid()+"\",firstname:\""+hp.get(0).getPid().getFirstname()+"\",lastname:\""+hp.get(0).getPid().getLastname()+"\",birthdate:\""
	+ ""+hp.get(0).getPid().getBirthdate()+"\",ht:\""+ht+"\",wt:\""+wt+"\"}";
	    }
	    else{
	    Person p = pService.getPersonById(id);
	    arrayToJson = "{pid:\""+p.getPid()+"\",firstname:\""+p.getFirstname()+"\",lastname:\""+p.getLastname()+"\",birthdate:\""
	+ ""+p.getBirthdate()+"\",ht:\"\",wt:\"\"}";
	    }
	    
	} catch (Exception ex) {
	    Logger.getLogger(PersonCollectionResource.class.getName()).log(Level.SEVERE, null, ex);
}
	return arrayToJson;
}


//Get a person's health profile list
@GET
@Path("/hp_hist/{pid}")
@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
public String getPersonhp_hist(@PathParam("pid") int id){
      arrayToJson = "[";
      try {
	    List<Healthprofile> hp = pService.getHealthprofByPid(id);
	 if(!hp.equals(null))
	     for(Healthprofile h:hp){
		 String wt="";String ht="";
		 if(h.getTid().getType().equals("weight"))
		    wt = h.getValue();
		if(h.getTid().getType().equals("height"))
		    ht = h.getValue();
		
	    arrayToJson += "{hid:\""+h.getHid()+"\",date:\""+h.getDatecreated()+"\",wt:\""+wt+"\",ht:\""+ht+"\"}";
	     }
	 if(arrayToJson.contains("}{"))
	 arrayToJson = arrayToJson.replace("}{", "},{");
	 arrayToJson=arrayToJson+"]";
	} catch (Exception ex) {
	    Logger.getLogger(PersonCollectionResource.class.getName()).log(Level.SEVERE, null, ex);
}
	return arrayToJson;
}

//Save a health profile
@POST
@Path("/hp")
public String addHP(String hp){
    arrayToJson="";
    try {
	     arrayToJson = objectMapper.writeValueAsString(pService.saveHealthprofile(hp));
	} catch (JsonProcessingException ex) {
	   ex.printStackTrace();
	}
     return arrayToJson;
}
////Edit a health profile
@PUT
@Path("/hp")
public String updateMeasureid(String hp){
   
	   System.out.println("hahaha "+hp);
	return pService.updateHealth(hp).toString();
 
}

//Get a person's goals, returned in json
@GET
@Path("/gol/{personId}")
public String getPersongol(@PathParam("personId") String id){
    String []dt = id.split("~~");
 arrayToJson = "[";
  List<Goal> gl = pService.getGoalByPid(Integer.parseInt(dt[0]));
  for(Goal g:gl){
      String []gg = g.getGoal().split("~~");
    arrayToJson += "{gid:\""+g.getGid()+"\",date:\""+gg[0]+"\",val:\""+gg[1]+"\"}";
	     }
	 if(arrayToJson.contains("}{"))
	 arrayToJson = arrayToJson.replace("}{", "},{");
	 arrayToJson+="]";
	 
	 if(dt.length>1){
	     System.out.println("size "+gl.size());
	     if(gl.size()>0)
	     return gl.get(gl.size()-1).getGoal().split("~~")[1];
	     else return "";
	 }
	     else
  return arrayToJson;
}

//Save a goal
@POST
@Path("/gol")
public String addGoal(String g){
    return pService.saveGoal(g).toString();
}

//Save a type
@POST
@Path("/typ")
public String addType(String t){
    arrayToJson="";
    try {
	     arrayToJson = objectMapper.writeValueAsString(pService.saveType(t));
	} catch (JsonProcessingException ex) {
	    Logger.getLogger(PersonCollectionResource.class.getName()).log(Level.SEVERE, null, ex);
	}
     return arrayToJson;
}

//Get types in the db
@GET
@Path("/typ")
public String getType(){
    
    arrayToJson="";
    try {
	     arrayToJson = objectMapper.writeValueAsString(pService.getAllType());
	} catch (JsonProcessingException ex) {
	    Logger.getLogger(PersonCollectionResource.class.getName()).log(Level.SEVERE, null, ex);
	}
     return arrayToJson;
}

//Get a type by type id
@GET
@Path("/typ/{typ}")
public String getTypeByType(@PathParam("typ") String typ){
	try {
	     arrayToJson = objectMapper.writeValueAsString(pService.getTypeByString(typ));
	} catch (JsonProcessingException ex) {
	    Logger.getLogger(PersonCollectionResource.class.getName()).log(Level.SEVERE, null, ex);
	}
     return arrayToJson;
}

////Edit a goal
@PUT
@Path("/gol")
public String updateGoal(String g){   
	
	return pService.updateGoal(g).toString(); 
}

//Delete a particular goal
 @DELETE
    @Path("/gol/{gid}")
    public String delGl(@PathParam("gid") int id) throws IOException {
	System.out.println("deleting hp with id " + id );            
      
      pService.deleteGoal(id);
      arrayToJson = "";
      try {
	    List<Person> pip = pService.getAllPeople();
	     arrayToJson = objectMapper.writeValueAsString(pip);
	} catch (JsonProcessingException ex) {
	    Logger.getLogger(PersonCollectionResource.class.getName()).log(Level.SEVERE, null, ex);
	}
	return arrayToJson;
    }  

}