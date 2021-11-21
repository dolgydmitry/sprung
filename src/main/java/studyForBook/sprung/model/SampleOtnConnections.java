package studyForBook.sprung.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;


@Table(name = "otn_connections")
@Entity
@Data
//@Accessors(chain = true)
public class SampleOtnConnections {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String vendor;
    private String state;

    public SampleOtnConnections() {
    }

    public SampleOtnConnections(String name, String vendor, String state) {
        this.name = name;
        this.vendor = vendor;
        this.state = state;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return name + " " + vendor + " "+ state;
    }

}
