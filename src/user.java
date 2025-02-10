import java.util.*;
import java.io.*;

public class User
{
    private static int ID = 0; // static int to represent user ID;
    

    public User() // user constructor
    {
        ID+=1;  // increments static ID by 1
    }

    public getID()
    {
        return ID; // returns ID
    }
}