package src.com.Designpattern.behavior.memorandum;
public class Memento {
    //标记
    private String flag;
    //原始数据
    private Object data;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "flag='" + flag + '\'' +
                ", data=" + data +
                '}';
    }
    public Memento(){

    }

    public Memento(String flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
