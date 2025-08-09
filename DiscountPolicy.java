/*
 * 
 * 1.DsicountPolicy Interface
 */

public interface DiscountPolicy {


    /*
     * @param amount The original amount.
     * @return the amount after the discount is applied.
     */
    double applyDiscount(double amount);
}
