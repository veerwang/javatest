import org.json.JSONArray;
import org.json.JSONObject;
import java.util.*;

public class Main {
	public static void main (String[] args)
	{
		System.out.println("json program test");
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("Name", "Tom");
		jsonObject1.put("age", "11");

		JSONObject jsonObject2 = new JSONObject("{'Name':'Jim','age':'12'}");

		JSONArray jsonArray2 = new JSONArray("['abc','xyz']");

        	//System.out.println("jsonObject1:" + "\r" + jsonObject1.toString());
        	System.out.println(jsonObject1.toString());
        	System.out.println(jsonObject2.toString());
        	System.out.println(jsonArray2.toString());


        	System.out.println(jsonObject1.getString("Name"));
        	System.out.println(jsonObject1.getString("age"));

		Map<String,String> map = new HashMap<String,String>();
		map.put("Name","kevin");
		map.put("age","98");

		JSONObject jsonObject3 = new JSONObject(map); 
        	System.out.println(jsonObject3.toString());
		if ( jsonObject3.getInt("age") == 98 )
			System.out.println(" object OK ");


	}
}
