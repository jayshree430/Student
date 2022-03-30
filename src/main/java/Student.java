import java.util.Arrays;

import static java.util.Arrays.asList;

public class Student {
    private String name;
    private String grade;
    private int group;
    private final String NICKNAME = "“MySecretNickName”";
    private final String GRADE_LIST[] = new String[]{"A","B","C","D","E"};

    public Student(String name, String grade, int group) {
        this.name = name;
        if (checkGrade(grade)){
            this.grade = grade;
        }
        else {
            throw new IllegalArgumentException("Invalid Grade. Grade should be one of ( A, B, C, D, E, F)");
        }
        if (checkGroup(group)){
            this.group = group;
        }else{
            throw new IllegalArgumentException("Invalid Group. Group should be between 1 to 5 only");
        }
    }
    public String getName(){
        return name;
    }
    public String getGrade(){
        return grade;
    }
    public int getGroup(){return group;}
    public void upgrade(){

        if(Arrays.asList(GRADE_LIST).indexOf(grade) > 0){
            int index = Arrays.asList(GRADE_LIST).indexOf(grade)-1;
            grade = GRADE_LIST[index];
        }
    }
    public void downgrade(){
        if(Arrays.asList(GRADE_LIST).indexOf(grade) < GRADE_LIST.length-1){
            int index = Arrays.asList(GRADE_LIST).indexOf(grade)+1;
            grade = GRADE_LIST[index];
        }
    }

    public boolean checkGrade(String gradeLetter){ return asList(GRADE_LIST).contains(gradeLetter); }

    public boolean checkGroup(int groupNumber){ return (groupNumber > 0) && (groupNumber <= 5);
    }
}
