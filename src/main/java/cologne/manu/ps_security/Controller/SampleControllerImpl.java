package cologne.manu.ps_security.Controller;

import cologne.manu.ps_security.Model.SampleDataContainer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/sample")
public class SampleControllerImpl implements SampleController {

    @GetMapping(
        path = "/",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Override
    public Mono<SampleDataContainer> getSampleData() {
        var data = new SampleDataContainer();
        data.setSampleDataString("Some sample string");
        return Mono.just(data);
    }

}
