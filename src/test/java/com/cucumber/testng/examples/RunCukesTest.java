package com.cucumber.testng.examples;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
/**
 * Created by Amit Rawat on 2/23/2016.
 */

@CucumberOptions(features = "src/test/resources/com.cucumber.testng.examples/date_calculator2.feature", format = { "pretty",
        "html:target/site/cucumber-pretty2",
        "json:target/cucumber2.json" })
public class RunCukesTest extends AbstractTestNGCucumberTests {
}

