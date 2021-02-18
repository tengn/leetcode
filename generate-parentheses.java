class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        help(res, new StringBuilder(), 0, 0, n);
        return res;
    }
    public void help(List<String> res, StringBuilder sb, int left, int right, int n) {
        if (sb.length() == n*2) {
            res.add(sb.toString());
            return;
        }
        if (left < n) {
            sb.append("(");
            help(res, sb, left + 1, right, n);
            sb.setLength(sb.length() - 1);
        }
        if (right < left) {
            sb.append(")");
            help(res, sb, left, right + 1, n);
            sb.setLength(sb.length() - 1);
        }
        
    }
}
