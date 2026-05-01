import java.util.HashMap;
@FunctionalInterface
interface GradeRule {
    boolean test(int grade);
}
public class GradeFilter {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Ali", 85);
        grades.put("Leyla", 92);
        grades.put("Murad", 55);
        grades.put("Nigar", 70);
        grades.put("Kamran", 40);

        GradeRule passedRule = (g) -> g >= 50;
        GradeRule excellentRule = (g) -> g >= 90;

        System.out.println("Passed students:");
        grades.forEach((k, v) -> {
            if(passedRule.test(v)) System.out.println(k + " -> " + v);
        });

        System.out.println("\nExcellent students:");
        grades.forEach((k, v) -> {
            if(excellentRule.test(v)) System.out.println(k + " -> " + v);
        });
    }
}