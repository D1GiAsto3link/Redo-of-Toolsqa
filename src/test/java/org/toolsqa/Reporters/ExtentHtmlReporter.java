package org.toolsqa.Reporters;

public class ExtentHtmlReporter {


    public ExtentHtmlReporter(String s) {

    }

    public void htmlreporter(){
        ExtentHtmlReporter htmlReporter =  new
                ExtentHtmlReporter(System.getProperty("C:\\Users\\Digi_WS\\IdeaProjects\\Redo of Toolsqa\\src\\test\\java\\org\\toolsqa\\Reporters")
                +"/Reporters/extentReport.html");
    }


}
