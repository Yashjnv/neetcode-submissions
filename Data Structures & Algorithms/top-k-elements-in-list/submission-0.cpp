class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> temp; vector<int> ans;
        for(auto it : nums){
            temp[it]++;
        }

        priority_queue<pair<int,int>> heap;
        for(auto it : temp){
            heap.push({it.second, it.first});
        }

        while(k--){
            auto value = heap.top();
            heap.pop();

            ans.push_back(value.second);
        }
        return ans;
    }
};
