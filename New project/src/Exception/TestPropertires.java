package Exception;

import java.util.Enumeration;
import java.util.Properties;

public class TestPropertires {

	public static void main(String[] args) {
		Properties prop = System.getProperties();
		Enumeration enumname = prop.propertyNames();
		while (enumname.hasMoreElements())
		{
			String propName = (String) enumname.nextElement();
			String property = prop.getProperty(propName);
			System.out.println("property"+propName+" is "+ property);
		}
	}

}
