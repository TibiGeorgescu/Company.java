import java.lang.reflect.Array;
import java.util.ArrayList;

public class Application {
    private ArrayList<Company> CompaniesList;
    private ArrayList<User> UsersList;


    public ArrayList<Company> getCompanies() {
        return CompaniesList;
    }

    public Company getCompany(String name) {
        for (Company Comp1 : CompaniesList)
            if (Comp1.name.equals(name))
                return Comp1;
            return null;
    }

    public void add(Company company) {
        CompaniesList.add(company);
    }

    public void add(User user) {
        UsersList.add(user);
    }

    public boolean remove(Company company) {
        if (!CompaniesList.contains(company))
            return false;
        else {
            CompaniesList.remove(company);
            return true;
        }
    }

    public boolean remove(User user) {
        if (!UsersList.contains(user))
            return false;
        else {
            UsersList.remove(user);
            return true;
        }
    }

    public ArrayList<Job> getJobs(ArrayList<String> companies){
        // De facut aici
        return null;
    }


}