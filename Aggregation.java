import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;
    private List<Skill> skills;

    public Person(String name, int age, List<Skill> skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public void displayPersonInfo() {
        System.out.println("Name " + this.name);
        System.out.println("Age " + this.age);
        System.out.println("Skills :- ");
        for (Skill skill : this.skills) {
            skill.showSkill();
        }
    }
}

class Skill {
    private String name;
    private int proficiency;

    public Skill(String name, int proficiency) {
        this.name = name;
        this.proficiency = proficiency;
    }

    public void showSkill() {
        System.out.println("Name " + this.name);
        System.out.println("Proficiency " + this.proficiency);
    }
}

public class Aggregation {

    public static void main(String[] args) {

        String[] skills = { "HTML", "CSS", "JavaScript", "OOPs", "Java" };
        List<Skill> skillList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Skill newSkill = new Skill(skills[i - 1], i);
            skillList.add(newSkill);
        }

        Person p = new Person("Vivek Jain", 21, skillList);
        p.displayPersonInfo();
    }
}
