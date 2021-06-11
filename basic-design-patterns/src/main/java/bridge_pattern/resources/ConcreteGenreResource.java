package bridge_pattern.resources;

import java.time.Duration;

public class ConcreteGenreResource implements ResourceBase {

  @Override
  public String bio() {
    return "MyGenreBio";
  }

  @Override
  public String recordDetails() {
    return "MyGenreReordDetails";
  }

  @Override
  public Duration duration() {
    return Duration.ofMinutes(200);
  }

  @Override
  public String title() {
    return "MyGenreTitle";
  }
}
