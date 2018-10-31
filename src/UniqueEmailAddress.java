import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
    private static int numberOfUniqueEmails(String emails[]){
        Set<String> set = new HashSet<String>();
        for(String email: emails){
            // Split email at @ to separate localname and domain name
            String[] parts = email.split("@");

            // Split parts to get rid of '+' symbol and replace '.'
            // For all special characters that have some meaning in a regex, you need to have "\\" as a prefix to your regex.
            String []localParts = parts[0].split("\\+");

            // Add localParts[0] and parts[1] to the set
            set.add(localParts[0].replace(".", "")+"@"+parts[1]);
        }
        return set.size();

    }
    public static void main(String[] args) {
        String input[] = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int count = numberOfUniqueEmails(input);
    }
}

