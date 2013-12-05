
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class User {
    
    private String name;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public void check(){
        
        if(name.equals("")){
            msg = "Please enter user name!";
        }else if(name.equals("Java")){
            msg = "Valid User , Access Granded!";
        }else{
            msg = "Invalid User , Please try again!";
        }
    }
    
}
