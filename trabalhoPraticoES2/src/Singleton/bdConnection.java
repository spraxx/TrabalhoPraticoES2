package Singleton;

public class bdConnection {

    private bdConnection(){}

    private String username;
    private String password;
    private String connectionString;

    private static bdConnection instance = new bdConnection();


    public static bdConnection getInstance() {
        if (instance == null) {

            instance = new bdConnection();
        }
        return instance;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConnectionString(){
        return connectionString;
    }

    public void setConnectionString(String connectionString){

        this.connectionString = connectionString;
    }
}
