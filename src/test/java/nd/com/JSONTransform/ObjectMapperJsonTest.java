package nd.com.JSONTransform;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.fasterxml.jackson.databind.ObjectMapper;

import nd.com.JSONTransform.model.User;

public class ObjectMapperJsonTest {

	ObjectMapperJson objectMapperJson;
	@Mock
	ObjectMapper objectMapper;
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		objectMapper = new ObjectMapper();
		objectMapperJson = new ObjectMapperJson();
	}

	@Test
	public void testReadJsonWithObjectMapper() throws IOException {
		User user = new User();
		
		//error
		when(objectMapper.readValue(Mockito.anyString(), Mockito.eq(User.class))).thenReturn(user);
		//error
		verify(objectMapper, times(1)).readValue(Mockito.anyString(), Mockito.eq(User.class));
		
		user = objectMapperJson.readJsonWithObjectMapper();
		assertEquals(123, user.getId());
	}

}
