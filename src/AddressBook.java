import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;   //collection of BuddyInfo objects

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null){
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < buddies.size() ){
            return buddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        //this is for step 17
    }
}

