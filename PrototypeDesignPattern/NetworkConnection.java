package PrototypeDesignPattern;

class NetworkConnection implements Cloneable {
  private String ip;
  private String CriticalData;

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getIp() {
    return ip;
  }

  public void loadCriticalData() throws InterruptedException {
    Thread.sleep(3000);
    this.CriticalData = "Critical Data";
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return this.ip + " : " + this.CriticalData;
  }

}