public class BonusMilesService {

    public int calculate(int cost) {
        int result;
        int fixed = 20;
        if (cost >= 20) {
            result = (cost / fixed);
        } else {
            result = 0;
        }
        return result;
    }
}
