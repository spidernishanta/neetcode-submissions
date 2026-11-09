class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> nums1;
        for(int i=0; i<nums.size(); i++){
            nums1.push_back(nums[i]);
        }
        for(int i=0; i<nums.size(); i++){
            nums1.push_back(nums[i]);
        }
        return nums1;
    }
};