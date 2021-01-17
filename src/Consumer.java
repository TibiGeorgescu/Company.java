import java.lang.reflect.Array;
import java.util.ArrayList;

public class Consumer {
    public class Resume{
        Information info;

    }
    private ArrayList<Education> EducationList;
    private ArrayList<Experience> ExperienceList;
    private ArrayList<Consumer> ConsumersList;

    public void add (Education education){
        EducationList.add(education);
    }

    public void add (Experience experience){
        ExperienceList.add(experience);
    }

    public void add (Consumer consumer){
        ConsumersList.add(consumer);
    }

    public void remove (Consumer consumer){
            ConsumersList.remove(consumer);
    }

    public Integer getGraduationYear() {
        return null;
    }
}
