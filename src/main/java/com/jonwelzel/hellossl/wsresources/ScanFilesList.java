package com.jonwelzel.hellossl.wsresources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

@Path("/scanfileslist")
public class ScanFilesList {

  private final Logger log = Logger.getLogger(getClass());
  
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getScanFilesList() {
    log.info("Serving scan files list");
    return "LOL";
  }
  
}
