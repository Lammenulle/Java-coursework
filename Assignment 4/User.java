import java.util.ArrayList;

public class User {
    
private Message[] inbox;
private int messageCount;

//Implement the constructor User()
public User(){
    //initialise the field inbox with an empty array of size 20, and assign zero to the field messageCount.
    this.inbox = new Message[20]; 
    this.messageCount = 0;
}



public String addMessage(Message msg) {
    //Modify the addMessage method such that, if the inbox is full, it just returns  "Sorry, the inbox is full!"
    if (messageCount == inbox.length) {
        return "Sorry, the inbox is full!";
    }
        //Only if the inbox is not full, it adds the message in the inbox and returns "Message is added!"
        if (messageCount < inbox.length)
            inbox[messageCount] = msg;
            messageCount++;
    
        return "Message is added!";
}
//mplement the method boolean sendMessage(Message msg)
public boolean sendMessage(Message msg) {
    //If the message is successfully added in the inbox of the receiver, that is if the inbox of the receiver is not full
    if (messageCount < 20){
        //that adds msg in the inbox of the receiver of the message msg.
        //Hint: use the addMessage method as a helper method
        addMessage(msg);
        //the method returns true
        return false;
    
        //Otherwise, it returns false. 
    } else {
        
        return true;
    }
} 

public String readMessage() {

    //if the inbox is empty, the method returns "There is no message to read!" 
    if (messageCount == 0) {
        return "There is no message to read!";
    } else {
       
        //Otherwise, it returns the value of text field of the first message in the inbox the message at index 0
        String messageText = inbox[0].getText();
        
       
        //And the remaining messages in the inbox, if any, should be shifted one position to the left.
        for (int i = 0; i < messageCount - 1; i++) {
            inbox[i] = inbox[i + 1];
        }
         // and deletes the message from inbox.
        //Hint: deleting the message involves decreasing the value of messageCount.
        messageCount--;        
        
        return messageText;
    }
}


}











