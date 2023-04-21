package school;

public class PrintService {
    public void print(Hogwarts[] students) {
        for (Hogwarts s : students) {
            System.out.println(s);
            Hogwarts maxPoints = students[0];
            if (s.getSum() > maxPoints.getSum()) {
                maxPoints = s;

            }
        }
        System.out.println();
        for (Hogwarts s : students) {
            Hogwarts maxPoints = students[0];
            if (s.getSum() > maxPoints.getSum()) {
                maxPoints = s;
                System.out.println("Максимальный балл " + s);
            }
        }
        System.out.println();
    }

    public void print(Gryffindor[] students1) {
        for (Gryffindor g : students1) {
            Gryffindor maxPointsGryf = students1[0];
            if (g.getSum1() >= maxPointsGryf.getSum1()) {
                maxPointsGryf = g;
                System.out.println(g);
            }
        }
        System.out.println();
    }

    public void print(Puffendoo[] students2) {
        for (Puffendoo h : students2) {
            Puffendoo maxPointsPuff = students2[0];
            if (h.getSum2() >= maxPointsPuff.getSum2()) {
                maxPointsPuff = h;
                System.out.println(h);
            }
        }
        System.out.println();
    }

    public void print(Kogtevran[] students3) {
        for (Kogtevran k : students3) {
            Kogtevran maxPointsKog = students3[0];
            if (k.getSum3() >= maxPointsKog.getSum3()) {
                maxPointsKog = k;
                System.out.println(k);
            }
        }
        System.out.println();
    }

    public void print(Slytherin[] students4) {
        for (Slytherin s : students4) {
            Slytherin maxPointsSlyth = students4[0];
            if (s.getSum4() >= maxPointsSlyth.getSum4()) {
                maxPointsSlyth = s;
                System.out.println(s);
            }
        }
    }
}
