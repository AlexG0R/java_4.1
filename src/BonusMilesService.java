public class BonusMilesService {
    public int calculate(double price) {
        int milePrice = 20;
        return (int) price / milePrice;
    }
}
