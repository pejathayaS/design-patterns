package bridge_pattern.resources;

import java.time.Duration;

public interface ResourceBase {
  String bio();
  String recordDetails();
  Duration duration();
  String title();
}
