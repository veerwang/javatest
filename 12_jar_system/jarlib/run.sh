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
#       CREATED: 2018年12月26日 13:57
#      REVISION:  ---
#===============================================================================

set -o nounset                              # Treat unset variables as an error
rm -rf com
rm -rf Tools.jar
javac *.java -d .
jar -cvf Tools.jar com
