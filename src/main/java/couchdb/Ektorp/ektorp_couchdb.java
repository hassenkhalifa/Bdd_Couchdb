package couchdb.Ektorp;

import java.net.MalformedURLException;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

public class ektorp_couchdb {

	public static void main(String[] args) throws MalformedURLException {

		createData("John", "Doe", "female", "1981-03-21", "2010-03-13T02:10:23.099+0000", "41.138.53.138",
				"Internet Explorer", 1263);
		updateData("41455");
		deleteData("aed95edf931fd28f56cfa891ed01fd0a");
	}

	public static void uploadData() throws MalformedURLException {
		HttpClient httpClient = new StdHttpClient.Builder().url("http://127.0.0.1:5984").username("admin")
				.password("admin").build();
		CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
		CouchDbConnector connector = dbInstance.createConnector("customer", true);

		Person person = new Person();

		person.setfirstName("John");
		person.setlastName("Doe");
		person.setgender("female");
		person.setbirthday("1981-03-21");
		person.setcreationDate("2010-03-13T02:10:23.099+0000");
		person.setlocationIP("41.138.53.138");
		person.setbrowserUsed("Internet Explorer");
		person.setplace(1263);
		connector.create("41455", person);
		System.out.println(person.getId());

	}

	public static void createData(String firstName, String lastName, String gender, String birthday,
			String creationDate, String locationIP, String browserUsed, int place) throws MalformedURLException {
		HttpClient httpClient = new StdHttpClient.Builder().url("http://127.0.0.1:5984").username("admin")
				.password("admin").build();
		CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
		CouchDbConnector connector = dbInstance.createConnector("customer", true);

		Person person = new Person();

		person.setfirstName("John");
		person.setlastName("Doe");
		person.setgender("female");
		person.setbirthday("1981-03-21");
		person.setcreationDate("2010-03-13T02:10:23.099+0000");
		person.setlocationIP("41.138.53.138");
		person.setbrowserUsed("Internet Explorer");
		person.setplace(1263);
		connector.create(person);

	}

	public static void updateData(String id) throws MalformedURLException {
		HttpClient httpClient = new StdHttpClient.Builder().url("http://127.0.0.1:5984").username("admin")
				.password("admin").build();
		CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
		CouchDbConnector connector = dbInstance.createConnector("customer", true);
		Person personup = connector.get(Person.class, id);
		personup.setfirstName("bruhh");
		personup.setlastName("gogo");

		/*
		 * personup.setgender("female"); personup.setbirthday("1981-03-21");
		 * personup.setcreationDate("2010-03-13T02:10:23.099+0000");
		 * personup.setlocationIP("41.138.53.138");
		 * personup.setbrowserUsed("Internet Explorer"); personup.setplace(1263);
		 */
		connector.update(personup);
	}

	public static void deleteData(String id) throws MalformedURLException {
		HttpClient httpClient = new StdHttpClient.Builder().url("http://127.0.0.1:5984").username("admin")
				.password("admin").build();
		CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
		CouchDbConnector connector = dbInstance.createConnector("customer", true);
		Person persondel = connector.get(Person.class, id);
		connector.delete(persondel);
	}

}
