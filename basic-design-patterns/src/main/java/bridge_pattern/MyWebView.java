package bridge_pattern;

import bridge_pattern.resources.ConcreteArtistResource;
import bridge_pattern.resources.ResourceBase;
import bridge_pattern.views.LongView;
import bridge_pattern.views.PortraitView;

public class MyWebView {

  public static void main(String[] args) {
    ResourceBase artistResource = new ConcreteArtistResource(); // get artist resource
    LongView longViewRender = new LongView(artistResource); // choose long view page for the web
    longViewRender.show(); // render the artist resource on long view page.

    System.out.println("----------------------------------------");

    System.out.println("                                         ");

    PortraitView portraitView = new PortraitView(artistResource); // choose long view page for the web
    portraitView.show(); // render the artist resource on long view page.
  }
}
