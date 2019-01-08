#!/bin/bash - 
#===============================================================================
#
#          FILE: clean.sh
# 
#         USAGE: ./clean.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2019年01月08日 15:26
#      REVISION:  ---
#===============================================================================

set -o nounset                              # Treat unset variables as an error

echo "clean project ..."
rm -rf libNativeFun.so
rm -rf NativeFun.class
rm -rf Main.class
rm -rf NativeFun.h
