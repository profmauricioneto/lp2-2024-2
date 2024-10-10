package org.unichristus.abstractclass.observerexample;

public class Main {
    public static void main(String[] args) {
        Subject wine = new Subject();

        ObserverSenderEmail emails = new ObserverSenderEmail(wine);
        emails.addEmail("qwerty@werty.com");
        emails.addEmail("asdfghj@asdfgh.com");
        ObserverSenderSMS telefones = new ObserverSenderSMS(wine);
        telefones.addNumberPhone("85 9911223344");
        telefones.addNumberPhone("85 9988776655");

        for (int i = 0; i < 4; i++) {
            if(wine.isEven(i)) {
                System.out.println("Evento No. " + i);
                wine.notifyAllAttaches();
            }
        }
    }
}
