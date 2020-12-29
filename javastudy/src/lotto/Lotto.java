package lotto;

public class Lotto {
	int[] ball = new int[7]; 	// 당첨된 공
	int[] number = new int[45]; // 모든 공
	int index;

	public Lotto() {		//생성자 공은 1부터 45까지
		for (int i = 0; i < 45; i++) {
			number[i] = i + 1;
		}
		mix_number();
		selectionSort(ball);
	}


	public void mix_number() {
		loop:for(int i=0;i<ball.length;i++) {	//당첨공
			index=(int)(Math.random()*45);//0~44중하나뽑기
			for(int j=0;j<i;j++) {
				if((index+1)==ball[j]) {	//중복발생
					i--;
					continue loop;
				}				
			}
			ball[i]=number[index];
			System.out.println(ball[i]+" ");
		}
	}
	
public void selectionSort(int a[]) {		//선택정렬 오름차순
        
        for(int i=0; i<a.length-1; i++) {
            int min = i;
            for(int j=i+1; j<a.length; j++) { 
                if(a[j] < a[min]) { 		//오름차순 
                    min = j;
                }
            }
            swap(a, min, i); 
            System.out.printf("\n선택 정렬 %d 단계 : ", i+1);
            for(int v : a) {
                System.out.printf("%3d ", v);
            }
            //System.out.println(Arrays.toString(a));            
        }
        System.out.println();
    }


public  void swap(int a[], int idx1, int idx2) {
    int temp = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = temp;
}



	
}
