package example;

import org.junit.jupiter.api.Test;
import org.openapitools.client.model.Zoo;

import java.io.IOException;

public class ExampleServiceTest {



    @Test
    void foo() throws IOException {
        var zoo = TestingUtil.getObjectFromJson("cat.json", Zoo.class);
        System.out.println(zoo);

    }


}
