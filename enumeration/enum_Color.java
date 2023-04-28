enum Color
{
RED,
BLACK,
WHITE;
}

class MainEnum
{


public static void main(String[] args)
{
Color c_arr[]=Color.values();
for(Color col:c_arr)
System.out.println(col+" at index "+col.ordinal());

System.out.println(Color.valueOf("BLUE"));
}
}