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
#       CREATED: 2018年12月26日 13:43
#      REVISION:  ---
#===============================================================================

set -o nounset                              # Treat unset variables as an error

echo "run compile ..."
javac -cp .:jarlib/Tools.jar Main.java
#java -cp .:jarlib/Tools.jar Main           #注意顺序不能颠倒
