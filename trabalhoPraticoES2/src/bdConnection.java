
public class bdConnection {

    private bdConnection(){}

    private String path;
    private String connectionString;

    private static bdConnection instance = new bdConnection();


    public static bdConnection getInstance() {
        if (instance == null) {

            instance = new bdConnection();
        }
        return instance;
    }


    public void setPath(String path){
        this.path = path;
    }

    public java.lang.String getPath(){
        return path;
    }

    public java.lang.String getConnectionString(){
        return connectionString;
    }

    public void setConnectionString(String connectionString){

        this.connectionString = connectionString;
    }
}
