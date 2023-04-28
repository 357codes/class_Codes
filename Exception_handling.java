import java.util.*;
public class ExceptionHandling
{
public static vod main(String args[])
{
try
{
int x = 125/0;
System.out.println(x);
}
catch(NullPointerExceotion e)
{
System.out.println("Exception");
}
finally
{
System.out.println("Exception");
}
finally
{
System.out.println("Done");
}
}
}