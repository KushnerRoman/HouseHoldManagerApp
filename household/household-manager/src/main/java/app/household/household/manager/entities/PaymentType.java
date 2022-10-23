package app.household.household.manager.entities;

public enum PaymentType {

    CASH, CARD, BANK_TRANSFER, CREDIT_CARD,BIT, OTHER;

    @Override
    public String toString() {
        switch (this) {
            case CASH:
                return "CASH";
            case CARD:
                return "CARD";
            case BANK_TRANSFER:
                return "BANK_TRANSFER";
            case CREDIT_CARD:
                return "CREDIT_CARD";
            case BIT:
                return "BIT";
            case OTHER:
                return "OTHER";
            default:
                return super.toString();
        }
    }


}
