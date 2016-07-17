package io.github.lumue.infojson;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * test nfo serialization of a movie entity
 */
public class InfojsonReaderTest {


    @Test
    public void testDeserialize() throws Exception {
        InfoJsonSerializer serializer = createSerializer();
        InputStream inputStream = InfojsonReaderTest.class.getResourceAsStream("example.nfo");
        Movie result=serializer.deserialize(inputStream);
        inputStream.close();
        assertNotNull("deserialized object should not be null",result);
    }

    private InfoJsonSerializer createSerializer() throws JAXBException {
        JAXBContext jaxbContext=JAXBContext.newInstance(Movie.class,Movie.Fileinfo.class,Movie.Actor.class);
        return new InfoJsonSerializer(jaxbContext);
    }


}