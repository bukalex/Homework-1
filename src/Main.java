public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задание 1:");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println(" ");

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("Задание 2:");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println(" ");

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("Задание 3:");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println(" ");

        var friend = 19;
        System.out.println("Задание 4:");
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        System.out.println(" ");

        var frog = 3.5;
        System.out.println("Задание 5:");
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        System.out.println(" ");

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var sum = boxer2Weight + boxer1Weight;
        var dif = boxer2Weight - boxer1Weight;
        System.out.println("Задание 6:");
        System.out.println(sum);
        System.out.println(dif);

        System.out.println(" ");

        System.out.println("Задание 7:");
        dif = boxer2Weight % boxer1Weight;
        System.out.println(dif);

        System.out.println(" ");

        var totalTime = 640;
        var personalTime = 8;
        var workersNum = totalTime/personalTime;
        System.out.println("Задание 8:");
        System.out.println("Всего в компании работает " + workersNum + " человек.");
        workersNum += 94;
        totalTime = workersNum * personalTime;
        System.out.println("Если в компании работает " + workersNum + " человек, то между ними может быть поделено " + totalTime + " часов работы.");
    }
}