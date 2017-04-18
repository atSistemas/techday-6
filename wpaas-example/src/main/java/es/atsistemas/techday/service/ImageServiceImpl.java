package es.atsistemas.techday.service;

import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="wallpaper")
public class ImageServiceImpl implements ImageService {

	@Autowired
	private Map<String,String> uriMap;
	
	@Override
	public InputStream getImage(String key) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	public URI getImageURI(String key){
		
		URI result = null;
		try {
			result = new URI(uriMap.get(key));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}

	public Map<String, String> getUriMap() {
		return uriMap;
	}

}