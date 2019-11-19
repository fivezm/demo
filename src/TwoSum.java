
import java.util.Arrays;
import java.util.HashMap;

public class _001两数之和 {

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		System.out.println(Arrays.toString(hashSolution(nums, 9)));
	}
	public static int[] hashSolution(int[] nums, int target)  {
		HashMap<Integer, Integer> map = new HashMap<>(nums.length);
		for(int i =0;i<nums.length;i++) {
			int temp = target - nums[i];
			if(map.containsKey(temp)) {
				return new int[] {map.get(temp),i};
			}
			map.put(nums[i], i);
		} 
		throw new IllegalArgumentException("No two sum solution");
	}
}
