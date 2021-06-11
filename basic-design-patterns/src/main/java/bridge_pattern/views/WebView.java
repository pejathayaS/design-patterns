package bridge_pattern.views;

import bridge_pattern.resources.ResourceBase;


public abstract class WebView {

  private ResourceBase resourceBase;

  public WebView(ResourceBase rb) {
    resourceBase = rb;
  }

  public ResourceBase getResourceBase() {
    return resourceBase;
  }

  public abstract void show();
}
