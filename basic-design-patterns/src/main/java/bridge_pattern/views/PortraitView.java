package bridge_pattern.views;

import bridge_pattern.resources.ResourceBase;

public class PortraitView extends WebView{

  public PortraitView(ResourceBase rb) {
    super(rb);
  }

  @Override
  public void show() {
    System.out.println("-----PortraitView-----");
    System.out.println(this.getResourceBase().bio());
    System.out.println("----------------------");
    System.out.println(this.getResourceBase().title());
    System.out.println("---------------------");
    System.out.println(this.getResourceBase().recordDetails());
    System.out.println("----------------------");
    System.out.println(this.getResourceBase().duration());
    System.out.println("----PortraitView------");
  }
}
