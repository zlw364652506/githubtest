package com.aj.frame.auth.common.configuration;


import com.aj.frame.net.UrlSet;
import com.aj.frame.net.impl.TransportProxyProcessor;
import com.aj.frame.net.impl.socket.SocketBinaryClientChannel;
import com.aj.frame.net.impl.socket.TcpConnector;
import com.aj.frame.processor.impl.AJFilesClearProcessor;
import com.aj.frame.spring.SpringTransportChannelFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * FPID_远程处理器
 * <p>
 * 如果要新增额外的远程处理器，复制次配置类，修改相应配置即可，
 */
@Configuration
public class FpidRemoteConfiguration {

    public static final String TRANSPORT_PROXY_PROCESSOR = "FPID_远程处理器";

    public static final String TRANSPORT_CHANNEL_FACTORY = "远程处理器服务传输通道工厂";

    public static final String BINARY_CLIENT_CHANNEL = "二进制传输客户端通道";

    public static final String AJ_FILES_CLEAR_PROCESSOR = "FPID_文件传输临时文件清理";

    private static final String CONFIG_PROP_PREFIX = "fpid-remote-processor.";

    @Bean(name = TRANSPORT_PROXY_PROCESSOR)
    @ConfigurationProperties(prefix = CONFIG_PROP_PREFIX + "transport-proxy-processor")
    public TransportProxyProcessor transportProxyProcessor(
            @Qualifier(TRANSPORT_CHANNEL_FACTORY) SpringTransportChannelFactory springTransportChannelFactory) {
        TransportProxyProcessor proxyProcessor = new TransportProxyProcessor();
        proxyProcessor.setProcessorId(TRANSPORT_PROXY_PROCESSOR);
        proxyProcessor.setAsynchronousCall(false);
        // 是否支持文件传输机制的标记，缺省值：false
        proxyProcessor.setFileTransmissionEnabled(false);
        // 服务端用来支持文件实体数据传输的处理器ID，缺省内容："FPID_文件传输"
        proxyProcessor.setFileTransmissionProcId("FPID_文件传输");
        // 框架文件传输时，上传实体文件数据分块大小（单位：k，缺省值：64，最小值：8，最大值：65536）
        proxyProcessor.setFileTransmissionDataBlockSize(512);
        // 框架文件传输时，下载实体文件临时存放的路径
        proxyProcessor.setStoragePath("/ajfiles/client");
        // AJData会话数据的传输通道信息填充模式，缺省值为2 0:不填充；1:如果已有则不填充，否则自动填充；2:强制覆盖填充；3:追加式填充，多次追加信息之间用'|"进行分隔。
        proxyProcessor.setCiFillMode(3);
        proxyProcessor.setTransportChannelFactory(springTransportChannelFactory);

        return proxyProcessor;
    }

    @Bean(name = TRANSPORT_CHANNEL_FACTORY) // 此Bean必须单独定义，其它地方需要用到
    @ConfigurationProperties(prefix = CONFIG_PROP_PREFIX + "transport-channel-factory")
    public SpringTransportChannelFactory springTransportChannelFactory() {
        SpringTransportChannelFactory channelFactory = new SpringTransportChannelFactory();
        channelFactory.setDefaultTransportChannel(BINARY_CLIENT_CHANNEL);

        TcpConnector tcpConnector = new TcpConnector();
        // 连接目标地址集（connect时会自动在多个地址中随机选择可用地址）
        tcpConnector.setUrls(new UrlSet());
        // 物理连接(socket)池的容量
        tcpConnector.setConnectionPoolSize(100);
        // 连接失败以后的重试次数
        tcpConnector.setConnectRetry(1);
        // 连接等待超时毫秒值
        tcpConnector.setConnectTimeout(60000);
        // 连接空闲超时毫秒值
        tcpConnector.setConnectionIdleTimeout(90000);
        channelFactory.setDefaultConnector(tcpConnector);
        return channelFactory;
    }

    @Bean(name = BINARY_CLIENT_CHANNEL)
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // 必须为scope=prototype，否则并发调用有可能IO异常
    @ConfigurationProperties(prefix = CONFIG_PROP_PREFIX + "socket-binary-client-channel")
    public SocketBinaryClientChannel socketBinaryClientChannel() {
        SocketBinaryClientChannel binaryClientChannel = new SocketBinaryClientChannel();
        // 指定传输加密的密钥
        binaryClientChannel.setEncryptKey("password");
        // 启用二进制数据压缩的数据长度限制，-1表示不启用压缩机制，详情参见该属性的注释
        binaryClientChannel.setZipLimit(1024);
        // 指定是否支持压缩传输
        binaryClientChannel.setSupportZip(true);
        // 传输通道读数据等待超时毫秒值
        binaryClientChannel.setReadTimeout(90000);
        // 是否仅合成简单的通道信息，缺省为true，其值决定info()返回的通道信息仅包含底层网络连接的本地IP信息，还是本机所有的IP信息。
        binaryClientChannel.setSimpleBuildChannelInfo(false);
        return binaryClientChannel;
    }

    @Bean(name = AJ_FILES_CLEAR_PROCESSOR)
    @ConfigurationProperties(prefix = CONFIG_PROP_PREFIX + "aj-files-clear-processor")
    public AJFilesClearProcessor aJFilesClearProcessor() {
        AJFilesClearProcessor aJFilesClearProcessor = new AJFilesClearProcessor();
        //待清理的临时文件存放位置
        aJFilesClearProcessor.setStoragePath("/ajfiles/client");
        //临时文件存储空间限制，缺省：256M
        aJFilesClearProcessor.setSpaceLimit("256M");
        //传输完成的完整文件的有效时间，超过有效时间的文件将被清理删除。缺省值：10分钟
        aJFilesClearProcessor.setValidityOfFile("10分钟");
        //传输过程中不完整的临时文件的有效时间，超过有效时间的文件将在临时文件存储空间满时被清理删除。缺省值：48小时
        aJFilesClearProcessor.setValidityOfTmpFile("48小时");
        return aJFilesClearProcessor;
    }

}
