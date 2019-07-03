#!/bin/bash - 
#===============================================================================
#
#          FILE: run.sh
# 
#         USAGE: ./run.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2019年07月03日 10:07
#      REVISION:  ---
#===============================================================================

set -o nounset                              # Treat unset variables as an error

javac Main.java
jar cvf oneway.jar *.class
# 该条语句的目的是将java的字节流转换成为dvm或dalvice运行的dex文件格式
~/android-sdk-linux/build-tools/28.0.3/dx --dex --output=oneway.dex Main.class

# 修改 oneway.jar 中的入口程序 
# 运行 java -jar oneway.jar

# 在Android系统中adb shell中运行
# export CLASSPATH=/data/user/oneway.dex
# exec app_process /system/bin 包名 (这里是Main)
