import java.util.ArrayList;
public class Student {
    private String id;
    private ArrayList<Offering> studies;

    public Student(String id){
        this.id = id;
        studies = new ArrayList<Offering>();
    }

    public void takeCourse(Course course, String semseter){
        studies.add(course.getOffering(semseter));
    }

    public ArrayList<Offering> getOfferList(){
        return studies;
    }

    public boolean hasBeenClassmateOf(Student student){
       for (Offering studie : studies) {
           for(Offering other_stu_studie: student.getOfferList()){
               if(studie.getSemId().equals(other_stu_studie.getSemId())){
                   return true;
               }
           }
       }
       return false;
    }
}
