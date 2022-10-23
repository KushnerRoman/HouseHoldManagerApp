package app.household.household.manager.entities.fixedPayments;

public enum BillType {

    ELECTRICITY, GAS, WATER, INTERNET, TELEVISION, PHONE, ARNONA, OTHER;

    @Override
    public String toString() {
        return switch (this) {
            case ELECTRICITY -> "ELECTRICITY";
            case GAS -> "GAS";
            case WATER -> "WATER";
            case INTERNET -> "INTERNET";
            case TELEVISION -> "TELEVISION";
            case PHONE -> "PHONE";
            case ARNONA -> "ARNONA";
            case OTHER -> "OTHER";

        };
    }
}
