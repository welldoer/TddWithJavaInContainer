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
