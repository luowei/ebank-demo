# E商贸通银行商户对接演示系统 (ebank-demo)

## 项目简介

这是一个基于 Spring MVC + Hibernate JPA 的电子银行商户直连接口演示项目。本项目封装了与"E商贸通"银行支付系统交互的完整流程，包括报文的加解密、签名验证、数据解析和生成等功能。主要用于演示商户如何通过专线直连方式与银行进行交易对接。

该系统提供了完整的电子银行业务操作流程，包括签约、资金出入金、交易冻结/解冻、付款状态查询等核心功能。

## 技术栈

### 核心框架
- **Spring Framework 4.1.0** - 依赖注入和 MVC 框架
- **Spring MVC** - Web 层框架
- **Spring Data JPA 1.7.0** - 数据访问层
- **Hibernate 4.1.9.Final** - JPA 实现和 ORM 框架
- **QueryDSL 3.4.3** - 类型安全的查询框架

### 构建工具
- **Apache Ant** - 项目构建工具
- **Apache Ivy** - 依赖管理工具

### 数据库
- **Microsoft SQL Server** - 主数据库
  - netbank - 网银业务数据库
  - trade - 交易数据库
  - expert - 专家库数据库
  - pcdb - PC数据库

### 其他依赖
- **Jackson 2.4.2** - JSON 序列化/反序列化
- **Apache HttpClient 4.3.5** - HTTP 客户端
- **JSTL 1.2** - JSP 标签库
- **SLF4J 1.7.7** - 日志门面
- **JUnit 4.10** - 单元测试框架

## 项目结构

```
ebank-demo/
├── src/                                # 源代码目录
│   ├── com/rootls/
│   │   ├── common/                     # 公共组件
│   │   │   ├── convert/                # 加密解密工具类
│   │   │   │   ├── CertStore.java      # 证书存储
│   │   │   │   ├── ConvertBase64.java  # Base64 转换
│   │   │   │   ├── GenerateKey.java    # 密钥生成
│   │   │   │   └── MyConvert.java      # 加解密核心类
│   │   │   ├── xml/                    # XML 处理
│   │   │   │   ├── Message.java        # 报文消息模型
│   │   │   │   └── JaxbUtil.java       # XML 序列化工具
│   │   │   ├── utils/                  # 工具类
│   │   │   │   └── HttpClientUtil.java # HTTP 客户端工具
│   │   │   ├── Config.java             # 系统配置
│   │   │   ├── MyJson.java             # JSON 响应封装
│   │   │   └── ExceptionHandler.java   # 异常处理器
│   │   ├── user/                       # 用户管理模块
│   │   │   ├── Admin.java              # 管理员实体
│   │   │   ├── AdminController.java    # 管理员控制器
│   │   │   ├── AdminRepository.java    # 管理员仓储
│   │   │   └── interceptor/            # 拦截器
│   │   ├── netbank/                    # 网银业务模块
│   │   │   ├── trade/                  # 交易处理
│   │   │   │   ├── sign/               # 签约相关 (3FC001)
│   │   │   │   ├── rujing/             # 入金相关 (3FC002)
│   │   │   │   ├── chujing/            # 出金相关 (3FC022)
│   │   │   │   ├── jiaoyi/             # 交易相关 (3FC009/010/011)
│   │   │   │   ├── TradeController.java # 交易控制器
│   │   │   │   ├── FillMessage.java    # 报文填充
│   │   │   │   └── FillResponse.java   # 响应填充
│   │   │   └── trans/                  # 传输服务
│   │   │       ├── BankService.java    # 银行服务接口
│   │   │       └── BankServiceImpl.java # 银行服务实现
│   │   └── manage/                     # 管理模块
│   │       ├── controller/             # 控制器
│   │       ├── model/                  # 数据模型
│   │       ├── repository/             # 数据仓储
│   │       └── dto/                    # 数据传输对象
│   ├── key/                            # 密钥文件目录
│   │   ├── bank/                       # 银行密钥
│   │   └── mine/                       # 商户密钥
│   ├── dataSource.properties           # 数据源配置
│   ├── persistence.xml                 # JPA 持久化配置
│   └── log4j.properties                # 日志配置
├── WebRoot/                            # Web 根目录
│   ├── WEB-INF/
│   │   ├── web.xml                     # Web 配置
│   │   ├── applicationContext.xml      # Spring 配置
│   │   └── dispatcher-servlet.xml      # MVC 配置
│   ├── trade/                          # 交易页面
│   │   ├── sign.jsp                    # 签约页面
│   │   ├── ruJing.jsp                  # 入金页面
│   │   ├── chuJing.jsp                 # 出金页面
│   │   ├── dongJie.jsp                 # 冻结/解冻页面
│   │   ├── querySign.jsp               # 查询签约页面
│   │   ├── queryYuE.jsp                # 查询余额页面
│   │   ├── queryPayStat.jsp            # 查询付款状态页面
│   │   └── haltTrade.jsp               # 停止交易页面
│   └── bank/                           # 银行相关页面
├── doc/                                # 接口文档
│   ├── E商贸通_银行商户专线直连应用接口规范_V1.0.6.doc
│   └── 附件：E商贸通_银行商户交易报文接口_V1.0.6.xls
├── lib/                                # 库文件
├── build.xml                           # Ant 构建脚本
├── ivy.xml                             # Ivy 依赖配置
└── ivysettings.xml                     # Ivy 设置文件
```

## 主要功能

### 1. 签约管理 (3FC001)
- **功能**：商户与银行进行签约，建立交易关系
- **接口**：`POST /sign.lz`
- **访问地址**：http://localhost:8070/trade/sign.jsp
- **说明**：完成商户基本信息登记和席位号分配

### 2. 查询签约状态
- **功能**：查询商户签约状态和详细信息
- **接口**：`POST /querySign.lz`
- **访问地址**：http://localhost:8070/trade/querySign.jsp
- **参数**：席位号 (spotSitNo)

### 3. 查询账户余额
- **功能**：查询商户账户当前余额
- **接口**：`POST /queryYuE.lz`
- **访问地址**：http://localhost:8070/trade/queryYuE.jsp
- **参数**：席位号 (spotSitNo)

### 4. 资金入金 (3FC002)
- **功能**：将资金转入交易账户
- **接口**：`POST /ruJing.lz`
- **访问地址**：http://localhost:8070/trade/ruJing.jsp
- **说明**：支持从绑定银行账户向交易账户充值

### 5. 资金出金 (3FC022)
- **功能**：将资金从交易账户转出
- **接口**：`POST /chuJing.lz`
- **访问地址**：http://localhost:8070/trade/chuJing.jsp
- **说明**：支持将交易账户资金提现到绑定银行账户

### 6. 资金冻结/解冻 (3FC009)
- **功能**：冻结或解冻交易资金
- **接口**：`POST /dongJie.lz`
- **访问地址**：http://localhost:8070/trade/dongJie.jsp
- **应用场景**：交易担保、风险控制

### 7. 查询付款状态 (3FC010)
- **功能**：查询付款交易的当前状态
- **接口**：`POST /queryPayStat.lz`
- **访问地址**：http://localhost:8070/trade/queryPayStat.jsp
- **参数**：商户号、合同号、付款批次号

### 8. 停止交易 (3FC011)
- **功能**：终止正在进行的交易
- **接口**：`POST /haltTrade.lz`
- **访问地址**：http://localhost:8070/trade/haltTrade.jsp
- **说明**：用于异常情况下的交易中止

## 使用方法

### 1. 环境准备

**前置要求**：
- JDK 1.6 或以上版本
- Apache Tomcat 6.0 或以上版本
- Microsoft SQL Server 数据库
- Apache Ant（用于构建）

### 2. 配置数据库

编辑 `src/dataSource.properties` 文件，配置数据库连接：

```properties
netbank.jdbc.url=jdbc:sqlserver://your-server:port;DatabaseName=netbank
netbank.jdbc.username=your-username
netbank.jdbc.password=your-password
```

### 3. 配置银行接口

编辑 `src/com/rootls/common/Config.java`，配置银行接口地址：

```java
// 交易URL
public static final String URL_CHANNEL = "http://bank-server:port/merchant_new/Tran/shzs";
// 商户号
public static String mch_no = "your-mch-no";
```

### 4. 配置密钥

将银行提供的密钥文件放置到以下目录：
- 银行公钥：`src/key/bank/pub_key.dat`
- 商户私钥：`src/key/mine/priv_key.dat`
- 商户公钥：`src/key/mine/pub_key.dat`
- DES密钥：`src/key/mine/des_key.dat` 和 `src/key/bank/des_key.dat`

### 5. 构建项目

```bash
# 下载依赖
ant retrieve

# 编译项目
ant compile

# 打包 WAR 文件
ant war
```

生成的 WAR 文件位于 `dist/authdemo.war`

### 6. 部署运行

将 `authdemo.war` 部署到 Tomcat 的 webapps 目录，启动 Tomcat 后访问：

```
http://localhost:8080/authdemo/trade/sign.jsp
```

### 7. 业务流程

**典型交易流程**：
1. 签约 → 获取席位号
2. 入金 → 充值到交易账户
3. 查询余额 → 确认资金到账
4. 进行交易（冻结/解冻资金）
5. 查询付款状态
6. 出金 → 提现到银行账户

## 依赖说明

### 核心依赖

| 依赖 | 版本 | 说明 |
|------|------|------|
| spring-context | 4.1.0.RELEASE | Spring 核心容器 |
| spring-webmvc-portlet | 4.1.0.RELEASE | Spring MVC |
| spring-data-jpa | 1.7.0.RELEASE | Spring Data JPA |
| hibernate-entitymanager | 4.1.9.Final | Hibernate JPA 实现 |
| querydsl-jpa | 3.4.3 | 类型安全查询 |
| jackson-databind | 2.4.2 | JSON 处理 |
| httpclient | 4.3.5 | HTTP 客户端 |

### 依赖管理

项目使用 Apache Ivy 管理依赖，所有依赖配置在 `ivy.xml` 文件中。

**下载依赖**：
```bash
ant retrieve
```

依赖将被下载到 `lib/` 目录。

## 安全说明

### 加密机制

1. **RSA 非对称加密**：用于签名验证和密钥交换
   - 密钥长度：1024位
   - 商户持有私钥，银行持有商户公钥
   - 银行持有私钥，商户持有银行公钥

2. **DES 对称加密**：用于报文数据加密
   - 报文内容使用 DES 加密
   - DES 密钥使用 RSA 公钥加密传输

3. **Base64 编码**：对加密后的二进制数据进行编码传输

### 报文处理流程

**发送报文**：
```
原始报文 → DES加密 → Base64编码 → 添加签名 → 发送
```

**接收报文**：
```
接收 → 验证签名 → Base64解码 → DES解密 → 解析XML
```

## 接口规范

### 报文格式

系统使用 XML 格式的报文进行通信，报文结构如下：

```xml
<Message>
    <Head>
        <TranCode>交易码</TranCode>
        <MchNo>商户号</MchNo>
        <!-- 其他头部信息 -->
    </Head>
    <Body>
        <!-- 具体业务数据 -->
    </Body>
</Message>
```

### 交易码说明

- **3FC001**：签约
- **3FC002**：入金
- **3FC003**：查询余额
- **3FC009**：冻结/解冻
- **3FC010**：查询付款状态
- **3FC011**：停止交易
- **3FC022**：出金

详细接口规范请参考 `doc/` 目录下的文档。

## 学习资源

### Ivy 依赖管理

- [Ivy 中文参考文档](http://ivy.group.iteye.com/group/wiki/)

### 视频教程

- [E商贸通之ebank-demo示例讲解](http://www.tudou.com/programs/view/88-4qPQFazQ/)

## 注意事项

1. **密钥安全**：
   - 密钥文件不应提交到版本控制系统
   - 生产环境密钥必须妥善保管
   - 定期更换密钥以提高安全性

2. **配置文件**：
   - `dataSource.properties` 包含敏感信息，需要独立管理
   - 不同环境使用不同的配置文件

3. **数据库**：
   - 确保数据库表结构与实体类匹配
   - 生产环境建议关闭 `hibernate.show_sql`

4. **网络环境**：
   - 生产环境应使用专线连接
   - 配置适当的超时时间（默认30秒）

5. **编码格式**：
   - 系统统一使用 GBK 编码与银行系统交互
   - 确保 Tomcat 配置正确的 URIEncoding

## 开发者信息

- **作者**：luowei
- **创建时间**：2014年8月
- **项目名称**：authdemo (ebank-demo)

## 许可证

请参考项目许可证文件。

---

**注**：本项目仅供学习和演示使用，生产环境部署前请进行充分的安全评估和测试。
