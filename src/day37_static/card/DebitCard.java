package day37_static.card;

    public class DebitCard {
        /*
         Create a class for Debit Card that has the following instance variables:
            card number (long), holder name (String), card type (String), pin (int), and balance (double):
         */
        long cardNumber;
        String holderName;
        String cardType;
        int pin;
        double balance;
        //  Static variable: account type (debit):
        static String accountType;

        // -> Use static block to initialize account type:
        static {
            accountType = "debit";
        }

        /*
         Create a constructor that will create a debit card object and initialize the card number, the card holder name, and the balance. The card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print “Invalid card number”
         */
        public DebitCard(long cardNumber, String holderName, double balance) {
            String cardNumb = String.valueOf(cardNumber);
            if (cardNumb.length() == 16) {
                this.cardNumber = cardNumber;
            } else {
                System.out.println("Invalid card number");
//            this.cardNumber = -1;
            }
            this.holderName = holderName;
            this.balance = balance;
        }

        /* Overload the constructor to take all the instance variables.
         The card type must be either MasterCard or Visa to be valid card type. If it is not one of those two then do not store the type and print “invalid card type”. Also the pin must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”
          */
        public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
            this.cardNumber = cardNumber;
            this.holderName = holderName;
            this.balance = balance;
            if (cardType.equalsIgnoreCase("MasterCard") || cardType.equalsIgnoreCase("Visa")) {
                this.cardType = cardType;
            } else {
                System.out.println("Invalid card type");
            }
            String pinString = String.valueOf(pin);
            if (pinString.length() == 4) {
                this.pin = pin;
            } else {
                System.out.println("Invalid pin length");
            }

        }
        //Add the toString method that will print all the card's information (Except the pin). If the card type does not have a value do not print that line


        @Override
        public String toString() {
            if (cardType != null) {
                return "------\nDebitCard details: " +
                        "\nCardNumber : " + cardNumber +
                        "\nHolderName : " + holderName +
                        "\nCardType : " + cardType +
                        "\nBalance : $" + balance;
            } else {
                return "------\nDebitCard details: " +
                        "\nCardNumber : " + cardNumber +
                        "\nHolderName : " + holderName +
                        "\nBalance : $" + balance;
            }

        }
    }