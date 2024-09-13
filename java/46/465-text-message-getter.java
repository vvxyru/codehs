// Messages.java
public class Messages extends ConsoleProgram
{
    public void run()
    {
        // Your code here.
        // Create the two TextMessage objects and print them out.
        
        TextMessage t1 = new TextMessage("Bob", "Gurt", "Hello dud");
        TextMessage t2 = new TextMessage("Ronald", "Gilbert", "Hello buddy");
        
        System.out.println(t1);
        System.out.println(t2);
    }
}

// TextMessage.java
public class TextMessage
{
    private String message;
    private String sender;
    private String receiver;
    
    public TextMessage(String from, String to, String theMessage)
    {
        sender = from;
        receiver = to;
        message = theMessage;
    }
    
    public String getSender()
    {
        return sender;
    }
    
    public String getReceiver()
    {
        return receiver;
    }
    
    public String getMessage()
    {
        return message;
    }
    
    public String toString()
    {
        return sender + " texted " + receiver + ": " + message;
    }
}
