package studyForBook.sprung.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Input {

    @Email
    private String name;

    @NotEmpty
    private String vendor;

    @NotNull
    private String state;
}
