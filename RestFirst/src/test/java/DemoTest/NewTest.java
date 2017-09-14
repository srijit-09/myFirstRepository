package DemoTest;

import org.testng.annotations.Test;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import io.restassured.RestAssured.*;
import io.restassured.builder.*;
import io.restassured.http.*;
import io.restassured.path.json.JsonPath;
import io.restassured.assertion.*;
//import io.restassured.itest.java.support.WithJetty;
import io.restassured.response.Response;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.post;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.*;

public class NewTest {

	HashMap<String, String> properties = new HashMap<String, String>();
	String getBRMURL = "http://webs-pub-test-v1-be-qal.api.intuit.net/brm-virtual-time-service/v2/brmvirtualtime/qal1/date";

	/*
	 * @Test(dataProvider = "dp")
	 * 
	 * public void getBRMtime(int number, String value) {
	 * 
	 * given().when().get(getBRMURL).then().statusCode(200).body("environment",
	 * equalTo("qal1"));
	 * 
	 * 
	 * String response = given().header("Authorization",
	 * "ntuit_IAM_Authentication intuit_token_type=IAM-Ticket, intuit_appid=Intuit.platform.ebseasqaservicestestframework.ebseasqatestclient,intuit_app_secret=preprdxVL2dCN3bFgsEeN0YFgdTKaG9tzB2kEkdw"
	 * ).get("getBRMURL").body().asString();
	 * 
	 * System.out.println(response); }
	 * 
	 * 
	 * 
	 * public void getRealm(Integer n, String s) {
	 * 
	 * 
	 * post("http://syntheticperson.intuit.net/?key=new&contacts=4").then();
	 * 
	 * }
	 */

	@Test(dataProvider = "dp")
	public void getAddress(String Adressline1, String city, String State, String zipcode) {

		String address = "{\"addressLine1\":\" "+Adressline1+"\","
				+ "\"addressLine2\":null,"
				+ "\"addressLine3\":null,"
				+ "\"addressLine4\":null,"
				+ "\"building\":\"RSA Union Bldg\","
				+ "\"city\":\""+city+"\","
				+ "\"state\":\""+State+"\","
				+ "\"zipCode\":\""+zipcode+"\","
				+ "\"zip4\":null, "
				+ "\"isocountryCode\":\"US\"}";
/*
		String response = given().header("Authorization",
				"Intuit_IAM_Authentication intuit_appid=Intuit.platform.ebseasqaservicestestframework.ebseasqatestclient, intuit_app_secret=preprdxVL2dCN3bFgsEeN0YFgdTKaG9tzB2kEkdw")
				.header("Content-Type", "application/json").header("Accept", "application/json")
				.header("intuit_originatingip", "123.45.67.89").header("intuit_tid", "12345-67890-12345-67890-123451")
				.header("intuit_locale", "en_US").body(address)
				.post("https://standardaddress-prf.platform.intuit.net/v1/StandardizedAddress").body().asString();
		*/
		
		Header hear = new Header(address, address);
		Header hea1 = new Header(address, address);
		Header hear2 = new Header(address, address);
		Header hear3 = new Header(address, address);
		Headers headers = new Headers(hear,hea1,hear2,hear3);
		
		
		given().headers(headers).post();
		
Response addressresponse=		given().header("Authorization",
				"Intuit_IAM_Authentication intuit_appid=Intuit.platform.ebseasqaservicestestframework.ebseasqatestclient, intuit_app_secret=preprdxVL2dCN3bFgsEeN0YFgdTKaG9tzB2kEkdw")
				.header("Content-Type", "application/json").header("Accept", "application/json")
				.header("intuit_originatingip", "123.45.67.89").header("intuit_tid", "12345-67890-12345-67890-123451")
				.header("intuit_locale", "en_US").body(address)
				.post("https://standardaddress-prf.platform.intuit.net/v1/StandardizedAddress");


JsonPath jsonpath = addressresponse.jsonPath();

String zip4= jsonpath.get("zip4");
String countyCode=jsonpath.get("countyCode");
String state=jsonpath.get("state");
String cityCode=jsonpath.get("city");

System.out.println("the zip4 is :"+zip4 + "the county Code is" + countyCode + "for state " +state + "citycodeis"+ cityCode);
//System.out.println(jsonpath.toString());

	//	System.out.println(response);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "863 Great Northern","Helena","Montana","59601"},
			new Object[] { "505 N 27th St","Lincoln","Nebraska","68503"},
			new Object[] { "2073 Hwy 50 E","Carson City","Nevada","89703"},
			new Object[] { "39 N Main St","Concord","New Hampshire","03301"},
			new Object[] { "101 South Warren Street","Trenton","New Jersey","08608"},
			new Object[] { "66-70 E San Francisco St","Santa Fe","New Mexico","87501"},
			new Object[] { "1 North Pearl Street","Albany","New York","12207"},
			new Object[] { "150 Fayetteville Street","Raleigh","North Carolina","27601"},
			new Object[] { "414 South 3rd Street","Bismarck","North Dakota","58504"},
			new Object[] { "107 South High Street","Columbus","Ohio","43215"},
			new Object[] { "119 W Main St","Oklahoma City","Oklahoma","73102"},
			new Object[] { "401 Center St NE","Salem","Oregon","97301"},
			new Object[] { "1500 N. 3rd Street","Harrisburg","Pennsylvania","17102"},
			new Object[] { "2 Kennedy Plaza","Providence","Rhode Island","02903"},
			new Object[] { "1421 Sumter St","Columbia","South Carolina","29201"},
			new Object[] { "512 W Sioux Ave","Pierre","South Dakota","57501"},
			new Object[] { "530 Church St","Nashville","Tennessee","37219"},
			new Object[] { "809 Congress Ave","Austin","Texas","78701"},
			new Object[] { "18 W 100 South","Salt Lake City","Utah","84101"},
			new Object[] { "28 State Street","Montpelier","Vermont","05602"},
			new Object[] { "30 N 8th St","Richmond","Virginia","23219"},
			new Object[] { "1023 Capitol Way S","Olympia","Washington","98501"},
			new Object[] { "333 Laidley Street","Charleston","West Virginia","25301"},
			new Object[] { "711 State Street","Madison","Wisconsin","53703"},
			new Object[] { "1802 Central Ave","Cheyenne","Wyoming","82001"},
			new Object[] { "Rte 1","Pago Pago","American Samoa","96799"},
			new Object[] { "Marine Corps Drive","Hagatna","Guam","96913"},
			new Object[] { "Middle Rd","Saipan","Northern Mariana Islands","96950"},
			new Object[] { "00918","San Juan","Northern Mariana Islands","00918"},
			new Object[] { "Rte 313","harlotte Amalie","U.S. Virgin Islands","00802"},
			new Object[] { "1201 G St. NW","Washington, DC","Washington, DC","20015"},

		};
	}
}
