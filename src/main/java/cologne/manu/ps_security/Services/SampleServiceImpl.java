package cologne.manu.ps_security.Services;

import cologne.manu.ps_security.Model.SampleDataContainer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class SampleServiceImpl implements SampleService {


    @Override
    public Mono<SampleDataContainer> getSampleData() {
        var data = new SampleDataContainer();
        data.setSampleDataString("Some sample string");
        return Mono.just(data);
    }
}
