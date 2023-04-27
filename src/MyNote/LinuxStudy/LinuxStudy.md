目录操作：    
    cd 切换目录
    ls/ll 查看目录
    mkdir 创建目录
    echo 输出信息
    cat 查看文件
    chown 改变文件所属用户
    chgrp 改变文件所属组
    wget 下载文件
    grep 查找某个字段  
    wc 统计文本中行数、字数、字符数
    more/less 部分显示
    find / -name 'auto.cnf' 查找文件
    cp 复制文件
    移动/重命名  mv
    pwd 显示当前目录
    atop 查看CPU使用率
    glances -w 查看CPU利用率
查看线程：
    ps![img.png](img.png)
    top![img_1.png](img_1.png)

# 开启防火墙
systemctl start 服务名
# 关闭防火墙(服务器重启后还会自动开启防火墙)
systemctl stop firewalld
# 禁止防火墙开机启动
systemctl disable firewalld





    