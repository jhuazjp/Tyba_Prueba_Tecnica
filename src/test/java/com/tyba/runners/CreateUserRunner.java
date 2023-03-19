package com.tyba.runners;

import com.tyba.utils.BeforeSuite;
import com.tyba.utils.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

import java.io.IOException;

import static com.tyba.utils.ClassType.RUNNER_CLASS;

@RunWith(MajorRunner.class)
@CucumberOptions(features = "src/test/resources/features/CreateUser.feature",
        glue = "com.tyba.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class CreateUserRunner {

    public CreateUserRunner(){
        throw new IllegalStateException(RUNNER_CLASS);
    }


    @BeforeSuite
    public static void test() throws IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/CreateUser.feature");
    }
}
