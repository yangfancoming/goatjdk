

#  网络组成
    应用层
    传输层             TCP/UDP
    网络层             IP 
    物理、数据链路层
    
# TCP/UDP 区别 
                   TCP             UDP 
    是否连接     面向连接        面向非连接 
    传输可靠性   可靠              不可靠 
    应用场合     传输大量数据     少量数据 
    速度           慢                  快
    消息边界       无                  有  
    面向          流：保证顺序     报文：既不拆分，也不合并，而是保留这些报文的边界，因此，应用程序需要选择合适的报文大小。
    
    
    