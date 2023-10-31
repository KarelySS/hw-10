public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        //Задача 1
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int salary : arr) {
            sum += salary;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //Задача 2
        System.out.println("Задача 2");
        int[] arr1 = generateRandomArray();
        int minSum = 300_000;
        int maxSum = 0;
        for (int j : arr1) {
            if (j > maxSum) {
                maxSum = j;
            }
        }
        for (int e = 0; e < arr.length; e++) {
            if (arr1[e] < minSum) {
                minSum = arr1[e];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей." +
                " Максимальная сумма трат за день составила " + maxSum + " рублей");
        //Задача 3
        System.out.println("Задача 3");
        int[] arr2 = generateRandomArray();
        int sum2 = 0;
        for (int salary1 : arr2) {
            sum2 += salary1;
        }
        int averageSalary=sum2/30;
        System.out.println("Средняя сумма трат за месяц составила "+(double)averageSalary+" рублей");
        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}