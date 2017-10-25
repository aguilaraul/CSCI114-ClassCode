/**
 * @author Raul Aguilar
 */
package csci114_20171004code3;


public class Csci114_20171004code3 {

    public static void main(String[] args) {
        int n = 32000;
        double[] grade = new double[n];
        grade[0] = 99.0;
        grade[1] = 89.0;
        grade[6] = 92.45;
        
        for(int i = 0; i < grade.length; i++) {
            grade[i] = n - 1;
            n = n -1;
        }
        
        System.out.println(grade[6]);
        System.out.printf("%s = %.2f%n", "grade", grade[6]);
        
        for(int i = 0; i < grade.length; i++)
            System.out.printf("grade[%d] = %.2f%n", i, grade[i]);
    }
    
}
