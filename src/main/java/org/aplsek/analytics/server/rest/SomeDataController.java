package org.aplsek.analytics.server.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Example rest endpoint controller.
 */
@RestController
public class SomeDataController {

    @RequestMapping("/somedata")
    public SomeData getSomeData() {
        return new SomeData("1", "some value");
    }

}
