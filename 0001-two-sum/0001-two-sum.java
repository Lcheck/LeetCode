class Solution {
 
	int[] result = new int[2];
	Map<Integer, Integer> map = new HashMap<>();
	public int[] twoSum(int[] nums, int target) {

		//2.해시맵 활용
		// -> 현재 인덱스, 값매핑 하여 "기록" 후 다음 순회에 활용
        
			for (int i = 0; i < nums.length; i++) 
			{	

				if(map.containsKey(target-nums[i]))
				{
					
					result[0]=map.get((target-nums[i]));
                    result[1]=i;
				}

                map.put(nums[i],i);
                //put이 앞에있으면 중복값있는 경우 현재 값의 인덱스가 출력됨
			}

        return result;
	}
}