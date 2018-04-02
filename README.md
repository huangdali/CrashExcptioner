## CrashExceptioner [![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0) [![Download](https://api.bintray.com/packages/huangdali/jwkj/CrashExceptioner/images/download.svg) ](https://bintray.com/huangdali/jwkj/CrashExceptioner/_latestVersion)

全局异常捕获器，带默认app错误信息页，一行代码集成，中、英两种翻译

>基于https://github.com/ACRA/acra 调整而来，方便使用，感谢ACEA的贡献

### 导入：
你的app/build.gradle中加入以下的代码
```java
dependencies {
    ...
    compile 'com.jwkj:CrashExceptioner:v2.0.3'
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
         ...
        CrashExceptioner.init(this);//最好放在onCreate方法的最后
        //CrashExceptioner.setShowErrorDetails(false);//设置不显示详细错误按钮，默认为true
    }
}
```
### TODO
- 可定制默认错误页UI
- 支持更多语言
- 可自定义错误页面

![](https://github.com/huangdali/CrashExcptioner/blob/master/crash.gif)

### 版本记录
2.0.3
- 【优化】修改默认错误页面的背景色为白色
- 【新增】提供设置是否显示“查看错误日志”按钮的接口(默认是true)

2.0.2
- 【修复】支持minSdk为11

2.0.1
- 【发布】正式发布
