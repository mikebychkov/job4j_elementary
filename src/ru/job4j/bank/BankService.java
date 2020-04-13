package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        /*
        for (User usr : this.users.keySet()) {
            if (usr.getPassport().equals(passport)) return usr;
        }
        */
        List<User> rsl = this.users.keySet().stream().filter(
                usr -> usr.getPassport().equals(passport)
        ).collect(Collectors.toList());
        for (User usr : rsl) return usr;
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User usr = findByPassport(passport);
        if (usr == null) return null;
        /*
        for (Account acc : this.users.get(usr)) {
            if (acc.getRequisite().equals(requisite)) return acc;
        }
        */
        List<Account> rsl = this.users.get(usr).stream().filter(
                acc -> acc.getRequisite().equals(requisite)
                ).collect(Collectors.toList());
        for (Account acc : rsl) return acc;
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