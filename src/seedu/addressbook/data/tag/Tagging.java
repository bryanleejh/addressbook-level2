package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    private Person personInvolved;
    private Tag tagInvolved;
    private action status;
    private enum action {ADDED, DELETED};
    
    public Tagging(Person personInvolved, Tag tagInvolved, boolean isAdded) {
        this.personInvolved = personInvolved;
        this.tagInvolved = tagInvolved;
        this.status = action.ADDED;
    }
    
    public String toString() {
        return status + " " + personInvolved.getName().toString() + " " + tagInvolved.toString();
    }
}