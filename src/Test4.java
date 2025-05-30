
import java.util.HashMap;
import java.util.Map;


//Suppose there is an application that capture the IP Address of the user upon each click and that information is logged in the Audit logs. Find out who has the maximum number of clicks
public class Test4 {

    public static void main(String[] args) {
        // Sample audit log data (userId, IP address)
        String[] auditLogs = {
            "192.168.1.1",
            "192.168.1.2",
            "192.168.1.1",
            "192.168.1.3",
            "192.168.1.2",
            "192.168.1.1",
            "192.168.1.3",
            "192.168.1.1"
        };

        // Map to store the count of clicks for each user
        Map<String, Integer> userClickCount = new HashMap<>();

        // Process audit logs
        for (String log : auditLogs) {
        	Integer val =userClickCount.get(log);
        	if(val == null) {
				userClickCount.put(log, 1);
			} else {
				userClickCount.put(log, val + 1);
        		
        	}
        	
        }
        System.out.println(userClickCount);

        // Find the user with the maximum clicks
        String maxUser = null;
        int maxClicks = 0;
        for (Map.Entry<String, Integer> entry : userClickCount.entrySet()) {
            if (entry.getValue() > maxClicks) {
                maxUser = entry.getKey();
                maxClicks = entry.getValue();
            }
        }

        // Output the result
        System.out.println("User with maximum clicks: " + maxUser + " (" + maxClicks + " clicks)");
    }
}
