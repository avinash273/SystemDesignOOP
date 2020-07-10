import java.util.Date;

public class Member extends Account {
    private Date dateOfMembership;
    private int totalBooksCheckedOut;

    public int getTotalBooksCheckedOut() {
        return totalBooksCheckedOut;
    }

    public boolean checkoutBookItem(BookStatus bookStatus){
        if(this.getTotalBooksCheckedOut() >= Constants.MAX_BOOKS_PER_PERSON)
            return false;
        else
            return true;
    }
}
