public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Первая задача");
        byte a = Byte.MAX_VALUE;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = Short.MAX_VALUE;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = Integer.MAX_VALUE;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = Long.MAX_VALUE;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = Float.MAX_VALUE;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = Double.MAX_VALUE;
        System.out.println("Значение переменной f с типом double равно " + f);

        // Задача 2
        System.out.println("Вторая задача");
        double one = 27.12;
        long two =  987678965549l;
        float three = 2.786f;
        boolean four = false;
        short five = 569;
        short six = -159;
        int seven = 27897;
        byte eight =67;
        System.out.println();

        // Задача 3
        System.out.println("Третья задача");
        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int paper = 480;
        System.out.println("Достанется " + paper / (studentsLP+studentsAS+studentsEA) + " листов каждому ученику");
        System.out.println();

        // Задача 4
        System.out.println("Четвертая задача");
        long performanceOneMinutes = 16/2; // производительность за одну минуту
        long howManyMinutesInDay = 60*24; // умножаем минуты на часы
        long howManyMinutesInMonth = howManyMinutesInDay* 30; // колличестов минут за дань умножаем на колличество дней в месяце
        System.out.println("За 20 минут машина произвела бутылок " + performanceOneMinutes * 20 +  " штук");
        System.out.println("За сутки  машина произвела бутылок " + performanceOneMinutes * howManyMinutesInDay +  " штук");
        System.out.println("За три дня машина произвела бутылок " + performanceOneMinutes * howManyMinutesInDay * 3 +  " штук");
        System.out.println("За месяц машина произвела бутылок " + performanceOneMinutes * howManyMinutesInMonth +  " штук");
        System.out.println();

        // Задача 5
        System.out.println("Пятая задача");

        int numberColor = 120;
        int numberColorOneClass = 4+2;
        int numberClass = numberColor/numberColorOneClass;
        System.out.println("В школе, где " + numberClass + " классов, нужно " + numberClass * 2 + " банок белой краски и " + numberClass *4 + " банок коричневой краски");
        System.out.println();

        //  Задача 6
        System.out.println("Шестая задача");
        int bananaWeight = 80;
        int milk100Weight = 105;
        int iceCreamBracketWeight = 100;
        int eggWeight = 70;
        int foodWeightG = bananaWeight*5 + milk100Weight*2 + iceCreamBracketWeight*2 + eggWeight*4;
        double foodWeightKG = foodWeightG/1000;
        System.out.println(" Вес спорт-завтрака " + foodWeightG + " гр.");
        System.out.println(" Вес спорт-завтрака " + foodWeightKG  + " кг.");
        System.out.println();

        //  Задача 7
        System.out.println("Седьмая задача");
        double planWeight = 7*1000;
        int dayPlan1 = (int) Math.round(planWeight /250);
        int dayPlan2 = (int) Math.round(planWeight /500);
        System.out.println(dayPlan1 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(dayPlan2 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println();

        //  Задача 8
        System.out.println("Восьмая задача");

        int salaryMashaBefore = 67760;
        int salaryMashaAfter = salaryMashaBefore + salaryMashaBefore /10;
        int salaryDenisBefore = 83690;
        int salaryDenisAfter = salaryDenisBefore + salaryDenisBefore /10;
        int salaryKristinaBefore = 76230;
        int salaryKristinaAfter = salaryKristinaBefore + salaryKristinaBefore /10;

        int  salaryMashaСhange = Math.abs(salaryMashaAfter*12 - salaryMashaBefore*12);
        int  salaryDenisСhange = Math.abs(salaryDenisAfter*12 - salaryDenisBefore*12);
        int  salaryKristinaСhange = Math.abs(salaryKristinaAfter*12 - salaryKristinaBefore*12);
        System.out.println("Маша теперь получает " + salaryMashaAfter + " рублей. Годовой доход вырос на " + salaryMashaСhange + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisAfter + " рублей. Годовой доход вырос на " + salaryDenisСhange + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaAfter + " рублей. Годовой доход вырос на " + salaryKristinaСhange + " рублей");

    }

}