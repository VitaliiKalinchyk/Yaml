package trying.yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main( String[] args ) throws IOException {
        File file1 = new File("person.yml");
        File file2 = new File("person2.yml");

        YAMLFactory yamlFactory = new YAMLFactory();
        ObjectMapper objectMapper = new ObjectMapper(yamlFactory);
        objectMapper.findAndRegisterModules();
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        Person person = objectMapper.readValue(file1, Person.class);
        System.out.println(person);

        objectMapper.writeValue(file2, person);
    }
}