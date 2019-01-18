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
#       CREATED: 2019年01月08日 14:31
#      REVISION:  ---
#===============================================================================

set -o nounset                              # Treat unset variables as an error

echo "Compiling project .."
javac Main.java
javah NativeFun				#注意是NativeFun,不是针对文件的，是针对类的。
                                        #注意javah的生成需要在package中的路径下执

g++ -I/opt/jdk1.8.0_102/include/linux -I/opt/jdk1.8.0_102/include/ -fPIC -shared -o libNativeFun.so NativeFun.cpp
#其中include的路径通过 which java获得

java -Djava.library.path='.' Main
