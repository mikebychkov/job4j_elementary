package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User us : users) {
            if (us.getUsername().equals(login)) {
                return us;
            }
        }
        throw new UserNotFoundException("User not found!");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() <= 3 || !user.isValid()) {
            throw new UserInvalidException("User is invalid!");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("User is invalid!");
        } catch (UserNotFoundException e) {
            System.out.println("User not found!");
        }
    }
}