import java.io.File;
public class Employee_Remove
{
    public void removeFile(String ID)
    {
        File file = new File("file" + ID + ".txt");
        if (file.exists())
        {
            if(file.delete())
            System.out.println("\nEmployee has been removed Successfully");
        }
        else
        System.out.println("\nEmployee does not exist :( ");
    }
}
