package src.com.Designpattern.structure.adapter;
//客户端类：连不到网线
public class Computer {
    //电脑需要一个转接头上网
    public void net(NetToUsb adapter){
        //上网的具体实现，找个转接头
        adapter.handleRequest();
    }
}
