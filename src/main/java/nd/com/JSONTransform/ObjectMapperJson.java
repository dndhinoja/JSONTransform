package nd.com.JSONTransform;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

import com.fasterxml.jackson.databind.ObjectMapper;

import nd.com.JSONTransform.model.User;

public class ObjectMapperJson {
	
	public User readJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String file = "src/main/resources/user.json";
        String json = new String(Files.readAllBytes(Paths.get(file)));
        User user = objectMapper.readValue(json, User.class);
        //logger.info(emp.toString());
        return user;
    }


}
