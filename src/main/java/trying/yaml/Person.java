package trying.yaml;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Person {
    private int id;
    private String name;
    private LocalDate birth;
    private List<PersonEmails> personEmails;
}