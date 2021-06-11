package bridge_pattern.resources;

import java.time.Duration;

public class ConcreteArtistResource implements ResourceBase{

  @Override
  public String bio() {
    return "MyArtistbio";
  }

  @Override
  public String recordDetails() {
    return "MyArtistRecordDetails";
  }

  @Override
  public Duration duration() {
    return Duration.ofMinutes(240);
  }

  @Override
  public String title() {
    return "MyArtistTitle";
  }
}
