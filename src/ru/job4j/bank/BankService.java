package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User usr = findByPassport(passport);
        if (usr == null) return;
        List<Account> usrAccs = this.users.get(usr);
        if (!usrAccs.contains(account)) {
            usrAccs.add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User usr : this.users.keySet()) {
            if (usr.getPassport().equals(passport)) return usr;
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User usr = findByPassport(passport);
        if (usr == null) return null;
        for (Account acc : this.users.get(usr)) {
            if (acc.getRequisite().equals(requisite)) return acc;
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, dеstRequisite);
        if (srcAcc == null || destAcc == null) return false;
        double srcBalance = srcAcc.getBalance();
        if (srcBalance < amount) return false;
        destAcc.setBalance(destAcc.getBalance() + amount);
        srcAcc.setBalance(srcBalance - amount);
        return true;
    }
}