package jan11;

public class Encap {
    private String password;
    private String user_name;

    public Encap(String password, String user_name) {
        this.password = password;
        this.user_name = user_name;
    }

    public String setpassword(String password) {
        this.password=password;
        return password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void login(String user_name,String password){
        if(this.user_name.equalsIgnoreCase(user_name) && this.password.equalsIgnoreCase(password)){
            System.out.println("authentication:");
        }
        else{
            System.out.println("wrong...");
        }
    }

    //main
    public static void main(String[] args) {
        Encap user1=new Encap("123","Paramjit");
        user1.login("788","dkdn");
        user1.setpassword("1997");
        user1.login("Paramjit","1997");
    }
}
