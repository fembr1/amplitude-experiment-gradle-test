package com.tiket.tix.experiment.gradle;

import com.tiket.tix.common.experiment.User;
import com.tiket.tix.common.experiment.Variant;
import com.tiket.tix.common.experiment.client.ExperimentClient;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
class Controller {

  @Autowired
  private ExperimentClient experimentClient;

  @GetMapping(path = "/experiment/variant")
  public Mono<List<Variant>> getVariants(User user) {
    return experimentClient.getVariants(user);
  }

  @GetMapping(path = "/experiment/variant/{flagKey}")
  public Mono<Variant> getVariants(@PathVariable String flagKey, User user) {
    return experimentClient.getVariant(user, flagKey);
  }
}
