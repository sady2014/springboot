package com.springboot.util;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;

import java.io.File;

public class JApiDocs {
    public static void main(String[] args) {
        DocsConfig config = new DocsConfig();
        config.setProjectPath("C:\\Users\\Mugua\\IdeaProjects\\springboot"); // root project path
        config.setProjectName("SpringBoot"); // project name
        config.setApiVersion("V1.1");       // api version
        config.setDocsPath("C:\\Users\\Mugua\\IdeaProjects\\springboot\\web\\src\\main\\resources\\doc"); // api docs target path
        config.setAutoGenerate(Boolean.TRUE);  // auto generate
        Docs.buildHtmlDocs(config); // execute to generate
    }
}
