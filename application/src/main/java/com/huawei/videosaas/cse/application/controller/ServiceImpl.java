package com.huawei.videosaas.cse.application.controller;


import javax.ws.rs.core.MediaType;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-03-16T13:20:13.511Z")

@RestSchema(schemaId = "cse-app")
@RequestMapping(path = "/cse-app", produces = MediaType.APPLICATION_JSON)
public class ServiceImpl {

    @Autowired
    private ServiceDelegate userServiceDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { MediaType.APPLICATION_JSON },
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userServiceDelegate.helloworld(name);
    }

}
