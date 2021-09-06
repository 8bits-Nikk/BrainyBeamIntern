package Day8;

public class Data {
    // Class Counter
    static int count =0;
    static Data[] obj = new Data[5];

    private int id;
    private String name;

    private Data(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Instance
    public static Data getInstance(int id, String name){
        if((count<5) && (obj[count] == null)){
            obj[count] = new Data(id, name);
            return obj[count ++];
        }else{
            return null;
        }
    }
}
