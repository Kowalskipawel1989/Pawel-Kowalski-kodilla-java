package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    public void information(final User user){
        System.out.println("Name: " + user.getName() + " " + user.getSecondName()
                            + "\n" + "nick: " + user.getNickName()
                            + "\n" + "address: " + user.getAddress() + "\n" + "phone number: "
                            + user.getPhoneNumber());
    }
}
