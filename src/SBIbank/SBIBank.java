package SBIbank;

import onlineBankingInterface.OnlineBankingInterface;

public class SBIBank implements OnlineBankingInterface {

    @Override
    public void showBalance() {

    }

    @Override
    public double withrawlMoney() {
        return 0;
    }

    @Override
    public double depositMoney() {
        return 0;
    }

    @Override
    public int changePass() {
        return 0;
    }

    @Override
    public boolean pinVerification() {
        return false;
    }
}
