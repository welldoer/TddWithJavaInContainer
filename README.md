# TddWithJavaInContainer

准备容器环境，参考：
1. [在VS Code中使用带Docker容器的Java开发环境 – Bruno Borge](https://www.jdon.com/52203)

准备容器环境具体步骤：
1. 在 GitHub 中创建新的 repository；
2. 在本机执行 git clone；
3. 打开 Vscode，点击菜单“查看”下"命令面板"，以 Remote-Containers: Open Folder in Container 方式打开项目；
4. 依据提示，选择 alpine v3.14，稍候初始容器即准备就绪。点击菜单"终端"下“新建终端”，尝试 java -version 显示不成功；
5. 编辑 .devcontainer/Dockerfile，将 apk 安装注释取消、采用 sudo 方式、安装 openjdk11
6. 执行 java -version、git --version 检查；
6. 提交更新至 repository；

特别说明：
1. 选择 alpine，容器镜像较小；选择其他 OS，可挑选 Maven、Gradle、Node、Git 等必要安装软件，直接下载相应容器镜像；
2. 若选择 alpine，也可以手动安装软件，可能还需要在用户 .bashrc、.zshrc 中增加环境变量：
3.   export JAVA_HOME="/usr/lib/jvm/java-11-openjdk"
4.   export PATH="${PATH}:${JAVA_HOME}/bin"

初始化 SpringBoot 开发项目环境说明：
1. 执行 curl.sh 下载 SpringBoot 初始代码集；
2. 关闭 vscode 当前工作区，再重新打开，此时 vscode 会自动识别并提示安装"Extension Pack for Java"；
3. 待安装完成后，会进一步自动识别 Java 工程，包括准备内置的 gradle 环境，在 JAVA PROJECTS 视图中可以查看各类信息；
4. 可右击提供的测试代码来验证整体环境的就绪；

参考项目：[TDD实战@计算斐波那契数](https://www.bilibili.com/video/BV18s411K7Kr)