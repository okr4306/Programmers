// 두 정수 사이의 합

class Solution {
	public long solution(int a, int b) {
		long answer = 0;
		int start = a;
		int end = b;

		if (a > b) {
			start = b;
			end = a;
		}

		for (int i = start; i <= end; i++) {
			answer = answer + i;
		}
		
		return answer;
	}
}
