package koorunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/koocumber/koocumber.feature"}, glue="koodefi",
                               plugin= {"html:testoutput/koowebapp.html"})
public class runerkoo {

}
