package by.attendance.bsuir.network;

public  class NetWorkConstance {

    private String HOST;
    private String version = "/v1/";

    public NetWorkConstance() {
        HOST = " https://students.bsuir.by/api" + version;
    }

    public String getHOST() {
        return HOST;
    }

    public void setHOST(String HOST) {
        this.HOST = HOST;
    }

}
