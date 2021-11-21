package studyForBook.sprung.model.dtos;

import lombok.Data;
import studyForBook.sprung.model.SampleOtnConnections;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
public class SampleOtnConnectionsDto {
    @NotBlank(message = "The city is required.")
    private String name;

    @NotBlank(message = "The city is required.")
    private String vendor;

    @NotBlank(message = "The city is required.")
    private String state;

    public SampleOtnConnectionsDto(String name, String vendor, String state) {
        this.name = name;
        this.vendor = vendor;
        this.state = state;
    }

    public SampleOtnConnections toOtnConnection() {
        SampleOtnConnections result = new SampleOtnConnections(name, vendor, state);
        return result;

    }

    @Override
    public String toString() {
        return name + " " + vendor + " "+ state;
    }


}
