package org.aplsek.analytics.server.rest;

/**
 * Example resource representation class.
 */
public class SomeData {

    private final String id;
    private final String someAttribute;

    public SomeData(String id, String someAttribute) {
        this.id = id;
        this.someAttribute = someAttribute;
    }

    public String getId() {
        return id;
    }

    public String getSomeAttribute() {
        return someAttribute;
    }
}
