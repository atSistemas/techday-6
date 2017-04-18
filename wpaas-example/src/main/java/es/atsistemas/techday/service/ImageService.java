package es.atsistemas.techday.service;

import java.io.InputStream;
import java.net.URI;

public interface ImageService {

	public InputStream getImage(String key);
	
	public URI getImageURI(String key);
}
