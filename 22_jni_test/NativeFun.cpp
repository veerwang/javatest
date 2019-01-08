/*
 * =====================================================================================
 *
 *       Filename:  NativeFun.cpp
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2019年01月08日 14时38分42秒
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  kevin (WangWei), kevin.wang2004@hotmail.com
 *        Company:  LiLin-Tech
 *   Organization:  GNU
 *
 * =====================================================================================
 */

#include "NativeFun.h"

JNIEXPORT jint JNICALL Java_NativeFun_addFunction (JNIEnv *env, jobject obj, jint x, jint y)
{
	return x + y;
}
