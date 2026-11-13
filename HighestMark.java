class HighestMark {
    public static void main(String[] args) {
	
        int[] marks = {75, 82, 90, 64, 88, 95};

        int maxMark = marks[0];

        for (int i = 1; i < marks.length; i++) {
		
            if (marks[i] > maxMark) {
                maxMark = marks[i];
            }
        }
        System.out.println("Highest Mark: " + maxMark);
    }
}
