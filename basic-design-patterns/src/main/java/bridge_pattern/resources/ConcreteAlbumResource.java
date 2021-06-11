package bridge_pattern.resources;

import java.time.Duration;

public class ConcreteAlbumResource implements ResourceBase{

  @Override
  public String bio() {
    return "MyAlbumBio";
  }

  @Override
  public String recordDetails() {
    return "MyAlbumRecordDetails";
  }

  @Override
  public Duration duration() {
    return Duration.ofMinutes(28);
  }

  @Override
  public String title() {
    return "MyAlbumTitle";
  }
}
