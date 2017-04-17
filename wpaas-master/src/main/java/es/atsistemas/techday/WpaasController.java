package es.atsistemas.techday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.atsistemas.techday.service.ImageService;

@RestController
public class WpaasController {
	
	@Autowired
	private ImageService imageService;

	
	@RequestMapping(value = "/wpaas", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<Object> getImage(@RequestParam String character) {
	    
	    HttpHeaders httpHeaders = new HttpHeaders();
	    httpHeaders.setLocation(imageService.getImageURI(character));
	    
	    return new ResponseEntity<>(httpHeaders, HttpStatus.SEE_OTHER);
	}
	
}
