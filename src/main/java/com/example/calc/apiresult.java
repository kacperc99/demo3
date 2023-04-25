package com.example.calc;

public class apiresult {

    private String result;
    private String error;

    private apiresult() {
    }

    static apiresult withResult(String resultMessage) {
        apiresult apiResult = new apiresult();
        apiResult.result = resultMessage;
        return apiResult;
    }

    static apiresult withError(String errorMessage) {
        apiresult apiResult = new apiresult();
        apiResult.error = errorMessage;
        return apiResult;
    }

    public String getResult() {
        return result;
    }

    public String getError() {
        return error;
    }
}
