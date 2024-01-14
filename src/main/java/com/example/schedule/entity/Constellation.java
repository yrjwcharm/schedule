package com.example.schedule.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Constellation {

    @JSONField(name = "reason")
    private String reason;
    @JSONField(name = "result")
    private ResultDTO result;
    @JSONField(name = "error_code")
    private Integer errorCode;

    @NoArgsConstructor
    @Data
    public static class ResultDTO {
        @JSONField(name = "icon")
        private String icon;
        @JSONField(name = "name")
        private String name;
        @JSONField(name = "range")
        private String range;
        @JSONField(name = "zxtd")
        private String zxtd;
        @JSONField(name = "sssx")
        private String sssx;
        @JSONField(name = "zggw")
        private String zggw;
        @JSONField(name = "yysx")
        private String yysx;
        @JSONField(name = "zdtz")
        private String zdtz;
        @JSONField(name = "zgxx")
        private String zgxx;
        @JSONField(name = "xyys")
        private String xyys;
        @JSONField(name = "jssw")
        private String jssw;
        @JSONField(name = "xyhm")
        private String xyhm;
        @JSONField(name = "kyjs")
        private String kyjs;
        @JSONField(name = "bx")
        private String bx;
        @JSONField(name = "yd")
        private String yd;
        @JSONField(name = "qd")
        private String qd;
        @JSONField(name = "jbtz")
        private String jbtz;
        @JSONField(name = "jttz")
        private String jttz;
        @JSONField(name = "xsfg")
        private String xsfg;
        @JSONField(name = "gxmd")
        private String gxmd;
        @JSONField(name = "zj")
        private String zj;
    }
}
