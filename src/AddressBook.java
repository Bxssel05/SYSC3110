import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;   //collection of BuddyInfo objects

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }
}

