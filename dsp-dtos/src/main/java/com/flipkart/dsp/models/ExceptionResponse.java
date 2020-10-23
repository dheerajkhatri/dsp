package com.flipkart.dsp.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class ExceptionResponse {

  private List<Error> errors = new ArrayList<>();

  public ExceptionResponse add(Error error) {
    errors.add(error);
    return this;
  }

  @Data
  @NoArgsConstructor
  public static class Error {

    private String type = "ERROR";
    private String code;
    private String message;
    private Map<String, String> params = new HashMap<>();

    public Error(String code, String message) {
      this.code = code;
      this.message = message;
    }
  }

}
