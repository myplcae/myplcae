package src.com.Designpattern.structure.adapter;

public class Adapters2 implements NetToUsb{

    private Adapter adapter;

    public Adapters2(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void handleRequest() {
        adapter.request();
    }
}
