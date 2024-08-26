public class Main {
    public static void main(String[] args) {
        System.out.println("Task first");
        int age = 42;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Task second");
        int weather = -12;
        if (weather <= -5) {
            System.out.println("На улице " + weather + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + weather + " градусов, можно идти без шапки");
        }

        System.out.println("Task third");
        int speedCar = 100;
        if (speedCar >= 60) {
            System.out.println("Если скорость " + speedCar + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedCar + ", то можно ехать спокойно");
        }

        System.out.println("Task fourth");
        int agePerson = 40;
        if (agePerson >= 2 && agePerson < 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад");
        } else if (agePerson >= 7 && agePerson < 17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу");
        } else if (agePerson >=18 && agePerson < 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему пора ходить на работу");
        }

        System.out.println("Task fifth");
        int ageChild = 5;
        if (ageChild <= 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        } else if (ageChild > 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Task sixth");
        int capacity = 102;
        int sitting = 60;
        int busySeat = 10;
        boolean freeSittingSeat = busySeat < sitting;
        boolean freeStandingSeat = busySeat >= sitting && busySeat < capacity;
        boolean freeSeat = busySeat < capacity;
        if (freeSeat) {
            System.out.println("В вагоне есть " + (capacity - busySeat) + " свободных мест ");
        } else {
            System.out.println("Мест нет!");
        }
        if (freeSittingSeat) {
            System.out.println("Из них в вагоне есть " + (sitting - busySeat) + " сидячих свободных мест и " + (capacity - sitting) + " стоячих свободных мест");
        } else if (freeStandingSeat) {
            System.out.println("Из них в вагоне есть " + (capacity - busySeat) + " стоячих свободных мест ");
        }

        System.out.println("Task seventh");
        int one = 100;
        int two = 221;
        int three = 119;
        if (one > two && one > three) {
            System.out.println("Первое число больше второго и третьего");
        } else if (two > three) {
            System.out.println("Второе число больше первого и третьего");
        } else {
            System.out.println("Третье число больше первого и третьего");
        }
    }
}