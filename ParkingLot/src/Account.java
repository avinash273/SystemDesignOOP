public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;
    //dummy.
    public abstract boolean resetPassword();
}
