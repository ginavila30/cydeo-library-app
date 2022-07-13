package com.cydeo.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber_reports.html", "json:target/cucumber-report.json", "me.jvt.cucumber.report.PrettyReports:target", "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/cydeo/library/step_definitions",
        dryRun = false,
        tags = "@testingExcel",
        publish = true
)
public class CukesRunner {


}
