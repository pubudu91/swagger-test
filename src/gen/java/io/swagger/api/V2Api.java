package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.V2ApiService;
import io.swagger.api.factories.V2ApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse401;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;

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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-18T19:55:30.603Z")
public class V2Api  {
   private final V2ApiService delegate = V2ApiServiceFactory.getV2Api();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Tells whether this Docker Registry instance supports Docker Registry HTTP API v2", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response. API v2 supported", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Registry does not implement v2 of the API", response = void.class) })
    public Response v2Get(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2Get(securityContext);
    }
    @GET
    @Path("/{name}/blobs/{digest}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Retrieve the blob from the registry identified by digest.", response = byte[].class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The blob identified by digest is available. The blob content will be present in the body of the response.", response = byte[].class),
        @io.swagger.annotations.ApiResponse(code = 206, message = "The blob identified by digest is available. The specified chunk of blob content will be present in the body of the request.", response = byte[].class),
        @io.swagger.annotations.ApiResponse(code = 307, message = "The blob identified by digest is available at the provided location.", response = byte[].class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "On failure", response = byte[].class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = byte[].class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The blob, identified by name and digest, is unknown to the registry.", response = byte[].class),
        @io.swagger.annotations.ApiResponse(code = 416, message = "The range specification cannot be satisfied for the requested content.", response = byte[].class) })
    public Response v2NameBlobsDigestGet(
        @ApiParam(value = "Name of the image (including the namespace)",required=true) @PathParam("name") String name,
        @ApiParam(value = "Digest of a desired BLOB",required=true) @PathParam("digest") String digest,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2NameBlobsDigestGet(name,digest,securityContext);
    }
    @HEAD
    @Path("/{name}/blobs/{digest}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Same as GET, except only the headers are returned.", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The blob identified by digest is available. The blob content will be present in the body of the response.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 206, message = "The blob identified by digest is available. The specified chunk of blob content will be present in the body of the request.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 307, message = "The blob identified by digest is available at the provided location.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "On failure", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The blob, identified by name and digest, is unknown to the registry.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 416, message = "The range specification cannot be satisfied for the requested content.", response = void.class) })
    public Response v2NameBlobsDigestHead(
        @ApiParam(value = "Name of the image (including the namespace)",required=true) @PathParam("name") String name,
        @ApiParam(value = "Digest of a desired BLOB",required=true) @PathParam("digest") String digest,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2NameBlobsDigestHead(name,digest,securityContext);
    }
    @POST
    @Path("/{name}/blobs/uploads")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Upload a blob identified by the digest parameter in single request. This upload will not be resumable unless a recoverable error is returned.", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "The blob has been created in the registry and is available at the provided location.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 202, message = "The upload has been created. The Location header must be used to complete the upload. The response should be identical to a GET request on the contents of the returned Location header.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "On failure", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = void.class) })
    public Response v2NameBlobsUploadsPost(
        @ApiParam(value = "Name of the image (including the namespace)",required=true) @PathParam("name") String name,
        @ApiParam(value = "Digest of uploaded blob. If present, the upload will be completed, in a single request, with contents of the request body as the resulting blob.") @QueryParam("digest") String digest,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2NameBlobsUploadsPost(name,digest,securityContext);
    }
    @DELETE
    @Path("/{name}/blobs/uploads/{uuid}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Cancel outstanding upload processes, releasing associated resources. If this is not called, the unfinished uploads will eventually timeout.", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The upload has been successfully deleted.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "On failure", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The upload is unknown to the registry. The client may ignore this error and assume the upload has been deleted.", response = void.class) })
    public Response v2NameBlobsUploadsUuidDelete(
        @ApiParam(value = "Name of the image (including the namespace)",required=true) @PathParam("name") String name,
        @ApiParam(value = "A uuid identifying the upload.",required=true) @PathParam("uuid") String uuid,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2NameBlobsUploadsUuidDelete(name,uuid,securityContext);
    }
    @GET
    @Path("/{name}/blobs/uploads/{uuid}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Retrieve status of upload identified by uuid. The primary purpose of this endpoint is to resolve the current status of a resumable upload.", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The upload is known and in progress. The last received offset is available in the Range header.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "On failure", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The upload is unknown to the registry. The upload must be restarted.", response = void.class) })
    public Response v2NameBlobsUploadsUuidGet(
        @ApiParam(value = "Name of the image (including the namespace)",required=true) @PathParam("name") String name,
        @ApiParam(value = "A uuid identifying the upload.",required=true) @PathParam("uuid") String uuid,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2NameBlobsUploadsUuidGet(name,uuid,securityContext);
    }
    @PATCH
    @Path("/{name}/blobs/uploads/{uuid}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Upload a stream of data to upload without completing the upload.", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The stream of data has been accepted and the current progress is available in the range header. The updated upload location is available in the Location header.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "On failure", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The upload is unknown to the registry. The upload must be restarted.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 416, message = "The Content-Range specification cannot be accepted, either because it does not overlap with the current progress or it is invalid.", response = void.class) })
    public Response v2NameBlobsUploadsUuidPatch(
        @ApiParam(value = "Name of the image (including the namespace)",required=true) @PathParam("name") String name,
        @ApiParam(value = "A uuid identifying the upload.",required=true) @PathParam("uuid") String uuid,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2NameBlobsUploadsUuidPatch(name,uuid,securityContext);
    }
    @PUT
    @Path("/{name}/blobs/uploads/{uuid}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Complete the upload, providing all the data in the body, if necessary. A request without a body will just complete the upload with previously uploaded content.", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The upload has been completed and accepted by the registry.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "On failure", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The upload is unknown to the registry. The upload must be restarted.", response = void.class) })
    public Response v2NameBlobsUploadsUuidPut(
        @ApiParam(value = "Name of the image (including the namespace)",required=true) @PathParam("name") String name,
        @ApiParam(value = "A uuid identifying the upload.",required=true) @PathParam("uuid") String uuid,
        @ApiParam(value = "Digest of uploaded blob. If present, the upload will be completed, in a single request, with contents of the request body as the resulting blob.",required=true) @QueryParam("digest") String digest,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2NameBlobsUploadsUuidPut(name,uuid,digest,securityContext);
    }
    @DELETE
    @Path("/{name}/manifests/{reference}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Delete the manifest identified by name and reference where reference can be a tag or digest.", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "The manifest has been accepted by the registry and is stored under the specified name and tag.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "On failure", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The named manifest could not be found in the Registry", response = void.class) })
    public Response v2NameManifestsReferenceDelete(
        @ApiParam(value = "Name of the image (including the namespace)",required=true) @PathParam("name") String name,
        @ApiParam(value = "A tag or a digest, pointing to a specific image",required=true) @PathParam("reference") String reference,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2NameManifestsReferenceDelete(name,reference,securityContext);
    }
    @GET
    @Path("/{name}/manifests/{reference}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Pulls the image manifest file associated with the specified name and reference. Reference may be a tag or a digest", response = InlineResponse200.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Returns the requested manifest file", response = InlineResponse200.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "On failure", response = InlineResponse200.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = InlineResponse200.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The named manifest could not be found in the Registry", response = InlineResponse200.class) })
    public Response v2NameManifestsReferenceGet(
        @ApiParam(value = "Name of the image (including the namespace)",required=true) @PathParam("name") String name,
        @ApiParam(value = "A tag or a digest, pointing to a specific image",required=true) @PathParam("reference") String reference,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2NameManifestsReferenceGet(name,reference,securityContext);
    }
    @PUT
    @Path("/{name}/manifests/{reference}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Put the manifest identified by name and reference where reference can be a tag or digest.", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "The manifest has been accepted by the registry and is stored under the specified name and tag.", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "On failure", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = void.class) })
    public Response v2NameManifestsReferencePut(
        @ApiParam(value = "Name of the image (including the namespace)",required=true) @PathParam("name") String name,
        @ApiParam(value = "A tag or a digest, pointing to a specific image",required=true) @PathParam("reference") String reference,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2NameManifestsReferencePut(name,reference,securityContext);
    }
    @GET
    @Path("/{name}/tags/list")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Fetch the tags under the repository identified by 'name'", response = InlineResponse2001.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Gives a list of tags for the names repository.", response = InlineResponse2001.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = InlineResponse2001.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "The named manifest could not be found in the Registry", response = InlineResponse2001.class) })
    public Response v2NameTagsListGet(
        @ApiParam(value = "Name of the image (including the namespace)",required=true) @PathParam("name") String name,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.v2NameTagsListGet(name,securityContext);
    }
}
