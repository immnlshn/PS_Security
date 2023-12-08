package cologne.manu.ps_security.Services;

import cologne.manu.ps_security.Model.SampleDataContainer;
import reactor.core.publisher.Mono;

public interface SampleService {

    Mono<SampleDataContainer> getSampleData();

}
