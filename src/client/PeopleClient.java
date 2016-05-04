package client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import final1.ws.People;
import final1.ws.PeopleService;
import final1.ws.Person;
import java.util.List;

/**
 *
 * @author benhur
 */
public class PeopleClient{
    public static void main(String[] args) throws Exception {
        PeopleService service = new PeopleService();
        People people = service.getPeopleImplPort();
        Person p = people.readPerson(2);
        List<Person> pList = people.getPeopleList();
        System.out.println("Result ==> "+p);
        System.out.println("Result ==> "+pList);
        System.out.println("First Person in the list ==> "+pList.get(0).getFirstname());
    }
}
