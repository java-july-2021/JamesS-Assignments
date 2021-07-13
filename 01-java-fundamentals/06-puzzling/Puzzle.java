import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class Puzzle {
    public static void main(String[] args) {
        int[] arr1 = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        int[] addArr = { 2, 3, 2 };
        int[] reVal = numArr(addArr);
        // numArr(arr1);
        Object[] retVal = biggerThanTen(arr1);// biggerThanTen(arr1);
        System.out.print(Arrays.toString(retVal));
        String[] names = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        System.out.println(Arrays.toString(shuffleName(names)));
        alphabetShuffle();
        Random r = new Random();
        System.out.println(r.nextint(45)+55);
        System.out.println(Arrays.toString(randomTen()));
        sortAndDisplay();
        System.out.println(randomString());
        System.out.println(Arrays.toString(randomArrayOfStrings()));
    }

    // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the
    // sum of all numbers in the array.
    // Also have the function return an array that only includes numbers that are
    // greater than 10 (e.g. when you pass the array above, it should return an
    // array with the values of 13,25,32)
    public static int[] numArr(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static Object[] biggerThanTen(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                newArr.add(arr[i]);// num = 10;
            }
        }
        System.out.println(sum);
        return newArr.toArray();
    }

    public static Object[] shuffleName(String[] arr) {
        ArrayList<String> newArr = new ArrayList<String>();
        List<String> nameList = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            nameList.add(arr[i]);
        }
        Collections.shuffle(nameList);
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
            if (nameList.get(i).length() > 5) {
                newArr.add(nameList.get(i));
            }
        }
        return newArr.toArray();
    }

    public static void alphabetShuffle(){
    ArrayList<Character> randomCharArr = new ArrayList<Character>();
    ArrayList<Character> alphabet = new ArrayList<Character>();
    for (char i = 'a'; i <= 'z'; i++) {
        alphabet.add(i);
    }
    Collections.shuffle(alphabet);
    System.out.println(alphabet);
    System.out.println(alphabet.get(alphabet.size()-1));
    System.out.println(alphabet.get(0));
    if(alphabet.get(0)=='a', alphabet.get(0)=='e',alphabet.get(0)=='o', alphabet.get(0)=='u', alphabet.get(0)=='i');
        System.out.println("Its a Vowel.");
    }

    public int[] randomArray() {
        Random r = new Random();
        int [] arr;
        arr = new int[10];
        for (int i=0; i<arr.length; i++) {
            arr[i] = r.nextInt(100-55)+55;
        }
        return arr;

    public int[] randomArraySorted() {
            Random r = new Random();
            int [] arr;
            arr = new int[10];
            for (int i=0; i<arr.length; i++) {
                arr[i] = r.nextInt(100-55)+55;
            }
            
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println("Minimum value: " + arr[0] + " " + "Maximum value: " + arr[9]);
    
            return arr;

    public String randomString5() {
        ArrayList<Character> randomCharArr = new ArrayList<Character>();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }
        Collections.shuffle(alphabet);
        for (int i = 0; i < 5; i++) {
            randomCharArr.add(alphabet.get(i));
        }
        
        StringBuilder randomStr = new StringBuilder();
        for (char randomChar : randomCharArr) {
            randomStr.append(randomChar);
        }
        return randomStr.toString();
    }

    public String[] randomStringArr() {
        String[] stringArr = new String[10];
        for (int i = 0; i < 10; i++) {
            stringArr[i] = randomString5();
        }
        return stringArr;
    }
}
