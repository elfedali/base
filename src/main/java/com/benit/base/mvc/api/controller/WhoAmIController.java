package com.benit.base.mvc.api.controller;

import com.benit.base.mvc.api.model.WhoAmIResponseModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Prints simple project information.
 * 
 * @author Abdessamad
 * @version 0.0.1-SNAPSHOT
 * @since 0.0.1-SNAPSHOT
 */

@RestController
@RequestMapping("/api")
public class WhoAmIController {

    /**
     * set to public for junit test.
     */
    public static final String URL_MAPPING = "/whoami";

    private final String appName;
    private final String appVersion;

    /**
     * Simple Constructor. Inject values from application.properties with springs
     * {@link Value} Annotation.
     * 
     * @param appName    {@link appName}
     * @param appVersion {@link appName}
     */
    @Autowired
    private WhoAmIController(@Value("${base.app.name}") final String appName,
            @Value("${base.app.version}") final String appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;

    }

    /**
     * Print App Name and App Version as JSON.
     * 
     * @return {@link WhoAmIResponse}
     */

    @GetMapping(value = { URL_MAPPING, "/about" })
    public ResponseEntity<WhoAmIResponseModel> get() {
        return new ResponseEntity<>(new WhoAmIResponseModel(appName, appVersion), HttpStatus.OK);
    }
}
