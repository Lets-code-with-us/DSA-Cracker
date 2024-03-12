class Solution {
public:
    int eraseOverlapIntervals(vector<vector<int>>& intervals) {

        //   Ex:-  [cs,ce] or [ns,ne] if ce<=ns then we are safe no overlapp
        // Ist Case Ex;- [0,2] or [3,6]  if 2 <3

        // 2nd Case if ce<=ne then case is kis vale ko remove kre so jiska ne
        // sbse jyada he use hta do because vo bakiyo ke sath bhi overlap krega
        // ce<ne then delte ne vala interval count bhi kr lo

        // if ce>ne then (reverse of 2nd case)
         sort(intervals.begin(),
             intervals.end()); // starting time ke according sort kr lo pehle
        int i = 0, j = 1,result = 0;

        while (j < intervals.size()) {
            vector<int> current = intervals[i],next = intervals[j];

            int cs = current[0], ce = current[1],ns = next[0], ne = next[1];

            if (ce <= ns) { // no overlap
                i = j;
                j++;
            } else if (ce <= ne) { // overlap
                result++;
                j++;
            } else if (ce > ne) { // overlap
                i = j;
                j++;
                result++;
            }
        }
        return result;
    }
};