/******
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
******/

class SolutiondefangedIPAddress {
    public String defangIPaddr(String address) {
         String defangedIPAddress = "";
         int length= address.length();
        for(int i=0;i<length;i++)
        {
            char c = address.charAt(i);
            
        if(c=='.')
            defangedIPAddress+= "[.]";
        else 
            defangedIPAddress+= c;

        }
        return defangedIPAddress;
    }
}
