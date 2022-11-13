package hu.testathon;

import hu.testathon.controller.TestService;
import hu.testathon.model.domain.TestValidator;
import hu.testathon.model.service.DataApi;
import hu.testathon.model.service.DataPraser;
import hu.testathon.model.service.FileReader;

public class App {

    private final TestService testService;

    private App() {
         DataApi dataApi = new DataApi("valaszok.txt", new FileReader(), new DataPraser());
        testService = new TestService(new TestValidator(dataApi.getAnswers()),
                dataApi.getTestResults());
    }

    public static void main(String[] args) {
        new App().run();
    }

    private void run() {
        System.out.println("1.feladat");
        System.out.printf("2. feladat: A vetélkedőn" + testService.getCompetitorNumber() + "vesenyző indult.");
    }
}
