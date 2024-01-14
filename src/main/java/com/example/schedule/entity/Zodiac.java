package com.example.schedule.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class Zodiac {

    @JsonProperty("reason")
    private String reason;
    @JsonProperty("result")
    private ResultDTO result;
    @JsonProperty("error_code")
    private Integer errorCode;

    @NoArgsConstructor
    @Data
    public static class ResultDTO {
        @JsonProperty("name")
        private String name;
        @JsonProperty("years")
        private String years;
        @JsonProperty("fw")
        private String fw;
        @JsonProperty("sc")
        private String sc;
        @JsonProperty("sz")
        private String sz;
        @JsonProperty("xyh")
        private String xyh;
        @JsonProperty("ys")
        private String ys;
        @JsonProperty("sy")
        private String sy;
        @JsonProperty("aq")
        private String aq;
        @JsonProperty("xg")
        private String xg;
        @JsonProperty("yd")
        private String yd;
        @JsonProperty("qd")
        private String qd;
        @JsonProperty("currentAge")
        private List<CurrentAgeDTO> currentAge;

        @NoArgsConstructor
        @Data
        public static class CurrentAgeDTO {
            @JsonProperty("y")
            private Integer y;
            @JsonProperty("s")
            private Integer s;
            @JsonProperty("x")
            private Integer x;
        }
    }
}