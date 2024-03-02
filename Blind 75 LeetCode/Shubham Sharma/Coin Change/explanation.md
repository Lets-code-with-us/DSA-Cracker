## intuition

* The idea is very classic dynamic programming: 
   - think of the last step we take. 
   - Suppose we have already found out the best way to sum up to amount a, then for the last step, we can choose any coin type which gives us a remainder r where r = a-coins[i] for all i's.
   - For every remainder, go through exactly the same process as before until either the remainder is 0 or less than 0 (meaning not a valid solution). 
   - With this idea, the only remaining detail is to store the minimum number of coins needed to sum up to r so that we don't need to recompute it over and over again.