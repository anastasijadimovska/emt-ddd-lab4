package mk.ukim.finki.emt.accommodationsmanagement.xport;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.Accommodation;
import mk.ukim.finki.emt.accommodationsmanagement.domain.model.AccommodationId;
import mk.ukim.finki.emt.accommodationsmanagement.service.AccommodationsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accommodations")
@AllArgsConstructor
public class AccommodationResource {
    private final AccommodationsService accommodationsService;

    @GetMapping
    public List<Accommodation> listAll(){
        return accommodationsService.findAll();
    }

    @GetMapping("/{id}")
    public Accommodation findAccommodation(@PathVariable AccommodationId id){
        return accommodationsService.findById(id);
    }
}
