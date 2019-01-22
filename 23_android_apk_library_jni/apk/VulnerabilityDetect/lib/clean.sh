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
#       CREATED: 2019年01月09日 15:20
#      REVISION:  ---
#===============================================================================

set -o nounset                              # Treat unset variables as an error

rm -rf obj
rm -rf libs
