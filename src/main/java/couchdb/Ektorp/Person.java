package couchdb.Ektorp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
	@JsonProperty("_id")
	private String id;
	@JsonProperty("_rev")
	private String revision;
	private String firstName;
	private String lastName;
	private String birthday;
	private String creationDate;
	private int place;
	private String browserUsed;
	private String locationIP;
	private String gender;

	public String getId() {
		return id;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public void setbirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setcreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public void setlocationIP(String locationIP) {
		this.locationIP = locationIP;
	}

	public void setbrowserUsed(String browserUsed) {
		this.browserUsed = browserUsed;
	}

	public void setplace(int place) {
		this.place = place;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public int getPlace() {
		return place;
	}

	public String getBrowserUsed() {
		return browserUsed;
	}

	public String getLocationIP() {
		return locationIP;
	}

	public String getGender() {
		return gender;
	}
}
