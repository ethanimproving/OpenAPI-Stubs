package example;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class TestingUtil
{
   public static < T > T getObjectFromJson( String path,
                                            Class< T > objClassName )
      throws IOException
   {
      InputStream inputStream = null;
      T value;
      try
      {
         ClassLoader classLoader = TestingUtil.class.getClassLoader();
         inputStream = classLoader != null ? classLoader.getResourceAsStream( path ) : null;
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                           false );
         value = mapper.readValue( inputStream,
                                   objClassName );
      }
      finally
      {
         if( inputStream != null )
         {
            inputStream.close();
         }
      }
      return value;
   }

}
