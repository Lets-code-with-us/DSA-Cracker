
func sequentialDigits(low int, high int) []int {
	var resl []int
	var dl, dh int
	n, m := low, high
	ans := make(map[int]bool)
	for n > 0 {
		n /= 10
		dl++
	}
	for m > 0 {
		m /= 10
		dh++
	}
	for i := 0; i < 9; i++ {
		helper(i, low, high, 0, dh, ans)
	}
	for k := range ans {
		resl = append(resl, k)
	}
	sort.Ints(resl)
	return resl
}

func helper(curr int, low int, high int, cd int, hd int, ans map[int]bool) {
	if cd > hd || curr > high {
		return
	}
	if curr <= high && curr >= low {
		ans[curr] = true
	}
	last := curr % 10
	if last == 9 {
		return
	}
	curr = curr*10 + (last + 1)
	helper(curr, low, high, cd+1, hd, ans)
}

