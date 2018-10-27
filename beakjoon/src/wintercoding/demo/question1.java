package wintercoding.demo;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String skill="CBD";
		char[] skillArray = skill.toCharArray();
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer = 0;
		int countFalse=0;
		int a = 0;
		int b = 0;
		//c에서 리턴된 인트보다 뒤에서 나오는 인트가 더 작은 경우 무조건 앙웃
		for(int i=0;i<skill_trees.length;i++) {
			for(int j=0;j<skillArray.length-1;j++) {
				a = skill_trees[i].indexOf(skillArray[j]);
				b = skill_trees[i].indexOf(skillArray[j+1]);
				System.out.print(a);
				System.out.print(b);
				
				if(a==-1) {
					if(a>b) {
						countFalse++;
						break;
					}
				}else {
					if(a>b) {
						countFalse++;
						break;
					}
				}
			}
			System.out.println();
		}
		answer = skill_trees.length - countFalse;
		System.out.println(answer);
	}

}
