public class OrderProcessing {
    public void processOrder(String customerType, String paymentMethod, double orderAmount, int itemCount) {
        if (customerType != null && !customerType.isEmpty()) {
            if (customerType.equals("VIP")) {
                if (orderAmount > 1000) {
                    if (paymentMethod != null && paymentMethod.equals("CreditCard")) {
                        System.out.println("VIP customer: Large order with CreditCard.");
                        if (itemCount > 10) {
                            System.out.println("Free gift added for VIP customer.");
                        } else {
                            System.out.println("No free gift for VIP with less than 10 items.");
                        }
                    } else if (paymentMethod != null && paymentMethod.equals("Cash")) {
                        System.out.println("VIP customer: Large order with Cash.");
                    } else {
                        System.out.println("VIP customer: Large order, unsupported payment method.");
                    }
                } else {
                    System.out.println("VIP customer: Small order.");
                }
            } else if (customerType.equals("Regular")) {
                if (orderAmount > 500) {
                    System.out.println("Regular customer: Large order.");
                } else {
                    System.out.println("Regular customer: Small order.");
                }
            } else {
                System.out.println("Unrecognized customer type.");
            }
        } else {
            System.out.println("Invalid customer information.");
        }

        for (int i = 0; i < itemCount; i++) {
            if (i % 2 == 0) {
                if (i > 5) {
                    System.out.println("Processing bulk item: " + i);
                } else {
                    System.out.println("Processing item: " + i);
                }
            } else {
                System.out.println("Skipping item: " + i);
            }
        }

        if (paymentMethod != null && paymentMethod.equals("CreditCard")) {
            if (orderAmount > 200) {
                if (customerType.equals("VIP")) {
                    System.out.println("CreditCard payment processed with VIP discount.");
                } else if (customerType.equals("Regular")) {
                    System.out.println("CreditCard payment processed for Regular customer.");
                } else {
                    System.out.println("CreditCard payment processed for unknown customer type.");
                }
            } else {
                System.out.println("CreditCard payment processed for small order.");
            }
        } else {
            System.out.println("Non-CreditCard payment processed.");
        }
    }
}
