package beakjoon.baekjoon;

import java.util.Scanner;

/* 
*  �ּ� :  https://www.acmicpc.net/problem/10974
*  ���� �̸� : ��� ����
*  ��¥ : 2018-10-18
*/	
public class Question10974 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ù ° �ٿ� N(1<=N<=8)�� �־�����.
		// ù° �ٺ��� N!���� �ٿ� ���ļ� ��� ������ ���������� ����Ѵ�.
		int n = sc.nextInt();
		
		//2�� ���� ��� �迭 �Ҵ��Ͽ� ����?
		Integer[] number = new Integer[n];
		
		for(int i=0;i<n;i++) {
			number[i] = i+1;
		}

	}

}
