package io.swagger.api.factories;

import io.swagger.api.V2ApiService;
import io.swagger.api.impl.V2ApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-18T19:55:30.603Z")
public class V2ApiServiceFactory {

   private final static V2ApiService service = new V2ApiServiceImpl();

   public static V2ApiService getV2Api()
   {
      return service;
   }
}
