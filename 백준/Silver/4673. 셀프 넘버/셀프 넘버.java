public class Main{
	// int count[]을 쓰지 말고 boolean[] check = new boolean[10000];을 써보자
	static int count[] = new int[10000];
	public static void sum(int a) {
		count[a]++;
		if(a>10000 || count[a]>=2) {
			return;
		}
	    int ans = 0;
	    ans += a;
        
	    while(true) {
	    	if(a<10) {
	    		ans += a % 10;
	    		break;
	    	}
	    	else if(a >= 10) {
	    		ans += a % 10;
	    		a = a / 10;
	    	}
	    }
	    if(ans>=10000) {
	    	return;
	    }
    	sum(ans);
    
	}
	
    public static void main(String args[]){
        for(int i =1;i<=9999;i++) {
        	sum(i);
        }
        int j = 0;
        for(int k:count) {
        	if(k<2 && j!=0) {
        		System.out.println(j);
        	}
        	j++;
        }
    }
}
