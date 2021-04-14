package Players;

import org.springframework.context.annotation.ComponentScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@ComponentScan
public class Player {

    @Id
    Integer id;

    String name;
    String club;
    String country;

    public Player() {
    }

    public Player(Integer id, String name, String club, String country) {
        super();
        this.id = id;
        this.name = name;
        this.club = club;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
