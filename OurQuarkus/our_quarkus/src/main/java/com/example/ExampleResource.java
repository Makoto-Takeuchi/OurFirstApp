package com.example;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    DataOperationService dos;

    @GET
    public String getSampleList(){
        //dos.getAllSample();
        return "data list";
    }

    @Path("{id}")
    @GET
    public String getSampleById(Long id){
        //Sample s = dos.getSample(id);
        return "id="+1;
    }

    @POST
    public void createNewSample(){
        //dos.createSample(id, name, description);
    }

    @Path("{id}")
    @PUT
    public void modifySample(Long id){
        //Sample sp = Sample.findById(id);
        //Sample.update("id",sp);
    }

    @Path("{id}")
    @DELETE
    public void deleteSample(Long id){
        //Sample.delete("id",id);
    }
}