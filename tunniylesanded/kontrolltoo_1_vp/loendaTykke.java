package kontrolltoo_1_vp;

public class loendaTykke {
    public static void main(String[] args) {
        int[] jada = {1, 2, 3, 4, 4, 5, 5, 5, 5};
        int[] jada2 = {1, 1, 2, 1, 1, 1,};
        int[] jada3 = {2, 2, 2, 2, 2};
        int[] jada4 = {};
        System.out.println(loendaTykke1(jada));
    }
    static int loendaTykke1(int[] jada) {
        try {
            int pikkus = jada.length;       //len et for cycle
            int mituSamaJarj = 0;           // mitu sama on järjest
            /*
            int mitusama = 0;
            for (int i = 0; i< pikkus; i++) {
                for (int j = 0; j< pikkus; j++) {
                    if (jada[i] == jada[j]) {
                        mitusama +=1;
                    }
                }
            }
            System.out.println("mitusama = " + mitusama);
            */
            if (pikkus < 2) {
                return 0;
            } else {
                for (int i = 0; i < pikkus-1; i++) {
                    if (jada[i] == jada[i+1]) {
                        System.out.println("i = " + i + " jada[i] = " + jada[i] + " jada[i+1] = " + jada[i+1]);
                        mituSamaJarj += 1;
                    }
                }
            }
            System.out.println("mituSamaJarj = " + mituSamaJarj);
            return mituSamaJarj-1;
        } catch (Exception e) {
            System.out.println("mingi viga");
        }
        return 2;
    }
}
