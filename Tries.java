public class Tries {
	private class TriesNode {
Map<Character, Tries> chlidren;
boolean isEnd;
Character value;
}

private TriesNode root
public Tries() {
	root = new TriesNode();
}

private void setValue() {

}

private void setIslast() {

}


public void insert(String s) {
	char last = 'a';
	TriesNode current = root;
	for (char c : s.toCharArray()) {
		if (root.chlidren.size() == 0) {
			// no root node yet, put this
			// as root node
		} else {
			if (!root.chlidren.containsKey(c)) {
				TriesNode temp = new TriesNode();
				temp.setValue(c);
				root.chlidren.put(c, temp);
				current = c;
			}
		}
		
	}
	TriesNode temp = new TriesNode();
	temp.setIslast(True);
	current.chlidren.put("", temp);
}

}
