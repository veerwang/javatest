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

static int g_version = 100;
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
