package exercises;

public class CE26FlourPacker {

    private static final int BIG_WEIGHT = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigKilos = bigCount * BIG_WEIGHT;
        int totalKilos = bigKilos + smallCount;

        if (totalKilos < goal) {
            return false;
        }

        // 2, 2, 12
        return goal % 5 <= smallCount;
    }
}
