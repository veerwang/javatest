#!/bin/bash - 
#===============================================================================
#
#          FILE: makekey.sh
# 
#         USAGE: ./makekey.sh 
# 
#   DESCRIPTION: 
# 
#       OPTIONS: ---
#  REQUIREMENTS: ---
#          BUGS: ---
#         NOTES: ---
#        AUTHOR: YOUR NAME (), 
#  ORGANIZATION: 
#       CREATED: 2019年01月11日 10:41
#      REVISION:  ---
#===============================================================================

set -o nounset                              # Treat unset variables as an error

keytool -genkey -alias MyFirstApp.keystore -keyalg RSA -validity 1000 -keystore MyFirstApp.keystore -dname CN=w,OU=w,O=localhost,L=w,ST=w,C=CN -keypass 123456 -storepass 123456
