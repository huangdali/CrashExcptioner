## CrashExceptioner

全局异常捕获器，带默认app错误信息页，一行代码集成，中、英两种翻译

>基于https://github.com/ACRA/acra 调整而来，方便使用，感谢ACEA的贡献

### 导入：
你的app/build.gradle中加入以下的代码
```java
dependencies {
    ...
    compile 'com.jwkj:CrashExceptioner:v2.0.2'
 }
```

>温馨提示：如果你想修改默认错误页面的ui，建议你下载源码，以module方式引入项目

### 用法
在你的Application的onCreate中加入

```java
public class YourApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashExceptioner.init(this);
        ...
    }
}
```
### TODO
- 可定制默认错误页UI
- 支持更多语言
- 可自定义错误页面

![](https://github.com/huangdali/CrashExcptioner/blob/master/crash.gif)