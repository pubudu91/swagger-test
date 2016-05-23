package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse401;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-18T19:55:30.603Z")
public abstract class V2ApiService {
  
      public abstract Response v2Get(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response v2NameBlobsDigestGet(String name,String digest,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response v2NameBlobsDigestHead(String name,String digest,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response v2NameBlobsUploadsPost(String name,String digest,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response v2NameBlobsUploadsUuidDelete(String name,String uuid,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response v2NameBlobsUploadsUuidGet(String name,String uuid,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response v2NameBlobsUploadsUuidPatch(String name,String uuid,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response v2NameBlobsUploadsUuidPut(String name,String uuid,String digest,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response v2NameManifestsReferenceDelete(String name,String reference,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response v2NameManifestsReferenceGet(String name,String reference,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response v2NameManifestsReferencePut(String name,String reference,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response v2NameTagsListGet(String name,SecurityContext securityContext)
      throws NotFoundException;
  
}
