class Request {
    private final RequestType requestType;
    private final String requestDescription;
    private boolean handled;

    Request(RequestType requestType, String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    RequestType getRequestType() {
        return requestType;
    }

    String getRequestDescription() {
        return requestDescription;
    }

    boolean isHandled() {
        return handled;
    }

    void markHandled() {
        this.handled = true;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }

    enum RequestType {
        DEFEND, TORTURE, TAX, EAT
    }
}
