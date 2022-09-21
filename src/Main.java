public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        byte a = 126;
        System.out.println(a);
        int b = 1234567;
        System.out.println(b);
        short c = 32754;
        System.out.println(c);
        long d = 12548547;
        System.out.println(d);
        float f = 2.45F;
        System.out.println(f);
        double g = 3.45782;
        System.out.println(g);
        char qp = 31;
        System.out.println(qp);
        boolean ac = a > 15;
        System.out.println(ac);

        // Задание 2
        System.out.println("Задание 2");
        float q = 27.12f;
        System.out.println(q);
        long w = 987_678_965_549L;
        System.out.println(w);
        double h = 2.786;
        System.out.println(h);
        boolean e = h > w;
        System.out.println(e);
        short j = 569;
        System.out.println(j);
        int s = -159;
        System.out.println(s);
        short k = 27879;
        System.out.println(k);
        byte m = 67;
        System.out.println(m);

        // Задание 3
        System.out.println("Задание 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short piecePapers = 480;
        int paper = piecePapers / (teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги.");

        // Задание 4
        System.out.println("Задание 4");
        byte bottleInMinutes = 16 / 2;
        System.out.println(bottleInMinutes);
        byte minutes20 = 20;
        short bottleInMinutes20 = (short) (minutes20 * bottleInMinutes);
        System.out.println("За " + minutes20 + " минут, машина произвела бутылок " + bottleInMinutes20 + " штук. ");
        short dayMinutes = 24 * 60;
        short bottleDay = (short) (dayMinutes * bottleInMinutes);
        System.out.println("За сутки, машина произвела бутылок " + bottleDay + " штук. ");
        short day3Minutes = (short) (dayMinutes * 3);
        int bottle3Day = (day3Minutes * bottleInMinutes);
        System.out.println("За 3 дня, машина произвела бутылок " + bottle3Day + " штук. ");
        int monthMinutes = (dayMinutes * 30);
        System.out.println("За 1 месяц, машина произвела бутылок " + bottleInMinutes * monthMinutes + " штук. ");

        // Задание 5
        System.out.println("Задание 5");
        byte bottlersPaint = 120;
        byte classShool = (byte) (bottlersPaint / (2 + 4));
        byte whiteBottlersPaint = (byte) (classShool * 2);
        byte brownBottlersPaint = (byte) (classShool * 4);
        System.out.println("В школе, где " + classShool + " классов, нужно " + whiteBottlersPaint + " банок белой краски и " + brownBottlersPaint + " банок коричневой краски.");

        // Задание 6
        System.out.println("Задание 6");
        short grammBanans = (short) (5 * 80);
        short grammMilk = (short) (200 / 100 * 105);
        short grammIceCream = (short) (2 * 100);
        short grammEggs = (short) (4 * 70);
        short breakfastSport = (short) (grammBanans + grammMilk + grammIceCream + grammEggs);
        System.out.println("Вес спортивного завтрака " + breakfastSport + " грамм.");
        double kg = 1000.0;
        double breakfastSportKg = breakfastSport / kg;
        System.out.println("Вес спортивного завтрака " + breakfastSportKg + " килограмм.");

        // Задание 7
        System.out.println("Задание 7");
        byte days250 = 7000 / 250;
        byte days500 = 7000 / 500;
        byte midlleDays = (byte) ((days250 + days500) / 2);
        System.out.println("Если спортсмен будет терять в день 250 грамм, то " + days250 + " дней уйдет на похудение");
        System.out.println("Если спортсмен будет терять в день 500 грамм, то " + days500 + " дней уйдет на похудение");
        System.out.println("В среднем спортсмен потратит на похудение " + midlleDays + " день");

        // Задание 8
        System.out.println("Задание 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double masha10 = masha * 0.1 + masha;
        double denis10 = denis * 0.1 + denis;
        double kristina10 = kristina * 0.1 + kristina;

        System.out.println("“Маша теперь получает " + (int) masha10 + " рублей. Годовой доход вырос на " + (int) (masha10 - masha) + " рублей.");
        System.out.println("“Денис теперь получает " + (int) denis10 + " рублей. Годовой доход вырос на " + (int) (denis10 - denis) + " рублей.");
        System.out.println("“Кристина теперь получает " + (int) kristina10+ " рублей. Годовой доход вырос на " + (int) (kristina10 - kristina) + " рублей.");



    }
}