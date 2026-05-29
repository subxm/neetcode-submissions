class Solution {
    public int evalRPN(String[] tokens) {
        ArrayList<String> list = new ArrayList<>();

        for (String token : tokens) {
            list.add(token);
        }

        while (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                String curr = list.get(i);

                if (curr.equals("+") || curr.equals("-") ||
                    curr.equals("*") || curr.equals("/")) {

                    int a = Integer.parseInt(list.get(i - 2));
                    int b = Integer.parseInt(list.get(i - 1));

                    int res = 0;

                    if (curr.equals("+")) res = a + b;
                    else if (curr.equals("-")) res = a - b;
                    else if (curr.equals("*")) res = a * b;
                    else res = a / b;

                    list.remove(i);
                    list.remove(i - 1);
                    list.remove(i - 2);

                    list.add(i - 2, String.valueOf(res));

                    break;
                }
            }
        }

        return Integer.parseInt(list.get(0));
    }
}