package com.example.calc;

import java.math.BigDecimal;


public class resultbuilder {

    private resultbuilder() {
    }


    public static apiresult getResult( Object result ) {
        return apiresult.withResult(result.toString());
    }

    public static apiresult getResult( BigDecimal result ) {
        return apiresult.withResult(result.toPlainString());
    }
    public static apiresult getResult( int result ) {
        return apiresult.withResult(String.valueOf(result));
    }

    public static apiresult getResultFromError(String errorMessage) {
        return apiresult.withError(errorMessage);
    }
}
