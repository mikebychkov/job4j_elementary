package ru.job4j.bank;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> usr = findByPassport(passport);
        if (usr.isEmpty()) return;
        List<Account> usrAccs = this.users.get(usr.get());
        if (!usrAccs.contains(account)) {
            usrAccs.add(account);
        }
    }

    public Optional<User> findByPassport(String passport) {
        /*
        for (User usr : this.users.keySet()) {
            if (usr.getPassport().equals(passport)) return usr;
        }
        */
        /*
        LinkedList<User> rsl = this.users.keySet().stream().filter(
                usr -> usr.getPassport().equals(passport)
        ).collect(Collectors.toCollection(LinkedList::new));
        return rsl.peekFirst();
        */
        return this.users.keySet().stream().filter(
                usr -> usr.getPassport().equals(passport)
        ).map(usr -> Optional.of(usr)).findFirst().orElse(Optional.empty());
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> usr = findByPassport(passport);
        if (usr.isEmpty()) return Optional.empty();
        /*
        for (Account acc : this.users.get(usr)) {
            if (acc.getRequisite().equals(requisite)) return acc;
        }
        */
        /*
        LinkedList<Account> rsl = this.users.get(usr).stream().filter(
                acc -> acc.getRequisite().equals(requisite)
        ).collect(Collectors.toCollection(LinkedList::new));
        return rsl.peekFirst();
        */
        return this.users.get(usr.get()).stream().filter(
                acc -> acc.getRequisite().equals(requisite)
        ).map(acc -> Optional.of(acc)).findFirst().orElse(Optional.empty());
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        Optional<Account> srcAcc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAcc = findByRequisite(destPassport, dеstRequisite);
        if (srcAcc.isEmpty() || destAcc.isEmpty()) return false;
        double srcBalance = srcAcc.get().getBalance();
        if (srcBalance < amount) return false;
        destAcc.get().setBalance(destAcc.get().getBalance() + amount);
        srcAcc.get().setBalance(srcBalance - amount);
        return true;
    }
}