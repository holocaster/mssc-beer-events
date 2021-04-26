package br.com.prcompany.beerevents.utils;

public abstract class EventsConstants {

    public static final String BREWING_REQUEST_QUEUE = "brewing-request";
    public static final String NEW_INVENTORY_QUEUE = "new-inventory";
    public static final String VALIDATE_ORDER_QUEUE = "validate-order";
    public static final String VALIDATE_ORDER_RESULT_QUEUE = "validate-order-result";
    public static final String ALLOCATE_ORDER_QUEUE = "allocate-order";
    public static final String ALLOCATE_ORDER_RESULT_QUEUE = "allocate-order-result";
    public static final String ALLOCATE_FAIL_QUEUE = "allocate-fail";
    public static final String DEALLOCATE_ORDER_QUEUE = "deallocate-order";
}
