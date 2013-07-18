/**
 * 
 */
package in.manurampandit.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author manurampandit
 *
 */
public class ActivitySelectionProblem {
	
	/**
	 * To find activities that can be covered 
	 * @param s --starting time of activities
	 * @param f -- finishing time of activities (assumption: sorted)
	 * @return
	 */
	public static List<Integer> getActivities(int s[], int[] f){
		//number of activities
		int n=s.length;
		List<Integer> activities= new ArrayList<>();
		int i=0;
		//first activity is always there
		activities.add(0);
		for (int j = 1; j < n; j++) {
			if(f[i]<=s[j]){
				activities.add(j);
				i=j;
			}
		}
		return activities;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] s =  {1, 3, 0, 5, 8, 5};
	    int[] f =  {2, 4, 6, 7, 9, 9};
	    List<Integer> activities= getActivities(s, f);
	    //print out activities
	    for (Integer activity : activities) {
	    	System.out.print(activity + "\t");
		}
	}

}
