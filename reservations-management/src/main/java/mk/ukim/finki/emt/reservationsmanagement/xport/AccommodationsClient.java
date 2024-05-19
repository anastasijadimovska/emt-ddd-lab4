package mk.ukim.finki.emt.reservationsmanagement.xport;

import mk.ukim.finki.emt.reservationsmanagement.domain.valueobjects.Accommodation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.List;

@Service
public class AccommodationsClient {
    private final RestTemplate restTemplate;
    private final String serverUrl;

    public AccommodationsClient(@Value("${app.accommodations-list.url}") String serverUrl)  {
        this.restTemplate = new RestTemplate();
        this.serverUrl = serverUrl;
        var requestFactory = new SimpleClientHttpRequestFactory();
        this.restTemplate.setRequestFactory(requestFactory);
    }

    private UriComponentsBuilder uri(){
        return UriComponentsBuilder.fromUriString(this.serverUrl);
    }

    public List<Accommodation> findAll(){
        try {
            return restTemplate.exchange(uri().path("/accommodations").build().toUri(), HttpMethod.GET, null, new ParameterizedTypeReference<List<Accommodation>>() {
            }).getBody();
        }catch (Exception e){
            return Collections.emptyList();
        }
    }

}
