package hu.testathon.model.service;

import hu.testathon.model.domain.TestResult;

import java.util.List;

public class DataApi {


    private final DataPraser dataPraser;
    private final List<String> lines;

    public DataApi(String filename, FileReader fileReader, DataPraser dataPraser) {
        lines = fileReader.read(filename);
        this.dataPraser = dataPraser;
    }

    public List<TestResult> getTestResults() {
        return dataPraser.getResults(lines);
    }
    public String getAnswers() {
        return dataPraser.getAnswers(lines);
    }
}
