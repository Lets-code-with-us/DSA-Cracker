class Solution {
    vector<int> mergeInter(const vector<int>& i1, const vector<int>& i2){
        return {min(i1[0],i2[0]), max(i1[1],i2[1])};
    }
    bool intervalIsLess(const vector<int>& i1, const vector<int>& i2){
        return i2[1]<i1[0];
    }
    bool intervalIsLarger(const vector<int>& i1, const vector<int>& i2){
        return i2[0]>i1[1];
    }
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        vector<vector<int>> result;
        bool merged = false;
        if (intervals.empty()){
            result.push_back(newInterval);
            return result;
        }
        for(const auto& inter: intervals){
            if(intervalIsLess(inter,newInterval)){
                if(!merged){
                    result.push_back(newInterval);
                    merged = true;
                }
                result.push_back(inter);
                continue;
            }
            if(intervalIsLarger(inter,newInterval)){
                result.push_back(inter);
                continue;
            }
            newInterval = mergeInter(inter,newInterval);
        }
        if(!merged){
            result.push_back(newInterval);
        }
        return result;
    }
};
