
public class Main {

    public static void main(String[] args){
        /* task1-3 */
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        /* task4-5 */
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        /* task6-8 */
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + " кг!");
        var weightDifference = firstBoxer - secondBoxer;
        System.out.println("Разница в весе боксеров " + weightDifference + " кг!");
        var weightDifference2 = secondBoxer - firstBoxer;
        System.out.println("Разница в весе боксеров " + weightDifference2 + " кг!");
        var weightDifference3 = secondBoxer % firstBoxer;
        System.out.println("Разница в весе боксеров " + weightDifference3 + " кг!");

        var workHours = 640;
        System.out.println("Всего рабочих часов " + workHours);
        var workers = 640 / 8;
        System.out.println("Всего работников в компании - " + workers + " человек");
        workers = workers + 94;
        workHours = workers * 8;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками");
    }
}
