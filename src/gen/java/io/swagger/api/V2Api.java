package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.V2ApiService;
import io.swagger.api.factories.V2ApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/v2")


@io.swagger.annotations.Api(description = "the v2 API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-06T17:28:24.798Z")
public class V2Api  {
   private final V2ApiService delegate = V2ApiServiceFactory.getV2Api();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Tells whether this Docker Registry instance supports Docker Registry HTTP API v2", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Registry does not implement v2 of the API", response = void.class) })
    public Response v2Get(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2Get(securityContext);
    }
}
