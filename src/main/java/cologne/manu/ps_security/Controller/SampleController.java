package cologne.manu.ps_security.Controller;

import cologne.manu.ps_security.Model.SampleDataContainer;
import reactor.core.publisher.Mono;

public interface SampleController {

    Mono<SampleDataContainer> getSampleData();

}
