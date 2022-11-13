package hu.testathon.controller;

import hu.testathon.model.domain.TestResult;
import hu.testathon.model.domain.TestValidator;

import java.util.List;

public class TestService {
    private final TestValidator testValidator;
    private final List<TestResult> testResults;

    public TestService(TestValidator testValidator, List<TestResult> testResults) {
        this.testValidator = testValidator;
        this.testResults = testResults;
    }

    /**
     * 2.feladat: Jelenítse meg
     */
    public int getCompetitorNumber() {
        return testResults.size();

    }

}
