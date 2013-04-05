package com.jonwelzel.hellossl.wsresources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/scanfileslist")
public class ScanFilesList {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getScanFilesList() {
    return "LOL";
  }
  
}
