//====================================================================================================//
import javax.net.ssl.HttpsURLConnection;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import java.net.URL;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Scanner;
import org.apache.commons.codec.binary.Base64;
//====================================================================================================//
public class Main_ 
{
private static final String  username = "nanri-test";
private static final String  password = "!Nanri0118";
        static       Result  result;
//----------------------------------------------------------------------------------------------------//
/**
 * Run the web service request
 */
public static void main(String[] args) 
{
/*1.*/ HttpsURLConnection conn = null;
/*2.*/ try 
{
// Create url to the Device Cloud server for a given web service request
/*2.1.*/ URL url = new URL("https://devicecloud.digi.com/ws/DataStream/");	
conn = (HttpsURLConnection)url.openConnection(); 
conn.setDoOutput(true);
conn.setDoInput(true);
conn.setRequestMethod("GET"); 

// Build authentication string
String userpassword = username + ":" + password;

// Can change this to use a different base64 encoder
String encodedAuthorization = Base64.encodeBase64String(userpassword.getBytes()).trim();

// Set request headers
conn.setRequestProperty("Authorization", "Basic " + encodedAuthorization);
// Get input stream from response and convert to String
InputStream   is        = conn.getInputStream();

Scanner       isScanner = new Scanner(is, "UTF-8");
StringBuffer  buf       = new StringBuffer();
/*2.2.*/ while (isScanner.hasNextLine()) 
{
buf.append(isScanner.nextLine() + "\n");
} // 2.2.
/*2.3.*/ String responseContent = buf.toString();

// Add line returns between tags to make it a bit more readable
responseContent = responseContent.replaceAll("><", ">\n<");

System.out.println(responseContent);

// Parse data into Java POJO classes, holding this information
JAXBContext  jaxbContext  = JAXBContext.newInstance(Result.class);
Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
StringReader reader       = new StringReader(responseContent);
             result       = (Result)unmarshaller.unmarshal(reader);

// Check  result of unmarshalling
// Result r = JAXB.unmarshal(new File("c://yourXml.xml"), Result.class);
// JAXB.marshal(r, System.out);

/*2.4.*/ if  (isScanner != null)  isScanner.close();

// Create  database
/*2.5.*/ DB_Conn_.db_cr();

} // 2. 
/*3.*/ catch (Exception e) 
{
// Print any exceptions that occur
e.printStackTrace();
} // 3. 
/*4.*/ finally 
{
/*4.1.*/ if (conn != null)  conn.disconnect();
} // 4.
} // public static void main(String[] args)
} // public class Main_
//====================================================================================================//
