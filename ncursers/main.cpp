/*
 * =====================================================================================
 *
 *       Filename:  main.cpp
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2016年07月02日 14时40分15秒
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  kevin (WangWei), kevin.wang2004@hotmail.com
 *        Company:  LiLin-Tech
 *   Organization:  GNU
 *
 * =====================================================================================
 */


#include <cstdlib>
#include <cstdio>
#include <iostream>

#include <curses.h>

/* 
 * ===  FUNCTION  ======================================================================
 *         Name:  main
 *  Description:  
 * =====================================================================================
 */
	int
main ( int argc, char *argv[] )
{
	initscr();
	clear();
	move(10,20);
	addstr("hello the world");
	//refresh();
	getch();
	endwin();
	return EXIT_SUCCESS;
}				/* ----------  end of function main  ---------- */
