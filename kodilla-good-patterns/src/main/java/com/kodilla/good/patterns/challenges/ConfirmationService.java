package com.kodilla.good.patterns.challenges;

public class ConfirmationService implements InformationService {

    @Override
    public void confirm(User user) {
        System.out.println("Order confirmation to user " + user + "has been sent!");
    }
}
