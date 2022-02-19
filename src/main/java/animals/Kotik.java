package animals;
public class Kotik {
    private String name; // имя
    private String voce; // голос
    private int satiety; // сытость
    private int weight; // вес
    private static int count; // отвечает за кол-во экземпляров класса
    private static final int[] METHODS = {1, 2, 3, 4, 5};
    // Конструкторы //
    public Kotik(String name, String voce, int satiety, int weight) {
        this.name = name;
        this.voce = voce;
        this.satiety = satiety;
        this.weight = weight;
    }

    public Kotik() {
        name = getName();
        voce = getVoce();
        satiety = getSatiety();
        weight = getWeight();
        count = getCount();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getVoce() {
        return voce;
    }
    public void setVoce(String voce) {
        this.voce = voce;
    }

    public int getSatiety() {
        return satiety;
    }
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public static int getCount() {
        return count++;
    }
    public void setCount(int count) {this.count = count++;}

    public int getWeight() {return weight;}
    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int play; // играть
    private int sleep; // спать
    private int wash; // умываться
    private int walk; // гулять
    private int hunt; // охотиться
    private String eda;

    public String getEda () {return  eda;}
    public void setEda () {this.eda=eda;}
    public int getPlay() {return play;}
    public void setPlay(int play) {this.play = play;}
    public int getSleep() {return sleep;}
    public void setSleep(int sleep) {this.sleep = sleep;}
    public int getWash() {return wash;}
    public void setWash(int wash) {this.wash = wash;}
    public int getWalk() {return walk;}
    public void setWalk(int walk) {this.walk = walk;}
    public int getHunt() {return play;}
    public void setHunt(int hunt) {this.hunt = hunt;}

    public boolean play() {
        setPlay(play);
        if (play > 0) {
            play--;
            satiety--;
            System.out.println("Котик наигрался. Действие выполнено  " + " уровень игривости: " + play+ " уровень сытости " + satiety);
            return true;
        } else {
            System.out.println("Котик хочет играть ");
            return  false;
        }
    }
    public boolean sleep() {
        setSleep(sleep);
        if (sleep > 0) {
            sleep--;
            satiety--;
            System.out.println("Котик выспался. Действие выполнено. уровень сытости: " + sleep + " уровень сытости " + satiety);
            return true;
        } else {
            System.out.println("Котик хочет спать ");
            return false;
        }
    }

    public boolean wash () {
        setWash(wash);
        if (wash > 0) {
            wash--;
            satiety--;
            System.out.println("Котик умытый. Действие выполнено  " + " уровень умытости: " + wash+ " уровень сытости " + satiety);
            return true;
        } else {
            System.out.println("Котик неумытый ");
            return false;
        }
    }

    public boolean walk() {
        setWalk(walk);
        if (walk > 0) {
            walk--;
            satiety--;
            System.out.println("Котик нагулялся. Действие выполнено  " + " уровень нагуленности: " + walk+ " уровень сытости " + satiety);
        return  true;
        } else {
            System.out.println("котик хочет гулять ");
            return false;
        }
    }

    public boolean hunt () {
        setHunt(hunt);
        if (hunt > 0) {
            hunt--;
            satiety--;
            System.out.println("Котик наохотился " + " уровень охотничества " + hunt+ " уровень сытости " + satiety);
        return  true;
        } else {
            System.out.println("Котик хочет охотиться ");
            return  false;
        }

    }
    public boolean eat(int satiety, int s2) {
        satiety += s2;
        this.satiety = satiety;
        if (satiety>0) {
            this.satiety = satiety;
            System.out.println("котик поел. Сытость: " + satiety);
            return true;
        }else {
            return false;
        }
    }

    public boolean eat( int satiety,String eda) {
        this.eda = eda;
        this.satiety = satiety;
        System.out.println(eda +satiety);
        return true;
    }
    public boolean eat() {
        this.eda = eda;
        this.satiety = satiety;
        eat(satiety, eda);
        return  true;
    }

    private String go;
    public String getGo () {return  go;}
    public void setGo () {this.go=go;}

    public void liveAnotherDay(String go) {
        int number;
        int rand = (int) (Math.random() * 5) + 1;
        for (number = 0; number <24; number++){
            switch (rand) {
                case 1:
                    play();
                    number++;
                    go=number + " - Играл";
                    System.out.println(go);
                case 2:
                    sleep();
                    number++;
                    go=number + " - Спал";
                    System.out.println(go);
                case 3:
                    wash();
                    number++;
                    go=number + " - Умывался";
                    System.out.println(go);
                case 4:
                    walk();
                    number++;
                    go=number + " - Гулял";
                    System.out.println(go);
                case 5:
                    hunt();
                    number++;
                    go=number + " - Охотился";
                    System.out.println(go);
                default:
                    number++;
                    satiety++;
                    go=number + " - Ел "+ eda + " сытость " + satiety;
                    System.out.println(go);
break;
            }
        }
    }

}
