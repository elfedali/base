package com.benit.base.mvc.api.model;

/**
 * Simple immutable model, which returns a JSON with project name and version.
 * 
 * @author Abdessamad
 * @version 0.0.1-SNAPSHOT
 * @since 0.0.1-SNAPSHOT
 */
public class WhoAmIResponseModel {

    private final String name;
    private final String version;

    /**
     * Simple Constructor.
     * 
     * @param name    {@link String}
     * @param version {@link String}
     */
    public WhoAmIResponseModel(final String name, final String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

}
