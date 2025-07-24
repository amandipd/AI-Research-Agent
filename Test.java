// class is a container for related functions
// to name classes we use PascalNamingConvention
// to name methods use camelNamingConvention

/*
How Java Code Gets Executed
- compiled language -> conversts files to bytecode files
- 
 */
// ending timestamp: 37:47
import java.util.Date;

class Test {
    public static void main(String[] args) {
        long viewsCount = 3_123_456_789l;
        float price = 10.99f;
        char letter = 'A';
        boolean isEligible = true;

        byte age = 30; // primitive type
        Date now = new Date();  // reference type, allocate memory
        now.getTime()

        System.out.println("HELLO WORLD JAVA " + viewsCount + " Price: " + price);
    }
}