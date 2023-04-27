package src.com.Designpattern.behavior.memorandum;
//要备份的对象：源码
public class SouceCode {

    //版本号
    private String version;
    //当前源代码有多少行
    private int lines;
    //备注信息
    private String remark;
    //创建一个备忘录
    public Memento creatMemento(){
        return  new Memento(this.getVersion(),new SouceCode
                (this.getVersion(),this.getLines(),this.getRemark()));
    }
    //根据备忘录恢复状态
    public void reset(Memento memento){
        SouceCode data = (SouceCode) memento.getData();
        this.version = data.getVersion();
        this.lines = data.getLines();
        this.remark = data.getRemark();
    }


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "SouceCode{" +
                "version='" + version + '\'' +
                ", lines=" + lines +
                ", remark='" + remark + '\'' +
                '}';
    }

    public SouceCode(String version, int lines, String remark) {
        this.version = version;
        this.lines = lines;
        this.remark = remark;
    }
    public SouceCode(){

    }

}
