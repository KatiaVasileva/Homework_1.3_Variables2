public class Main {
    public static void main(String[] args) {
//      Задача 1
        System.out.println("Задача 1");
        int city = 516;
        System.out.println("Значение переменной city с типом int равно " + city + ".");
        byte village = 103;
        System.out.println("Значение переменной village с типом byte равно " + village + ".");
        short town = 215;
        System.out.println("Значение переменной town с типом short равно " + town + ".");
        long country = 144_000_000L;
        System.out.println("Значение переменной country с типом long равно " + country + ".");
        float men = 26.89f;
        System.out.println("Значение переменной men с типом float равно " + men + ".");
        double women = 29.97;
        System.out.println("Значение переменной women с типом double равно " + women + ".");
        System.out.println();

//      Задача 2
        System.out.println("Задача 2");
        float variable_a = 27.12f;
        long variable_b = 987_678_965_549L;
        double variable_c = 2.786;
        boolean variable_d = false;
        char variable_e = 569;
        short variable_f = -159;
        int variable_g = 27897;
        byte variable_h = 67;
        System.out.println();

//      Задача 3
        System.out.println("Задача 3");
        int studentsInLudmilaClass = 23;
        int studentsInAnnaClass = 27;
        int studentsInEkaterinaClass = 30;
        int totalPaper = 480;
        int paperPerStudent = totalPaper / (studentsInLudmilaClass + studentsInAnnaClass + studentsInEkaterinaClass);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");
        System.out.println();

//      Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int machineCapacityPerMinute = bottles / minutes;
        int period1 = 20;
        int machineCapacityPeriod1 = machineCapacityPerMinute * period1;
        System.out.println("За 20 минут машина произвела бутылок " + machineCapacityPeriod1 + " штук.");
        int period2 = 24 * 60;
        int machineCapacityPeriod2 = machineCapacityPerMinute * period2;
        System.out.println("За сутки машина произвела бутылок " + machineCapacityPeriod2 + " штук.");
        int period3 = 3 * period2;
        int machineCapacityPeriod3 = machineCapacityPerMinute * period3;
        System.out.println("За 3 дня машина произвела бутылок " + machineCapacityPeriod3 + " штук.");
        int period4 = 30 * period2;
        int machineCapacityPeriod4 = machineCapacityPerMinute * period4;
        System.out.println("За 1 месяц машина произвела бутылок " + machineCapacityPeriod4 + " штук.");
        System.out.println();

//      Задача 5
        System.out.println("Задача 5");
        int totalPaint = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int classNumber = totalPaint / (whitePaintPerClass + brownPaintPerClass);
        int totalWhitePaint = classNumber * whitePaintPerClass;
        int totalBrownPaint = classNumber * brownPaintPerClass;
        System.out.println("В школе, где " + classNumber + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");
        System.out.println();

//      Задача 6
        System.out.println("Задача 6");
        int bananas = 5;
        int bananasWeight = 80;
        int milk = 200;
        int milkWeight100 = 105;
        int iceCream = 2;
        int iceCreamWeight = 100;
        int egg = 4;
        int eggWeight = 70;
        int totalWeight = (bananas * bananasWeight) + ((milk * milkWeight100) / 100) + (iceCream * iceCreamWeight) + (egg * eggWeight);
        float totalWeightKg = totalWeight / 1000f;
        System.out.println("Вес спорт-завтрака составляет " + totalWeightKg + " кг." );
        System.out.println();

//      Задача 7
        System.out.println("Задача 7");
        int weightLossKg = 7;
        int minWeightLossPerDayG = 250;
        int maxWeightLossPerDayG = 500;
        int maxDays = weightLossKg * 1000 / minWeightLossPerDayG;
        System.out.println("Если спортсмен теряет в весе " + minWeightLossPerDayG + " г в сутки, то ему потребуется " + maxDays + " дней, чтобы сбросить " + weightLossKg + " кг.");
        int minDays = weightLossKg * 1000 / maxWeightLossPerDayG;
        System.out.println("Если спортсмен теряет в весе " + maxWeightLossPerDayG + " г в сутки, то ему потребуется " + minDays + " дней, чтобы сбросить " + weightLossKg + " кг.");
        int averageDays = (maxDays + minDays) / 2;
        System.out.println("В среднем спортсмену понадобится приблизительно " + averageDays + " день, чтобы сбросить " + weightLossKg + " кг.");
        System.out.println();

//      Задача 8
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float raise = 0.1f;
        float salaryMashaRaise = salaryMasha * raise;
        float newSalaryMasha = salaryMasha + salaryMashaRaise;
        float yearRaiseMasha = salaryMashaRaise * 12;
        int newSalaryMashaR = Math.round (newSalaryMasha); // Округление, так как в зарплате не используют дробную часть.
        int yearRaiseMashaR = Math.round(yearRaiseMasha);
        System.out.println("Маша будет получать " + newSalaryMashaR + " рублей в месяц. Годовой доход вырастет на " + yearRaiseMashaR + " рублей.");
        float salaryDenisRaise = salaryDenis * raise;
        float newSalaryDenis = salaryDenis + salaryDenisRaise;
        float yearRaiseDenis = salaryDenisRaise * 12;
        int newSalaryDenisR = Math.round (newSalaryDenis); // Округление, так как в зарплате не используют дробную часть.
        int yearRaiseDenisR = Math.round(yearRaiseDenis);
        System.out.println("Маша будет получать " + newSalaryDenisR + " рублей в месяц. Годовой доход вырастет на " + yearRaiseDenisR + " рублей.");
        float salaryKristinaRaise = salaryKristina * raise;
        float newSalaryKristina = salaryKristina + salaryKristinaRaise;
        float yearRaiseKristina= salaryKristinaRaise * 12;
        int newSalaryKristinaR = Math.round(newSalaryKristina); // Округление, так как в зарплате не используют дробную часть.
        int yearRaiseKristinaR = Math.round(yearRaiseKristina);
        System.out.println("Маша будет получать " + newSalaryKristinaR + " рублей в месяц. Годовой доход вырастет на " + yearRaiseKristinaR + " рублей.");
        System.out.println();


















    }
}