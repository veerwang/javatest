/*
 * =====================================================================================
 *
 *       Filename:  wangvutils.cpp
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2019年01月15日 13时22分20秒
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  kevin (WangWei), kevin.wang2004@hotmail.com
 *        Company:  LiLin-Tech
 *   Organization:  GNU
 *
 * =====================================================================================
 */

#include "wangvutils.h"

#include <iostream>
#include <cstdlib>
#include <cstdio>

JNIEXPORT jint JNICALL Java_com_security_landicorp_vulnerabilitydetect_JNIHub_getVersion (JNIEnv *env, jobject obj)
{
	Wangvutils wvu;
	return wvu.getVersion();
}

JNIEXPORT void JNICALL Java_com_security_landicorp_vulnerabilitydetect_JNIHub_printVersion (JNIEnv *, jobject)
{
	Wangvutils wvu;
	return wvu.printVersion();
}

static int g_version = 192;
/*
 *--------------------------------------------------------------------------------------
 *       Class:  Wangvutils
 * Description:  
 *--------------------------------------------------------------------------------------
 */
Wangvutils::Wangvutils ()
{
}  /* -----  end of method Wangvutils::Wangvutils  (constructor)  ----- */

Wangvutils::~Wangvutils ()
{
}  /* -----  end of method Wangvutils::Wangvutils  (destructor)  ----- */

/* 
 * ===  FUNCTION  ======================================================================
 *         Name:  printVersion
 *  Description:  
 * =====================================================================================
 */
void Wangvutils::printVersion ()
{
	std::cout<<"version: "<<g_version<<std::endl;
}

/* 
 * ===  FUNCTION  ======================================================================
 *         Name:  getVersion
 *  Description:  
 * =====================================================================================
 */
int Wangvutils::getVersion ()
{
	return g_version;
}
