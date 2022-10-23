package app.household.household.manager.entities.variablePayments;

public enum GroceryType {

    BASIC,ADVANCED,LARGE;

    @Override
    public String toString() {
        return switch (this) {
            case BASIC -> "BASIC";
            case ADVANCED -> "ADVANCED";
            case LARGE -> "LARGE";

        };
    }


}
