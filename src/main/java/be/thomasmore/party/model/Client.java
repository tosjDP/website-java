package be.thomasmore.party.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    private Integer id;
    private String name;
    private String birthdate;
    private String gender;
    private String startDate;

    public Client(String startDate, String name, String birthdate, String gender) {
       this.startDate=startDate;
        this.name = name;
        this.birthdate = birthdate;
        this.setGender(gender);
    }
    public Client() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setGender(String gender) {
        this.gender="U";
        if (gender.equals("M")||gender.equals("F"))
        this.gender = gender;

    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
