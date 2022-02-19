import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotic1 = new Kotik("Garry", "Meow", 6, 4);
       Kotik.getCount();
        Kotik kotic2 = new Kotik();
        Kotik.getCount();
        kotic2.setName("Torry");
        kotic2.setVoce("Shhhhhh");
        kotic2.setSatiety(5);
        kotic2.setWeight(3);
        kotic2.setPlay(1);
        kotic2.setSleep(3);
        kotic2.setWalk(2);
        kotic2.setWash(0);
        kotic2.setHunt(5);
       kotic2.liveAnotherDay(kotic2.getGo());
        compareVoice(kotic1, kotic2);
        System.out.println("Количество котиков " + Kotik.getCount());
        System.out.println("Второго котика зовут "+ kotic2.getName()+" его вес " + kotic2.getWeight());
    }

    private static boolean compareVoice(Kotik kot1, Kotik kot2) {
        int kkk = kot1.getVoce().compareTo(kot2.getVoce());
        System.out.println("голоса котиков: " + kkk + "(разные)");
        return true;
    }
}

