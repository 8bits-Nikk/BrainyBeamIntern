package Day3;

import java.util.ArrayList;

public class DeleteUser {
    public ArrayList<User> deleteuser(ArrayList<User> users, String name){
        int index = -1;
        ArrayList<User> temp = users;
        for(int i=0;i< temp.size();i++){
            if(name.equals(temp.get(i).getName())){
                index = i;
                break;
            }
        }
       if(index != -1){
           temp.remove(index);
           System.out.println("====== Deleted =======");
       }else{
           System.out.println("====== Not Found =======");
       }
        return temp;
    }
}
