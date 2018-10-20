package beakjoon.baekjoon;

import java.util.Scanner;

/* 
*  주소 :  https://www.acmicpc.net/problem/10974
*  문제 이름 : 모든 순열
*  날짜 : 2018-10-18
*/	
public class Question10974 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 첫 째 줄에 N(1<=N<=8)이 주어진다.
		// 첫째 줄부터 N!개의 줄에 걸쳐서 모든 순열을 사전순으로 출력한다.
		int n = sc.nextInt();
		
		//2가 들어올 경우 배열 할당하여 구현?
		Integer[] number = new Integer[n];
		
		for(int i=0;i<n;i++) {
			number[i] = i+1;
		}

	}

}
