package wintercoding.demo;

import java.util.HashSet;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirs="URUUUUUURLRULL";
		
		char[] dirsArray=dirs.toCharArray();
		
		int dirsArrayLength = dirsArray.length;
		
		int[] position = {0,0};

		int answer=0;
		HashSet<String> movedPath = new HashSet<>();
		for(int i=0;i<dirsArrayLength;i++) {
			String path = "";
			path = String.valueOf(position[0]) + String.valueOf(position[1]);
			switch(dirsArray[i]) {
				case 'U':
					position[1] += 1;
					break;
				case 'D':
					position[1] -= 1;
					break;
				case 'R':
					position[0] += 1;
					break;
				case 'L':
					position[0] -= 1;
					break;
			}
			if(position[0]<-5){
				position[0]++;
			}else if(position[1]<-5){
				position[1]++;
			}else if(position[0]>5){
				position[0]--;
			}else if(position[1]>5){
				position[1]--;
			}else {
				path += String.valueOf(position[0]) + String.valueOf(position[1]);

				if(movedPath.contains(path)) {
					System.out.println("already movedPath");
				}else {
					System.out.println("Find new movedPath");
					answer++;
					movedPath.add(path);
				}
				
				System.out.println(path);
			}
			
			
			
		}
		System.out.println(answer);
		
	}

}
